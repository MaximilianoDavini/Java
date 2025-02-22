package org.example;

public class Main {
    public static void main(String[] args) {

        int num=0;
        boolean a, b, resultado = true;
        a = num % 3 == 0;
        b = num % 5 == 0;
        do {
            num++;
            if (num % 3 == 0) {
                System.out.println(num + " fizz \n");
            } else if (num % 5 == 0) {
                System.out.println(num + " buzz \n");
            } else if ((a && b) == resultado){
                System.out.println(num + " Fizz buzz \n");
            } else {
                System.out.println(num + "\n");
            } 

        } while (num < 100);

    }
}
