// 12.2 Listado de estudiantes con la Clase EstudianteDAO -> Parte 1
package UTN.datos;

import UTN.dominio.Estudiante;

import static UTN.conexion.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// 12.3 Comenzamos con las pruebas del método listarEstudiantes() -> solucionamos algunos errores de conexión
public class EstudianteDAO {
    // Método Listar:
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        // Creamos algunos objetos que son necesarios para comunicarnos con la base de datos:
        PreparedStatement ps; // Ayuda a preparar la sentencia SQL y la envia a la base de datos
        ResultSet rs; // Obtiene el resultado de la consulta SQL en la base de datos

        // 12.2 Listado de estudiantes con la Clase EstudianteDAO -> Parte 2
        // Creamos un objeto de tipo Conexión:
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2023";

        // 12.2 Listado de estudiantes con la Clase EstudianteDAO -> Parte 3
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2023"));
                // 12.2 Listado de estudiantes con la Clase EstudianteDAO -> Parte 4
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                estudiantes.add(estudiante);
                // Falta agregarlo a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al seleccionar datos: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexión: " + e.getMessage());
            } // Fin del catch
        } // Fin del finally
        return estudiantes;
    } // Fin método listar

    // 12.4 Creamos en PersonaDAO() el Método por id -> FIND BY ID (ENCONTRAR MÉTODO POR ID):
    public boolean buscarEstudiantePorID(Estudiante estudiante) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2023 WHERE idestudiantes2023 = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; // Se encontró el estudiante
            }// Fin del if
        } catch (Exception e) {
            System.out.println("Ocurrió un error al buscar el estudiante: " + e.getMessage());
        } // Fin del catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexión: " + e.getMessage());
            } // Fin del catch
        } // Fin del finally
        return false; // No se encontró el estudiante
    }

    // 12.6 Método agregarEstudiante() -> Parte 1 y 2
    // 12.6 Creamos en PersonaDAO() el Método para insertar un estudiante -> INSERT:
    public boolean agregarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2023 (nombre, apellido, telefono, email) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error al insertar el estudiante: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Ocurrió un error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false; // No se pudo insertar el estudiante
    } // Fin del método agregarEstudiante()

    // 12.8 Agregamos el método -> modificarEstudiante()
    public boolean modificarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2023 SET nombre = ?, apellido = ?, telefono = ?, email = ? WHERE idestudiantes2023 = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true; // Se modificó el estudiante
        } catch (Exception e) {
            System.out.println("Error al modificar el estudiante: " + e.getMessage());
        } // Fin catch
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            } // Fin catch
        } // Fin finally
        return false; // No se pudo modificar el estudiante
    } // Fin método modificarEstudiante()


    // Método Eliminar Estudiante:  16/08/2023 (primera clase 4to semestre)
    public boolean eliminarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM estudiantes2023 WHERE idestudiantes2023=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var estudianteDao = new EstudianteDAO();
        // 12.9 Comenzamos con las pruebas del método -> modificarEstudiante()
        var estudianteModificado = new Estudiante(1, "Juan Carlos", "Juarez", "12345678", "juan@mail.com");
        var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        if (modificado)
            System.out.println("Estudiante modificado: " + estudianteModificado);
        else
            System.out.println("No se modificó al estudiante: " + estudianteModificado);


//      12.7 Comenzamos con las pruebas del Método -> agregarEstudiante() Parte 1 y 2
//      Agregar un estudiante
//      var nuevoEstudiante = new Estudiante("Carlos", "Lara", "12345678", "carloslara@mail.com");
//      var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
//      if(agregado)
//          System.out.println("Estudiante agregado: "+nuevoEstudiante);
//      else
//          System.out.println("No se pudo agregar al estudiante: "+nuevoEstudiante);


        // Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); // Función LAMBDA para imprimir los estudiantes

//        12.7 Comenzamos con las pruebas del Método -> agregarEstudiante() Parte 1 y 2
//        Agregar un estudiante
//        var nuevoEstudiante = new Estudiante("Carlos", "Lara", "12345678", "carloslara@mail.com");
//        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
//        if(agregado)
//        System.out.println("Estudiante agregado: "+nuevoEstudiante);
//        else
//        System.out.println("No se pudo agregar al estudiante: "+nuevoEstudiante);

//        12.5 Hacemos las pruebas del método -> Buscar un estudiante por ID()
//        var estudiante1 = new Estudiante(1);
//        System.out.println("Estudiantes antes de la búsqueda: "+estudiante1);
//        var encontrado = estudianteDao.buscarEstudiantePorID(estudiante1);
//        if(encontrado)
//            System.out.println("Estudiante encontrado: "+estudiante1);
//        else
//            System.out.println("No se encontró al estudiante: "+estudiante1.getIdEstudiante());



        // Eliminar estudiante con ID 3:   // AGREGADO 16/08/2023 4to semestre
        var estudianteEliminar = new Estudiante(3);
        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminar);
        if(eliminado)
            System.out.println("Estudiante eliminado: "+estudianteEliminar);
        else
            System.out.println("No se eliminó el estudiante: "+estudianteEliminar);

        // Listar a los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes1= estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println); // función LAMBDA para imprimir

        // Buscar por ID
        // var estudiante1 = new Estudiante(1);
        //System.out.println("Estudiantes antes de la búsqueda: "+estudiantes1);
        //var encontrado = estudianteDao.buscarEstudiantePorId(estudiantes1);
        //if(encontrado)
        //     System.out.println("No se encontró el estudiante: "+estudiantes1+.getIdEstudiante());
    }
}
