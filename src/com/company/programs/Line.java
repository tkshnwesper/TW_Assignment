package com.company.programs;

import com.company.programs.template.Template;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Line implements Template {
    abstract String delimiter();
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length:");
        int input;
        // Handles exception where input is not an integer
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i < input; i++) {
            System.out.print("*");
            System.out.print(this.delimiter());
        }
        System.out.println();
    }
}
