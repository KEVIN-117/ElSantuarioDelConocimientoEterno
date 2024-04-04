# DOCKER: COCEPTOS BÁSICOS
## ¿Qué es Docker?
Docker es una plataforma de código abierto que permite a los desarrolladores empaquetar, enviar y ejecutar aplicaciones en contenedores. Los contenedores son una forma de virtualización ligera que facilita la implementación de aplicaciones en entornos aislados.

## ¿Qué es un contenedor?
Un contenedor es una unidad de software que empaqueta una aplicación y todas sus dependencias para que la aplicación se ejecute de manera rápida y confiable en cualquier entorno. Los contenedores aíslan la aplicación del entorno subyacente, lo que garantiza que la aplicación se ejecute de la misma manera, independientemente de las diferencias entre los entornos.

## ¿Cuál es la diferencia entre una máquina virtual y un contenedor?
Las máquinas virtuales (VM) y los contenedores son tecnologías de virtualización que permiten a los desarrolladores crear entornos aislados para ejecutar aplicaciones. La principal diferencia entre una máquina virtual y un contenedor es que una máquina virtual incluye un sistema operativo completo, mientras que un contenedor solo incluye la aplicación y sus dependencias.

## ¿Por qué usar Docker?
Docker ofrece varias ventajas para los desarrolladores, incluida la portabilidad, la eficiencia y la escalabilidad. Al empaquetar una aplicación y sus dependencias en un contenedor, los desarrolladores pueden garantizar que la aplicación se ejecute de manera consistente en cualquier entorno. Además, los contenedores son más livianos que las máquinas virtuales, lo que permite una implementación más rápida y eficiente. Docker también facilita la escalabilidad de las aplicaciones al permitir a los desarrolladores crear y administrar múltiples contenedores de manera sencilla.

## ¿Cómo funciona Docker?
Docker utiliza una arquitectura cliente-servidor para administrar contenedores. El cliente de Docker envía comandos al daemon de Docker, que es un proceso en segundo plano que administra los contenedores. El daemon de Docker se comunica con el kernel del sistema operativo para crear, ejecutar y administrar los contenedores. Los contenedores de Docker se ejecutan en un entorno aislado, lo que garantiza que la aplicación se ejecute de manera segura y confiable.

## ¿Qué es un Dockerfile?
Un Dockerfile es un archivo de texto que contiene instrucciones para construir una imagen de Docker. Las imágenes de Docker son plantillas de solo lectura que contienen el código y las dependencias de una aplicación. Al crear un Dockerfile, los desarrolladores pueden definir cómo se construye una imagen de Docker y qué dependencias se incluyen en ella.

## ¿Qué es una imagen de Docker?
Una imagen de Docker es una plantilla de solo lectura que contiene el código y las dependencias de una aplicación. Las imágenes de Docker se utilizan para crear contenedores, que son instancias en ejecución de una imagen. Al empaquetar una aplicación y sus dependencias en una imagen de Docker, los desarrolladores pueden garantizar que la aplicación se ejecute de manera consistente en cualquier entorno.

## ¿Qué es un registro de Docker?
Un registro de Docker es un repositorio de imágenes de Docker que se utiliza para almacenar y distribuir imágenes de Docker. Los registros de Docker permiten a los desarrolladores compartir imágenes de Docker con otros usuarios y equipos. Docker Hub es el registro de Docker público más utilizado, pero también existen registros privados que permiten a las organizaciones almacenar imágenes de Docker de forma segura.

## Comandos de Docker
- `docker run`: Crea y ejecuta un contenedor a partir de una imagen de Docker.
- `docker build`: Construye una imagen de Docker a partir de un Dockerfile.
- `docker pull`: Descarga una imagen de Docker desde un registro de Docker.
- `docker push`: Sube una imagen de Docker a un registro de Docker.
- `docker ps`: Lista los contenedores en ejecución.
- `docker images`: Lista las imágenes de Docker en el sistema.
- `docker exec`: Ejecuta un comando en un contenedor en ejecución.
- `docker stop`: Detiene un contenedor en ejecución.
- `docker rm`: Elimina un contenedor.
- `docker rmi`: Elimina una imagen de Docker.
- `docker-compose`: Administra aplicaciones Docker con múltiples contenedores.
- `docker logs`: Muestra los registros de un contenedor en ejecución.
- `docker inspect`: Muestra información detallada sobre un contenedor o una imagen de Docker.
- `docker network`: Administra redes de Docker.
- `docker volume`: Administra volúmenes de Docker.
- `docker system`: Administra el sistema Docker.
- `docker info`: Muestra información sobre el sistema Docker.
- `docker version`: Muestra la versión de Docker instalada.

