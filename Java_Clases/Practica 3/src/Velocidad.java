public class Velocidad {
    private int kms;
    public int ms;
    public Velocidad(int kmsCons) {
        this.kms = kmsCons;
        }

    public int pasaje () {
        ms = kms * 1000;
        return ms;
    }

    public void detalle () {
        System.out.printf("La cantidad de %d Km/s corresponde a %d m/s.", kms, ms);
    }


}
