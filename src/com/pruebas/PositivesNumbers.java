package com.pruebas;

import java.util.ArrayList;
import java.util.List;

public class PositivesNumbers {
    public static void main(String[] args){
        int[] input = new int[] {8, 1, 3, 1, 4, 5, 6, 3, 2};

        int output = countDuplicates(input);

        System.out.println(output);
    }

    static int countDuplicates(int[] numbers) {
        List noDuplicates = new ArrayList();
        int duplicates = 0;

        for(int i = 0; i<numbers.length; i++){
            if(!noDuplicates.contains(numbers[i])){
                noDuplicates.add(numbers[i]);
            }else{
                duplicates++;
            }
        }

        return  duplicates;
    }
}
