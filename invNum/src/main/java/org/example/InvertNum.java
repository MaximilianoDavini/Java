package org.example;

public class InvertNum {
        int numero;
     public InvertNum(int numCons) {
        this.numero = numCons;
    }

    public int Invert () {
        int reverso = 0;
        while (numero > 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }
        return reverso;
    }
}
