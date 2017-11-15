package com.company.programs;

import com.company.programs.lib.Scan;
import com.company.programs.template.Template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeFactors implements Template {
    private Integer[] generate(int n) {
        List<Integer> factors = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        List<Integer> counterFactors = new ArrayList<>();
        for (Integer factor: factors) {
            Integer counter = n / factor;
            if (!factors.contains(counter)) {
                counterFactors.add(counter);
            }
        }
        factors.addAll(counterFactors);
        Collections.sort(factors);
        List<Integer> nonPrime = new ArrayList<>();
        for (Integer factor: factors) {
            for (Integer dividend: factors) {
                if (!factor.equals(dividend) && dividend % factor == 0) {
                    nonPrime.add(dividend);
                }
            }
        }
        factors.removeAll(nonPrime);
        Integer[] factorArray = factors.toArray(new Integer[factors.size()]);
        Arrays.sort(factorArray);
        return factorArray;
    }

    @Override
    public void run() {
        Integer input = Scan.getInteger("Enter N:");
        if (input == null) return;
        Integer[] result = generate(input);
        String[] resultString = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            resultString[i] = result[i].toString();
        }
        System.out.println(String.join(", ", resultString));
    }
}
