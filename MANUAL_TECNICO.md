# MANUAL TÉCNICO

Este documento técnico proporciona una visión completa sobre el diseño, la estructura interna y los aspectos técnicos del sistema. El sistema permite la gestión de vehículos a través de una interfaz gráfica basada en Swing, utilizando una lista enlazada simple como estructura de datos principal.

---

## ESTRUCTURA DEL SISTEMA

El sistema está compuesto por las siguientes clases principales:

- **AppVehiculos.java**: Clase principal que contiene el método `main` y gestiona el flujo del programa. Incluye el menú de navegación con `JOptionPane`.
- **Vehiculo.java**: Clase modelo que representa un objeto tipo vehículo, con atributos como placa, color, línea, modelo y propietario.
- **NodoVehiculo.java**: Clase nodo para construir la lista enlazada. Cada nodo contiene un objeto `Vehiculo`.
- **ListaVehiculos.java**: Clase que contiene la lógica principal para insertar, buscar, eliminar y mostrar vehículos. Maneja una lista enlazada simple.

---

## VALIDACIONES

Para garantizar la integridad de los datos ingresados, se aplican las siguientes expresiones regulares:

- **Placa**: `^[A-Z]{1}\\d{3}[A-Z]{3}$` → Formato como `M584JPG`
- **Modelo**: `\\d{4}` → Debe ser un año válido con cuatro dígitos
- **Propietario**: `^[A-ZÁÉÍÓÚÜÑ]+\\s+[A-ZÁÉÍÓÚÜÑ]+$` → Solo letras, nombre y apellido separados por un espacio

---

## FUNCIONAMIENTO

El sistema opera utilizando una lista enlazada simple, implementando dinámicamente una estructura que permite insertar, eliminar y buscar nodos sin límites fijos. Cada nodo contiene los datos de un vehículo. El sistema no tiene persistencia, por lo que toda la información se pierde al cerrar el programa.

---

### Menú principal y sus opciones:

- **INSERTAR VEHÍCULO**: Captura y valida los datos ingresados por el usuario.
- **BUSCAR VEHÍCULO**: Permite filtrar vehículos según cualquier campo (placa, color, línea, modelo, propietario).
- **ELIMINAR VEHÍCULO**: Solicita la placa del vehículo a eliminar.
- **MOSTRAR TODOS**: Requiere la clave `'0000'` para mostrar todos los registros.


---

## REQUISITOS TÉCNICOS

- Java 8 o superior instalado  
- IDE con soporte Swing  
- No requiere conexión a internet  
- Sin persistencia (no guarda en archivo o base de datos)

