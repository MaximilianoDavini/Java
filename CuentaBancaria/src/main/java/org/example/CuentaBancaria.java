package org.example;

public class CuentaBancaria extends Titular {
    static int numeroCuenta = 0;
    float saldo = 0, depo, ret;

    public CuentaBancaria (String nombreCons, String apellidoCons, int dniCons) {
        super(nombreCons, apellidoCons, dniCons);
        this.numeroCuenta++;
    }

    public float saldo(float saldoCons) {
        this.saldo = saldoCons;
        return saldo;
    }

    public float depositar(float dep) {
        this.depo = dep;
        depo = saldo + depo;
        saldo = depo;
        System.out.printf("Se deposito $ %7.2f correctamente", depo);
        System.out.printf("\nSu saldo actual es: $ %7.2f", saldo);
        return depo;
    }

    public float retirar(float reti) {
        float retOk;
        this.ret = reti;
        retOk = ret;
        ret = saldo - ret;
        saldo = ret;
        System.out.printf("Se retiro $ %7.2f correctamente", retOk);
        System.out.printf("\nSu saldo actual es: $ %7.2f", saldo);
        return retOk;
    }

    public void detalleTitularFull() {
        System.out.printf("Nombre: %s, Apellido: %s, DNI: %d\n",nombre, apellido, dni);
        System.out.printf("Cuenta: %d, Saldo actual: $ %7.2f",numeroCuenta, saldo);
    }
}
