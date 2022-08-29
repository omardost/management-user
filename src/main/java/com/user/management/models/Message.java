package com.user.management.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class Message {
    @JsonProperty(value= "mensaje")
    @Getter
    @Setter
    private String message;
}
