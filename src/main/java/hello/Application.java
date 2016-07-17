package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;




@EnableAutoConfiguration
@ComponentScan(basePackages = {"hello"})
@PropertySource({"classpath:application.properties"})
@SpringBootApplication
public class Application {

 //   private static final Logger log = LoggerFactory.getLogger(Application.class);

	@Autowired
	private Environment env;
	
	@Bean(name = "gitHubuserApiUrl")
	public String gitHubUserApiUrl(){
		return env.getProperty("api.github.user.url");
	}
	
    public static void main(String args[]) throws Exception{
        SpringApplication.run(Application.class);
    }


}