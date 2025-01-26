package modelo;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.InputStream;

public class Musica {

    private Player player;
    private InputStream file;
    private Thread hiloReproduccion;

    /**
     * Constructor que carga y prepara un archivo MP3 para su reproducción.
     *
     * @param archivoMP3 La ruta del archivo MP3 dentro del directorio de recursos.
     */
    public Musica(String archivoMP3) {
        System.out.println("Cargando archivo MP3: " + archivoMP3);

        // Cargar el archivo MP3 desde los recursos
        file = getClass().getClassLoader().getResourceAsStream("musica/" + archivoMP3);

        if (file == null) {
            System.err.println("No se encontró el archivo MP3: " + archivoMP3);
            return;
        }

        try {
            // Crear el reproductor con el flujo de entrada
            player = new Player(file);
            System.out.println("Archivo MP3 cargado exitosamente.");
        } catch (JavaLayerException e) {
            System.err.println("Error al cargar el archivo MP3.");
            e.printStackTrace();
        }
    }

    /**
     * Método para iniciar la reproducción de la música en un hilo separado.
     */
    public void reproducir() {
        if (player == null) {
            System.err.println("El reproductor no está inicializado. No se puede reproducir la música.");
            return;
        }

        // Iniciar un nuevo hilo para la reproducción
        hiloReproduccion = new Thread(() -> {
            try {
                player.play();
                System.out.println("Reproducción finalizada.");
            } catch (JavaLayerException e) {
                System.err.println("Error al reproducir el archivo de música.");
                e.printStackTrace();
            } finally {
                detener(); // Asegurarse de liberar los recursos al terminar
            }
        });

        hiloReproduccion.start();
    }

    /**
     * Método para detener la reproducción y liberar los recursos.
     */
    public void detener() {
        try {
            if (player != null) {
                player.close(); // Cerrar el reproductor
                System.out.println("Reproductor detenido.");
            }

            if (file != null) {
                file.close(); // Cerrar el flujo de entrada
                System.out.println("Flujo de entrada cerrado.");
            }

            if (hiloReproduccion != null && hiloReproduccion.isAlive()) {
                hiloReproduccion.interrupt(); // Interrumpir el hilo de reproducción si sigue activo
                System.out.println("Hilo de reproducción interrumpido.");
            }

        } catch (Exception e) {
            System.err.println("Error al detener la reproducción.");
            e.printStackTrace();
        }
    }
}
