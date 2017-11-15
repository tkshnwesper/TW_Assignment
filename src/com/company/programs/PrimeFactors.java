package com.company.programs;

import com.company.programs.lib.Scan;
import com.company.programs.template.Template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors implements Template {
    private Integer[] generate(int n) {
        List<Integer> factors = new ArrayList<>();
        // Finds square root to narrow down factor finding
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                // adds those that divide N to a List called factors
                factors.add(i);
            }
        }
        /* Counter factors are needed to find the remaining factors.
        For e.g. N = 10
        sqrt(N) = (something between 3 and 4)
        So using the previous step we obtain 2 as a factor
        But 5 is also a factor. Hence, we need to divide N / 2 = 5
         */
        List<Integer> counterFactors = new ArrayList<>();
        for (Integer factor: factors) {
            Integer counter = n / factor;
            // Ensures no duplicates
            if (!factors.contains(counter)) {
                counterFactors.add(counter);
            }
        }
        // Concatenates the two lists
        factors.addAll(counterFactors);
        /* From the factors list, not all are prime. So we create a list
        of those that are not prime and find their difference (in the end).
         */
        List<Integer> nonPrime = new ArrayList<>();
        for (Integer factor: factors) {
            for (Integer dividend: factors) {
                if (!factor.equals(dividend) && dividend % factor == 0) {
                    nonPrime.add(dividend);
                }
            }
        }
        // Remove all non-primes and what's remaining are the prime factors!
        factors.removeAll(nonPrime);
        Integer[] factorArray = factors.toArray(new Integer[factors.size()]);
        // Since sorting was also a part of the problem statement
        Arrays.sort(factorArray);
        return factorArray;
    }

    @Override
    public void run() {
        Integer input = Scan.getInteger("Enter N:");
        if (input == null) return;
        Integer[] result = generate(input);
        /* We need to convert the Integer array to a String array so we can join
        them using a delimiter.
         */
        String[] resultString = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            resultString[i] = result[i].toString();
        }
        // Joins the string array
        System.out.println(String.join(", ", resultString));
    }
}
