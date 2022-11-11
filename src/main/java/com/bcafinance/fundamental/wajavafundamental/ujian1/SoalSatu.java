package com.bcafinance.fundamental.wajavafundamental.ujian1;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-222.4345.14, built on October 5, 2022
@Author Widia a.k.a. Widia
Created on 11/11/2022 13:41
Last modified on 13:41
Version 1.0
*/


import java.util.Scanner;

public class SoalSatu {
    public static void main(String[] args) {
        int intNumber = 0;
        int intTotal = 0;
        Boolean isAgain = true;
        Scanner sn = new Scanner(System.in);

        try{
            while (isAgain = true){
                System.out.println("Masukkan angka sepuasnya : ");
                intNumber = sn.nextInt();
                intTotal += intNumber;
            }
        }
        catch (Exception e){
            System.out.println("Jumlah : " + intTotal);
        }
    }
}
