package ru.aphirri.edu;

import java.util.Scanner;
import java.io.IOException;

public class Main {
    // COMMENT: IOException подсвечен серым - это значит он не используется.
    // Пока не объясняю, что это такое, но код, которым подсвечен серым - можно смело удалять.
    public static void main(String[] args) throws IOException {
        // COMMENT: Мне не понятно имя переменной, нужно что-то более говорящее
        Scanner ml = new Scanner(System.in);
        // COMMENT: Пожалуйста, давай не будем писать бесполезные комментарии
        System.out.println("I am very tired:");
        // COMMENT: Мне не понятно имя переменной, нужно что-то более говорящее
        int mus = ml.nextInt();
        // COMMENT: Пока не объясняю про ресурсы, но new Scanner(System.in) выделяет определенное количество ресурсов
        // на поддержание сканера. Когда он уже не используется - нужно закрыть этот ресурс. Тут должно быть ml.close();
        int[] ar = new int[mus];

        // COMMENT: во-первых консоль пишется как console. Во вторых - не очень красиво использовать ":{:}" как разделители
        System.out.println("Consul begging :{");
        for (int i = 0; i < mus; i++) {
            ar[i] = (int) (Math.random() * 100);
            System.out.print(ar[i]);
            // COMMENT: плохая идея использовать большое количество пробелов, лучше \t
            System.out.print("  ");
            // COMMENT: не знаю, зачем знать о его индексе. Можно было просто сами элементы вывести как [12,63,12] и тд.
            System.out.println(i);
        }
        System.out.println("Consul end :}");

        int max = ar[0];
        // COMMENT: Мне не понятно имя переменной sf, нужно что-то более говорящее, либо просто i, j - привычные переменные для итерации.
        // max <<-- COMMENT: вот тут
        for (int sf = 0; sf < mus-1; sf++) {                 //max ---- COMMENT: плохо так комментарии писать. Лучше над блоком кода
            if (max < ar[sf + 1]) {
                max = ar[sf + 1];
            }
        }
        System.out.println("max = "+ max); // COMMENT: Вот тут не хватает отступа хотя бы для лучшего понимания, где код логически разделяется.
        int min = ar[0];

        // COMMENT: те же комментарии к переменной и комментарию "// min"
        for (int h = 0; h < mus-1; h++) {                 //min
            if (min > ar[h + 1]) {
                min = ar[h + 1];
            }
        }
        System.out.println("min = "+ min);

        // COMMENT: лучше приравнять 0 и начать итерироваться с 0, а не с 1
        float avg = ar[0];
        for (int av = 1; av < mus; av++) {                //avg ... интересно что это такое... Animal Vegetable Goal или AVGust... COMMENT: на самом деле с первого запроса гуглится. avg - общепринятое сокращение average - что переводится как "среднее"
            // COMMENT: можно было использовать avg += ar[av];
            avg = (avg + ar[av]);
        }
        // COMMENT: и тут avg /= mus - 1
        avg = avg / (mus-1);
        System.out.println("avg = " + avg);
    }
}
