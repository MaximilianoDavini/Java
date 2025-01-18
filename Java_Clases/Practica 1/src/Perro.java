public class Perro extends Animal {

    //Atributos/Variables
    String raza, tamano;
    int peso;

    //constructor
    public Perro (String nombrePerro, String razaPerro, String tamanoPerro, int pesoPerro) {
       super(nombrePerro);
       //this.nombre = nombrePerro;
       this.raza = razaPerro;
       this.tamano = tamanoPerro;
       this.peso = pesoPerro;
    }

    @Override
    public void hacerSonido(){
        super.hacerSonido();
       System.out.println("El perro hace Guau");
       System.out.printf("Su nombre es: %s \n Su raza es: %s \n Su tamaño es: %s \n Su peso es:%d", nombre, raza, tamano, peso);
       }

}
