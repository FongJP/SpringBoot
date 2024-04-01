package jp.fong.demo.restapi.service;

public class UserService {

	private final long id;
	private final String name;
	private final String loginId;
	private final String loginPw;
	private final String email;

	public UserService(long id, String name, String loginId, String loginPw, String email) {
		this.id = id;
		this.name = name;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLoginId() {
		return loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public String getEmail() {
		return email;
	}
	
	
}
