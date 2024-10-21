package com.user.user_service.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    private String email;
    private String description;

    //we are telling database we don't have to save it to databaase;
    @Transient
    private List<Rating> ratings = new ArrayList<>();


}
