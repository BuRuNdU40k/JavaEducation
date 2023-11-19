package ru.aphirri.edu;

import java.util.Scanner;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ml = new Scanner(System.in);
        System.out.println("I am very tired:");
        int mus = ml.nextInt();
        int[] ar = new int[mus];
        System.out.println("Consul begging :{");
        for (int i = 0; i < mus; i++) {
            ar[i] = (int) (Math.random() * 100);
            System.out.print(ar[i]);
            System.out.print("  ");
            System.out.println(i);
        }
        System.out.println("Consul end :}");
        int max = ar[0];
        for (int sf = 0; sf < mus-1; sf++) {                 //max
            if (max < ar[sf + 1]) {
                max = ar[sf + 1];
            }
        }
        System.out.println("max = "+ max);
        int min = ar[0];
        for (int h = 0; h < mus-1; h++) {                 //min
            if (min > ar[h + 1]) {
                min = ar[h + 1];
            }
        }
        System.out.println("min = "+ min);
        float avg = ar[0];
        for (int av = 1; av < mus; av++) {                //avg ... интересно что это такое... Animal Vegetable Goal или AVGust...
            avg = (avg + ar[av]);
        }
        avg = avg / (mus-1);
        System.out.println("avg = " + avg);
    }
}
