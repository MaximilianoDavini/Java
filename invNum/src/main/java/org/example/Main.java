package org.example;
import jdk.jshell.SourceCodeAnalysis;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, inver;
        System.out.println("Ingrese la serie de numeros a invertir\nEjemplo: 12345");
        System.out.println("Valor: ");
        valor = teclado.nextInt();
        InvertNum invertir = new InvertNum(valor);
        inver = invertir.Invert();
        System.out.println("Número original: " + valor);
        System.out.println("Número invertido: " + inver);
    }
}