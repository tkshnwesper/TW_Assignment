package com.company;

import com.company.programs.*;
import com.company.programs.lib.Scan;
import com.company.programs.template.Template;

import java.util.HashMap;
import java.util.Map;

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
        programs.put("Prime Factors Exercise", new PrimeFactors());
        programs.put("FizzBuzz", new FizzBuzz());
        programs.put("Diamond with name", new DiamondWithName());
        programs.put("Diamond", new Diamond());
        programs.put("Isosceles triangle", new IsoscelesTriangle());
        programs.put("Draw a right triangle", new RightTriangle());
        programs.put("Draw a vertical line", new VerticalLine());
        programs.put("Draw a horizontal line", new HorizontalLine());
        programs.put("Easiest exercise ever", new Easiest());
    }

    public static void main(String[] args) {
        initializePrograms();
        while (true) {
            // Shows menu at the start of the loop
            showMenu();
            Integer option = Scan.getInteger("Enter option:", "Oops! Invalid option. Please enter an integer.");
            if (option == null) continue;
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
