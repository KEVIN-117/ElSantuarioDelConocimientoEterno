**Enunciado del Ejercicio: Sistema de Empleados**

Supón que se te ha encargado desarrollar un sistema de gestión de empleados para una empresa. El sistema debe ser capaz de manejar diferentes tipos de empleados, calcular sus salarios y proporcionar información relevante sobre cada empleado. Debes utilizar programación orientada a objetos (POO) y la herencia para modelar la jerarquía de empleados.

**Requisitos del Sistema:**

1. Debes crear una clase base llamada `Empleado` que contenga los siguientes atributos:
    - `nombre` (String): El nombre del empleado.
    - `numeroEmpleado` (int): El número de empleado.
    - `salarioBase` (double): El salario base mensual del empleado.

2. La clase `Empleado` debe tener un método llamado `calcularSalario()` que calcule el salario del empleado. Por defecto, este método devolverá el salario base mensual.

3. Debes crear al menos dos clases derivadas de `Empleado`:
    - `EmpleadoTiempoCompleto`: Representa a un empleado a tiempo completo. Debe tener un atributo adicional llamado `salarioAnual` y sobrescribir el método `calcularSalario()` para calcular el salario mensual dividiendo el salario anual entre 12.

    - `EmpleadoTiempoParcial`: Representa a un empleado a tiempo parcial. Debe tener atributos adicionales llamados `tarifaPorHora` y `horasTrabajadas`, y sobrescribir el método `calcularSalario()` para calcular el salario multiplicando la tarifa por hora por las horas trabajadas.

4. Debes crear una clase `Main` que demuestre el funcionamiento del sistema. Crea objetos de diferentes tipos de empleados, calcule sus salarios y muestre la información relevante en la consola.

**Consideraciones Adicionales:**

- Asegúrate de utilizar la herencia adecuadamente para evitar la duplicación de código.
- Proporciona una interfaz de usuario simple en la clase `Main` para ingresar datos de empleados y mostrar resultados.

Este ejercicio te ayudará a comprender cómo aplicar la herencia en Java para crear una jerarquía de clases y cómo las subclases pueden heredar y personalizar el comportamiento de la clase base. Además, te permitirá practicar la creación y uso de objetos en Java.