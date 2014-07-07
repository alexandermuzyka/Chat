package org.hillel.it.chat.model.entity;

import java.util.Date;

public class Messages {
	private String text;
	private String[] smiles;
    private Date date = new Date();
	private String source;
	private String destination;
	private Files files;
	private Chat chat;
	
	public void seanding() {
		
	}
	
	public void insert() {
		
	}
	
	public void copy() {
		
	}
	
	public void paste() {
		
	}
	
	public void fontTransform() {
		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getSmiles() {
		return smiles;
	}

	public void setSmiles(String[] smiles) {
		this.smiles = smiles;
	}

	public Date getNow() {
		return date;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Files getFiles() {
		return files;
	}

	public void setFiles(Files files) {
		this.files = files;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	
}
