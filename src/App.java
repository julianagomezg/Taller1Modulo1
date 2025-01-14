import Class.Bibliotecario;
import Class.Libro;
import Class.Usuario;
import java.util.List;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        List<Libro>listaLibros=new ArrayList<>();
        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1, true);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 2, true);
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        System.out.println("hay un total de "+listaLibros.size()+" libros");
        // Crear usuario
        Usuario usuario = new Usuario("Juan", "Pérez");

        // Crear bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Ana", "Gómez");

        // Mostrar datos
        usuario.mostrarDatos();
        bibliotecario.mostrarDatos();

        // Prestar libros
        bibliotecario.prestarLibro(usuario, libro1);
        bibliotecario.prestarLibro(usuario, libro2);

        // Devolver libro
        bibliotecario.devolverLibro(usuario, libro1);
    }
}
