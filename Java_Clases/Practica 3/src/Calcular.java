public class Calcular {
    private int base, altura, p, area;
    public Calcular(int baseCalc, int alturaCalc) {
                this.base = baseCalc;
                this.altura = alturaCalc;
                }

    public int perimetro() {
        p = base * 2 + altura * 2;
        return p;
    }

    public int superficie() {
        area = base * altura;
        return area;
    }
    public void detalle() {
        System.out.printf("El perimetro es igual a: %d\nLa superficie es igual a %d: ", p, area);
    }
}
