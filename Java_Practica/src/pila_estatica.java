public class pila_estatica implements pila {
    private int pila[];
    private int tope = -1;

    public pila_estatica(int max){
        pila = new int[max];
    }

    @Override
    public void push(int dato) {
        boolean band = pila_llena();
        if (band == false) {
            tope++;
            pila[tope] = dato;
        }
    }

    @Override
    public int pop() {
        boolean band = pila_vacia();
        if (band == true) {
            return 0;
        } else {
            int dato = pila[tope];
            tope--;
            return dato;
        }

    }

    @Override
    public boolean pila_llena() {
        if (tope ==  pila.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pila_vacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }
}
