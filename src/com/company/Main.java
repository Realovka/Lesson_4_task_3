package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int [] array = new int[15];
        Random random = new Random();

        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(99);
        }

        System.out.print(Arrays.toString(array));

        int y=0; // счетчик
        for(int i=0; i<array.length; i++){
            if (array[i] % 2 == 0){
                y++;
            }
        }

        System.out.println();
        System.out.println("Количество четных элементов "+y);

    }
}
