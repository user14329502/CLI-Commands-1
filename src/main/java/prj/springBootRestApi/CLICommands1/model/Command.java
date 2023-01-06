package prj.springBootRestApi.CLICommands1.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Command {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;
    private String description;
    private String line;
    LocalDateTime created_at;

    public Command(Integer id, String description, String line, LocalDateTime created_at) {
        this.id = id;
        this.description = description;
        this.line = line;
        this.created_at = created_at;
    }

    public Command() {
    }

    // Getters and Setters

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

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", line='" + line + '\'' +
                ", created_at=" + created_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return Objects.equals(id, command.id) && Objects.equals(description, command.description) &&
                Objects.equals(line, command.line) && Objects.equals(created_at, command.created_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, line, created_at);
    }
}
