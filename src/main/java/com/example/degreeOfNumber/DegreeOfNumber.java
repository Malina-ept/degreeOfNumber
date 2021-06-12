package com.example.degreeOfNumber;

public class DegreeOfNumber {

        public Integer square(Integer val1) {
            return val1 * val1;
        }

        public Integer cube(Integer val1){
            return val1 * val1 * val1;
        }

    public static int exponentiation(Integer val1, Integer val2) {
        Integer result = 1;
        for (Integer i = 1; i <= val2; i++) {
            result = result * val1;
        }
        return result;
    }
}
