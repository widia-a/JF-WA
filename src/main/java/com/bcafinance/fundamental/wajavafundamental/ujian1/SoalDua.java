package com.bcafinance.fundamental.wajavafundamental.ujian1;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-222.4345.14, built on October 5, 2022
@Author Widia a.k.a. Widia
Created on 11/11/2022 14:05
Last modified on 14:05
Version 1.0
*/

import java.util.Random;

public class SoalDua {
    public static void main(String[] args) {
        String strVocal = "aeiou";
        String strKonsonan = "bcdfghjklmnpqrstvwxyz";
        String strAlfabet = "abcdefghijklmnopqrstuvwxyz";

        Random ran = new Random();

        char[] chrVocal = strVocal.toCharArray();
        char[] chrKonsonan = strKonsonan.toCharArray();
        char[] chrAlfabet = strAlfabet.toCharArray();
        char chrKapital;

        int x = 0;
        int i;

        for (i = 0; i < 15; i++) {
            if (i<7){
                if (i == 0) {
                    x = ran.nextInt(2);
                    if (x == 1) {
                        chrKapital = Character.toUpperCase(chrKonsonan[ran.nextInt(21)]);
                        System.out.print(chrKapital);
                    }
                    else {
                        chrKapital = Character.toUpperCase(chrVocal[ran.nextInt(21)]);
                        System.out.print(chrKapital);
                    }
                }
                else if (i % 2 == 1) {
                    if (x == 1) {
                        System.out.print(chrVocal[ran.nextInt(5)]);
                    }
                    else {
                        System.out.print(chrKonsonan[ran.nextInt(21)]);
                    }
                }
                else if (i % 2 == 0) {
                    if (x == 0) {
                        System.out.print(chrVocal[ran.nextInt(5)]);
                    }
                    else {
                        System.out.print(chrKonsonan[ran.nextInt(21)]);
                    }
                }
            }
            else {
                System.out.print(chrAlfabet[ran.nextInt(26)]);
            }
        }
    }
}
//test


