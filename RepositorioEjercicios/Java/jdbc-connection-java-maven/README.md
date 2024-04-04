# ESTE ES UN PROYECTO DE PRUEBA PARA APRENDER A USAR JAVA PERSISTENCIA DE DATOS CON MYSQL Y EL DRIVER DE CONEXION JDBC DE JAVA

## utilidades del proyecto
- [x] Crear una base de datos
  - la base de datos estar corriendo bajo el puerto 3306, en un contenedor docker el archivo docker-compose.yml
  ```yaml
    version: '3.7'

    services:
        db:
            image: mysql:5.7
            restart: always
            container_name: mysql
            ports:
                - 3306:3306
            environment:
                MYSQL_ROOT_PASSWORD: root
                MYSQL_DATABASE: h4ck3rDb
                MYSQL_USER: h4ck3r
                MYSQL_PASSWORD: h4ck4u
            volumes:
              - ./mysql:/var/lib/mysql
    ```
- [x] Crear una tabla

- [ESTE ES UN PROYECTO DE PRUEBA PARA APRENDER A USAR JAVA PERSISTENCIA DE DATOS CON MYSQL Y EL DRIVER DE CONEXION JDBC DE JAVA](#este-es-un-proyecto-de-prueba-para-aprender-a-usar-java-persistencia-de-datos-con-mysql-y-el-driver-de-conexion-jdbc-de-java)
  - [INSTALACION DE MYSQL](#instalacion-de-mysql)
  - [INSTALACION DE MYSQL WORKBENCH](#instalacion-de-mysql-workbench)
  - [INSTALACION DE MYSQL CONNECTOR/J](#instalacion-de-mysql-connectorj)
  - [COMANDOS BASICOS DE MYSQL](#comandos-basicos-de-mysql)
    - [Comando bascio de CLI MySQL](#comando-bascio-de-cli-mysql)
    - [Crear una base de datos:](#crear-una-base-de-datos)
    - [Seleccionar una base de datos:](#seleccionar-una-base-de-datos)
    - [Crear una tabla:](#crear-una-tabla)
    - [Insertar datos en una tabla:](#insertar-datos-en-una-tabla)
    - [Consultar datos:](#consultar-datos)
    - [Filtrar datos:](#filtrar-datos)
    - [Actualizar datos:](#actualizar-datos)
    - [Eliminar datos:](#eliminar-datos)
    - [Eliminar una tabla:](#eliminar-una-tabla)
  - [TIPOS DE DATOS](#tipos-de-datos)
    - [Tipos de datos numéricos:](#tipos-de-datos-num%C3%A9ricos)
    - [Tipos de datos de texto:](#tipos-de-datos-de-texto)
    - [Tipos de datos de fecha y hora:](#tipos-de-datos-de-fecha-y-hora)
    - [Otros tipos de datos:](#otros-tipos-de-datos)
  - [EJEMPLO](#ejemplo)
    - [Ejemplo de creación de una tabla:](#ejemplo-de-creaci%C3%B3n-de-una-tabla)
    - [Insertar datos en la tabla:](#insertar-datos-en-la-tab

- 

# Comando bascio de CLI MySQL

### Crear una base de datos:
```sql
CREATE DATABASE nombre_de_la_base_de_datos;
```
Esto creará una nueva base de datos con el nombre especificado.

### Seleccionar una base de datos:
```sql
USE nombre_de_la_base_de_datos;
```
Te permite cambiar a una base de datos específica para realizar operaciones.

### Crear una tabla:
```sql
CREATE TABLE nombre_de_tabla (
    id INT AUTO_INCREMENT PRIMARY KEY,
    columna1_tipo_dato,
    columna2_tipo_dato,
    ...
);
```
Reemplaza `nombre_de_tabla`, `columna1_tipo_dato`, etc., con los nombres y tipos de datos reales que necesites.

### Insertar datos en una tabla:
```sql
INSERT INTO nombre_de_tabla (columna1, columna2, ...)
VALUES (valor_columna1, valor_columna2, ...);
```
Esto añade una nueva fila a la tabla.

### Consultar datos:
```sql
SELECT * FROM nombre_de_tabla;
```
Obtiene todos los registros de la tabla.

### Filtrar datos:
```sql
SELECT * FROM nombre_de_tabla WHERE condición;
```
Utiliza condiciones (por ejemplo, `nombre='Juan'` o `edad > 25`) para filtrar los resultados.

### Actualizar datos:
```sql
UPDATE nombre_de_tabla SET columna = valor WHERE condición;
```
Actualiza los valores en la tabla basándose en una condición.

### Eliminar datos:
```sql
DELETE FROM nombre_de_tabla WHERE condición;
```
Elimina filas de la tabla que cumplen con una condición específica.

### Eliminar una tabla:
```sql
DROP TABLE nombre_de_tabla;
```
Esto eliminará la tabla especificada.

# TIPOS DE DATOS


### Tipos de datos numéricos:
- **INT**: Número entero.
- **BIGINT**: Número entero grande.
- **FLOAT**: Número de coma flotante.
- **DOUBLE**: Número de coma flotante de precisión doble.
- **DECIMAL**: Número decimal exacto.

### Tipos de datos de texto:
- **CHAR**: Cadena de caracteres de longitud fija.
- **VARCHAR**: Cadena de caracteres de longitud variable.
- **TEXT**: Texto de longitud variable (para cantidades mayores de caracteres).
- **ENUM**: Conjunto de valores de cadena permitidos.

### Tipos de datos de fecha y hora:
- **DATE**: Fecha.
- **TIME**: Hora.
- **DATETIME**: Fecha y hora combinadas.
- **TIMESTAMP**: Marca de tiempo (a menudo utilizada para almacenar la fecha y hora de la última modificación de un registro).

### Otros tipos de datos:
- **BOOLEAN**: Valor verdadero o falso.
- **BLOB**: Datos binarios largos (útil para almacenar imágenes u otros archivos binarios).
- **JSON**: Para almacenar datos en formato JSON (disponible en versiones más recientes de MySQL).

# EJEMPLO

Claro, aquí tienes algunos ejemplos de cómo puedes utilizar estos tipos de datos al crear tablas en MySQL:

### Ejemplo de creación de una tabla:
Supongamos que queremos crear una tabla para almacenar información de usuarios:

```sql
CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    edad INT,
    email VARCHAR(100),
    fecha_registro DATE
);
```

### Insertar datos en la tabla:
Para insertar datos en esta tabla, puedes usar la sentencia `INSERT INTO`:

```sql
INSERT INTO Usuarios (nombre, edad, email, fecha_registro) 
VALUES ('Juan', 25, 'juan@example.com', '2023-12-01');
```

### Consultas básicas:
#### Consultar todos los usuarios:
```sql
SELECT * FROM Usuarios;
```

#### Filtrar usuarios mayores de 30 años:
```sql
SELECT * FROM Usuarios WHERE edad > 30;
```

#### Actualizar información de un usuario:
```sql
UPDATE Usuarios SET email = 'nuevo_email@example.com' WHERE id = 1;
```

#### Eliminar un usuario:
```sql
DELETE FROM Usuarios WHERE id = 1;
```

