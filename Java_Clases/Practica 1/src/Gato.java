public class Gato extends Animal {
    String raza, tamano;
    private static int id = 0;
    int idAux, peso;
    public Gato (String nombreGato, String razaGato, String tamanoGato, int pesoGato) {
        super(nombreGato);
        this.idAux = id++;
        this.raza = razaGato;
        this.tamano = tamanoGato;
        this.peso = pesoGato;
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El gato hace Miau");
        System.out.printf("ID: %d \n Su nombre es: %s \n Su raza es: %s \n Su tamaño es: %s \n Su peso es:%d", idAux, nombre, raza, tamano, peso);
    }
}
