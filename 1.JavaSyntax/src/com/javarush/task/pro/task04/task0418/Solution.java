package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner keyboard = new Scanner(System.in);
        boolean stakan = keyboard.nextBoolean();
        if (stakan) {
            int x = (int) Math.ceil(glass);
            System.out.println(x);
        }
        else{
            int y = (int) Math.floor(glass);
            System.out.println(y);
        }

        }

    }