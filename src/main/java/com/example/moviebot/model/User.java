package com.example.moviebot.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private Long chatId;
    private String username;
    private List<Preference> preferences;
    private String state;
}