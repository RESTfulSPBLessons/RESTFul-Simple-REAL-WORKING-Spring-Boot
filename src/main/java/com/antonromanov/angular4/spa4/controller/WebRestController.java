package com.antonromanov.angular4.spa4.controller;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest")
public class WebRestController {


    String json = "{\"id\":2488,\"content\":\"Hello!\"}";
    @GetMapping(value="/hello")
    public String hi(@RequestParam(value = "name") String name){
        return json;
    }


}

