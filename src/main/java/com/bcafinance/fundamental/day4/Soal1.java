package com.bcafinance.fundamental.day4;

/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-222.4345.14, built on October 5, 2022
@Author widia a.k.a. Widia
Created on 10/11/2022 13:56
Last modified on 13:56
Version 1.0
*/

public class Soal1 {

    public static void main(String[] args) {
        int[] intArr = {3,8,5,2,1,9,10};
        int intB = 8;
        Boolean isFound = true;
        int i = 0;

        for(i=0; i<intArr.length; i++){
                if(intB == intArr[i]){
                    System.out.println("Angka " + intB + " sudah ditemukan pada index ke " + i);
                    isFound = false;
                    break;
                }
            }
        if (isFound == true){
            System.out.println("Angka " + intB + " yang Anda cari tidak ditemukan");
        }
    }
}
