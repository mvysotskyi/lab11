package com.lab.task1;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

enum Gender {
    MALE, FEMALE
}

@Getter
@SuperBuilder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}