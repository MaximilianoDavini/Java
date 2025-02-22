package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 1;
            System.out.printf("%d, ", a);
        for ( int i = 1; i < 50; i++) {
            System.out.printf("%d, ",c);
            c = a + b;
            a = b;
            b = c;
        }
    }
}