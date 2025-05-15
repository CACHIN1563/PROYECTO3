# Sistema de Parqueo de Vehículos en JAVA

Este proyecto fue desarrollado en **Java** utilizando la biblioteca **Swing** para la interfaz gráfica de usuario. Permite gestionar una lista de vehículos con operaciones como inserción, búsqueda, eliminación y visualización de todos los registros.

---
## Funcionalidades

- **Insertar vehículo** con validación de datos:
  - Placa (formato `L000LLL`, ejemplo: `M584JPG`)
  - Color
  - Línea
  - Modelo (año, 4 dígitos)
  - Propietario (nombre y apellido)
 
   - **Buscar vehículos** por:
  - Placa
  - Color
  - Línea
  - Modelo
  - Propietario

- **Eliminar vehículo** por placa.

- **Mostrar todos los vehículos** (protegido con clave `0000`).

---

## 🧱 Estructura de Clases

- `AppVehiculos.java`: clase principal con el menú principal.
- `Vehiculo.java`: clase que representa un vehículo.
- `Nodo.java`: clase para los nodos de la lista enlazada.
- `ListaVehiculos.java`: clase que implementa la lista enlazada con métodos para insertar, buscar, eliminar y mostrar.

---

## Descripción
Aplicación Java con interfaz gráfica para gestión de vehículos, implementando menús interactivos mediante JOptionPane. 

## Características principales
- Interfaz gráfica intuitiva con JOptionPane
- Visualización de datos en JTextArea con JScrollPane
- Texto en mayúsculas para mejor legibilidad
- Soporte para iconos personalizados en diálogos

## Requisitos técnicos
- **JDK 8+** 
- IDE compatible (NetBeans)


