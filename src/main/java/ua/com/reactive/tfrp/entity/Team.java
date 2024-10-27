package ua.com.reactive.tfrp.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "teams")
public class Team {
    @Id
    private int id;
    private String name;

    public Team(String name) {
        this.name = name;
    }
}
