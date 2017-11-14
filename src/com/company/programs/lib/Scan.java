package com.company.programs.lib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    public static Integer getInteger(String... params) {
        // params[0] is the prompt message and params[1] is the error message
        Scanner scanner = new Scanner(System.in);
        System.out.println(params.length < 1 ? "Enter the length:" : params[0]);
        Integer input;
        // Handles exception where input is not an integer
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(params.length < 2 ? "Invalid input" : params[1]);
            return null;
        }
        return input;
    }

    public static String getString(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.next();
    }
}
