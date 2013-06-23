package com.jbranchaud.babou;

import com.jbranchaud.babou.constants.GuiConstants;
import com.jbranchaud.babou.controllers.BabouController;
import com.jbranchaud.babou.enums.AlterationType;
import com.jbranchaud.babou.gui.BabouGui;
import com.jbranchaud.babou.manager.RepoManager;
import com.jbranchaud.babou.models.AlteredFile;
import com.jbranchaud.babou.models.AnnotatedCommit;
import com.jbranchaud.babou.models.BabouChangeset;

public class Babou {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BabouGui babouView = new BabouGui(GuiConstants.FRAME_TITLE);
		RepoManager repoManager = new RepoManager() {

			@Override
			public BabouChangeset getChanges() {
				BabouChangeset changeSet = new BabouChangeset();
				changeSet.getAlteredFiles().add(new AlteredFile("file1.txt", AlterationType.MODIFIED));
				changeSet.getAlteredFiles().add(new AlteredFile("file2.txt", AlterationType.MODIFIED));
				changeSet.getAlteredFiles().add(new AlteredFile("file4.txt", AlterationType.MODIFIED));
				changeSet.getAlteredFiles().add(new AlteredFile("file3.txt", AlterationType.MODIFIED));
				changeSet.getAlteredFiles().add(new AlteredFile("file12.txt", AlterationType.MODIFIED));
				
				return changeSet;
			}

			@Override
			public boolean commit(AnnotatedCommit annotatedCommit) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		
		BabouController controller = new BabouController(babouView, repoManager);
		controller.updateFileList();
	}

}
