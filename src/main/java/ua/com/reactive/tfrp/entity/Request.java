package ua.com.reactive.tfrp.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Table(name = "requests")
public class Request {
    @Id
    private Long id;
    @Column("user_id")
    private Long user_id;
    @Column("team_id")
    private Long team_id;
    private String work_type;
    private String scale;
    private LocalDate desired_date;
    private LocalTime desired_time;
    private String status;

    public Request(Long user_id, Long team_id, String work_type, String scale, LocalDate desired_date, LocalTime desired_time, String status) {
        this.user_id = user_id;
        this.team_id = team_id;
        this.work_type = work_type;
        this.scale = scale;
        this.desired_date = desired_date;
        this.desired_time = desired_time;
        this.status = status;
    }


}
