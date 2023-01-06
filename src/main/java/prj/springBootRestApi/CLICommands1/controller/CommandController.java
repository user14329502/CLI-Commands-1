package prj.springBootRestApi.CLICommands1.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commands")
public class CommandController {
    private CommandService commandService;


    public CommandController(CommandService commandService) {     // Dependency (ArticleRepository) injection
        this.commandService = commandService;
    }

    //    @GetMapping
//    public Iterable<Article> findAll() {
//        return articles.findAll();
//    }
    @GetMapping
    @ApiOperation(value = "Get all commands.") // Information for the API documentation
    public ResponseEntity<List<CommandReadDTO>> findAll() {
        return ResponseEntity.ok(commandService.getAllCommands());
    }

//    @GetMapping("/{id}")
//    public Article findById(Integer id) {
//        return articles.findById(id);
//    }

    // write better code here
    @GetMapping("/{id}")
    @ApiOperation(value = "Get the command of the given id number.") // Information for the API documentation
    public ResponseEntity<CommandReadDTO> findById(@PathVariable Integer id) {
        CommandReadDTO commandDTO = commandService.findById(id);
        return ResponseEntity.ok(commandDTO);
    }

    @PostMapping
    // Information for the API documentation:
    @ApiOperation(value = "Creating a command: Please fill in the two attributes. " +
            "'description' is the command description, and 'line' is the code of the command.")
    public void addCommand(@RequestBody CommandCreateDTO request){
        commandService.addCommand(request);
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Replaces the command of a given id.") // Information for the API documentation
    public ResponseEntity<Void> update(@PathVariable Integer id,
                                       @RequestBody CommandCreateDTO request) {
        commandService.update(id,request);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete the given command.") // Information for the API documentation
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        commandService.delete(id);
        return ResponseEntity.ok().build();
    }
}

