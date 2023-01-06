package prj.springBootRestApi.CLICommands1.dto;

import java.util.Objects;

public class CommandReadDTO {

    public Integer id;
    public String description;
    public String line;

    public CommandReadDTO(Integer id, String description, String line) {
        this.id = id;
        this.description = description;
        this.line = line;
    }

    public CommandReadDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        CommandReadDTO that = (CommandReadDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(description, that.description) && Objects.equals(line, that.line);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, line);
    }

    @Override
    public String toString() {
        return "CommandReadDTO{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", line='" + line + '\'' +
                '}';
    }
}
