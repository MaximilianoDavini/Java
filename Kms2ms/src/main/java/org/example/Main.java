package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float kms;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inicio de programa");
        System.out.println("Conversion de km/s a m/s");
        System.out.print("Ingrese los KM/S:..");
        kms = teclado.nextFloat();
        Conv toMs = new Conv(kms);
        toMs.fConv();
    }
}