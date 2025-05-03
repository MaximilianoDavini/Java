package org.example;

public class Conv {
    float kms, ms;
    public Conv (float kmsCons){
        this.kms = kmsCons;
        }

        public void fConv () {
            float resultado;
            resultado = kms * 1000;
            System.out.printf("El resultado del a conversion Km/s a M/S es: %f",resultado);
        }

}
