import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        /* //SCANEO DE DATOS
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int numero = 0;
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el numero a sacar el cuadrado: ");
        numero = teclado.nextInt();
        // USO EL OBJETO Y LE ASIGNO LAS VARIABLES PARA CADA PARAMETRO A RECIBIR POR CONSTRUCTOR
        Operacion juan = new Operacion(nombre, numero);
        // UTILIZO LOS METODOS PARA EL OBJETO
        juan.cuadrado();
        juan.detalle(); */
        // GENERO LAS VARIABLES, CREO EL OBJETO PARA SCANEO DE DATOS Y LOS MISMOS
       //int base, altura;
       //Scanner teclado = new Scanner(System.in);
       //System.out.println("Bienvenido");
       //System.out.println("Ingrese la base para calcular: ");
       //base = teclado.nextInt();
       //teclado.nextLine();
       //System.out.println("Ingrese la altura para calcular: ");
       //altura = teclado.nextInt();
       //// CREO EL OBJETO PARA LA CLASE Y PASO LAS VARIABLES
       //Calcular rectangulo = new Calcular(base, altura);
       //// LLAMO A LOS METODOS PARA SU FUNCION
       //rectangulo.perimetro();
       //rectangulo.superficie();
       //rectangulo.detalle();
       //System.out.println("\nFIN DEL PROGRAMA;");

        //CREO EL CONSTRUCTOR SCANNER Y SUS VARIABLES
        //int kmsScan;
        //Scanner teclado = new Scanner(System.in);
        //System.out.println("BIENVENIDO AL PROGRAMA");
        //System.out.println("PARA CALCULAR KM/S -> M/S");
        //System.out.println("--------------------------");
        //System.out.println("Ingrese la cantidad de km/s a calcular: ");
        //kmsScan = teclado.nextInt();
        //teclado.nextLine();
        //// CREO EL OBJETO Y LE PASO LAS VARIABLES
        //Velocidad v = new Velocidad(kmsScan);
        ////ASIGNO AL OBJETO LOS METODOS PARA SUS ACCIONES
        //v.pasaje();
        //v.detalle();
        // CREO CONSTRUCTOR PARA SCANNER Y LAS VARIABLES NECESARIAS
     //  String nombre, apellido;
     //  int edad, nota;
     //  String vTec;
     //  Scanner teclado = new Scanner(System.in);
     //  // INTRO
     //  System.out.println("BIENVENIDO A LA SECCION DE ALUMNOS.");
     //  System.out.println("Para avanzar necesitamos que complete la siguiente informacion:");
     //  System.out.println("¿Comenzamos? -> S: SI / N: NO.");
     //  vTec = teclado.nextLine();
     //  if (vTec.equals("S") || vTec.equals("s")) {
     //      System.out.println("Perfecto, avancemos!");
     //      System.out.println("Ingresa el Nombre del alumno:");
     //      nombre = teclado.nextLine();
     //      System.out.println("Ingresa el Apellido del alumno:");
     //      apellido = teclado.nextLine();
     //      System.out.println("Ingresa la edad del alumno:");
     //      edad = teclado.nextInt();
     //      teclado.nextLine();
     //      System.out.println("Ingresa la nota promedio del alumno:");
     //      nota = teclado.nextInt();
     //      teclado.nextLine();
     //      // CREO EL OBJETO Y LE PASO LAS VARIABLES A UTILIZAR POR PARAMETROS;
     //      Alumno maxi = new Alumno(nombre,apellido,edad,nota);
     //      // ASIGNO EL OBJETO A LOS METODOS
     //      maxi.detalle();
     //      System.out.println("----------------------\n");
     //      System.out.println("FIN DEL PROGRAMA\n");
     //      System.out.println("----------------------\n");
     //  } else {
     //      System.out.println("Programa finalizado;");
     //      System.exit(0);
     //  }
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA DE ESCANEO\n");
        System.out.println("POR FAVOR, INGRESAR EL VALOR:");
        numero = teclado.nextInt();
        teclado.nextLine();
        Desg n = new Desg(numero);
        n.operacion();
        //n.info();
        System.out.println("\n=================");
        System.out.println("FIN DEL PROGRAMA\n");
        System.out.println("=================");
    }

}