# Street-Figther-Maven

Street-Figther-Maven es una reimplementación en Java (usando Maven y Swing) del clásico videojuego de peleas. Este proyecto ejemplifica buenas prácticas en desarrollo de software Java, incluyendo arquitectura MVC, gestión de dependencias con Maven, modularidad, pruebas y documentación profesional.

> **Nota:** Este proyecto **no utiliza inteligencia artificial** para ninguna de sus funciones, lógica de juego ni mecánicas internas.

**Este proyecto fue creado y utilizado para promocionar el curso: [CFGS DAM].**

---

## Características

- Desarrollado en Java SE 8+  
- Arquitectura MVC (Modelo-Vista-Controlador)
- Interfaz gráfica con Java Swing (JFrame)
- Gestión de dependencias y ciclo de vida del proyecto con Maven
- Soporte para recursos multimedia (imágenes y audio MP3)
- Código estructurado y modular
- Documentación con JavaDoc y comentarios profesionales


---

## Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/lardevpro/Street-Figther-Maven.git
   ```
2. Entra al directorio del proyecto:
   ```bash
   cd Street-Figther-Maven
   ```
3. Compila el proyecto con Maven:
   ```bash
   mvn clean install
   ```
4. Ejecuta la aplicación:
   ```bash
   mvn exec:java -Dexec.mainClass="com.tuempresa.Main"
   ```
   > Ajusta el nombre del main class si es necesario.

---

## Uso

- Selecciona tu personaje y pelea contra la computadora en modo historia o entrenamiento.
- Controles por teclado (consulta la documentación interna para detalles).
- Disfruta de sprites y sonidos inspirados en el juego clásico.

---

## Estructura del Proyecto

```
Street-Figther-Maven/
├── src/
│   ├── main/
│   │   ├── java/         # Código fuente Java
│   │   └── resources/    # Recursos (imágenes, sonidos)
│   └── test/
│       └── java/         # Pruebas unitarias
├── pom.xml               # Archivo Maven
└── README.md
```

---

## Mejores Prácticas Implementadas

- Uso de Maven para automatización de compilación, pruebas y empaquetado
- Separación por capas y paquetes lógicos: modelo, vista, controlador
- Recursos externos gestionados en el directorio estándar `src/main/resources`
- Métodos y clases documentados con JavaDoc
- `.gitignore` para excluir archivos generados y sensibles
- Código limpio, siguiendo convenciones de estilo Java
- README completo y actualizado

---

## Dependencias Principales

- Java SE 8+
- Maven
- JUnit (para pruebas unitarias)
- Bibliotecas de audio si se requiere (ver `pom.xml`)

---

## Curso Relacionado

Este proyecto fue utilizado para promocionar y ejemplificar conceptos en el curso:

**[Desarrollo de Videojuegos con Java y Maven](https://www.ejemplo-curso.com)**  
Aprende desde cero a crear videojuegos completos y estructurados usando las mejores prácticas profesionales y herramientas modernas de desarrollo en Java.

---

## Autor

- [lardevpro](https://github.com/lardevpro)

---

## Licencia

Actualmente sin licencia declarada.  
Solicita permiso al autor para usos comerciales o derivados.
