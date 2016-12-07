package pl.edu.utp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xxbar on 07.12.2016.
 */
@RestController
public class PingController {

    @RequestMapping(path = "/api/ping", method = RequestMethod.GET, produces = "application/json")
    public String ping(){
        return "pong";
    }

//    @RequestMapping(path = "/api/person", method = RequestMethod.GET, produces = "application/json")
//    public Person getPerson(){
//        return new Person(1,"Bartosz", "Teska");
//    }
}
