public class Desg {
    int numero;
    String valor;
    public Desg (int numeroScan){
        this.numero = numeroScan;
    }

    public void operacion() {
        String [] ar = new String[10];
        String cadena = String.valueOf(numero);

        for(int i = 0; i < ar.length; i++) {
            char valor = cadena.charAt(i);
            System.out.println(valor);
//             valor = ar[i];

        }
//         return valor;
    }
 //   public void info () {
 //       System.out.printf("El recorrido es %d", valor);
 //   }
}
