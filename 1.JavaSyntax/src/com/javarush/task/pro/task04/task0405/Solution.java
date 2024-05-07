package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int Visota=1;
        while(Visota<=10){
            int Shirina =1;
            while(Shirina<=20){
                if (Visota == 1||Visota == 10){
                System.out.print("Б");}
                else if (Shirina==1||Shirina==20) {
                    System.out.print("Б");
                }
                else {
                    System.out.print(" ");
                }
                Shirina++;

                }
                System.out.println();
            Visota++;
        }


    }
}