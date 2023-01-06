package prj.springBootRestApi.CLICommands1.dto;

import java.util.Objects;

public class CommandCreateDTO {

    public String description;
    public String line;

    public CommandCreateDTO(String description, String line) {
        this.description = description;
        this.line = line;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandCreateDTO that = (CommandCreateDTO) o;
        return Objects.equals(description, that.description) && Objects.equals(line, that.line);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, line);
    }

    @Override
    public String toString() {
        return "CommandCreateDTO{" +
                "description='" + description + '\'' +
                ", line='" + line + '\'' +
                '}';
    }
}
