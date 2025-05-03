package org.example;
import java.sql.*;

public class ConexionJ { // INICIO CLASE
    String nombredb, usuario, pass, urlC;
    public ConexionJ (String nombredbCons, String usuarioCons, String passCons) {
        this.nombredb = nombredbCons;
        this.usuario = usuarioCons;
        this.pass = passCons;
        urlC = "jdbc:mysql://localhost:3306/"+ nombredb;
        try {
            /// 1. Creamos la conexion a la db
            Connection conndb = DriverManager.getConnection(urlC,usuario,pass);

            /// 2. Creamos un estado de conexion
            Statement stm = conndb.createStatement();
            System.out.println("Ingresaste a la db correctamente");
            ///  3.Vamos a crear una vista de la db como resultado y devolverla en consola

            ResultSet rs = stm.executeQuery("SELECT * FROM usuario");

            while (rs.next()) {
                System.out.println(rs.getString("id") + " | " + rs.getString("nombre") + " | " + rs.getString("apellido"));
            }

        } catch (Exception e) {
            System.out.println("Error: Ingresaste algun dato erroneo!" + e);
            e.printStackTrace();
        }
    }


} /// FIN CLASE


//  try {
//     // 1. Crear conexion
//     // String url = "jdbc:mysql://localhost:3306/dbjava";
//     // String user = "root";
//     // String pass = "";
//     Connection conndb = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjava", "root", "");
//     // 2. Crear objeto statement
//     Statement statem = conndb.createStatement();
//     // 3. Crear objeto resultset, luego ejecutar quety sql
//     ResultSet registros = statem.executeQuery("Select * from usuario");
//     // 4. Recorrer/leer datos de la tabla virtual (resultado que nos devuelve)
//     //    while (registros.next()) {
//     //        System.out.println(registros.getString("id") + " " + registros.getString("nombre") + " " + registros.getString("apellido") + " " + registros.getString("dni"));
///     // }
//
// } catch (Exception e) {
//     System.out.println("ERROR!" + e);
//     e.printStackTrace();
// }
