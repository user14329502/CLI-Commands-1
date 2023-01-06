package prj.springBootRestApi.CLICommands1.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import prj.springBootRestApi.CLICommands1.dto.CommandReadDTO;
import prj.springBootRestApi.CLICommands1.service.CommandService;

@WebMvcTest(CommandController.class)
class CommandsControllerTest {

    CommandController controller;

    @MockBean
    CommandService service;

    List<CommandReadDTO> commandReadDTOs = new ArrayList();


    @BeforeEach
    void setUp() {
        controller = new CommandController(service);

        /* In order to only test the controller unit, mock articleDTOs are generated in this class instead of using the
           real articles from ArticleRepository */
        commandReadDTOs = List.of(new CommandReadDTO(1,"Test command","test command"));
    }

    @Test
    void shouldReturnAllCommands() {

        Mockito.when(service.getAllCommands()).thenReturn(commandReadDTOs);
        assertEquals(1,controller.findAll().getBody().spliterator().getExactSizeIfKnown());
    }

    @Test
    void shouldReturnArticleByIdWithValidId() {
        Mockito.when(service.findById(1)).thenReturn(commandReadDTOs.get(0));

        CommandReadDTO commandDTO = controller.findById(1).getBody();
        // System.out.println(commandDTO);
        assertNotNull(commandDTO);
    }

    // TODO: Add more tests

}
