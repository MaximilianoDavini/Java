//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        pila pila_test = new pila_estatica(5);
            pila_test.push(1);
            pila_test.push(2);
            pila_test.push(3);
            pila_test.push(4);
            pila_test.push(5);
            pila_test.push(6);

        System.out.println(pila_test.pop());
        System.out.println(pila_test.pop());
        System.out.println(pila_test.pop());
        System.out.println(pila_test.pop());
        System.out.println(pila_test.pop());
        System.out.println(pila_test.pop());


        int a = 2023, b = 2024, c = 2025, suma, suma_aux, posicion = 0;
        System.out.printf("A: %d,  B: %d, C: %d \n", a, b, c);
        do {
            posicion++;
            suma = a + b + c;
            System.out.printf("La suma en la posicion %d es %d \n", posicion, suma);
        } while (posicion <= 100);
    }
}