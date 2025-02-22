package org.example;
import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String textoA, textoB;
        int opcion;
        /// INICIO DE VALIDACION: ANAGRAMA
        System.out.println("**** INICIO DE PROGRAMA: ANAGRAMA ****");
        System.out.println("**** HAREMOS UNA VALIDACION DE STRINGS ****");
        System.out.println("[1: SI / 2: NO] -- ¿EMPEZAMOS?: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer texto a comparar: ");
                    textoA = teclado.nextLine();
                    System.out.print("Ingrese el segundo texto a comparar: ");
                    textoB = teclado.nextLine();
                    System.out.println("Enviamos los textos a validar en una función especifica...");
                    if (validacion(textoA, textoB) == true) {
                        System.out.printf("La validacion de los textos %s y %s es correcta, ambos son iguales.\n", textoA, textoB);
                    } else {
                        System.out.printf("La validacion de los textos %s y %s no fue exitosa, intente nuevamente...\n", textoA, textoB);
                    }
                break;
                case 2:
                    System.out.println("**** GRACIAS POR TU VISITA, ESPERAMOS VERTE PRONTO... ****");
                break;
                case 3:
                    break;
            }
     }
     public static boolean validacion (String A, String B) {
         String textoA = A, textoB = B;
         if (Objects.equals(textoA, textoB)) {
             return true;
         } else {
             return false;
         }
     }
}