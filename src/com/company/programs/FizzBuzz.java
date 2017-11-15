package com.company.programs;

import com.company.programs.template.Template;

public class FizzBuzz implements Template {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            boolean divisibleBy3 = i % 3 == 0, divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                System.out.println("FizzBuzz");
            } else if (divisibleBy3) {
                System.out.println("Fizz");
            } else if (divisibleBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
