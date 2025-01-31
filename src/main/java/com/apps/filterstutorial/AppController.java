package com.apps.filterstutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome(){
        return "home page";
    }

    @RequestMapping(value = "/secured", method = RequestMethod.GET)
    public String getSecured(){
        return "secured page";
    }

}
