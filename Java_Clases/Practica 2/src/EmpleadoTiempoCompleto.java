public class EmpleadoTiempoCompleto extends Empleado {

    float bono = 55555555;

    public EmpleadoTiempoCompleto(String nombreEmpleadoTC, int idEmpleadoTC, float salarioBaseEmpleadoTC) {
        //this.nombre = nombreEmpleadoTC;
        super(nombreEmpleadoTC, idEmpleadoTC, salarioBaseEmpleadoTC);
        // this.nombre = nombreEmpleado;
        // super(idEmpleadoTC);
        // super(salarioBaseEmpleadoTC);
    }


    public float calcularSalario() {
        salarioBase = salarioBase + bono;
        return salarioBase;
    }

    public void mostrarDetalles() {
        System.out.printf("Empleado: %s \n ID: %d \n Salario base: %7.2f", nombre, id, salarioBase);
    }
}
