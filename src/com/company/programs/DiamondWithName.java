package com.company.programs;

import com.company.programs.lib.Scan;

public class DiamondWithName extends IsoscelesTriangle {
    @Override
    public void run() {
        Integer input = Scan.getInteger();
        if (input == null) return;
        String name = Scan.getString("Enter name:");
        this.draw(input - 1);
        System.out.println(name);
        this.drawReverse(input - 1, 0);
    }
}
