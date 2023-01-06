package prj.springBootRestApi.CLICommands1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prj.springBootRestApi.CLICommands1.model.Command;

public interface CommandRepository extends JpaRepository<Command, Integer> {
}
