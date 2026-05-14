package org.example.memo.controller;

import org.example.memo.dto.MemoRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/memo")
public class MemoController {

    @GetMapping
    public String test(){
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "안녕하세요 " + name + "님";
    }

    @PostMapping
    public String createMemo(@RequestBody MemoRequestDto request){
        return "메모 저장 완료: " + request.getContent();
    }

}
