# LlanquihueTourApp

## Descripcion

Aplicacion basica en Java para la actividad de Semana 4 de Desarrollo Orientado a Objetos I. El proyecto lee datos de tours desde un archivo `tours.txt`, crea objetos `Tour`, los almacena en un `ArrayList`, recorre la coleccion y filtra los tours por tipo.

## Estructura del proyecto

```text
src/
├── data/
│   └── GestorDatos.java
├── model/
│   └── Tour.java
├── resources/
│   └── tours.txt
└── ui/
    └── Main.java
```

## Clases y archivos

- `model.Tour`: representa los datos de cada tour con nombre, tipo y precio.
- `data.GestorDatos`: lee el archivo `tours.txt`, separa los datos con `split(";")` y crea un `ArrayList<Tour>`.
- `ui.Main`: muestra todos los tours y filtra los tours de tipo `Aventura`.
- `resources/tours.txt`: contiene al menos 5 lineas de datos separadas por punto y coma.

## Instrucciones para ejecutar en IntelliJ IDEA

1. Abrir IntelliJ IDEA.
2. Seleccionar `Open`.
3. Abrir la carpeta `LlanquihueTourApp`.
4. Abrir el archivo `src/ui/Main.java`.
5. Ejecutar la clase `ui.Main` desde el boton verde de IntelliJ IDEA.

## Salida esperada

```text
=== Catalogo completo de tours ===
Tour{nombre='Ruta Gastronomica', tipo='Gastronomico', precio=25000}
Tour{nombre='Paseo Lacustre', tipo='Aventura', precio=15000}
Tour{nombre='Excursion Cultural', tipo='Cultural', precio=12000}
Tour{nombre='Tour Personalizado', tipo='Privado', precio=45000}
Tour{nombre='Ruta de los Volcanes', tipo='Aventura', precio=30000}

=== Tours filtrados por tipo: Aventura ===
Tour{nombre='Paseo Lacustre', tipo='Aventura', precio=15000}
Tour{nombre='Ruta de los Volcanes', tipo='Aventura', precio=30000}
```

## Repositorio

https://github.com/angaspar-duocuc/llanquihue-tour.git
