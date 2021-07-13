/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex30;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        int max = 12;

        //Rows
        for(int x = 1; x <= max; x++) {

            //Columns
            for (int y = 1; y <= max; y++) {

                System.out.print(String.format("%4d", x * y)); //Creates a 12 x 12 multiplication table

            }
            System.out.println();

        }

    }

}
