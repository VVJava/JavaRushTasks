package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int sum = 0;
        boolean isExit =false;
        while(!isExit)
        {
            if (keyboard.hasNextInt()) {
                int number = keyboard.nextInt();
                sum = sum+number;
            } else if (keyboard.hasNextLine()) {
                String line = keyboard.nextLine();
                if (line.equals("ENTER")){
                    isExit = true;
                }

            }
        }
        System.out.println(sum);

    }
}