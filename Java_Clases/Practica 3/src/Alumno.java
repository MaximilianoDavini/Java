public class Alumno {
    private String nombre, apellido;
    private int edad, nota;
    public Alumno (String nombreAlumno, String apellidoAlumno, int edadAlumno, int notaAlumno){
        this.nombre = nombreAlumno;
        this.apellido = apellidoAlumno;
        this.edad = edadAlumno;
        this.nota = notaAlumno;
    }

    public void detalle () {
        System.out.printf("Opc. 1:\nEl alumno"+ " " + nombre + " " + apellido + ", de " + edad + " años de edad tiene una nota promedio de " + nota +"\n");
        System.out.printf("Opc. 2:\nEl alumno %s %s, de %d años de edad tiene una nota promedio de %d \n", nombre, apellido, edad, nota);
    }

}
