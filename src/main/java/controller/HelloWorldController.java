package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    /** Hello world*/
    private String helloWorld = "Hello World";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getHelloWorld(){
        return helloWorld;
    }
}
