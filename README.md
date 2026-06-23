# LlanquihueTourApp

## Descripcion

Sistema de gestion para la agencia **Llanquihue Tour**, desarrollado en Java como actividad de Semana 5 de Desarrollo Orientado a Objetos I. El proyecto organiza el codigo en paquetes funcionales, aplica composicion entre clases del modelo, carga datos desde un archivo `.txt` en una coleccion `ArrayList`, y permite recorrer, filtrar y visualizar los tours por consola.

## Paquetes y clases implementadas

```text
src/
├── model/
│   ├── Tour.java        — modela un tour con nombre, tipo, precio y guia asignado (composicion)
│   └── Guia.java        — modela un guia turistico; Tour tiene-un Guia (composicion)
├── data/
│   └── GestorDatos.java — lee tours.txt linea a linea y construye objetos Tour con Guia
├── service/
│   └── GestorTours.java — gestiona la coleccion ArrayList<Tour>: agregar, listar, buscar
├── util/
│   └── Validador.java   — metodos estaticos para validar texto y precio antes de crear objetos
├── ui/
│   └── Main.java        — clase principal: carga datos, lista tours y aplica filtros por tipo
└── resources/
    └── tours.txt        — datos fuente (nombre;tipo;precio;idGuia;nombreGuia;especialidad)
```

## Instrucciones para ejecutar en IntelliJ IDEA

1. Abrir IntelliJ IDEA.
2. Seleccionar `Open` y abrir la carpeta `LlanquihueTourApp`.
3. Abrir el archivo `src/ui/Main.java`.
4. Ejecutar la clase `ui.Main` con el boton verde de ejecucion.

## Salida esperada

```text
=== LLANQUIHUE TOUR - Sistema de Gestion ===

--- Catalogo completo ---
Ruta Gastronomica | Gastronomico | $25000 | Guia: Carlos Mendez
Paseo Lacustre | Aventura | $15000 | Guia: Ana Soto
Excursion Cultural | Cultural | $12000 | Guia: Ana Soto
Tour Personalizado | Privado | $45000 | Guia: Luis Vega
Ruta de los Volcanes | Aventura | $30000 | Guia: Carlos Mendez

--- Tours de tipo: Aventura ---
Paseo Lacustre | Aventura | $15000 | Guia: Ana Soto
Ruta de los Volcanes | Aventura | $30000 | Guia: Carlos Mendez

--- Tours de tipo: Cultural ---
Excursion Cultural | Cultural | $12000 | Guia: Ana Soto
```

## Repositorio

https://github.com/angaspar-duocuc/llanquihue-tour.git
