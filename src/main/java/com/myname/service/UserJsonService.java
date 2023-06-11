package com.myname.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.myname.dto.UserDto;

public class UserJsonService {

    public String createUserJson(String name, String surname) {

        UserDto user = new UserDto();
        user.setName(name);
        user.setLastName(surname);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(user);

    }

}
