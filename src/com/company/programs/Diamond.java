package com.company.programs;

import com.company.programs.lib.Scan;

public class Diamond extends IsoscelesTriangle {
    @Override
    public void run() {
        Integer input = Scan.getInteger();
        if (input == null) return;
        this.draw(input);
        this.drawReverse(input - 1, 1);
    }
}