## Comandos de Dockerfile
- `FROM`: Especifica la imagen base.
- `RUN`: Ejecuta un comando en el contenedor.
- `COPY`: Copia archivos o directorios al contenedor.
- `ADD`: Copia archivos o directorios al contenedor (admite URL y descompresión).
- `CMD`: Especifica el comando predeterminado que se ejecutará cuando se inicie el contenedor.
- `ENTRYPOINT`: Especifica el comando predeterminado que se ejecutará cuando se inicie el contenedor (se puede anular con `docker run`).
- `WORKDIR`: Establece el directorio de trabajo para los comandos `RUN`, `CMD`, `ENTRYPOINT`, `COPY` y `ADD`.
- `EXPOSE`: Expone un puerto en el contenedor.
- `ENV`: Establece una variable de entorno en el contenedor.
- `ARG`: Define una variable de compilación en el Dockerfile.
- `VOLUME`: Crea un punto de montaje en el contenedor.
- `USER`: Establece el usuario o UID que se utilizará al ejecutar el contenedor.
- `LABEL`: Agrega metadatos al contenedor.
- `HEALTHCHECK`: Especifica un comando para verificar el estado de salud del contenedor.
- `SHELL`: Especifica el shell predeterminado que se utilizará en los comandos `RUN`, `CMD`, `ENTRYPOINT`, `COPY` y `ADD`.
- `STOPSIGNAL`: Especifica la señal que se enviará al contenedor para detenerlo.
- `ONBUILD`: Agrega una instrucción que se ejecutará cuando se use la imagen como base para otra imagen.
- `MAINTAINER`: Especifica el autor del Dockerfile (obsoleto, se recomienda usar `LABEL`).

## Ejemplo de Dockerfile
```Dockerfile
# Use an official Python runtime as the base image
FROM python:3.7-slim

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Install any needed packages specified in requirements.txt
RUN pip install --trusted-host pypi.python.org -r requirements.txt

# Make port 80 available to the world outside this container
EXPOSE 80

# Define environment variable
ENV NAME World

# Run app.py when the container launches
CMD ["python", "app.py"]
```

## Docker Compose
Docker Compose es una herramienta que permite a los desarrolladores definir y ejecutar aplicaciones Docker con múltiples contenedores. Con Docker Compose, los desarrolladores pueden definir la configuración de una aplicación en un archivo YAML y luego usar el comando `docker-compose` para crear y administrar los contenedores de la aplicación.

## Comandos de Docker Compose
- `docker-compose up`: Crea y ejecuta los contenedores de la aplicación.
- `docker-compose down`: Detiene y elimina los contenedores de la aplicación.
- `docker-compose build`: Construye las imágenes de Docker de la aplicación.
- `docker-compose pull`: Descarga las imágenes de Docker de la aplicación.
- `docker-compose start`: Inicia los contenedores de la aplicación.
- `docker-compose stop`: Detiene los contenedores de la aplicación.
- `docker-compose restart`: Reinicia los contenedores de la aplicación.
- `docker-compose logs`: Muestra los registros de los contenedores de la aplicación.
- `docker-compose ps`: Lista los contenedores de la aplicación en ejecución.
- `docker-compose exec`: Ejecuta un comando en un contenedor de la aplicación.
- `docker-compose run`: Ejecuta un comando en un nuevo contenedor de la aplicación.
- `docker-compose config`: Valida y muestra la configuración de Docker Compose.
- `docker-compose images`: Lista las imágenes de Docker de la aplicación.
- `docker-compose kill`: Detiene los contenedores de la aplicación de forma brusca.
- `docker-compose rm`: Elimina los contenedores de la aplicación.
- `docker-compose pull`: Descarga las imágenes de Docker de la aplicación.
- `docker-compose push`: Sube las imágenes de Docker de la aplicación.
- `docker-compose top`: Muestra los procesos en ejecución de los contenedores de la aplicación.
- `docker-compose version`: Muestra la versión de Docker Compose instalada.
- `docker-compose help`: Muestra la ayuda de Docker Compose.
- `docker-compose --verbose`: Muestra información detallada sobre las operaciones de Docker Compose.
- `docker-compose --log-level`: Establece el nivel de registro de Docker Compose.
- `docker-compose --no-ansi`: Deshabilita la salida ANSI de Docker Compose.
- `docker-compose --project-directory`: Establece el directorio del proyecto de Docker Compose.
- `docker-compose --file`: Especifica el archivo de configuración de Docker Compose.
- `docker-compose --project-name`: Establece el nombre del proyecto de Docker Compose.
- `docker-compose --env-file`: Especifica el archivo de variables de entorno de Docker Compose.
- `docker-compose --compatibility`: Habilita el modo de compatibilidad de Docker Compose.

## Ejemplo de archivo `docker-compose.yml`
```yaml
version: '3'
services:
  web:
    build: .
    image: flask-app
    container_name: flask-app
    restart: always
    
    ports:
      - "5000:5000"
    environment:
      FLASK_ENV: development
      FLASK_APP: app.py
      
    volumes:
      - .:/code
      - logvolume01:/var/log
  redis:
    image: "redis:alpine"
    volumes:
      - "redis-data:/data"
      - "/var/run/docker.sock:/var/run/docker.sock"
    environment:
      - REDIS_PASSWORD=123456
      - REDIS_PORT=6379
      - REDIS_HOST=localhost
      - REDIS_DB=0
      - REDIS_TIMEOUT=3000
      - REDIS_MAX_CONNECTIONS=100
      - REDIS_SOCKET_TIMEOUT=3000
      - REDIS_CHARSET=utf-8
      - REDIS_ERRORS=strict
      - REDIS_DECODE_RESPONSES=True
      - REDIS_UNIX_SOCKET_PATH=/tmp/redis.sock
```  


    
