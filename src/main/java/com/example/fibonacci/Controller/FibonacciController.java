package com.example.fibonacci.Controller;

import com.example.fibonacci.Service.FibonacciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/fibonacci")
@RequiredArgsConstructor
public class FibonacciController {
    private final FibonacciService fibonacciService;

    @PostMapping("/calc")
    public ResponseEntity<String> requestFibonacciSequence(@RequestParam int length){

        try{
            return ResponseEntity.ok(String.valueOf(fibonacciService.createFibonacciSequence(length)));
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body("bad value");
        }
    }

}
