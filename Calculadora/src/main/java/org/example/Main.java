package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, opc, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("Calculadora JAVA");
        System.out.println("***************");
        do {
            System.out.println("\n***************");
            System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
            System.out.println("***************");
            System.out.print("\n ¿Que operacion desea realizar?: ");
            opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el primero valor: ");
                    a = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese el segundo valor: ");
                    b = teclado.nextInt();
                    teclado.nextLine();
                    resultado = a + b;
                    System.out.printf("El valor de la suma es: %d", resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primero valor: ");
                    a = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese el segundo valor: ");
                    b = teclado.nextInt();
                    teclado.nextLine();
                    resultado = a - b;
                    System.out.printf("El valor de la resta es: %d", resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primero valor: ");
                    a = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese el segundo valor: ");
                    b = teclado.nextInt();
                    teclado.nextLine();
                    resultado = a * b;
                    System.out.printf("El valor de la multiplicacion es: %d", resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primero valor: ");
                    a = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingrese el segundo valor: ");
                    b = teclado.nextInt();
                    teclado.nextLine();
                    resultado = a / b;
                    System.out.printf("El valor de la division es: %d", resultado);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar la calculadora.");
                    break;
            }
        }  while (opc != 5);
    }
}
