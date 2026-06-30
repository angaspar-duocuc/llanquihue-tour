# LlanquihueTourApp

## Descripcion

Aplicacion basica en Java para la actividad de Semana 6 de Desarrollo Orientado a Objetos I. El proyecto modela una jerarquia de servicios turisticos para la agencia Llanquihue Tour, aplicando herencia simple, reutilizacion de atributos comunes, uso de `super(...)` y sobrescritura del metodo `toString()`.

## Objetivo de esta semana

Representar distintos tipos de servicios turisticos mediante una superclase comun y subclases especializadas. La actividad se enfoca en disenar una jerarquia clara, organizada en paquetes y probada desde la clase `Main`.

## Estructura del proyecto

```text
src/
├── data/
│   └── GestorServicios.java
├── model/
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
└── ui/
    └── Main.java
```

## Clases creadas

- `ServicioTuristico`: superclase con los atributos comunes `nombre` y `duracionHoras`.
- `RutaGastronomica`: subclase que agrega el atributo `numeroDeParadas`.
- `PaseoLacustre`: subclase que agrega el atributo `tipoEmbarcacion`.
- `ExcursionCultural`: subclase que agrega el atributo `lugarHistorico`.
- `GestorServicios`: clase del paquete `data` que crea dos objetos de prueba por cada subclase.
- `Main`: clase del paquete `ui` que ejecuta el programa y muestra los servicios por consola.

## Instrucciones para ejecutar en IntelliJ IDEA

1. Abrir IntelliJ IDEA.
2. Seleccionar `Open`.
3. Abrir la carpeta `LlanquihueTourApp`.
4. Abrir el archivo `src/ui/Main.java`.
5. Ejecutar la clase `ui.Main` desde el boton verde de IntelliJ IDEA.

## Salida esperada

```text
=== Servicios turisticos Llanquihue Tour ===
RutaGastronomica{nombre='Ruta sabores del lago', duracionHoras=3.5, numeroDeParadas=4}
RutaGastronomica{nombre='Experiencia cocina local', duracionHoras=4.0, numeroDeParadas=5}
PaseoLacustre{nombre='Paseo por lago Llanquihue', duracionHoras=2.0, tipoEmbarcacion='Lancha turistica'}
PaseoLacustre{nombre='Navegacion atardecer', duracionHoras=1.5, tipoEmbarcacion='Catamaran'}
ExcursionCultural{nombre='Recorrido patrimonial Llanquihue', duracionHoras=2.5, lugarHistorico='Museo local'}
ExcursionCultural{nombre='Historia colonos del sur', duracionHoras=3.0, lugarHistorico='Casa historica'}
```

## Repositorio

Repositorio GitHub utilizado para la continuidad del proyecto LlanquihueTourApp.
