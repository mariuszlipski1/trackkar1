package com.app.trackcar1.trackkar1;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@Service
@Component
@Repository
@Controller
@RestController
public class Helloword {

        @RequestMapping("/")
        public String index(){
            return "Api";
        }

}

