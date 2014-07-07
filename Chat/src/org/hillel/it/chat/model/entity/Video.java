package org.hillel.it.chat.model.entity;

public class Video {
	private boolean videoPicture;
	private String[] quality;
	private boolean resolution;
	private User user;

	public Video(String[] quality) {
		super();
		this.quality = quality;
	}

	public void start() {

	}

	public void stop() {

	}

	public void next() {

	}

	public void demostration() {

	}

	public boolean isVideoPicture() {
		return videoPicture;
	}

	public void setVideoPicture(boolean videoPicture) {
		this.videoPicture = videoPicture;
	}

	public String[] getQuality() {
		return quality;
	}

	public void setQuality(String[] quality) {
		this.quality = quality;
	}

	public boolean isResolution() {
		return resolution;
	}

	public void setResolution(boolean resolution) {
		this.resolution = resolution;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
