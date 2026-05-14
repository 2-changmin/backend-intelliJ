package org.example.memo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memo")
public class MemoController {

    @GetMapping
    public String test(){
        return "hello";
    }


}
