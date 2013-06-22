package com.jbranchaud.babou.controllers;

import com.jbranchaud.babou.gui.BabouGui;
import com.jbranchaud.babou.manager.RepoManager;

public class BabouController {
	private BabouGui gui;
	private RepoManager manager;

	public BabouController(final BabouGui gui, final RepoManager manager) {
		this.gui = gui;
		this.manager = manager;
	}

	/**
	 * @return the gui
	 */
	public final BabouGui getGui() {
		return gui;
	}

	/**
	 * @param gui
	 *            the gui to set
	 */
	public final void setGui(final BabouGui gui) {
		this.gui = gui;
	}

	/**
	 * @return the manager
	 */
	public final RepoManager getManager() {
		return manager;
	}

	/**
	 * @param manager
	 *            the manager to set
	 */
	public final void setManager(final RepoManager manager) {
		this.manager = manager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gui == null) ? 0 : gui.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final BabouController other = (BabouController) obj;
		if (gui == null) {
			if (other.gui != null) {
				return false;
			}
		} else if (!gui.equals(other.gui)) {
			return false;
		}
		if (manager == null) {
			if (other.manager != null) {
				return false;
			}
		} else if (!manager.equals(other.manager)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BabouController [" + (gui != null ? "gui=" + gui + ", " : "") + (manager != null ? "manager=" + manager : "") + "]";
	}
}
