package com.example.task04;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        double sum = 0.0;

        // читаем весь ввод с помощью Scanner
        Scanner scanner = new Scanner(System.in);

        // пока есть токены (слова, разделённые пробелами/переносами)
        while (scanner.hasNext()) {
            String token = scanner.next(); // берём очередное слово
            try {
                double value = Double.parseDouble(token); // пробуем преобразовать
                sum += value;
            } catch (NumberFormatException e) {
                // если не число — просто пропускаем
            }
        }

        // выводим с 6 знаками после запятой, используя англ. локаль (разделитель — точка)
        System.out.printf(Locale.US, "%.6f", sum);

        System.out.flush();
    }
}

