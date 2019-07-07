package com.richard.joinfaces.home;

import lombok.Getter;
import lombok.Setter;

import javax.inject.Named;

@Named(value = "home")
public class HomeMBean {

    @Getter @Setter
    private String firstName = "Richard";

    @Getter @Setter
    private String lastName = "Viana";

    public String showGreeting() {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
