package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nombredb, usuario, contraseña;
        Scanner teclado = new Scanner(System.in);
            System.out.println("*** INGRESA A LA DB ***");
            System.out.println("DB: ");
            nombredb = teclado.nextLine();
            System.out.println("Usuario: ");
            usuario = teclado.nextLine();
            System.out.println("Contraseña");
            contraseña = teclado.nextLine();
            ConexionJ db = new ConexionJ(nombredb,usuario,contraseña);
        }
}