package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getInt(9, 7);
        // write your code here
        factor(100);
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] Arr = new int[100];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(Arr));
        int[] Rar = {1, 5, 2, 3, 5, 4, 6, 7, 7, 9, 8, 2, 3, 7, 4};
        for (int i = 0; i < Rar.length; i++) {
            if (Rar[i] < 6) {
                Rar[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(Rar));
    }

    public static int[][] factor(int c) {
        int[][] Car = new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j || i + j == c - 1) {
                    Car[i][j] = 1;
                }
            }
        }
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j || i + j == c - 1) {
                    Car[i][j] = 1;
                }
            }
        }
        System.out.println(buf.toString());
        return Car;
    }
    public static int[] getInt(int len, int initialValue){
       int[] Gar = new int[len];
       for(int i=0; i<Gar.length; i++) {
           Gar[i] =initialValue;
       }
        StringBuffer buf = new StringBuffer();
        for(int i=0; i<Gar.length; i++) {
            Gar[i] =initialValue;
                    Gar[i] = 1;
                }
        System.out.println(buf.toString());
       return Gar;
    }

    }
