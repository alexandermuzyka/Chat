package org.hillel.it.chat.model.entity;

public class User {
	private String nickname;
	private int age;
	private String sex;
	private String email;
	private String country;
	private String login;
	private String password;
	private Video video;
	private Chat[] chat;

	public User(String nickname, int age, String sex, String email,
			String country, String login, String password) {
		super();
		this.nickname = nickname;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.country = country;
		this.login = login;
		this.password = password;
	}

	public void input() {

	}

	public void exit() {

	}

	public void hidden() {

	}

	public void search() {

	}

	public void registrated() {

	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Chat[] getChat() {
		return chat;
	}

	public void setChat(Chat[] chat) {
		this.chat = chat;
	}

}
