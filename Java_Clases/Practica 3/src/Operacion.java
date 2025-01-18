public class Operacion {
    private int numero;
    private String nombre;
    public int resultado;

    public Operacion (String nombreOperacion, int numeroOperacion) {
        this.nombre = nombreOperacion;
        this.numero = numeroOperacion;
    }

    public int cuadrado () {
        resultado = numero * 2;
        return resultado;
        }

    public void detalle () {
        System.out.printf ("Su nombre es: %s \nEl resultado de %d al cuadrado es %d: ", nombre, numero, resultado);
    }

}
