package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean afterFirstNegative = false;
        int positiveNumbers = 0;
        double res = 0.0;
        double nums[] = {2.2, 3.3, 4.4, 5.5, 6.6, -7.7, -8.8, 9.9, 10.1, 11.9, 2.3, -7.7, 8.5, 17.7, -1.1};
        for (double i : nums){
            if (i >= 0 && !afterFirstNegative){
                continue;
            }
            else if(i >= 0 && afterFirstNegative){
                positiveNumbers++;
                res = res + i;
            }
            else {
                afterFirstNegative = true;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(res + " / " + positiveNumbers + " = " + (res/positiveNumbers));
        System.out.println("Avarage is: " + (res/positiveNumbers));


        int array[] = {0, -1, 2, 9, -5, 7};
        int indexMin = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int minimum = array[i];
            for (int j = i; j < array.length; j++) {
                if(array[j] <= minimum){
                    minimum = array[j];
                    indexMin = j;
                }
            }
            temp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = temp;

        }
    }
}
