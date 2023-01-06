package prj.springBootRestApi.CLICommands1.service;

import org.springframework.stereotype.Service;
import prj.springBootRestApi.CLICommands1.dto.CommandCreateDTO;
import prj.springBootRestApi.CLICommands1.dto.CommandReadDTO;
import prj.springBootRestApi.CLICommands1.model.Command;
import prj.springBootRestApi.CLICommands1.repository.CommandRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandService {

    //    @Autowired // necessary?
    private CommandRepository commandRepository;

//    @Autowired
//    private ModelMapper modelMapper;


    public CommandService(CommandRepository commandRepository) {
        this.commandRepository = commandRepository;
    }

//    public ArticleService() {
//    }

    public List<CommandReadDTO> getAllCommands(){
        return commandRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    public CommandReadDTO findById(Integer id){
        Command command = commandRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException());
        return convertEntityToDto(command);
    }
    public void addCommand(CommandCreateDTO request){
        // TODO: Check if the request has the correct format ?
        Command command = convertDtoToEntity(request);
        command.setCreated_at(LocalDateTime.now());
        commandRepository.save(command);
    }

    public void update(Integer id, CommandCreateDTO request){
        if(commandRepository.findById(id).isEmpty()){
            throw new ResourceNotFoundException();
        }
        Command updatedCommand = convertDtoToEntity(request);
        updatedCommand.setId(id);
        commandRepository.save(updatedCommand);
    }

    public void delete(Integer id){
        if(commandRepository.findById(id).isEmpty()){
            throw new ResourceNotFoundException();
        }
        commandRepository.deleteById(id);
    }



    // DTO <-> Entity Conversion
    // TODO: Use the 'modelMapper' library for automatic conversion
    private CommandReadDTO convertEntityToDto(Command user){
        CommandReadDTO userLocationDTO = new CommandReadDTO();
        userLocationDTO.setId(user.getId());
        userLocationDTO.setDescription(user.getDescription());
        userLocationDTO.setLine(user.getLine());
        return userLocationDTO;
    }

    private Command convertDtoToEntity(CommandCreateDTO commandDTO){
        Command command = new Command();
        command.setDescription(commandDTO.getDescription());
        command.setLine(commandDTO.getLine());
        return command;
    }








//     Automatic conversion using the 'modelMapper' library:
//    private ArticleDTO convertEntityToDto(Article article){
//        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
//        ArticleDTO articleDTO = new ArticleDTO();
//        articleDTO = modelMapper.map(article, articleDTO.class);
//        return articleDTO;
//    }
//
//    private User convertDtoToEntity(UserLocationDTO userLocationDTO){
//        modelMapper.getConfiguration()
//                .setMatchingStrategy(MatchingStrategies.LOOSE);
//        User user = new User();
//        user = modelMapper.map(userLocationDTO, User.class);
//        return user;
//    }
}
