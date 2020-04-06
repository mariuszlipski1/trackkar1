package com.app.trackcar1.trackkar1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloword {

        @RequestMapping("/")
        public String index(){
            return "Dołączone PotsgreSQL";
        }

}

