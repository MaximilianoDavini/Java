public class Empleado {
    String nombre;
    int id = 0;
    float salarioBase;

    public Empleado(String nombreEmpleado, int idEmpleado, float salarioBaseEmpleado) {
        this.nombre = nombreEmpleado;
        this.id = idEmpleado;
        this.salarioBase = salarioBaseEmpleado;
    }

    public float calcularSalario() {
        return salarioBase;
    }

    public void mostrarDetalles() {
        System.out.printf("Empleado: %s \n ID: %d \n Salario base: %7.2f \n", nombre, id, salarioBase);
    }
}
