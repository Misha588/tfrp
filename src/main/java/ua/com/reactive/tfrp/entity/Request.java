package ua.com.reactive.tfrp.entity;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Request {
    private Long id;
    private Long tenant_id;
    private Long team_id;
    private String work_type;
    private String scale;
    private LocalDate desired_date;
    private LocalTime desired_time;
    private Status status;

    public enum Status {
        NEW,
        IN_PROGRESS,
        COMPLETED
    }
}
