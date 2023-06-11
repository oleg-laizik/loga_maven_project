package com.myname;

import com.myname.service.UserJsonService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        UserJsonService userJsonService = new UserJsonService();
        log.info(userJsonService.createUserJson("Oleg", "Lohazyak"));

    }
}
