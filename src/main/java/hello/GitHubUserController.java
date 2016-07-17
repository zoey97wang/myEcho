package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/github/user")
public class GitHubUserController {

	private GitHubService gitHubService;
	
	@Autowired
	public GitHubUserController(GitHubService gitHubService){
		this.gitHubService = gitHubService;
	}
	
	@RequestMapping("/{username}")
	@ResponseBody
	public GitHubUser getGitHubUser(@PathVariable(value = "username") String username){
		return gitHubService.getUser(username);
	}
	
}
