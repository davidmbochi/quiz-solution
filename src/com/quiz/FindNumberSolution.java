package com.quiz;

import java.util.List;

public class FindNumberSolution {
    public static String findNumber(List arr, int k){
        String result = null;
        for (int i = 0; i < arr.size(); i++) {
            if ((int) arr.toArray()[i] == k){
               result = "YES";
            }else {
                result = "NO";
            }
            break;
        }
        return  result;
    }
    public static void main(String[] args) {
        List<Integer> array = List.of(2, 3, 1);
        int k = 5;

        System.out.println(findNumber(array,k));
    }
}
