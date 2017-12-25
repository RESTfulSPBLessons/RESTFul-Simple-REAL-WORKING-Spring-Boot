package com.antonromanov.angular4.spa4.controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/user")
public class WebRestController {


    String json = "{\"id\":2488,\"content\":\"Hello!\"}";
    /*
    @RequestMapping(
            value = "/hello",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public String hi(@RequestParam(value = "name") String name){
        return name+" - TEST";
    }

   */

    @GetMapping(value="/hello")
    public String hi(@RequestParam(value = "name") String name){
    //    return name+" - TEST";
        return json;
    }


}

