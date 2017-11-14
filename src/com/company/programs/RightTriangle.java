package com.company.programs;

import com.company.programs.lib.Scan;
import com.company.programs.template.Template;

public class RightTriangle implements Template {
    @Override
    public void run() {
        Integer input = Scan.getInteger();
        if (input == null) return;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
