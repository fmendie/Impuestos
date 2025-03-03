Descripción

Este es un sistema desarrollado en Java utilizando el patrón Modelo-Vista-Controlador (MVC) que permite a los usuarios calcular el impuesto vehicular basado en factores como el avalúo comercial, la antigüedad y el tipo de uso del vehículo.

Requisitos

Java JDK 8 o superior

NetBeans IDE

Instalación y Ejecución

1. Clonar o Descargar el Proyecto
git clone https://github.com/fmendie/Impuestos.git

2. Abrir en NetBeans

Abre NetBeans.

Selecciona Archivo → Abrir Proyecto.

Busca la carpeta del proyecto y haz clic en Abrir.

3. Compilar y Ejecutar

Presiona F6 o haz clic en Ejecutar → Ejecutar Proyecto.

Uso de la Aplicación

Ingresa los datos requeridos en la interfaz:

Marca y modelo del vehículo.

Año de fabricación.

Cilindraje.

Avalúo comercial.

Tipo de uso (particular o público).

Presiona el botón Calcular.

Se mostrará el valor del impuesto calculado según los datos ingresados.

Estructura del Proyecto

El proyecto está organizado en las siguientes carpetas:

- src/
  - MVC/ (Contiene la clase Main.java)
  - Model/ (Clases Vehiculo.java y CalculadoraImpuestos.java)
  - View/ (Clase CalculatorView.java)
  - Controller/ (Clase CalculatorController.java)

Tecnologías Utilizadas

Java para la lógica del sistema.

Swing para la interfaz de usuario.

NetBeans IDE como entorno de desarrollo.

Autor

Desarrollado por Felipe Mendieta