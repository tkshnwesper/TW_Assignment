package com.company;

import com.company.programs.*;
import com.company.programs.template.Template;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Template> programs;

    // Just prints the menu
    private static void showMenu() {
        System.out.println("Select an option: (press 0 to quit)");
        for (int i = 0; i < programs.size(); i++) {
            System.out.println(Integer.toString(i + 1) + ". " + programs.keySet().toArray(new String[programs.size()])[i]);
        }
    }

    // Creates a HashMap of the program string names and their respective objects
    private static void initializePrograms() {
        programs = new HashMap<>();
        programs.put("Easiest exercise ever", new Easiest());
        programs.put("Draw a horizontal line", new HorizontalLine());
    }

    public static void main(String[] args) {
        initializePrograms();

        // Scanner in order to read inputs
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Shows menu at the start of the loop
            showMenu();
            int option;
            try {
                // Reads the integer entered into option
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                // Occurs in case character entered wasn't an integer
                System.out.println("Kindly enter an integer.");
                // To ignore the faulty input and go to the next line
                scanner.nextLine();
                continue;
            }
            // Checks to see whether option is within array bounds
            if (option > 0 && option <= programs.size()) {
                // One-liner to fetch and run the program!
                programs.get(programs.keySet().toArray(new String[programs.size()])[option - 1]).run();
            } else if (option == 0) {
                // To quit
                break;
            }
        }
    }
}
