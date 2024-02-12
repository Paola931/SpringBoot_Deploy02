package com.example.Deploy_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SumController {
    @GetMapping("/get")
    public int getSumOfNumbers(@RequestParam int firstNumber,
                               @RequestParam int secondNumber){
       return firstNumber + secondNumber;
    }
}
