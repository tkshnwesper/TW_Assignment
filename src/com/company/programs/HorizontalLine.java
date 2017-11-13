package com.company.programs;

import com.company.programs.template.Template;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HorizontalLine implements Template {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the horizontal line:");
        int input;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i < input; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
