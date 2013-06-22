package com.jbranchaud.babou;

import com.jbranchaud.babou.constants.GuiConstants;
import com.jbranchaud.babou.controllers.BabouController;
import com.jbranchaud.babou.gui.BabouGui;
import com.jbranchaud.babou.manager.RepoManager;

public class Babou {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BabouGui babouView = new BabouGui(GuiConstants.FRAME_TITLE);
		RepoManager repoManager = null;
		
		BabouController controller = new BabouController(babouView, repoManager);
	}

}
