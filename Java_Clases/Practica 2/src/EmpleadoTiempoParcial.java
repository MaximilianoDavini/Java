public class EmpleadoTiempoParcial extends Empleado {
    int horasTrabajadas = 0;
    float tasaPorHora = 0;

    public EmpleadoTiempoParcial(String nombreEmpleadoTP, int idEmpleadoTP,
                                 float salarioBaseEmpleadoTP, int horasTrabajadasEmpleadoTP) {
        super(nombreEmpleadoTP, idEmpleadoTP, salarioBaseEmpleadoTP);
        this.horasTrabajadas = horasTrabajadasEmpleadoTP;
    }

    public float calcularSalario() {
        tasaPorHora = salarioBase / horasTrabajadas;
        return tasaPorHora;
    }

    public void mostrarDetalles() {
        System.out.printf("Empleado: %s \n ID: %d \n Salario (segun horas trabajadas): %7.2f", nombre, id, tasaPorHora);
    }
}

