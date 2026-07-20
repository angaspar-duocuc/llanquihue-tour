# LlanquihueTourApp

## Autor

- **Nombre del estudiante:** Antonio Jesús Gaspar
- **Sección:** DESARROLLO ORIENTADO A OBJETOS I_001A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online
- **Fecha de entrega:** 19-07-2026

## Descripcion

Prototipo modular en Java para la Evaluacion Final Transversal de Desarrollo Orientado a Objetos I. El sistema administra clientes, guias turisticos, operadores de transporte y proveedores de alojamiento de Llanquihue Tour mediante encapsulamiento, composicion, colecciones, herencia, polimorfismo, interfaces, validaciones y lectura desde un archivo `.txt`.

## Funcionalidades

- Carga automatica de cuatro categorias desde `src/data/entidades.txt`.
- Registro manual mediante una interfaz grafica con `JOptionPane`.
- Visualizacion y recorrido polimorfico de la coleccion.
- Busqueda exacta de entidades por nombre.
- Filtro por tipo: cliente, guia, operador o proveedor.
- Validacion de datos con `DatoInvalidoException`.
- Composicion entre `RecursoAgencia` y `Direccion`.

## Estructura del proyecto

```text
src/
|-- data/
|   |-- entidades.txt
|   |-- GestorEntidades.java
|   `-- GestorServicios.java
|-- model/
|   |-- Registrable.java
|   |-- RecursoAgencia.java
|   |-- Direccion.java
|   |-- Cliente.java
|   |-- GuiaTuristico.java
|   |-- OperadorTransporte.java
|   |-- ProveedorAlojamiento.java
|   |-- ServicioTuristico.java
|   |-- RutaGastronomica.java
|   |-- PaseoLacustre.java
|   `-- ExcursionCultural.java
|-- ui/
|   |-- Main.java
|   `-- VentanaPrincipal.java
`-- utils/
    |-- DatoInvalidoException.java
    `-- LectorEntidades.java
```

## Clases principales

- `Registrable`: interfaz comun que declara `getNombre()` y `mostrarResumen()`.
- `RecursoAgencia`: superclase con los datos comunes y una `Direccion` por composicion.
- `Direccion`: representa la calle y comuna de cada entidad.
- `Cliente`: entidad registrable que incorpora el correo.
- `GuiaTuristico`: entidad registrable que incorpora el idioma.
- `OperadorTransporte`: entidad registrable que incorpora el tipo de transporte.
- `ProveedorAlojamiento`: entidad registrable que incorpora el tipo de alojamiento.
- `GestorEntidades`: administra el `ArrayList<Registrable>` y permite agregar, recorrer, buscar y filtrar.
- `LectorEntidades`: convierte las lineas del archivo externo en objetos.
- `VentanaPrincipal`: permite utilizar las funcionalidades mediante `JOptionPane`.
- `Main`: punto de entrada de la aplicacion.

## Formato del archivo de datos

El archivo utiliza cinco valores separados por punto y coma:

```text
tipo;nombre;dato especifico;calle;comuna
```

Los tipos permitidos son `cliente`, `guia`, `operador` y `proveedor`.

## Opciones de la aplicacion

1. Ingresar un cliente.
2. Ingresar un guia turistico.
3. Ingresar un operador de transporte.
4. Ingresar un proveedor de alojamiento.
5. Mostrar todas las entidades.
6. Buscar una entidad por nombre.
7. Filtrar entidades por tipo.
0. Salir del programa.

## Instrucciones para clonar y ejecutar en IntelliJ IDEA

1. Clonar el repositorio:

```bash
git clone https://github.com/angaspar-duocuc/llanquihue-tour.git
```

2. Abrir IntelliJ IDEA y seleccionar `Open`.
3. Abrir la carpeta `llanquihue-tour`.
4. Abrir `src/ui/Main.java`.
5. Ejecutar `ui.Main` desde el boton verde de IntelliJ IDEA.
6. Utilizar el menu de `JOptionPane` para gestionar las entidades.

## Repositorio

[Repositorio GitHub utilizado para la continuidad del proyecto LlanquihueTourApp.](https://github.com/angaspar-duocuc/llanquihue-tour.git)
