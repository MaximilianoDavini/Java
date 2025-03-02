package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int dniMain, opc;
        String nombreMain, apellidoMain;

        Scanner teclado = new Scanner(System.in);
        System.out.println("****** SISTEMA DE GESTION BANCARIO ******");
        System.out.println("****** ¿DESEA CREAR UN USUARIO?: ");

        System.out.println("Ingrese su nombre: ");
        nombreMain = teclado.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellidoMain = teclado.nextLine();
        System.out.println("Ingrese su DNI");
        dniMain = teclado.nextInt();
        System.out.println("***** PERFECTO, TU USUARIO HA SIDO CREADO EXITOSAMENTE. *****");
        CuentaBancaria nuevoUsuario = new CuentaBancaria(nombreMain, apellidoMain, dniMain);
        do {
        System.out.print("""
                
                Menu:
                * 1: Detalle de cuenta
                * 2: Depositar dinero a cuenta.
                * 3: Retirar dinero.
                * 0: Salir
                """);
        opc = teclado.nextInt();
           switch (opc) {
                case 1:
                    nuevoUsuario.detalleTitularFull();
                    break;
                case 2:
                    float depositar;
                    System.out.println("Ingrese la cantidad de dinero a depositar: ");
                    depositar = teclado.nextFloat();
                    nuevoUsuario.depositar(depositar);
                    break;
                case 3:
                    float retirar;
                    System.out.println("Ingrese la cantidad de dinero a retirar: ");
                    retirar = teclado.nextFloat();
                    nuevoUsuario.retirar(retirar);
                    break;
               default:
                    System.out.println("Esperamos verte pronto!");
                    break;
           }
        } while (opc != 0);
    }

}