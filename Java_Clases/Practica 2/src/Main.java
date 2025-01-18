//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     //   Empleado empleado_a = new Empleado("Maximiliano", 1, 50000);
     //  empleado_a.calcularSalario();
     //  empleado_a.mostrarDetalles();
     //  // -
     //  EmpleadoTiempoCompleto empTc = new EmpleadoTiempoCompleto("Maximiliano Davini",
     //          2, 2000000);
     //  empTc.calcularSalario();
     //  empTc.mostrarDetalles();

        EmpleadoTiempoParcial empTP = new EmpleadoTiempoParcial("Pepe Argento", 50, 25000, 10);
        empTP.calcularSalario();
        empTP.mostrarDetalles();
    }
}