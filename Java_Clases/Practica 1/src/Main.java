public class Main {

    public static void main(String[] args) {
      Animal perro = new Perro("Juancito", "Caniche", "Chico", 5);
      perro.hacerSonido();

      Animal gato = new Gato("Garfield", "Montes", "Mediano", 10);
      gato.hacerSonido();

      Animal gatoB = new Gato("GarfieldB", "MontesB", "MedianoC", 12);
      gatoB.hacerSonido();
    }
}