package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class GitHubUser {

	private long id;
	private String name;
	private String login;
	
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLogin() {
		return login;
	}
	
	
	
	
}
