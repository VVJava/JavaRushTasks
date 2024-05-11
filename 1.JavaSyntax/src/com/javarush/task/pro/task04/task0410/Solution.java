package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner keyboard = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        while (keyboard.hasNextInt()){
            int RES = keyboard.nextInt();
            if (RES<min){
                min2=min;
                min = RES;
            }
            else if (RES>min && RES<min2) {
                min2=RES;
            }
        }
        System.out.println(min2);
        }

    }
