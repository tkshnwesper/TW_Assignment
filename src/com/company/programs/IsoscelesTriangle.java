package com.company.programs;

import com.company.programs.lib.Scan;
import com.company.programs.template.Template;

public class IsoscelesTriangle implements Template {
    void drawReverse(int input, int offset) {
        for (int i = 0; i < input; i++) {
            // Spaces
            for (int j = 0; j < i + offset; j++) {
                System.out.print(' ');
            }
            // Asterisk
            for (int j = 0; j < (2 * input - 1) - 2 * i; j++) {
                System.out.print('*');
            }
            // NL
            System.out.println();
        }
    }

    void draw(int input) {
        for (int i = 0; i < input; i++) {
            // Prints spaces
            for (int j = 0; j < input - i - 1; j++) {
                System.out.print(' ');
            }
            // Prints asterisk
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            // NL
            System.out.println();
        }
    }
    @Override
    public void run() {
        Integer input = Scan.getInteger();
        if (input == null) return;
        this.draw(input);
    }
}
