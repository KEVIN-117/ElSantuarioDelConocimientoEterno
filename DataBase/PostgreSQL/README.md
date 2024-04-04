


# ![img.png](img.png) Aprende PostgreSQL 

## ¿Qué es PostgreSQL?

![Badge en Desarollo](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green)



PostgreSQL es un sistema de gestión de bases de datos relacional de código abierto y gratuito. Es uno de los sistemas de bases de datos más avanzados y potentes disponibles en la actualidad, y es ampliamente utilizado en aplicaciones web, móviles y empresariales.

PostgreSQL ofrece una amplia gama de características y funcionalidades que lo hacen ideal para una variedad de casos de uso, incluyendo:

- **Soporte para tipos de datos avanzados**: PostgreSQL admite una amplia variedad de tipos de datos, incluyendo tipos de datos geométricos, de red, de texto, de fecha y hora, y más.
- **Transacciones ACID**: PostgreSQL garantiza la integridad de los datos mediante el cumplimiento de las propiedades ACID (Atomicidad, Consistencia, Aislamiento y Durabilidad
- **Concurrencia**: PostgreSQL permite el acceso concurrente a los datos, lo que significa que múltiples usuarios pueden leer y escribir en la base de datos al mismo tiempo sin interferir entre sí.
- **Extensibilidad**: PostgreSQL es altamente extensible y permite a los usuarios crear sus propias funciones, tipos de datos y extensiones para adaptarse a sus necesidades específicas.
- **Escalabilidad**: PostgreSQL es altamente escalable y puede manejar grandes volúmenes de datos y cargas de trabajo intensivas.
- **Seguridad**: PostgreSQL ofrece una amplia gama de características de seguridad, incluyendo autenticación, autorización, cifrado de datos y auditoría de eventos.
- **Compatibilidad con SQL**: PostgreSQL es compatible con el lenguaje estándar de consulta SQL, lo que facilita la migración de aplicaciones existentes a PostgreSQL.
- **Soporte para índices y consultas avanzadas**: PostgreSQL ofrece un potente sistema de indexación y optimización de consultas que permite realizar consultas complejas de manera eficiente.
- **Replicación y alta disponibilidad**: PostgreSQL ofrece soporte integrado para la replicación y la alta disponibilidad, lo que garantiza la disponibilidad continua de los datos.
- **Soporte para JSON y XML**: PostgreSQL ofrece soporte nativo para el almacenamiento y la consulta de datos JSON y XML.
- **Soporte para funciones almacenadas y procedimientos almacenados**: PostgreSQL permite a los usuarios crear funciones almacenadas y procedimientos almacenados en varios lenguajes de programación, incluyendo PL/pgSQL, PL/Python, PL/Perl y PL/Java.
- **Soporte para triggers y eventos**: PostgreSQL permite a los usuarios crear triggers y eventos que se activan automáticamente en respuesta a ciertos eventos en la base de datos.

En resumen, PostgreSQL es una base de datos relacional avanzada y potente que ofrece una amplia gama de características y funcionalidades para satisfacer las necesidades de una variedad de aplicaciones y casos de uso.

## ¿Por qué aprender PostgreSQL?

PostgreSQL es uno de los sistemas de bases de datos más populares y ampliamente utilizados en la actualidad, y hay varias razones por las que aprender PostgreSQL puede ser beneficioso:

- **Amplia demanda en el mercado laboral**: PostgreSQL es ampliamente utilizado en la industria y hay una gran demanda de profesionales con experiencia en PostgreSQL. Aprender PostgreSQL puede abrirte nuevas oportunidades laborales y aumentar tu empleabilidad.
- **Salarios competitivos**: Los profesionales con experiencia en PostgreSQL suelen recibir salarios competitivos en el mercado laboral. Aprender PostgreSQL puede ayudarte a aumentar tu potencial de ingresos y avanzar en tu carrera.
- **Flexibilidad y portabilidad**: PostgreSQL es un sistema de bases de datos relacional que se puede utilizar en una amplia variedad de entornos y aplicaciones. Aprender PostgreSQL te proporciona una base sólida para trabajar en una variedad de proyectos y sectores.


## ¿Cómo aprender PostgreSQL?

Si estás interesado en aprender PostgreSQL, hay varias formas de hacerlo:

- **Documentación oficial**: La documentación oficial de PostgreSQL es una excelente fuente de información sobre cómo instalar, configurar y utilizar PostgreSQL. Puedes acceder a la documentación oficial en el sitio web de PostgreSQL.
- **Tutoriales en línea**: Hay una gran cantidad de tutoriales en línea gratuitos y de pago que te pueden ayudar a aprender PostgreSQL. Estos tutoriales cubren una amplia variedad de temas, desde los conceptos básicos hasta las características avanzadas de PostgreSQL.
- **Cursos en línea**: Hay una variedad de cursos en línea gratuitos y de pago que te pueden ayudar a aprender PostgreSQL. Estos cursos suelen incluir videos, lecturas, ejercicios prácticos y proyectos para ayudarte a adquirir experiencia práctica con PostgreSQL.
- **Libros**: Hay una gran cantidad de libros sobre PostgreSQL que cubren una amplia variedad de temas, desde los conceptos básicos hasta las características avanzadas de PostgreSQL. Algunos libros populares sobre PostgreSQL incluyen "PostgreSQL: Up and Running" y "PostgreSQL High Performance".


## Manipulación de datos en PostgreSQL

### Crear una base de datos

Para crear una base de datos en PostgreSQL, puedes utilizar el comando `CREATE DATABASE` seguido del nombre de la base de datos que deseas crear. Por ejemplo, para crear una base de datos llamada `mydatabase`, puedes ejecutar el siguiente comando:

```sql
CREATE DATABASE mydatabase;
```

### Conectar a una base de datos

Para conectarte a una base de datos en PostgreSQL, puedes utilizar el comando `psql` seguido del nombre de la base de datos a la que deseas conectarte. Por ejemplo, para conectarte a la base de datos `mydatabase`, puedes ejecutar el siguiente comando:

```bash
psql mydatabase
```

### Crear una tabla

Para crear una tabla en PostgreSQL, puedes utilizar el comando `CREATE TABLE` seguido del nombre de la tabla y la lista de columnas y tipos de datos que deseas incluir en la tabla. Por ejemplo, para crear una tabla llamada `users` con las columnas `id`, `name` y `email`, puedes ejecutar el siguiente comando:

```sql
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50)
);
```

### Insertar datos en una tabla

Para insertar datos en una tabla en PostgreSQL, puedes utilizar el comando `INSERT INTO` seguido del nombre de la tabla y los valores que deseas insertar en la tabla. Por ejemplo, para insertar un nuevo usuario en la tabla `users`, puedes ejecutar el siguiente comando:

```sql
INSERT INTO users (name, email) VALUES ('John Doe', 'johndoe@gmail.com');
```

### Consultar datos de una tabla

Para consultar datos de una tabla en PostgreSQL, puedes utilizar el comando `SELECT` seguido de los nombres de las columnas que deseas seleccionar y el nombre de la tabla de la que deseas seleccionar los datos. Por ejemplo, para seleccionar todos los usuarios de la tabla `users`, puedes ejecutar el siguiente comando:

```sql
SELECT * FROM users;
```

### Actualizar datos en una tabla

Para actualizar datos en una tabla en PostgreSQL, puedes utilizar el comando `UPDATE` seguido del nombre de la tabla, los valores que deseas actualizar y la condición que debe cumplir la fila que deseas actualizar. Por ejemplo, para actualizar el email de un usuario en la tabla `users`, puedes ejecutar el siguiente comando:

```sql
UPDATE users SET email = 'john@gmail.com' WHERE name = 'John Doe';
```

### Eliminar datos de una tabla

Para eliminar datos de una tabla en PostgreSQL, puedes utilizar el comando `DELETE FROM` seguido del nombre de la tabla y la condición que debe cumplir la fila que deseas eliminar. Por ejemplo, para eliminar un usuario de la tabla `users`, puedes ejecutar el siguiente comando:

```sql
DELETE FROM users WHERE name = 'John Doe';
```

### Eliminar una tabla

Para eliminar una tabla en PostgreSQL, puedes utilizar el comando `DROP TABLE` seguido del nombre de la tabla que deseas eliminar. Por ejemplo, para eliminar la tabla `users`, puedes ejecutar el siguiente comando:

```sql

DROP TABLE users;
```

## Operadores en PostgreSQL

### Operadores de comparación

Los operadores de comparación en PostgreSQL se utilizan para comparar dos valores y devolver un resultado booleano que indica si la comparación es verdadera o falsa. Algunos de los operadores de comparación más comunes en PostgreSQL son:

- `=`: Comprueba si dos valores son iguales.
- `!=` o `<>`: Comprueba si dos valores son diferentes.
- `<`: Comprueba si un valor es menor que otro.
- `>`: Comprueba si un valor es mayor que otro.
- `<=`: Comprueba si un valor es menor o igual que otro.
- `>=`: Comprueba si un valor es mayor o igual que otro.
- `IS NULL`: Comprueba si un valor es nulo.
- `IS NOT NULL`: Comprueba si un valor no es nulo.
- `BETWEEN`: Comprueba si un valor está dentro de un rango de valores.
- `IN`: Comprueba si un valor está en una lista de valores.
- `LIKE`: Comprueba si un valor coincide con un patrón de texto.
- `ILIKE`: Comprueba si un valor coincide con un patrón de texto sin distinguir entre mayúsculas y minúsculas.
- `SIMILAR TO`: Comprueba si un valor coincide con una expresión regular.
- `NOT LIKE`: Comprueba si un valor no coincide con un patrón de texto.
- `NOT ILIKE`: Comprueba si un valor no coincide con un patrón de texto sin distinguir entre mayúsculas y minúsculas.
- `NOT SIMILAR TO`: Comprueba si un valor no coincide con una expresión regular.
- `ANY`: Comprueba si un valor es igual a cualquiera de los valores de una subconsulta.
- `ALL`: Comprueba si un valor es igual a todos los valores de una subconsulta.
- `EXISTS`: Comprueba si una subconsulta devuelve algún resultado.
- `NOT EXISTS`: Comprueba si una subconsulta no devuelve ningún resultado.
- `IS DISTINCT FROM`: Comprueba si dos valores son distintos, incluso si ambos son nulos.
- `IS NOT DISTINCT FROM`: Comprueba si dos valores son iguales, incluso si ambos son nulos.
- `OVERLAPS`: Comprueba si dos rangos de fechas se superponen.
- `CONTAINS`: Comprueba si un rango de fechas contiene a otro rango de fechas.
- `CONTAINED BY`: Comprueba si un rango de fechas está contenido por otro rango de fechas.
- `&&`: Comprueba si dos rangos de fechas se superponen.
- `@>`: Comprueba si un rango de fechas contiene a otro rango de fechas.
- `<@`: Comprueba si un rango de fechas está contenido por otro rango de fechas.
- `~`: Comprueba si un valor coincide con una expresión regular.
- `~*`: Comprueba si un valor coincide con una expresión regular sin distinguir entre mayúsculas y minúsculas.
- `!~`: Comprueba si un valor no coincide con una expresión regular.
- `!~*`: Comprueba si un valor no coincide con una expresión regular sin distinguir entre mayúsculas y minúsculas.
- `#`: Comprueba si un valor coincide con un patrón de texto.
- `#*`: Comprueba si un valor coincide con un patrón de texto sin distinguir entre mayúsculas y minúsculas.
- `#!`: Comprueba si un valor no coincide con un patrón de texto.
- `AND`: Comprueba si dos condiciones son verdaderas.
- `OR`: Comprueba si al menos una de dos condiciones es verdadera.
- `NOT`: Invierte el resultado de una condición.

#### Ejemplos de operadores de comparación en PostgreSQL
- para ejemplificar el uso de los operadores de comparación en PostgreSQL, consideremos la siguiente tabla `estudiantes` con los siguientes datos:

```sql
CREATE TABLE estudiantes (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100),
    edad INTEGER,
    promedio FLOAT,
    fecha_nacimiento DATE,
    correo_electronico VARCHAR(255),
    direccion VARCHAR(255),
    ciudad VARCHAR(100),
    pais VARCHAR(100),
    codigo_postal VARCHAR(20),
    telefono VARCHAR(20),
    genero VARCHAR(10),
    fecha_registro TIMESTAMP,
    carrera VARCHAR(100),
    universidad VARCHAR(100),
    semestre INTEGER,
    grupo VARCHAR(10),
    idioma_principal VARCHAR(50),
    idiomas_secundarios VARCHAR(255),
    habilidades TEXT,
    experiencia_laboral TEXT,
    certificaciones TEXT[],
    intereses TEXT[],
    redes_sociales JSONB,
    notas TEXT
);

INSERT INTO estudiantes (nombre, edad, promedio, fecha_nacimiento, correo_electronico, direccion, ciudad, pais, codigo_postal, telefono, genero, fecha_registro, carrera, universidad, semestre, grupo, idioma_principal, idiomas_secundarios, habilidades, experiencia_laboral, certificaciones, intereses, redes_sociales, notas)
VALUES
    ('Juan Pérez', 20, 85.5, '2001-05-10', 'juan@example.com', 'Calle 123', 'Ciudad de México', 'México', '12345', '123-456-7890', 'Masculino', CURRENT_TIMESTAMP, 'Ingeniería Informática', 'Universidad Nacional', 5, 'A', 'Español', 'Inglés, Francés', 'Desarrollo web, Python, SQL', 'Practicante en empresa X, Freelancer en empresa Y', '{"Certificado de Python", "Certificado de SQL"}', '{"Viajar", "Cocinar", "Música"}', '{"linkedin": "https://www.linkedin.com/in/juan"}', 'Notas adicionales sobre Juan...'),
    ('María García', 22, 90.2, '1999-03-15', 'maria@example.com', 'Avenida Principal', 'Lima', 'Perú', '54321', '987-654-3210', 'Femenino', CURRENT_TIMESTAMP, 'Medicina', 'Universidad Nacional de Lima', 8, 'B', 'Español', 'Inglés, Portugués', 'Cirugía, Pediatría, Investigación médica', 'Residente en hospital Z, Investigadora en proyecto A', '{"Certificado de Cirugía", "Certificado de Pediatría"}', '{"Leer", "Hacer senderismo", "Fotografía"}', '{"linkedin": "https://www.linkedin.com/in/maria", "twitter": "https://twitter.com/maria"}', 'Notas adicionales sobre María...'),
    ('Pedro Rodríguez', 19, 78.9, '2002-08-20', 'pedro@example.com', 'Rua Principal', 'São Paulo', 'Brasil', '67890', '456-789-0123', 'Masculino', CURRENT_TIMESTAMP, 'Administración de Empresas', 'Universidade de São Paulo', 3, 'C', 'Portugués', 'Inglés, Español', 'Gestión de proyectos, Marketing digital', 'Practicante en empresa W, Coordinador de eventos en empresa Z', '{"Certificado de Marketing Digital"}', '{"Fútbol", "Videojuegos", "Voluntariado"}', '{"linkedin": "https://www.linkedin.com/in/pedro", "instagram": "https://www.instagram.com/pedro"}', 'Notas adicionales sobre Pedro...');
    
-- Insertar más datos de ejemplo
INSERT INTO estudiantes (nombre, edad, promedio, fecha_nacimiento, correo_electronico, direccion, ciudad, pais, codigo_postal, telefono, genero, fecha_registro, carrera, universidad, semestre, grupo, idioma_principal, idiomas_secundarios, habilidades, experiencia_laboral, certificaciones, intereses, redes_sociales, notas)
VALUES
    ('Laura Martínez', 21, 88.6, '2000-10-15', 'laura@example.com', 'Calle 456', 'Buenos Aires', 'Argentina', '54321', '987-654-3210', 'Femenino', CURRENT_TIMESTAMP, 'Derecho', 'Universidad de Buenos Aires', 6, 'D', 'Español', 'Inglés, Francés', 'Derecho Internacional, Mediación, Litigio', 'Pasante en bufete de abogados A, Voluntaria en ONG de derechos humanos', '{"Certificado de Mediación"}', '{"Viajar", "Cine", "Arte"}', '{"linkedin": "https://www.linkedin.com/in/laura", "facebook": "https://www.facebook.com/laura"}', 'Notas adicionales sobre Laura...'),
    ('Carlos López', 23, 82.3, '1998-07-20', 'carlos@example.com', 'Carrera 789', 'Madrid', 'España', '67890', '123-456-7890', 'Masculino', CURRENT_TIMESTAMP, 'Economía', 'Universidad Complutense de Madrid', 7, 'C', 'Español', 'Inglés, Alemán', 'Análisis financiero, Economía internacional, Gestión de riesgos', 'Analista financiero en empresa B, Consultor económico en empresa C', '{"Certificado de Análisis Financiero"}', '{"Deportes", "Leer", "Viajar"}', '{"linkedin": "https://www.linkedin.com/in/carlos", "twitter": "https://twitter.com/carlos"}', 'Notas adicionales sobre Carlos...'),
    ('Ana Silva', 20, 91.8, '2001-03-05', 'ana@example.com', 'Rua Principal', 'Lisboa', 'Portugal', '12345', '456-789-0123', 'Femenino', CURRENT_TIMESTAMP, 'Ingeniería Civil', 'Universidade de Lisboa', 4, 'B', 'Portugués', 'Inglés, Español', 'Diseño estructural, Gestión de proyectos, Geotecnia', 'Practicante en empresa de construcción X, Investigadora en proyecto de infraestructura Y', '{"Certificado de Diseño Estructural", "Certificado de Gestión de Proyectos"}', '{"Música", "Senderismo", "Jardinería"}', '{"linkedin": "https://www.linkedin.com/in/ana", "instagram": "https://www.instagram.com/ana"}', 'Notas adicionales sobre Ana...'),
    ('Diego García', 24, 85.1, '1997-11-12', 'diego@example.com', 'Avenida Central', 'Ciudad de México', 'México', '98765', '789-012-3456', 'Masculino', CURRENT_TIMESTAMP, 'Psicología', 'Universidad Nacional Autónoma de México', 8, 'A', 'Español', 'Inglés, Francés', 'Psicoterapia, Psicología clínica, Neuropsicología', 'Psicólogo en consultorio privado, Investigador en laboratorio de neuropsicología', '{"Certificado de Psicoterapia"}', '{"Cine", "Cocinar", "Fútbol"}', '{"linkedin": "https://www.linkedin.com/in/diego", "facebook": "https://www.facebook.com/diego"}', 'Notas adicionales sobre Diego...'),
    ('Sara García', 22, 93.5, '1999-08-25', 'sara@example.com', 'Rua das Flores', 'Lisboa', 'Portugal', '54321', '234-567-8901', 'Femenino', CURRENT_TIMESTAMP, 'Biología', 'Universidade de Coimbra', 6, 'B', 'Portugués', 'Inglés, Español', 'Biología marina, Ecología, Conservación de especies', 'Investigadora en laboratorio de biología marina, Voluntaria en proyecto de conservación de tortugas', '{"Certificado de Biología Marina"}', '{"Viajar", "Pintar", "Bucear"}', '{"linkedin": "https://www.linkedin.com/in/sara", "instagram": "https://www.instagram.com/sara"}', 'Notas adicionales sobre Sara...'),
    ('Alejandro Torres', 21, 87.2, '2000-04-30', 'alejandro@example.com', 'Calle Mayor', 'Madrid', 'España', '34567', '890-123-4567', 'Masculino', CURRENT_TIMESTAMP, 'Arquitectura', 'Universidad Politécnica de Madrid', 5, 'A', 'Español', 'Inglés, Francés', 'Diseño arquitectónico, Urbanismo, Sostenibilidad', 'Practicante en estudio de arquitectura X, Diseñador en proyecto de urbanismo Y', '{"Certificado de Diseño Arquitectónico"}', '{"Arte", "Ciclismo", "Cocina"}', '{"linkedin": "https://www.linkedin.com/in/alejandro", "twitter": "https://twitter.com/alejandro"}', 'Notas adicionales sobre Alejandro...'),
    ('Elena Vázquez', 23, 90.9, '1998-12-10', 'elena@example.com', 'Avenida Central', 'Ciudad de México', 'México', '67890', '901-234-5678', 'Femenino', CURRENT_TIMESTAMP, 'Medicina Veterinaria', 'Universidad Nacional Autónoma de México', 7, 'C', 'Español', 'Inglés, Portugués', 'Cuidado de animales exóticos, Medicina preventiva, Investigación en salud animal', 'Veterinaria en clínica de animales exóticos, Investigadora en laboratorio de salud animal', '{"Certificado de Cuidado de Animales Exóticos"}', '{"Viajar", "Jardinería", "Pintura"}', '{"linkedin": "https://www.linkedin.com/in/elena", "facebook": "https://www.facebook.com/elena"}', 'Notas adicionales sobre Elena...'),
    ('Javier Ruiz', 24, 85.7, '1997-06-20', 'javier@example.com', 'Calle Mayor', 'Madrid', 'España', '23456', '789-012-3456', 'Masculino', CURRENT_TIMESTAMP, 'Física', 'Universidad Complutense de Madrid', 8, 'B', 'Español', 'Inglés, Alemán', 'Física cuántica, Astronomía, Investigación en física teórica', 'Investigador en laboratorio de física cuántica, Profesor de física en universidad', '{"Certificado de Física Cuántica"}', '{"Música", "Ajedrez", "Excursionismo"}', '{"linkedin": "https://www.linkedin.com/in/javier", "instagram": "https://www.instagram.com/javier"}', 'Notas adicionales sobre Javier...'),
    ('Lucía Gómez', 22, 89.4, '1999-09-15', 'lucia@example.com', 'Rua das Flores', 'Lisboa', 'Portugal', '78901', '012-345-6789', 'Femenino', CURRENT_TIMESTAMP, 'Química', 'Universidade de Coimbra', 6, 'A', 'Portugués', 'Inglés, Español', 'Química orgánica, Síntesis de materiales, Investigación en nanotecnología', 'Investigadora en laboratorio de química orgánica, Participante en proyecto de síntesis de materiales', '{"Certificado de Síntesis de Materiales"}', '{"Bailar", "Viajar", "Leer"}', '{"linkedin": "https://www.linkedin.com/in/lucia", "twitter": "https://twitter.com/lucia"}', 'Notas adicionales sobre Lucía...'),
    ('Marcos García', 23, 86.2, '1998-02-28', 'marcos@example.com', 'Carrera 123', 'Buenos Aires', 'Argentina', '45678', '345-678-9012', 'Masculino', CURRENT_TIMESTAMP, 'Ciencias de la Computación', 'Universidad de Buenos Aires', 7, 'D', 'Español', 'Inglés, Portugués', 'Desarrollo de software, Inteligencia artificial, Seguridad informática', 'Desarrollador en empresa de tecnología X, Investigador en proyecto de IA', '{"Certificado de Desarrollo de Software", "Certificado de Seguridad Informática"}', '{"Videojuegos", "Fútbol", "Tecnología"}', '{"linkedin": "https://www.linkedin.com/in/marcos", "instagram": "https://www.instagram.com/marcos"}', 'Notas adicionales sobre Marcos...');

```

- **Operador `=`**: El operador `=` se utiliza para comparar si dos valores son iguales. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre sea 'Juan Pérez', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre = 'Juan Pérez';
```

- **Operador `!=`**: El operador `!=` se utiliza para comparar si dos valores son diferentes. Por ejemplo, para seleccionar todos los estudiantes cuya edad no sea 20, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE edad != 20;
```

- **Operador `>`**: El operador `>` se utiliza para comparar si un valor es mayor que otro. Por ejemplo, para seleccionar todos los estudiantes cuya edad sea mayor que 20, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE edad > 20;
```

- **Operador `<`**: El operador `<` se utiliza para comparar si un valor es menor que otro. Por ejemplo, para seleccionar todos los estudiantes cuya edad sea menor que 22, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE edad < 22;
```

- **Operador `>=`**: El operador `>=` se utiliza para comparar si un valor es mayor o igual que otro. Por ejemplo, para seleccionar todos los estudiantes cuya edad sea mayor o igual que 22, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE edad >= 22;
```

- **Operador `<=`**: El operador `<=` se utiliza para comparar si un valor es menor o igual que otro. Por ejemplo, para seleccionar todos los estudiantes cuya edad sea menor o igual que 22, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE edad <= 22;
```

- **Operador `IS NULL`**: El operador `IS NULL` se utiliza para comparar si un valor es nulo. Por ejemplo, para seleccionar todos los estudiantes cuyo teléfono sea nulo, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE telefono IS NULL;
```

- **Operador `IS NOT NULL`**: El operador `IS NOT NULL` se utiliza para comparar si un valor no es nulo. Por ejemplo, para seleccionar todos los estudiantes cuyo teléfono no sea nulo, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE telefono IS NOT NULL;
```

- **Operador `BETWEEN`**: El operador `BETWEEN` se utiliza para comparar si un valor está dentro de un rango de valores. Por ejemplo, para seleccionar todos los estudiantes cuya edad esté entre 20 y 22 años, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE edad BETWEEN 20 AND 22;
```

- **Operador `IN`**: El operador `IN` se utiliza para comparar si un valor está en una lista de valores. Por ejemplo, para seleccionar todos los estudiantes cuyo país sea 'México', 'Perú' o 'Brasil', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE pais IN ('México', 'Perú', 'Brasil');
```

- **Operador `LIKE`**: El operador `LIKE` se utiliza para comparar si un valor coincide con un patrón de texto. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre empiece con 'J', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre LIKE 'J%';
```

- **Operador `ILIKE`**: El operador `ILIKE` se utiliza para comparar si un valor coincide con un patrón de texto sin distinguir entre mayúsculas y minúsculas. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre empiece con 'j' o 'J', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre ILIKE 'j%';
```

- **Operador `SIMILAR TO`**: El operador `SIMILAR TO` se utiliza para comparar si un valor coincide con una expresión regular. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre empiece con 'J' o 'M', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre SIMILAR TO '[JM]%';
```
- **Operador `NOT LIKE`**: El operador `NOT LIKE` se utiliza para comparar si un valor no coincide con un patrón de texto. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre no empiece con 'J', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre NOT LIKE 'J%';
```

- **Operador `NOT ILIKE`**: El operador `NOT ILIKE` se utiliza para comparar si un valor no coincide con un patrón de texto sin distinguir entre mayúsculas y minúsculas. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre no empiece con 'j' o 'J', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre NOT ILIKE 'j%';
```

- **Operador `NOT SIMILAR TO`**: El operador `NOT SIMILAR TO` se utiliza para comparar si un valor no coincide con una expresión regular. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre no empiece con 'J' o 'M', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre NOT SIMILAR TO '[JM]%';
```

- **Operador `AND`**: El operador `AND` se utiliza para combinar dos condiciones y devolver un resultado verdadero si ambas condiciones son verdaderas. Por ejemplo, para seleccionar todos los estudiantes cuyo país sea 'México' y cuya edad sea mayor que 20, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE pais = 'México' AND edad > 20;
```

- **Operador `OR`**: El operador `OR` se utiliza para combinar dos condiciones y devolver un resultado verdadero si al menos una de las condiciones es verdadera. Por ejemplo, para seleccionar todos los estudiantes cuyo país sea 'México' o cuya edad sea mayor que 22, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE pais = 'México' OR edad > 22;
```

- **Operador `NOT`**: El operador `NOT` se utiliza para invertir el resultado de una condición y devolver un resultado verdadero si la condición es falsa. Por ejemplo, para seleccionar todos los estudiantes cuyo país no sea 'México', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE NOT pais = 'México';
```

- **Operador `ANY`**: El operador `ANY` se utiliza para comparar si un valor es igual a cualquiera de los valores de una subconsulta. Por ejemplo, para seleccionar todos los estudiantes cuyo promedio sea igual a cualquiera de los promedios de los estudiantes de la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE promedio = ANY (SELECT promedio FROM estudiantes);
```

- **Operador `ALL`**: El operador `ALL` se utiliza para comparar si un valor es igual a todos los valores de una subconsulta. Por ejemplo, para seleccionar todos los estudiantes cuyo promedio sea igual a todos los promedios de los estudiantes de la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE promedio = ALL (SELECT promedio FROM estudiantes);
```

- **Operador `EXISTS`**: El operador `EXISTS` se utiliza para comparar si una subconsulta devuelve algún resultado. Por ejemplo, para seleccionar todos los estudiantes que tienen certificaciones, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE EXISTS (SELECT 1 FROM estudiantes WHERE certificaciones IS NOT NULL);
```

- **Operador `NOT EXISTS`**: El operador `NOT EXISTS` se utiliza para comparar si una subconsulta no devuelve ningún resultado. Por ejemplo, para seleccionar todos los estudiantes que no tienen certificaciones, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE NOT EXISTS (SELECT 1 FROM estudiantes WHERE certificaciones IS NOT NULL);
```

- **Operador `IS DISTINCT FROM`**: El operador `IS DISTINCT FROM` se utiliza para comparar si dos valores son distintos, incluso si ambos son nulos. Por ejemplo, para seleccionar todos los estudiantes cuyo teléfono sea distinto de '123-456-7890', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE telefono IS DISTINCT FROM '123-456-7890';
```

- **Operador `IS NOT DISTINCT FROM`**: El operador `IS NOT DISTINCT FROM` se utiliza para comparar si dos valores son iguales, incluso si ambos son nulos. Por ejemplo, para seleccionar todos los estudiantes cuyo teléfono sea igual a '123-456-7890', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE telefono IS NOT DISTINCT FROM '123-456-7890';
```

- **Operador `OVERLAPS`**: El operador `OVERLAPS` se utiliza para comparar si dos rangos de fechas se superponen. Por ejemplo, para seleccionar todos los estudiantes cuya fecha de nacimiento se superponga con la fecha de registro, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE fecha_nacimiento OVERLAPS fecha_registro;
```

- **Operador `CONTAINS`**: El operador `CONTAINS` se utiliza para comparar si un rango de fechas contiene a otro rango de fechas. Por ejemplo, para seleccionar todos los estudiantes cuya fecha de registro esté contenida en el rango de fechas de nacimiento, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE fecha_registro CONTAINS fecha_nacimiento;
```

- **Operador `CONTAINED BY`**: El operador `CONTAINED BY` se utiliza para comparar si un rango de fechas está contenido por otro rango de fechas. Por ejemplo, para seleccionar todos los estudiantes cuya fecha de registro esté contenida en el rango de fechas de nacimiento, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE fecha_registro CONTAINED BY fecha_nacimiento;
```

- **Operador `&&`**: El operador `&&` se utiliza para comparar si dos rangos de fechas se superponen. Por ejemplo, para seleccionar todos los estudiantes cuya fecha de nacimiento se superponga con la fecha de registro, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE fecha_nacimiento && fecha_registro;
```

- **Operador `@>`**: El operador `@>` se utiliza para comparar si un rango de fechas contiene a otro rango de fechas. Por ejemplo, para seleccionar todos los estudiantes cuya fecha de registro esté contenida en el rango de fechas de nacimiento, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE fecha_registro @> fecha_nacimiento;
```

- **Operador `<@`**: El operador `<@` se utiliza para comparar si un rango de fechas está contenido por otro rango de fechas. Por ejemplo, para seleccionar todos los estudiantes cuya fecha de registro esté contenida en el rango de fechas de nacimiento, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE fecha_registro <@ fecha_nacimiento;
```

- **Operador `~`**: El operador `~` se utiliza para comparar si un valor coincide con una expresión regular. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre empiece con 'J' o 'M', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre ~ '^[JM]';
```

- **Operador `~*`**: El operador `~*` se utiliza para comparar si un valor coincide con una expresión regular sin distinguir entre mayúsculas y minúsculas. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre empiece con 'j' o 'm', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre ~* '^[jm]';
```

- **Operador `!~`**: El operador `!~` se utiliza para comparar si un valor no coincide con una expresión regular. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre no empiece con 'J' o 'M', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre !~ '^[JM]';
```

- **Operador `!~*`**: El operador `!~*` se utiliza para comparar si un valor no coincide con una expresión regular sin distinguir entre mayúsculas y minúsculas. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre no empiece con 'j' o 'm', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre !~* '^[jm]';
```

- **Operador `#`**: El operador `#` se utiliza para comparar si un valor coincide con un patrón de texto. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre empiece con 'J' o 'M', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre # '^[JM]';
```

- **Operador `#*`**: El operador `#*` se utiliza para comparar si un valor coincide con un patrón de texto sin distinguir entre mayúsculas y minúsculas. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre empiece con 'j' o 'm', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre #* '^[jm]';
```

- **Operador `#!`**: El operador `#!` se utiliza para comparar si un valor no coincide con un patrón de texto. Por ejemplo, para seleccionar todos los estudiantes cuyo nombre no empiece con 'J' o 'M', puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes WHERE nombre #! '^[JM]';
```

### Sentencia `ORDER BY`:

La sentencia `ORDER BY` se utiliza para ordenar los resultados de una consulta en PostgreSQL. Puedes ordenar los resultados por una o más columnas en orden ascendente o descendente. Por ejemplo, para ordenar los estudiantes por nombre en orden ascendente, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes ORDER BY nombre;
```

Para ordenar los estudiantes por nombre en orden descendente, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes ORDER BY nombre DESC;
```

Para ordenar los estudiantes por edad en orden ascendente y luego por promedio en orden descendente, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes ORDER BY edad ASC, promedio DESC;
```

### Sentencia `LIMIT`:

La sentencia `LIMIT` se utiliza para limitar el número de filas que se devuelven en una consulta en PostgreSQL. Puedes utilizar `LIMIT` para devolver un número específico de filas o para paginar los resultados de una consulta. Por ejemplo, para devolver los primeros 5 estudiantes de la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes LIMIT 5;
```

### Sentencia `OFFSET`:

La sentencia `OFFSET` se utiliza para omitir un número específico de filas al principio de los resultados de una consulta en PostgreSQL. Puedes utilizar `OFFSET` junto con `LIMIT` para paginar los resultados de una consulta. Por ejemplo, para devolver los siguientes 5 estudiantes después de los primeros 5 estudiantes de la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT * FROM estudiantes OFFSET 5 LIMIT 5;
```

### Sentencia `GROUP BY`:

La sentencia `GROUP BY` se utiliza para agrupar filas que tienen el mismo valor en una o más columnas en PostgreSQL. Puedes utilizar `GROUP BY` junto con funciones de agregación como `COUNT`, `SUM`, `AVG`, `MIN` y `MAX` para realizar cálculos en grupos de filas. Por ejemplo, para contar el número de estudiantes por país en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT pais, COUNT(*) FROM estudiantes GROUP BY pais;
```

### Sentencia `HAVING`:

La sentencia `HAVING` se utiliza para filtrar grupos de filas que cumplen una condición en PostgreSQL. Puedes utilizar `HAVING` junto con `GROUP BY` y funciones de agregación para filtrar grupos de filas. Por ejemplo, para contar el número de estudiantes por país y filtrar solo los países con más de 2 estudiantes, puedes ejecutar la siguiente consulta:

```sql 
SELECT pais, COUNT(*) FROM estudiantes GROUP BY pais HAVING COUNT(*) > 2;
```

### Sentencia `DISTINCT`:

La sentencia `DISTINCT` se utiliza para eliminar filas duplicadas de los resultados de una consulta en PostgreSQL. Puedes utilizar `DISTINCT` para devolver solo valores únicos en una columna o en varias columnas. Por ejemplo, para devolver una lista de países únicos de la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT DISTINCT pais FROM estudiantes;
```

### Sentencia `MIN y MAX`:

Las funciones `MIN` y `MAX` se utilizan para devolver el valor mínimo y máximo de una columna en PostgreSQL. Puedes utilizar `MIN` y `MAX` para encontrar el valor mínimo y máximo de una columna en una tabla. Por ejemplo, para encontrar la edad mínima y máxima de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT MIN(edad), MAX(edad) FROM estudiantes;
```

### Sentencia `SUM`:

La función `SUM` se utiliza para devolver la suma de los valores de una columna en PostgreSQL. Puedes utilizar `SUM` para calcular la suma de los valores de una columna en una tabla. Por ejemplo, para calcular la suma de los promedios de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT SUM(promedio) FROM estudiantes;
```

### Sentencia `AVG`:

La función `AVG` se utiliza para devolver el promedio de los valores de una columna en PostgreSQL. Puedes utilizar `AVG` para calcular el promedio de los valores de una columna en una tabla. Por ejemplo, para calcular el promedio de las edades de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT AVG(edad) FROM estudiantes;
```

### Sentencia `COUNT`:

La función `COUNT` se utiliza para devolver el número de filas que cumplen una condición en PostgreSQL. Puedes utilizar `COUNT` para contar el número de filas en una tabla o el número de filas que cumplen una condición en una tabla. Por ejemplo, para contar el número total de estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT COUNT(*) FROM estudiantes;
```

Para contar el número de estudiantes cuya edad es mayor que 20, puedes ejecutar la siguiente consulta:

```sql
SELECT COUNT(*) FROM estudiantes WHERE edad > 20;
```

### Sentencia `JOIN`:

La sentencia `JOIN` se utiliza para combinar filas de dos o más tablas en PostgreSQL. Puedes utilizar `JOIN` para combinar filas de tablas relacionadas utilizando una columna común. Por ejemplo, para combinar las tablas `estudiantes` y `universidades` en una consulta, puedes ejecutar la siguiente consulta:

```sql
SELECT estudiantes.nombre, estudiantes.edad, universidades.nombre AS universidad
FROM estudiantes
JOIN universidades ON estudiantes.universidad = universidades.id;
```

### Sentencia `LEFT JOIN`:

La sentencia `LEFT JOIN` se utiliza para combinar todas las filas de la tabla de la izquierda con las filas coincidentes de la tabla de la derecha en PostgreSQL. Puedes utilizar `LEFT JOIN` para devolver todas las filas de la tabla de la izquierda, incluso si no hay filas coincidentes en la tabla de la derecha. Por ejemplo, para combinar las tablas `estudiantes` y `universidades` en una consulta y devolver todos los estudiantes, incluso si no tienen una universidad asociada, puedes ejecutar la siguiente consulta:

```sql
SELECT estudiantes.nombre, estudiantes.edad, universidades.nombre AS universidad
FROM estudiantes
LEFT JOIN universidades ON estudiantes.universidad = universidades.id;
```

### Sentencia `RIGHT JOIN`:

La sentencia `RIGHT JOIN` se utiliza para combinar todas las filas de la tabla de la derecha con las filas coincidentes de la tabla de la izquierda en PostgreSQL. Puedes utilizar `RIGHT JOIN` para devolver todas las filas de la tabla de la derecha, incluso si no hay filas coincidentes en la tabla de la izquierda. Por ejemplo, para combinar las tablas `estudiantes` y `universidades` en una consulta y devolver todas las universidades, incluso si no tienen estudiantes asociados, puedes ejecutar la siguiente consulta:

```sql
SELECT estudiantes.nombre, estudiantes.edad, universidades.nombre AS universidad
FROM estudiantes
RIGHT JOIN universidades ON estudiantes.universidad = universidades.id;
```

### Sentencia `FULL JOIN`:

La sentencia `FULL JOIN` se utiliza para combinar todas las filas de la tabla de la izquierda y de la tabla de la derecha en PostgreSQL. Puedes utilizar `FULL JOIN` para devolver todas las filas de ambas tablas, incluso si no hay filas coincidentes en una de las tablas. Por ejemplo, para combinar las tablas `estudiantes` y `universidades` en una consulta y devolver todas las filas de ambas tablas, puedes ejecutar la siguiente consulta:

```sql
SELECT estudiantes.nombre, estudiantes.edad, universidades.nombre AS universidad
FROM estudiantes
FULL JOIN universidades ON estudiantes.universidad = universidades.id;
```

### Sentencia `UNION`:

La sentencia `UNION` se utiliza para combinar los resultados de dos o más consultas en PostgreSQL. Puedes utilizar `UNION` para combinar los resultados de dos o más consultas en una sola tabla. Por ejemplo, para combinar los nombres de los estudiantes de la tabla `estudiantes` con los nombres de las universidades de la tabla `universidades`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre FROM estudiantes
UNION
SELECT nombre FROM universidades;
```

### Sentencia `UNION ALL`:

La sentencia `UNION ALL` se utiliza para combinar los resultados de dos o más consultas en PostgreSQL. Puedes utilizar `UNION ALL` para combinar los resultados de dos o más consultas en una sola tabla, incluyendo filas duplicadas. Por ejemplo, para combinar los nombres de los estudiantes de la tabla `estudiantes` con los nombres de las universidades de la tabla `universidades`, incluyendo filas duplicadas, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre FROM estudiantes
UNION ALL
SELECT nombre FROM universidades;
```

### Sentencia `INTERSECT`:

La sentencia `INTERSECT` se utiliza para devolver los resultados que se encuentran en ambas consultas en PostgreSQL. Puedes utilizar `INTERSECT` para devolver los resultados que se encuentran en dos o más consultas. Por ejemplo, para devolver los nombres de los estudiantes que también son nombres de universidades en las tablas `estudiantes` y `universidades`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre FROM estudiantes
INTERSECT
SELECT nombre FROM universidades;
```

### Sentencia `EXCEPT`:

La sentencia `EXCEPT` se utiliza para devolver los resultados que se encuentran en la primera consulta pero no en la segunda consulta en PostgreSQL. Puedes utilizar `EXCEPT` para devolver los resultados que se encuentran en la primera consulta pero no en la segunda consulta. Por ejemplo, para devolver los nombres de los estudiantes que no son nombres de universidades en las tablas `estudiantes` y `universidades`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre FROM estudiantes
EXCEPT
SELECT nombre FROM universidades;
```

### Sentencia `CASE`:

La sentencia `CASE` se utiliza para realizar evaluaciones condicionales en PostgreSQL. Puedes utilizar `CASE` para devolver un valor basado en una condición. Por ejemplo, para devolver una categoría de promedio basada en el promedio de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre, promedio,
    CASE
        WHEN promedio >= 90 THEN 'Excelente'
        WHEN promedio >= 80 THEN 'Bueno'
        WHEN promedio >= 70 THEN 'Regular'
        ELSE 'Deficiente'
    END AS categoria
FROM estudiantes;
```

### Sentencia `COALESCE`:

La función `COALESCE` se utiliza para devolver el primer valor no nulo de una lista de valores en PostgreSQL. Puedes utilizar `COALESCE` para devolver el primer valor no nulo de una lista de valores. Por ejemplo, para devolver el correo electrónico o el teléfono de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre, COALESCE(correo, telefono) AS contacto
FROM estudiantes;
```

### Sentencia `NULLIF`:

La función `NULLIF` se utiliza para devolver nulo si dos valores son iguales en PostgreSQL. Puedes utilizar `NULLIF` para devolver nulo si dos valores son iguales. Por ejemplo, para devolver nulo si el correo electrónico y el teléfono de los estudiantes son iguales, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre, NULLIF(correo, telefono) AS contacto
FROM estudiantes;
```

### Sentencia `GREATEST`:

La función `GREATEST` se utiliza para devolver el mayor valor de una lista de valores en PostgreSQL. Puedes utilizar `GREATEST` para devolver el mayor valor de una lista de valores. Por ejemplo, para devolver la mayor edad de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre, GREATEST(edad) AS mayor_edad
FROM estudiantes;
```

### Sentencia `LEAST`:

La función `LEAST` se utiliza para devolver el menor valor de una lista de valores en PostgreSQL. Puedes utilizar `LEAST` para devolver el menor valor de una lista de valores. Por ejemplo, para devolver la menor edad de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre, LEAST(edad) AS menor_edad
FROM estudiantes;
```

### Sentencia `COALESCE`:

La función `COALESCE` se utiliza para devolver el primer valor no nulo de una lista de valores en PostgreSQL. Puedes utilizar `COALESCE` para devolver el primer valor no nulo de una lista de valores. Por ejemplo, para devolver el correo electrónico o el teléfono de los estudiantes en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
SELECT nombre, COALESCE(correo, telefono) AS contacto
FROM estudiantes;
```

## Trigger

Un trigger es un procedimiento almacenado que se ejecuta automáticamente en respuesta a ciertos eventos en una tabla en PostgreSQL. Puedes utilizar triggers para realizar acciones como insertar, actualizar o eliminar datos en una tabla cuando se produce un evento en otra tabla. Por ejemplo, puedes utilizar un trigger para actualizar el saldo de una cuenta bancaria cuando se realiza una transacción.

### Crear un Trigger

Para crear un trigger en PostgreSQL, puedes utilizar la siguiente sintaxis:

```sql
CREATE TRIGGER nombre_trigger
AFTER INSERT OR UPDATE OR DELETE ON nombre_tabla
FOR EACH ROW
EXECUTE FUNCTION nombre_funcion();
```

En esta sintaxis:

- `nombre_trigger` es el nombre del trigger que estás creando.
- `AFTER INSERT OR UPDATE OR DELETE` especifica cuándo se ejecutará el trigger.
- `nombre_tabla` es el nombre de la tabla en la que se ejecutará el trigger.
- `FOR EACH ROW` especifica que el trigger se ejecutará para cada fila afectada por el evento.
- `nombre_funcion` es el nombre de la función que se ejecutará cuando se active el trigger.
- `CREATE TRIGGER` es la sentencia que se utiliza para crear un trigger en PostgreSQL.
- `EXECUTE FUNCTION` es la sentencia que se utiliza para ejecutar una función en un trigger en PostgreSQL.
- `;` es el delimitador de sentencia que se utiliza para finalizar la sentencia.

Por ejemplo, para crear un trigger que se ejecute después de insertar, actualizar o eliminar una fila en la tabla `estudiantes` y ejecute la función `actualizar_promedio()`, puedes ejecutar la siguiente consulta:

```sql
CREATE TRIGGER actualizar_promedio_trigger
AFTER INSERT OR UPDATE OR DELETE ON estudiantes
FOR EACH ROW
EXECUTE FUNCTION actualizar_promedio();
```

- la función `actualizar_promedio()` se ejecutará cada vez que se inserte, actualice o elimine una fila en la tabla `estudiantes`.
- la función `actualizar_promedio()` debe estar definida previamente en la base de datos y debe aceptar los mismos parámetros que el trigger.
- la función `actualizar_promedio()` puede realizar cualquier acción que desees en respuesta al evento, como actualizar el promedio de un estudiante.
- la función `actualizar_promedio()` puede devolver un valor si es necesario, pero no es obligatorio.

```sql
CREATE OR REPLACE FUNCTION actualizar_promedio()
RETURNS TRIGGER AS $$
BEGIN
    -- Realizar acciones en respuesta al evento
    UPDATE estudiantes SET promedio = (SELECT AVG(nota) FROM calificaciones WHERE id_estudiante = NEW.id) WHERE id = NEW.id;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

```

### Eliminar un Trigger

Para eliminar un trigger en PostgreSQL, puedes utilizar la siguiente sintaxis:

```sql
DROP TRIGGER nombre_trigger ON nombre_tabla;
```

## Procedimientos almacenados:

Un procedimiento almacenado es un conjunto de instrucciones SQL que se almacenan en la base de datos y se pueden ejecutar de forma repetida en PostgreSQL. Puedes utilizar procedimientos almacenados para realizar tareas complejas que requieren múltiples instrucciones SQL. Por ejemplo, puedes utilizar un procedimiento almacenado para calcular el promedio de las calificaciones de un estudiante.

### Crear un Procedimiento Almacenado

Para crear un procedimiento almacenado en PostgreSQL, puedes utilizar la siguiente sintaxis:

```sql
CREATE OR REPLACE FUNCTION nombre_procedimiento(parametro1 tipo, parametro2 tipo, ...)
RETURNS tipo
AS $$
BEGIN
    -- Instrucciones SQL
END;
$$ LANGUAGE plpgsql;
```

En esta sintaxis:

- `nombre_procedimiento` es el nombre del procedimiento almacenado que estás creando.
- `parametro1, parametro2, ...` son los parámetros que acepta el procedimiento almacenado.
- `tipo` es el tipo de datos de los parámetros y del valor de retorno del procedimiento almacenado.
- `RETURNS tipo` especifica el tipo de datos que devuelve el procedimiento almacenado.
- `BEGIN` y `END` delimitan el bloque de instrucciones SQL que se ejecutarán en el procedimiento almacenado.
- `$$` es el delimitador de bloque que se utiliza para encerrar el bloque de instrucciones SQL.
- `LANGUAGE plpgsql` especifica que el procedimiento almacenado está escrito en el lenguaje PL/pgSQL.
- `CREATE OR REPLACE FUNCTION` es la sentencia que se utiliza para crear o reemplazar un procedimiento almacenado en PostgreSQL.

Por ejemplo, para crear un procedimiento almacenado que acepte el `id` de un estudiante y actualice su promedio en la tabla `estudiantes`, puedes ejecutar la siguiente consulta:

```sql
CREATE OR REPLACE FUNCTION actualizar_promedio(id_estudiante INT)
RETURNS VOID
AS $$
BEGIN
    UPDATE estudiantes SET promedio = (SELECT AVG(nota) FROM calificaciones WHERE id_estudiante = id_estudiante) WHERE id = id_estudiante;
END;
$$ LANGUAGE plpgsql;
```

# Aqui te dejo algunos ejemplos de como crear una base de datos en PostgreSQL

1. Create una base de datos con cualquier nombre:
```sql
CREATE DATABASE nombre_base_de_datos;
```

2. Crea la siguiente tabla en la base de datos:
```sql
CREATE TABLE STATION(
    ID INT,
    CITY VARCHAR(21)
);
```

3. Inserta los siguientes registros en la tabla:
```sql
-- * insercion de datos
insert into STATION (ID, CITY) values (1, 'Paombong');
insert into STATION (ID, CITY) values (2, 'Broshniv-Osada');
insert into STATION (ID, CITY) values (3, 'Makale');
insert into STATION (ID, CITY) values (4, 'Fréjus');
insert into STATION (ID, CITY) values (5, 'Pamiątkowo');
insert into STATION (ID, CITY) values (6, 'Canhas');
insert into STATION (ID, CITY) values (7, 'Turar Ryskulov');
insert into STATION (ID, CITY) values (8, 'Karagandy');
insert into STATION (ID, CITY) values (9, 'Iperó');
insert into STATION (ID, CITY) values (10, 'Nema');
insert into STATION (ID, CITY) values (11, 'Ankola');
insert into STATION (ID, CITY) values (12, 'São Miguel do Guamá');
insert into STATION (ID, CITY) values (13, 'Zastávka');
insert into STATION (ID, CITY) values (14, 'Aleksandrów');
insert into STATION (ID, CITY) values (15, 'Dalinhe');
insert into STATION (ID, CITY) values (16, 'Balengbeng');
insert into STATION (ID, CITY) values (17, 'Zhongshan Donglu');
insert into STATION (ID, CITY) values (18, 'Dongshan');
insert into STATION (ID, CITY) values (19, 'Capilla del Monte');
insert into STATION (ID, CITY) values (20, 'Dawang');
insert into STATION (ID, CITY) values (21, 'Rokietnica');
insert into STATION (ID, CITY) values (22, 'Kariya');
insert into STATION (ID, CITY) values (23, 'Takaoka');
insert into STATION (ID, CITY) values (24, 'Banjar Beratan');
insert into STATION (ID, CITY) values (25, 'Pingshan');
insert into STATION (ID, CITY) values (26, 'Wonokerto');
insert into STATION (ID, CITY) values (27, 'Mosquera');
insert into STATION (ID, CITY) values (28, 'Aras-asan');
insert into STATION (ID, CITY) values (29, 'Nyandoma');
insert into STATION (ID, CITY) values (30, 'Cipondok');
insert into STATION (ID, CITY) values (31, 'Hongxing');
insert into STATION (ID, CITY) values (32, 'Hermosa');
insert into STATION (ID, CITY) values (33, 'Carriedo');
insert into STATION (ID, CITY) values (34, 'Kuhmalahti');
insert into STATION (ID, CITY) values (35, 'Dao’er');
insert into STATION (ID, CITY) values (36, 'Severomorsk');
insert into STATION (ID, CITY) values (37, 'Nueva Manoa');
insert into STATION (ID, CITY) values (38, 'Santa Rosa');
insert into STATION (ID, CITY) values (39, 'Aelande');
insert into STATION (ID, CITY) values (40, 'Lluchubamba');
insert into STATION (ID, CITY) values (41, 'Dalun');
insert into STATION (ID, CITY) values (42, 'Klatakan');
insert into STATION (ID, CITY) values (43, 'Biasong');
insert into STATION (ID, CITY) values (44, 'Krajan Craken');
insert into STATION (ID, CITY) values (45, 'Coro');
insert into STATION (ID, CITY) values (46, 'Xingxi');
insert into STATION (ID, CITY) values (47, 'İsmayıllı');
insert into STATION (ID, CITY) values (48, 'Talambung Laok');
insert into STATION (ID, CITY) values (49, 'Skuratovskiy');
insert into STATION (ID, CITY) values (50, 'Nālchiti');
insert into STATION (ID, CITY) values (51, 'Nyangao');
insert into STATION (ID, CITY) values (52, 'Songqiao');
insert into STATION (ID, CITY) values (53, 'Keruguya');
insert into STATION (ID, CITY) values (54, 'Kamieniec');
insert into STATION (ID, CITY) values (55, 'Baru');
insert into STATION (ID, CITY) values (56, 'Telde');
insert into STATION (ID, CITY) values (57, 'Tuti');
insert into STATION (ID, CITY) values (58, 'Mrgavan');
insert into STATION (ID, CITY) values (59, 'Pimian');
insert into STATION (ID, CITY) values (60, 'Vidovci');
insert into STATION (ID, CITY) values (61, 'Budapest');
insert into STATION (ID, CITY) values (62, 'Las Americas');
insert into STATION (ID, CITY) values (63, 'Lyamino');
insert into STATION (ID, CITY) values (64, 'Mendes');
insert into STATION (ID, CITY) values (65, 'Guardizela');
insert into STATION (ID, CITY) values (66, 'Piedade');
insert into STATION (ID, CITY) values (67, 'Shilovo');
insert into STATION (ID, CITY) values (68, 'São Miguel dos Campos');
insert into STATION (ID, CITY) values (69, 'Xiabuji');
insert into STATION (ID, CITY) values (70, 'Quảng Ngãi');
insert into STATION (ID, CITY) values (71, 'Tumba');
insert into STATION (ID, CITY) values (72, 'Philadelphia');
insert into STATION (ID, CITY) values (73, 'Kozlovice');
insert into STATION (ID, CITY) values (74, 'Pakapasan Girang');
insert into STATION (ID, CITY) values (75, 'Las Lomas');
insert into STATION (ID, CITY) values (76, 'Arlington');
insert into STATION (ID, CITY) values (77, 'Sindangsari');
insert into STATION (ID, CITY) values (78, 'Muff');
insert into STATION (ID, CITY) values (79, 'Maicao');
insert into STATION (ID, CITY) values (80, 'Rokiciny');
insert into STATION (ID, CITY) values (81, 'Waturoka');
insert into STATION (ID, CITY) values (82, 'Caringin Lor');
insert into STATION (ID, CITY) values (83, 'Zlaté Hory');
insert into STATION (ID, CITY) values (84, 'Daba');
insert into STATION (ID, CITY) values (85, 'Kabba');
insert into STATION (ID, CITY) values (86, 'Heyou');
insert into STATION (ID, CITY) values (87, 'Kang-neung');
insert into STATION (ID, CITY) values (88, 'Sinop');
insert into STATION (ID, CITY) values (89, 'Minokamo');
insert into STATION (ID, CITY) values (90, 'Gandi');
insert into STATION (ID, CITY) values (91, 'Uruaçu');
insert into STATION (ID, CITY) values (92, 'Taibai');
insert into STATION (ID, CITY) values (93, 'Longkou');
insert into STATION (ID, CITY) values (94, 'Korotych');
insert into STATION (ID, CITY) values (95, 'Miguel Calmon');
insert into STATION (ID, CITY) values (96, 'Vysokogornyy');
insert into STATION (ID, CITY) values (97, 'San Jacinto');
insert into STATION (ID, CITY) values (98, 'Kastsyukowka');
insert into STATION (ID, CITY) values (99, 'La’ershan');
insert into STATION (ID, CITY) values (100, 'Changgai');

insert into STATION (ID, CITY) values (1, 'New York');
insert into STATION (ID, CITY) values (2, 'New York');
insert into STATION (ID, CITY) values (3, 'Bengalaru');
insert into STATION (ID, CITY) values (4, 'Bengalaru');
```

4. Diviertete con tu base de datos y estos ejemplos.

- Ejercicio 1: Encuentre la diferencia entre el número total de entradas de CIUDAD en la tabla y el número de entradas distintas de CIUDAD en la tabla.
La cláusula DISTINCT elimina los registros duplicados de los resultados de una consulta

```sql
SELECT COUNT(CITY) - COUNT(DISTINCT CITY) AS DIFFERENCE FROM STATION;
```

```sql
--? Consulta las dos ciudades en ESTACIÓN con los nombres de CIUDAD más cortos y más largos, así como sus respectivas longitudes (es decir, número de caracteres en el nombre). Si hay más de una ciudad más pequeña o más grande, elija la que aparece primero en orden alfabético.

--* Esta subconsulta busca la ciudad con la longitud máxima en la columna "CITY".

    --* Utiliza la función LEN para obtener la longitud de cada ciudad.
    --* Agrupa los resultados por ciudad utilizando la cláusula GROUP BY.
    --* Calcula la longitud máxima para cada ciudad utilizando la función de agregación MAX(LEN(CITY)).
    --* Ordena los resultados por la longitud máxima en orden ascendente (ASC) y por el nombre de la ciudad.
SELECT * FROM (SELECT TOP 1 CITY, MAX(LEN(CITY)) AS LENGTH FROM STATION GROUP BY CITY ORDER BY MAX(LEN(CITY)) ASC, CITY) A 
UNION ALL 
--* Esta subconsulta busca la ciudad con la longitud mínima en la columna "CITY".

    --* Utiliza la función LEN para obtener la longitud de cada ciudad.
    --* Agrupa los resultados por ciudad utilizando la cláusula GROUP BY.
    --* Calcula la longitud mínima para cada ciudad utilizando la función de agregación MIN(LEN(CITY)).
    --* Ordena los resultados por la longitud mínima en orden descendente (DESC) y por el nombre de la ciudad.
SELECT * FROM (SELECT TOP 1 CITY, MIN(LEN(CITY)) AS LENGTH FROM STATION GROUP BY CITY ORDER BY MIN(LEN(CITY)) DESC, CITY) B;

--*La cláusula UNION ALL:
    --* La cláusula UNION ALL se utiliza para combinar los resultados de las dos subconsultas en un solo conjunto de resultados. 
    --* Esto significa que se mostrarán las dos filas resultantes en secuencia.

--? Consulte la lista de nombres de CIUDAD que comienzan con vocales (es decir, a, e, i, o o u) desde ESTACIÓN. Su resultado no puede contener duplicados.

SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '[aeiouAEIOU]%';

--? Consulta la lista de nombres de CIUDAD que terminan en vocales (a, e, i, o, u) desde ESTACIÓN. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '%[aeiouAEIOU]';

--? Consulte la lista de nombres de CIUDAD de ESTACIÓN que tienen vocales (es decir, a, e, i, o y u) como primer y último carácter. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '[aeiouAEIOU]%[aeiouAEIOU]';

--? Consulta la lista de nombres de CIUDAD de ESTACIÓN que no comienzan con vocales. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '[aeiouAEIOU]%';

--? Consulta la lista de nombres de CIUDAD de ESTACIÓN que no terminan en vocal. Su resultado no puede contener duplicados.

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '%[aeiouAEIOU]'

--? Consulta la lista de nombres de CIUDAD de ESTACIÓN que no comienzan con vocales o no terminan con vocales. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '[aeiouAEIOU]%' OR CITY NOT LIKE '%[aeiouAEIOU]';
```

```sql
USE master

USE LEARN

CREATE TABLE STUDENTS
(
    ID INT IDENTITY PRIMARY KEY,
    NAME VARCHAR(60),
    MARKS INT
)

SELECT *
FROM STUDENTS

INSERT INTO STUDENTS
    (NAME, MARKS)
VALUES
    ('Ashley', 81)
INSERT INTO STUDENTS
    (NAME, MARKS)
VALUES
    ('Samantha', 75)
INSERT INTO STUDENTS
    (NAME, MARKS)
VALUES
    ('Julia', 76)
INSERT INTO STUDENTS
    (NAME, MARKS)
VALUES
    ('Belevet', 84)

--Consulte el nombre de cualquier estudiante en ESTUDIANTES que obtuvo una puntuación superior a 75 marcas. 
--Ordene su salida por los últimos tres caracteres de cada nombre. Si dos o más estudiantes tienen nombres 
--que terminan en los mismos últimos tres caracteres (es decir, Bobby, Robby, etc.), clasifíquelos secundariamente por ID ascendente.

SELECT NAME, COUNT(SUBSTRING(NAME, LEN(NAME)-2, LEN(NAME)))
FROM STUDENTS
WHERE MARKS > 75
GROUP BY NAME
ORDER BY SUBSTRING(NAME, LEN(NAME)-2, LEN(NAME)) DESC;


SELECT NAME, ID
FROM STUDENTS
WHERE MARKS > 75
ORDER BY ID ASC;

SELECT NAME
FROM STUDENTS
WHERE MARKS > 75
ORDER BY 
    -- La función SUBSTRING RECIVE 3 PARAMETROS 
    -- 1 LA COLUMNA EN DE DONDE SE SACARA LA SUBCADENA
    -- 2 EL INDICE INICIAL DE DOMDE SE TOMARA LA DUBCADENA
    -- 3 EL INDICE FINAL HASTA DONDE SE TOMARA LA SUBCADENA 
    -- se utiliza para obtener los últimos tres caracteres del nombre de cada estudiante. 
    -- Luego, se utiliza la cláusula ORDER BY para ordenar los resultados primero por los últimos tres caracteres del nombre (en orden ascendente) 
    -- y luego por el ID (en orden ascendente) en caso de empate.
    SUBSTRING(NAME, LEN(NAME)-2, LEN(NAME)), 
    ID ASC;



CREATE TABLE EMPLOYEE
(
    ID INT IDENTITY PRIMARY KEY,
    NAME VARCHAR(60),
    MONTHS INT,
    SALARY INT
)

insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Giselle', 1, 9332);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Wade', 8, 5803);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Becka', 5, 7065);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Dasha', 9, 9030);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Ira', 5, 4184);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Chris', 2, 6798);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Issiah', 3, 4051);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Maurise', 9, 10127);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Vinson', 3, 7392);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Rhianna', 3, 10468);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Ezri', 11, 7535);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Rachelle', 1, 4349);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Hillard', 11, 6345);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Cecily', 11, 4899);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Alexei', 9, 10120);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Nappy', 3, 9083);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Eyde', 11, 9291);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Tracey', 10, 4915);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Ashlen', 10, 5106);
insert into EMPLOYEE
    (NAME, MONTHS, SALARY)
values
    ('Beryl', 10, 3771);

--Escriba una consulta que imprima una lista de nombres de empleados (es decir, el atributo de nombre) de la tabla Empleado en orden alfabético.
SELECT NAME
FROM EMPLOYEE
ORDER BY NAME ASC


--Escriba una consulta que imprima una lista de nombres de empleados (es decir, el atributo de nombre) para los empleados en Empleado con un salario 
--superior a 2000 por mes que han sido empleados por menos de 10 meses. Ordene su resultado de forma ascendente employee_id.
SELECT NAME
FROM EMPLOYEE
WHERE MONTHS < 10 AND SALARY > 2000
ORDER BY ID ASC


--P(R) representa un patrón dibujado por Julia en R filas. El siguiente patrón representa P(5):
DECLARE @COUNTER INT = 20;
WHILE @COUNTER >= 1
BEGIN
    DECLARE @COUNTER2 INT = @COUNTER;
    DECLARE @ACUM VARCHAR(MAX) = ' ';
    WHILE @COUNTER2 >= 1
    BEGIN
        SET @ACUM = @ACUM+'* '
        SET @COUNTER2 = @COUNTER2-1
    END
    PRINT @ACUM
    --PRINT LEN(@ACUM)
    SET @COUNTER = @COUNTER-1
END

--P(R) representa un patrón dibujado por Julia en R filas. El siguiente patrón representa P(5):
DECLARE @COUNTER INT = 1;
WHILE @COUNTER <= 20
BEGIN
    DECLARE @COUNTER2 INT = 1;
    DECLARE @ACUM VARCHAR(MAX) = ' ';
    WHILE @COUNTER2 <= @COUNTER
    BEGIN
        SET @ACUM = @ACUM+'* '
        SET @COUNTER2 = @COUNTER2+1
    END
    PRINT @ACUM
    --PRINT LEN(@ACUM)
    SET @COUNTER = @COUNTER+1
END


--Escriba una consulta para imprimir todos los números primos menores o iguales que 1000. Imprima su resultado en una sola línea y use el carácter 
--ampersand (&) como separador (en lugar de un espacio).
DECLARE @COUNTER INT = 2;
DECLARE @SAVEPRIME VARCHAR(MAX) = ''
WHILE @COUNTER <= 1000
BEGIN
    DECLARE @A INT= 2;
    DECLARE @B INT= 0;
    WHILE @A > 1 AND @A < @COUNTER
    BEGIN
        IF @COUNTER % @A = 0
        BEGIN
            SET @B = @B + 1;
            BREAK;
        END
        SET @A = @A + 1
    END
    IF @B = 0
    BEGIN
        SET @SAVEPRIME = @SAVEPRIME + CAST(@COUNTER AS VARCHAR(MAX))+'&'
    END
    SET @COUNTER = @COUNTER+1
END
PRINT SUBSTRING(@SAVEPRIME, 0, LEN(@SAVEPRIME))


--Consulta los dos valores siguientes de la tabla STATION:
--  1.- La suma de todos los valores en LAT_N redondeados a una escala de 2 lugares decimales.
--  2.- La suma de todos los valores en LONG_W redondeados a una escala de 2 lugares decimales.

SELECT ROUND(SUM(LAT_N), 2) AS 'lat', ROUND(SUM(LONG_W), 2) AS 'lon'
FROM STATION
SELECT LEFT(ROUND(SUM(LAT_N),2),8) AS 'lat', LEFT(ROUND(SUM(LONG_W),2),8) AS 'lon'
FROM STATION

SELECT *
FROM STATION


-- Consulta la suma de las latitudes del norte (LAT_N) de la ESTACIÓN con valores mayores que 18,7880 Y Menor a 137,2345. 
-- Trunca tu respuesta a 4 decimales.

SELECT LEFT(ROUND(SUM(LAT_N),4),10)
FROM STATION
WHERE LAT_N > 38.7880 AND LAT_N < 137.2345;


--Consulta el mayor valor de las latitudes del norte (LAT_N) de la ESTACIÓN que es menor que 137.2345. Trunca tu respuesta a 4 decimales.

SELECT MAX(LAT_N)
FROM STATION
WHERE LAT_N < 137.2345;

SELECT LEFT(ROUND(MAX(LAT_N), 4), 8)
FROM STATION
WHERE LAT_N < 137.2345;

--Consulte la longitud occidental (LONG_W) para la mayor latitud norte (LAT_N) en STATION que sea inferior a 137.2345. Redondea tu respuesta a 4 decimales.

SELECT LEFT(ROUND(MAX(LONG_W), 4), 8)
FROM STATION
WHERE LAT_N = (SELECT MAX(LAT_N)
FROM STATION
WHERE LAT_N < 137.2345)


--Consulta la latitud norte más pequeña (LAT_N) de STATION que sea mayor que 38.7780. Redondea tu respuesta a decimales.

--38.85260000
SELECT LEFT(ROUND(MIN(LAT_N), 4), 6+1)
FROM STATION
WHERE LAT_N > 38.7780;

--Consulte la longitud occidental (LONG_W) donde la latitud norte más pequeña (LAT_N) en STATION es mayor que 38.7780. Redondea tu respuesta a 4 decimales.
SELECT LEFT(ROUND(MIN(LONG_W), 4), 7)
FROM STATION
WHERE LAT_N = (SELECT MIN(LAT_N)
FROM STATION
WHERE LAT_N > 38.7780)

--Considere P1(a, b) y P2(c, d) son 2 puntos en un plano 2D
--  a = pasa a ser igual al valor mínimo en Latitud Norte (LAT_N en ESTACIÓN).
--  b = pasa a ser igual al valor mínimo en longitud occidental (LONG_W en STATION).
--  c = pasa a ser igual al valor máximo en Latitud Norte (LAT_N en ESTACIÓN).
--  d = pasa a ser igual al valor máximo en longitud occidental (LONG_W en STATION).

--Consultar la Distancia de Manhattan entre los puntos P1 y P2 y redondearlo a una escala de 4 decimales.

DECLARE @x1 INT = (SELECT MIN(LAT_N)
FROM STATION);
DECLARE @y1 INT = (SELECT MIN(LONG_W)
FROM STATION);
DECLARE @x2 INT = (SELECT MAX(LAT_N)
FROM STATION);
DECLARE @y2 INT = (SELECT MAX(LONG_W)
FROM STATION);
SELECT LEFT(ROUND((@x2 - @x1) + (@y2 - @y1), 4) , 9) AS DISTANCE

--4863.6
SELECT
    LEFT(
        ROUND(
        MAX(LAT_N) - MIN(LAT_N)
            + 
        MAX(LONG_W) - MIN(LONG_W)
            ,4
    )
    , 9) AS DISTANCE
FROM STATION


--Considere P1(a, b) y P2(c, d) son 2 puntos en un plano 2D
--donde (a, b) son los respectivos valores mínimo y máximo de Latitud Norte (LAT_N) y (c, d) son los respectivos valores mínimo y máximo de 
-- longitud occidental (LONG_W) en ESTACIÓN.
-- Consulta la distancia euclidiana entre LOS puntos P1 y P2 formatea tu respuesta para mostrar 4 dígitos decimales.
-- d(p1, p2) = sqrt((x2-x1)**2 + (y2-y1)**2)
--  X1 a = pasa a ser igual al valor mínimo en Latitud Norte (LAT_N en ESTACIÓN).
--  Y1 c = pasa a ser igual al valor MINIMO en Latitud Norte (LONG_W en ESTACIÓN).


--  X2 b = pasa a ser igual al valor MAXIMO en longitud occidental (LAT_N en STATION).
--  Y2 d = pasa a ser igual al valor máximo en longitud occidental (LONG_W en STATION).
-- 3440,2441

-- 184.1616
SELECT
    LEFT(
        ROUND(SQRT(
                POWER(MAX(LAT_N) - MIN(LAT_N), 2)
            + 
                POWER(MAX(LONG_W) - MIN(LONG_W), 2)
            ), 4)
    , 8)
FROM STATION


SELECT ROUND(SQRT(
    POWER(MAX(LAT_N) - MIN(LAT_N), 2)+
    POWER(MAX(LONG_W) - MIN(LONG_W), 2)
), 4)
FROM STATION;

-- 184.1616
```

```sql

USE master
CREATE DATABASE LEARN
USE LEARN
CREATE TABLE STATION(
    ID INT,
    CITY VARCHAR(21),
    STATE VARCHAR(2),
    LAT_N INT,
    LONG_W INT
)
DROP TABLE STATION
SELECT * FROM STATION
ALTER TABLE STATION ALTER COLUMN LAT_N FLOAT;
ALTER TABLE STATION ALTER COLUMN LONG_W FLOAT;

insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (329, 'Benin', 'BJ', 1509, 835);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4231, 'Jordan', 'JO', 1915, 1563);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4764, 'China', 'CN', 721, 346);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (595, 'Russia', 'RU', 649, 964);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3584, 'Vietnam', 'VN', 1171, 513);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3283, 'Russia', 'RU', 1878, 1389);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2064, 'Nicaragua', 'NI', 844, 243);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4013, 'Portugal', 'PT', 887, 993);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1337, 'Bolivia', 'BO', 789, 529);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4265, 'China', 'CN', 139.45128, 2048.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1935, 'Uganda', 'UG', 1594.45128, 1657.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2297, 'China', 'CN', 639.45128, 500.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4650, 'Argentina', 'AR', 483.45128, 159.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2807, 'Indonesia', 'ID', 2278.45128, 1565.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3381, 'China', 'CN', 565.45128, 381.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4402, 'Senegal', 'SN', 450.45128, 1568.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (696, 'Indonesia', 'ID', 2018.45128, 614.45128);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1507, 'Belarus', 'BY', 2016.365, 2031.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1340, 'Czech Republic', 'CZ', 1416.365, 1178.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3159, 'China', 'CN', 1344.365, 1691.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2200, 'Indonesia', 'ID', 1116, 1862);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2758, 'China', 'CN', 784, 596);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4293, 'China', 'CN', 362.365, 762.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2063, 'Indonesia', 'ID', 705.365, 624.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2681, 'Philippines', 'PH', 1944.365, 1009.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4993, 'Sweden', 'SE', 2371.365, 2096.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4398, 'Mauritania', 'MR', 771.365, 637.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3791, 'Japan', 'JP', 388.365, 2127.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2561, 'Zimbabwe', 'ZW', 2247.365, 2497.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1917, 'Tunisia', 'TN', 1935.365, 275.365);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1918, 'Madagascar', 'MA', 1935.365, 275.1416);

insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (374, 'Croatia', 'HR', 17.18739214, 24.19014736);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4229, 'Croatia', 'HR', 76.21873867, 102.37002884);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4503, 'Croatia', 'HR', 120.09393251, 77.40780252);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2501, 'Croatia', 'HR', 72.8433364, 135.1960635);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1169, 'Croatia', 'HR', 21.00630142, 129.7322161);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2935, 'Croatia', 'HR', 80.24261077, 83.48165481);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3672, 'Croatia', 'HR', 132.90736574, 121.3376519);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (870, 'Croatia', 'HR', 28.70693002, 36.43901883);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2568, 'Croatia', 'HR', 2.78388688, 95.34937458);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1183, 'Croatia', 'HR', 103.31943273, 68.63302259);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3749, 'Croatia', 'HR', 60.24354842, 84.29719083);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4223, 'Croatia', 'HR', 125.68578532, 12.01081665);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3130, 'Croatia', 'HR', 112.62921135, 76.57549596);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (555, 'Croatia', 'HR', 80.43382382, 82.58889084);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1521, 'Croatia', 'HR', 112.19868646, 2.34930689);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1812, 'Croatia', 'HR', 45.69885841, 118.59335297);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2188, 'Croatia', 'HR', 55.39156552, 88.66183564);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4919, 'Croatia', 'HR', 6.244241, 132.52873917);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2137, 'Croatia', 'HR', 86.52715877, 130.35897086);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1392, 'Croatia', 'HR', 70.26389781, 57.87927216);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (4734, 'Croatia', 'HR', 20.01925336, 3.43133689);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3574, 'Croatia', 'HR', 121.47997426, 84.71051948);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (3729, 'Croatia', 'HR', 93.68029548, 125.99314623);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1000, 'Croatia', 'HR', 82.93895442, 134.09691025);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (2520, 'Croatia', 'HR', 133.97428529, 48.98889977);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (1467, 'Croatia', 'HR', 57.88882679, 93.40530735);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (241, 'Croatia', 'HR', 109.29502957, 120.91464415);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (314, 'Croatia', 'HR', 49.00096858, 91.70394626);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (840, 'Croatia', 'HR', 136.18397323, 62.55860503);
insert into STATION (ID, CITY, STATE, LAT_N, LONG_W) values (211, 'Croatia', 'HR', 94.8713577, 70.78828866);

--Encuentre la diferencia entre el número total de entradas de CIUDAD en la tabla y el número de entradas distintas de CIUDAD en la tabla.
--La cláusula DISTINCT elimina los registros duplicados de los resultados de una consulta
SELECT COUNT(CITY) - COUNT(DISTINCT CITY) AS DIFFERENCE FROM STATION;

--Consulta las dos ciudades en ESTACIÓN con los nombres de CIUDAD más cortos y más largos, así como sus respectivas longitudes (es decir, número de caracteres en el nombre). Si hay más de una ciudad más pequeña o más grande, elija la que aparece primero en orden alfabético.

--Esta subconsulta busca la ciudad con la longitud máxima en la columna "CITY".

    --Utiliza la función LEN para obtener la longitud de cada ciudad.
    --Agrupa los resultados por ciudad utilizando la cláusula GROUP BY.
    --Calcula la longitud máxima para cada ciudad utilizando la función de agregación MAX(LEN(CITY)).
    --Ordena los resultados por la longitud máxima en orden ascendente (ASC) y por el nombre de la ciudad.
SELECT * FROM (SELECT TOP 1 CITY, MAX(LEN(CITY)) AS LENGTH FROM STATION GROUP BY CITY ORDER BY MAX(LEN(CITY)) ASC, CITY) A 
UNION ALL 
--Esta subconsulta busca la ciudad con la longitud mínima en la columna "CITY".

    --Utiliza la función LEN para obtener la longitud de cada ciudad.
    --Agrupa los resultados por ciudad utilizando la cláusula GROUP BY.
    --Calcula la longitud mínima para cada ciudad utilizando la función de agregación MIN(LEN(CITY)).
    --Ordena los resultados por la longitud mínima en orden descendente (DESC) y por el nombre de la ciudad.
SELECT * FROM (SELECT TOP 1 CITY, MIN(LEN(CITY)) AS LENGTH FROM STATION GROUP BY CITY ORDER BY MIN(LEN(CITY)) DESC, CITY) B;

--La cláusula UNION ALL:
    --La cláusula UNION ALL se utiliza para combinar los resultados de las dos subconsultas en un solo conjunto de resultados. 
    --Esto significa que se mostrarán las dos filas resultantes en secuencia.

--Consulte la lista de nombres de CIUDAD que comienzan con vocales (es decir, a, e, i, o o u) desde ESTACIÓN. Su resultado no puede contener duplicados.

SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '[aeiouAEIOU]%';

--Consulta la lista de nombres de CIUDAD que terminan en vocales (a, e, i, o, u) desde ESTACIÓN. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '%[aeiouAEIOU]';

--Consulte la lista de nombres de CIUDAD de ESTACIÓN que tienen vocales (es decir, a, e, i, o y u) como primer y último carácter. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '[aeiouAEIOU]%[aeiouAEIOU]';

--Consulta la lista de nombres de CIUDAD de ESTACIÓN que no comienzan con vocales. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '[aeiouAEIOU]%';

--Consulta la lista de nombres de CIUDAD de ESTACIÓN que no terminan en vocal. Su resultado no puede contener duplicados.

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '%[aeiouAEIOU]'

--Consulta la lista de nombres de CIUDAD de ESTACIÓN que no comienzan con vocales o no terminan con vocales. Su resultado no puede contener duplicados.
SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '^[^aeiou].*[^aeiou]$';

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT LIKE '[aeiouAEIOU] % [aeiouAEIOU]';

select distinct city from station where city NOT like '^[aeiou]' and city not like'[aeiou]$';

```