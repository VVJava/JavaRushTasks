package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int speed_wind = keyboard.nextInt();
        int sum = (int) Math.round (speed_wind*3.6);
        System.out.println(sum);

    }
}