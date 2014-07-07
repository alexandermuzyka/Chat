package org.hillel.it.chat.model.entity;

public class Chat {
	private int numberOfUsers;
	private Messages[] messages;
	private User user;

	public Chat(int numberOfUsers) {
		super();
		this.numberOfUsers = numberOfUsers;
	}

	public void connect() {

	}

	public void disconnect() {

	}

	public void another() {

	}

	public void switchOver() {

	}

	public int getNumberOfUsers() {
		return numberOfUsers;
	}

	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}

	public Messages[] getMessages() {
		return messages;
	}

	public void setMessages(Messages[] messages) {
		this.messages = messages;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
