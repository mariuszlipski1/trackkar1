package com.app.trackcar1.trackkar1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloword {

        @GetMapping("/Hello")
        public String Hello(){
            return "Apii!!!";
        }

}

