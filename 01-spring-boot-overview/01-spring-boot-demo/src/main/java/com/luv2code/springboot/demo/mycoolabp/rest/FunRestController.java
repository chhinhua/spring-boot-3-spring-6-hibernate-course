package com.luv2code.springboot.demo.mycoolabp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chhin_Hua - 13/03
 **/

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
}
