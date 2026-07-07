# LlanquihueTourApp

## Descripcion

Aplicacion basica en Java para la actividad de Semana 7 de Desarrollo Orientado a Objetos I. El proyecto continua la jerarquia de servicios turisticos de Llanquihue Tour e incorpora una coleccion polimorfica `List<ServicioTuristico>` para almacenar, recorrer y mostrar distintos tipos de servicios desde referencias de la superclase.

## Objetivo de esta semana

Aplicar polimorfismo, colecciones genericas y sobrescritura de metodos sobre la jerarquia creada anteriormente. La clase `ServicioTuristico` define el metodo `mostrarInformacion()` y cada subclase lo sobrescribe para mostrar su informacion especifica.

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

## Clases creadas y actualizadas

- `ServicioTuristico`: superclase con los atributos comunes `nombre` y `duracionHoras`, además del método `mostrarInformacion()`.
- `RutaGastronomica`: subclase que sobrescribe `mostrarInformacion()` y agrega `numeroDeParadas`.
- `PaseoLacustre`: subclase que sobrescribe `mostrarInformacion()` y agrega `tipoEmbarcacion`.
- `ExcursionCultural`: subclase que sobrescribe `mostrarInformacion()` y agrega `lugarHistorico`.
- `GestorServicios`: clase del paquete `data` que declara una colección `List<ServicioTuristico>` y carga al menos cinco objetos de distintas subclases.
- `Main`: clase del paquete `ui` que ejecuta el programa y muestra la información de forma polimórfica.

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

[Repositorio GitHub utilizado para la continuidad del proyecto LlanquihueTourApp.](https://github.com/angaspar-duocuc/llanquihue-tour.git)
