package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int min=Integer.MAX_VALUE;
       while(keyboard.hasNextInt())
       {
           int x = keyboard.nextInt();
           if (x < min) {
               min=x;
           }
       }
        System.out.println(min);

    }
}