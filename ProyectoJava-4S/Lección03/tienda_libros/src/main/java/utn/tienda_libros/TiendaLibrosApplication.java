package utn.tienda_libros;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import tienda_libros.vista.LibroForm;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) { SpringApplication.run(TiendaLibrosApplication.class, args);
		ConfigurableApplicationContext contextoSpring =
				new SpringApplicationBuilder(TiendaLibrosApplication.class)
						.headless(false)
						.web(WebApplicationType.NONE)
						.run(args);

		// Ejecutamos el código para cargar el formulario
		EventQueue.invokeLater(() -> {
			// Obtenemos el objeto from a través del Spring
			LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
		});
	}
}