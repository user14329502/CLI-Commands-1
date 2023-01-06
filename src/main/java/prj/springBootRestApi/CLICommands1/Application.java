package prj.springBootRestApi.CLICommands1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prj.springBootRestApi.CLICommands1.apiDocumentation.SpringFoxConfig;

@SpringBootApplication
public class Application {

	// Customizing the GUI:
	SpringFoxConfig springFoxConfig = new SpringFoxConfig();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
