# LlanquihueTourApp

## Descripcion

Aplicacion basica en Java para la actividad de Semana 8 de Desarrollo Orientado a Objetos I. El sistema de Llanquihue Tour incorpora una interfaz comun, una jerarquia de recursos, una coleccion generica, validacion de tipos con `instanceof` y una interfaz grafica sencilla con `JOptionPane`.

## Objetivo de esta semana

Integrar interfaces, herencia, polimorfismo, colecciones genericas y validacion de tipos. Las entidades `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno` heredan de `RecursoAgencia`, implementan la interfaz `Registrable` y definen su propio metodo `mostrarResumen()`.

## Estructura del proyecto

```text
src/
├── data/
│   ├── GestorEntidades.java
│   └── GestorServicios.java
├── model/
│   ├── Registrable.java
│   ├── RecursoAgencia.java
│   ├── GuiaTuristico.java
│   ├── Vehiculo.java
│   ├── ColaboradorExterno.java
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
└── ui/
    ├── Main.java
    └── VentanaPrincipal.java
```

## Clases e interfaces utilizadas

- `Registrable`: interfaz que declara el metodo `mostrarResumen()`.
- `RecursoAgencia`: superclase con el atributo comun `nombre`.
- `GuiaTuristico`: subclase registrable que incorpora el idioma principal.
- `Vehiculo`: subclase registrable que incorpora la patente.
- `ColaboradorExterno`: subclase registrable que incorpora la especialidad.
- `GestorEntidades`: administra un `ArrayList<Registrable>`, recorre sus objetos y diferencia sus tipos mediante `instanceof`.
- `VentanaPrincipal`: interfaz grafica basica creada con `JOptionPane` para ingresar y visualizar entidades.
- `Main`: clase principal que inicia la interfaz grafica.

Las clases de servicios turisticos desarrolladas en las semanas anteriores se mantienen como parte de la continuidad del proyecto.

## Funcionamiento de la interfaz grafica

El menu permite:

1. Ingresar un guia turistico.
2. Ingresar un vehiculo.
3. Ingresar un colaborador externo.
4. Mostrar el resumen de las entidades registradas.
0. Salir del programa.

## Instrucciones para ejecutar en IntelliJ IDEA

1. Abrir IntelliJ IDEA.
2. Seleccionar `Open`.
3. Abrir la carpeta `LlanquihueTourApp`.
4. Abrir el archivo `src/ui/Main.java`.
5. Ejecutar la clase `ui.Main` desde el boton verde de IntelliJ IDEA.
6. Utilizar el menu de `JOptionPane` para ingresar y visualizar entidades.

## Repositorio

[Repositorio GitHub utilizado para la continuidad del proyecto LlanquihueTourApp.](https://github.com/angaspar-duocuc/llanquihue-tour.git)
