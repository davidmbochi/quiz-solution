package com.quiz;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersSolution {
    public static List oddNumbers(int l, int r){
        int count = l;
        List<Integer> list = new ArrayList();
        do {
            if ((count % 2) != 0){
                list.add(count);
            }
            count++;
        }while (count <= r);

        return list;
    }
    public static void main(String[] args) {

        System.out.println(oddNumbers(2,5));

    }
}
