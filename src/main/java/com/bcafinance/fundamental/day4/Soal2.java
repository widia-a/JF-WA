package com.bcafinance.fundamental.day4;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-222.4345.14, built on October 5, 2022
@Author widia a.k.a. Widia
Created on 10/11/2022 14:36
Last modified on 14:36
Version 1.0
*/

public class Soal2 {
    public static void main(String[] args) {
        int keyword = 99;
        int[] val = {66,77,80,84,88,99,100};
        int low = 0;
        int high = val.length - 1;
        int med = 0;
        Boolean status = false;

        while (low<=high){
            med = (low + high) / 2;
            if (keyword == val[med]){
                System.out.println(keyword + " FOUNDED in position " + (med+1) + " and INDEX " + med);
                status = true;
                break;
            }
            else {
                if (keyword > val[med]){
                    low = med + 1;
                }
                else {
                    high = med - 1;
                }
            }
        }
        if (status == false){
            System.out.println(keyword + " NOT FOUND!");
        }

    }
}
