package com.company.programs;

import com.company.programs.lib.Scan;
import com.company.programs.template.Template;

public abstract class Line implements Template {
    abstract String delimiter();
    public void run() {
        Integer input = Scan.getInteger();
        if (input == null) return;
        for (int i = 0; i < input; i++) {
            System.out.print("*");
            System.out.print(this.delimiter());
        }
        System.out.println();
    }
}
