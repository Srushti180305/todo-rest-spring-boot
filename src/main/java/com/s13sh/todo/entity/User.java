package com.s13sh.todo.entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import com.s13sh.todo.dto.UserRequest;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String email;

    @CreationTimestamp
    private LocalDateTime createdTime;

    public User(UserRequest request) {
        this.email = request.getEmail();
        this.username = request.getUsername();
        this.password = request.getPassword();
    }

    public boolean checkPassword(String rawPassword) {
        return this.password.equals(rawPassword);
    }
}