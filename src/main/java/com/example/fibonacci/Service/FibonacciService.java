package com.example.fibonacci.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class FibonacciService {
    public int createFibonacciSequence(int length) throws IllegalArgumentException{
        int n = 0;
        int m = 1;
        int fibo = 0;
        if(length == 0){
            return 0;
        } else if (length < 0) {
            throw new IllegalArgumentException("invalid value");
        }
        for ( int i = 1; i <= length; i++){
         fibo = n + m;
         n = m;
         m = fibo;
     }
     return fibo;
    }

}
