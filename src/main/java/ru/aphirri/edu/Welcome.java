package ru.aphirri.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Welcome {
    public static void main(String[] args) throws IOException {

        // Ввод с помощью консоли и вывод
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String read = reader.readLine();

        System.out.println(read);

        // Типы данных
        Integer i = 10;

        String s = "str";

        char c = 'c';
        Character cc = 'c';

        float f = 10;
        f -= 0.1F;
        Float ff = 10.0F;

        double d = 10.1;
        d += 0.1;
        Double dd = 10.0;

        boolean b = true;
        Boolean bb = false;

        byte by = 0;
        short sh = 0;
        int ii = 0;
        long l = 0;

        // Тип перечисления
        enum Color {
            RED(1),
            GREEN(2),
            YELLOW(3);

            public int label = 1;

            Color(int label) {
                this.label = label;
            }
        }
        Color color = Color.RED;

        // Ветвления if/else
        if (true) {
            by = 1;
        } else {
            by = 2;
        }

        // Switch
        switch (color) {
            case RED:
                sh = 1;
            case GREEN:
                sh = 0;
            case YELLOW:
                sh = 12;
        }

        // Арифметические выражения
        i = i + 1;
        i *= 2;
        i++;


        // Массивы
        int size = 10;
        int[] array = new int[size];
        array[0] = 1;
        float[] arrayF = new float[]{0.0F, 1.5F};
        String[] arrayS = new String[]{"123", "345"};
        Color[] arrayC = new Color[]{Color.RED, Color.RED};

        // List
        List<String> list = new ArrayList<>();
        List<Integer> listI = new ArrayList<>();
        List<Color> listC = new ArrayList<>();

        // Циклы
        for (int j = 0; j < list.size(); j++) {

        }

        while (true) {

        }
    }
}
