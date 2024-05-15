package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Количество банок колы в ящике: ");
       int kola = keyboard.nextInt();
       System.out.println("Количество сотрудников в кабинете: ");
       int sotrudnik = keyboard.nextInt();
       double sum = 1.0*kola/sotrudnik ;
       System.out.println("Каждому сотруднику достанется банок колы: "+sum);




    }
}