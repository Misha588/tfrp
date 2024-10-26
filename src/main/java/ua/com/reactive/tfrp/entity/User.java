package ua.com.reactive.tfrp.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String username;
    private String password;
}
