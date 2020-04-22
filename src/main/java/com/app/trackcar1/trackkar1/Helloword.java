package com.app.trackcar1.trackkar1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloword {

        @GetMapping("/Hello")
        public String Hello(){
//            return "Apii!!!";
//            return  "działa";
            if(tel == tel2){ return "działa";     }
            else
                {return "nie działa";  }
        }

    Device tel = new Device(5,"test",5,"online",0);
    Device tel2 = new Device(5,"test",5,"online",0);


}

