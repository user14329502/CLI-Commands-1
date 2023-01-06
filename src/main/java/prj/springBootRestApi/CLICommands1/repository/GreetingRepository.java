package prj.springBootRestApi.CLICommands1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prj.springBootRestApi.CLICommands1.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
