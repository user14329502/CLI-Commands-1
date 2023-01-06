package prj.springBootRestApi.CLICommands1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prj.springBootRestApi.CLICommands1.apiDocumentation.SpringFoxConfig;

@SpringBootApplication
public class Application {
	Logger logger = LoggerFactory.getLogger(Application.class);

	// Customize the GUI:
	SpringFoxConfig springFoxConfig = new SpringFoxConfig();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
