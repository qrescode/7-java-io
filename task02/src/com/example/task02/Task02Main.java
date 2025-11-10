package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int prev = -1;
        int curr;

        while ((curr = System.in.read()) != -1) {
            if (prev == '\r') {
                if (curr == '\n') {
                    System.out.write('\n');
                    prev = -1;
                } else {
                    System.out.write('\r');
                    prev = curr;
                }
            } else {
                if (prev != -1) {
                    System.out.write(prev);
                }
                prev = curr;
            }
        }

        if (prev != -1) {
            System.out.write(prev);
        }

        System.out.flush();
    }
}
