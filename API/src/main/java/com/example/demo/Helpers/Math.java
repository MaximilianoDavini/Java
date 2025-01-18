package com.example.demo.Helpers;

public class  Math {

    private int numeroUno;
    private int numeroDos;
    

    public int Sumar()
    {
        return this.numeroUno + this.numeroDos;
    } 

    public Math SetNumeroUno(int numero)
    {
        this.numeroUno = numero;
        return this;
    }

    public Math SetNumeroDos(int numero)
    {
        this.numeroDos = numero;
        return this;
    }

    public Math Build()
    {
        if ( this.numeroUno == 0  || this.numeroDos == 0)
            System.out.println("Error en build");
        return this;
    }


}


