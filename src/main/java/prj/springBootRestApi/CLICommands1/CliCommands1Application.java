package prj.springBootRestApi.CLICommands1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliCommands1Application {
	Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	// Customize the GUI:
	SpringFoxConfig springFoxConfig = new SpringFoxConfig();

	public static void main(String[] args) {
		SpringApplication.run(CliCommands1Application.class, args);
	}

}
