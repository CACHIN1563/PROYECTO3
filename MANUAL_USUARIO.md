**Manual de Usuario del Sistema de Gestión de Vehículos**

---

**1. Información General**

Este sistema fue desarrollado como parte del curso de programación 3, con el fin de aplicar conceptos como listas enlazadas, validaciones de entrada y una interfaz básica con Swing. El objetivo principal es registrar, buscar y eliminar datos de vehículos, haciendo uso de memoria de manera eficiente y amigable para el usuario.

---

**2. Requisitos del Sistema**

* Java JDK 8 o superior
* NetBeans IDE (se recomienda versión 12.6 o posterior)
* Sistema operativo Windows, macOS o Linux

---

**3. Instalación y Ejecución**

1. Descomprimir el archivo `gestionvehiculos.zip` en cualquier ubicación del equipo.
2. Abrir NetBeans y seleccionar la opción **File > Open Project**.
3. Buscar y abrir la carpeta del proyecto.
4. Ejecutar el archivo `Main.java` para iniciar el programa.

---

**4. Menú Principal y Navegación**

Al iniciar el sistema, se muestra una ventana con un menú principal y la imagen de un carro como decoración visual. Desde este menú se puede acceder a las siguientes funciones:

* **Insertar Vehículo:** Permite registrar un nuevo vehículo en el sistema. Se solicitan los siguientes datos:

  * Placa (formato de Guatemala, por ejemplo: M584JPG)
  * Color (libre)
  * Línea (libre)
  * Modelo (año en formato de cuatro dígitos)
  * Propietario (nombre y apellido)

  El sistema valida cada dato. Si alguno no cumple con el formato, se muestra un mensaje explicando el motivo y se solicita ingresar nuevamente el valor.

* **Buscar Vehículo:** El usuario puede seleccionar por cuál propiedad desea buscar (placa, color, línea, modelo o propietario). El sistema muestra todos los vehículos que coincidan con el criterio especificado.

* **Eliminar Vehículo:** Solicita la placa del vehículo a eliminar. Si se encuentra, se elimina del registro; si no, se notifica al usuario.

* **Mostrar Información (acceso restringido):** Esta opción permite visualizar todos los datos almacenados. Para acceder es necesario ingresar la clave: `0000`. Si la clave es incorrecta, el acceso se deniega.

* **Salir:** Cierra el programa de forma segura.

---

**5. Validaciones del Sistema**

El sistema cuenta con las siguientes validaciones para garantizar que los datos ingresados sean correctos:

* **Placa:** Debe cumplir el formato guatemalteco (una letra seguida de tres números y tres letras). Ejemplo: M584JPG. Se valida tanto la longitud como el patrón de letras y números.
* **Modelo:** Solo se acepta un año de cuatro dígitos entre 1900 y el año actual.
* **Propietario:** Debe contener solo letras y al menos un espacio (nombre y apellido).
* **Datos numéricos:** Se rechazan letras o números negativos donde no corresponda.

---

**6. Estructura del Proyecto**

El proyecto está dividido en varias clases para mantener una estructura limpia:

* `Vehiculo.java`: Clase que representa un vehículo con sus atributos.
* `NodoVehiculo.java`: Nodo de la lista enlazada.
* `ListaVehiculos.java`: Lista enlazada que contiene los nodos.
* `AppVehiculos.java`: Interfaz Swing que maneja las interacciones y punto de entrada del programa.

---

**7. Observaciones Finales**

El sistema está pensado para ser extendido fácilmente. A pesar de ser una aplicación académica, simula un entorno real de gestión de vehículos y puede ser mejorado con persistencia de datos, mejoras visuales o integración con bases de datos en el futuro.

---

**Credenciales de Acceso Restringido**

* Clave para ver todos los registros: `0000`

---

**Desarrollado por:**
\RUBEN GARCÍA Y CARLOS CACHIN

**Curso:** PROGRAMACION 3
**Universidad:** \MARIANO GALVEZ DE GUATEMALA
**Año:** 2025
