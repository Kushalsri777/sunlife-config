package com.example.user.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @Column(unique = true)
    private String userId;
    @Column(unique = true)
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private String about;
    private Long phoneNo;
    private String gender;
    private String nickName;
    private String password;

    @Transient    //we don't have to save this to the database so we use transient
    private List<Ratings> ratings = new ArrayList<>();
}
