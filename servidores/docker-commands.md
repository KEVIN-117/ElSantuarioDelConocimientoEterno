# DOCKER

# INTRODUCCION
- Problemas de desarrollo de software profecional
<details><summary>Contruir (como armamos el softaware)</summary>
    - escribir codigo es solo una pequenia parte
    - los problemas complejos necesitan equipos 
    - problematica:
        - entorno de desarrollo: hace referenci si tengtodo lo necesario para poder trabajar (paquetes)
        - Dependencias: En el uso de bibliotecas y frameworks ya contruidos el problema puede surgir en las verciones 
        - Entornos de ejecucion: 
        - equivalencia con entorno de produccion
        - Servicios Externos
</details>

<details><summary>Ditribuir (como lo llevamos a donde tiene que estar para que funcione)</summary>
    - El codigo debe transformarse en un artefacto, o varios que puedan ser transportados a donde tenga que ejecutarse
    - problematica:
        - Output de build heterogeo (múltiples compilaciones)
        - Acceso a servidores productivos (No tenemos acceso al servidor)
        - Ejecución nativa vs virtualizada
        - Entornos Serverless
</details>

<details><summary>Ejecutar (de que manera corremos el softaware como enverdad se esperaba)</summary>
    - Implementar la solución en el ambiente de producción (Subir a producción). El reto Hacer que funcione como debería funcionar
    - problematica:
        - Dependencia de aplicación (paquetes, runtime)
        - Compatibilidad con el entorno productivo (sistema operativo poco amigable con la solución)
        - Disponibilidad de servicios externos (Acceso a los servicios externos)
        - Recursos de hardware (Capacidad de ejecución - Menos memoria, procesador más debil)
</details>
- el punto es que al utilizar docker podemos dar solucion a estos 3 tipos de problemas que llegan a pasar rrecurentemenet en el dearrolo del sofware 
- docker permite contruir distribuir y ejecutar cualuier aplicacion en cualquier lado


- Exponiendo Contenedores
 
- la necesidad de exponer un contenedor es porque un contendor esta corriendo dentro de un puerto que esta denrtro de contenedor, pero si yo quiero acceder al contenedor desde un puerto de mi equipo es hay donde nace la necesidad de exponer un contenedor

- Comandos:
    
    - corriendo un contenedor
        ```
        docker run -d --name proxy nginx (corro un nginx)
        ```
    
    - deteniendo la ejecucion de un  contenedor
        ```
        docker stop proxy (apaga el contenedor)
        ```
    
    - corro un nginx y expongo el puerto 80 del contenedor en el puerto 8080 de mi máquina -p = published
        ```
        docker run -d --name proxy -p 8080:80 nginx 
        ```

    - ejecuta localhost:8080 en un navegador
    
    - veo los logs
        ```
        docker logs proxy 
        ```
    
    - hago un follow del log 
        - -f = follow
        ```
        docker logs -f proxy 
        ```
    - veo y sigo solo las 10 últimas entradas del log
        ```
        docker logs --tail 10 -f proxy 
        ```
<h1>eliminar una imagen </h1>
<p>existen dos formas</p>
# lo borra si el contenedor ya esta detenido
    docker rm nombreImagen
# detiene el contenedor y lo borra
    docker rm -f nombreImagen

- Monturas de unión (Bind Mounts)
- Las necesidades que se dan poara el uso de Monturas de union o (Bind Mounts) o tambien podriamos decirle manejo de archivos en local. Los contenedores son autiocontenidas es decir que ellos no saben que estan corriendo dentro de una maquina desde el punto de vista del contenedor esat solamente el contenedor como una maquina real, por defgecto cunaod una contenedor se elimina o se le apaga este pierde toda la informacion quer se guarda en ella para evitar esto es hay dionde entra los bind Mounts todo lo que se haga en elcontenedor lo ara en la maquina

- Comandos:
    - creo un directorio en mi máquina
        ```
        mkdir dockerdata 
        ```
        
    - corro la imagen llamada mongo
        
        - correra la imagen en su ultima vesion pero si la version es mayor 5.0+ en los logs se lanza la siguiente advertencia 
        
        - WARNING: MongoDB 5.0+ requires a CPU with AVX support, and your current system does not appear to have that! 
        (ADVERTENCIA: MongoDB 5.0+ requiere una CPU compatible con AVX, ¡y su sistema actual no parece tener eso!)
    
    - [ver](https://jira.mongodb.org/browse/SERVER-54407)
            
    - [ver tambien](https://www.mongodb.com/community/forums/t/mongodb-5-0-cpu-intel-g4650-compatibility/116610/2) 
    - [see tambien](https://github.com/docker-library/mongo/issues/485#issuecomment-891991814)
  
        ```
        docker run -d --name db mongo
        ```
        

    - En todo caso como solucion se puede ejecutar el siguiente comando que correra la imagen en una version inferior a la 5.0
        ```
        docker run -d --name db -p 27017:27017 mongo:4.4
        ```
    Eplicacion:
    - El comando "docker run -d --name db mongo" ejecuta un contenedor de Docker utilizando la imagen de MongoDB llamada "mongo".

    Aquí está el significado de los argumentos utilizados en el comando:

    - `docker run`: Comando para crear y ejecutar un contenedor de Docker.
    - `-d`: Bandera que indica que el contenedor se ejecutará en segundo plano (modo daemon).
    - `--name db`: Asigna el nombre "db" al contenedor. Esto es útil para referirse al contenedor por su nombre en lugar de su ID.
    - `mongo`: Especifica la imagen de Docker a utilizar para crear el contenedor. En este caso, se utiliza la imagen de MongoDB.

    En resumen, este comando crea un contenedor de Docker a partir de la imagen de MongoDB llamada "mongo" y lo ejecuta en segundo plano. El contenedor se le asigna el nombre "db", lo que permite hacer referencia a él más adelante utilizando ese nombre. Este comando es útil para iniciar una instancia de MongoDB en un contenedor de Docker.


    - veo los contenedores activos
        ```
        docker ps 
        ```

    - entro al bash del contenedor
        ```
        docker exec -it db bash 
        ```

    - me conecto a la BBDD
        ```
        mongo 
        ```

    - listo las BBDD
        ```
        show dbs 
        ```

    - creo la BBDD 
        ```
        use <DB>
        ```

    - inserto un nuevo dato
        ```
        db.users.insert({“nombre”:“guido”})
        ```

    - veo el dato que cargué
        ```
        db.users.find()
        ```

    - corro un contenedor de mongo y creo un bind mount
        - la ruta de mi maquina hace referencia a donde quieres guardar los datos  
        - mongo guarda sus datos por defecto en (/data/db mongo) lo que seria la suta del contenedor
        ```
        docker run -d --name db -v <ruta de mi maquina>:<ruta dentro del contenedor> <nombre de la imagen>
        ```

    - [comandos de mongo](https://gitlab.com/containers903425/docker-initial/-/blob/main/mongo.md)

# Volumenes:

- las volumenes son una de evoluvion de los Bind Bound. la unica diferencia manejar datos entre contenedores sin la necsidad de estar compartiendo directorios, de esta forma es mucho mas practico porque al crear un volumen no sabemos en donde se guardo, de esta manera otro usuario no puede ir y ver que es lo que tiene
    -  listar volumenes
        ```
        docker volume ls
        ```
    - comando para crear un volumen
        ```
        docker create volume <nombre volumen>
        ```
    - Comando para monstar un contenedor en un volumen
        ```
        docker run -d --name nombre --mount src=<nombre del archivo de destino>,dst=<ruta del contenedor> <nombre de la imagen>
        ```
        - --mount = montar un volume
        - src = source
        - dst = destino
    - Comando para ver informacion detallada de un contenedor
        ```
        docker inspect <nombre del contenedor>
        ```
    

# Insertar y extraer archivos de un contenedor:

- Creamos un archivo:
    ```
    touch <nombre del archivo>.txt
    ```
- Corremos el contenedor
    ```
    docker run -d --name <nombre> <nombre imagen> tail -f /dev/null
    ```
    El comando "docker run -d --name <nombre> <nombre imagen> tail -f /dev/null" se utiliza para ejecutar un contenedor Docker en segundo plano (modo daemon) con un nombre específico y basado en una imagen específica.

    - A continuación, se explica el significado de cada parte del comando:

    - `docker run`: Comando utilizado para crear y ejecutar un nuevo contenedor a partir de una imagen.
    - `-d`: Opción que indica que el contenedor se ejecutará en segundo plano (modo daemon).
    - `--name <nombre>`: Opción que especifica el nombre que se asignará al contenedor. Debes reemplazar `<nombre>` con el nombre deseado.
    - `<nombre imagen>`: Nombre de la imagen del contenedor que se utilizará para crear el contenedor. Debes reemplazar `<nombre imagen>` con el nombre de la imagen que deseas usar.
    - `tail -f /dev/null`: Comando que se ejecuta dentro del contenedor. En este caso, se utiliza `tail -f /dev/null` para mantener el contenedor en ejecución indefinidamente. `tail -f` se utiliza para seguir la salida de un archivo (en este caso, `/dev/null`, que es un archivo nulo que no contiene ningún dato), lo cual evita que el contenedor se detenga y se mantenga en ejecución en segundo plano.

    - En resumen, este comando crea un contenedor en segundo plano con un nombre específico, basado en una imagen específica, y mantiene el contenedor en ejecución indefinidamente utilizando el comando `tail -f /dev/null`.
- Copiando el archivo dentro del contenedor
    ```
    docker cp <nombre del archivo> <nombre del contenedor>:<ruta de a donde se copara el archivo>/<nuevo nombre para el archivo>
    ```
- Exatrayendo el archivo a la maquina
    ```
    docker cp <nombre imagen>:<ruta de donde se quiere extraer el archivo o directorio> <nuevo nombre>
    ```


## IMAGENES

- las imagenes dan soluion a 2 problemas del desarrollo de software (distribucion, ejecucion)
- las imagenes son plantillas o moldes que a partir de ellos se crean contenedores
- Podemos llegar a la conslusión, que una imágen se conforma de distintas capas de personalización, en base a una capa inicial (base image), la dicha capa, es el más puro estado del SO.

### <img src="./img/0ee3d4cf-2133-4143-a7c4-690274483841.webp" /> 

- Si observamos, partimos desde la base del SO, y vamos agregando capas de personalización hasta obtener la imágen que necesitamos

- Historia de una imágen: Podemos observar la historia de nuestra imágen, con el siguiente comando
    ```
    docker history <nombre imagen>
    ```
- Comando para listar imagenes
    ```
    docker images
    docker images ls
    ```
- Comanado para traer una imagen solo lo trae no lo ejecuta
    ```
    docker pull <nombre imagen>
    ```

### Construyendo imagenes:
- el proceso de contruccion de una imagen inicia con un archivo llamdo docker-file que describe como sera la imagen

- build a una imagen
    ```
    docker build -t <nombre imagen> <ruta en donde se guardara la imagen>
    ```
- ahora puede crear contenedores a partir de la imagen 
    ```
    docker run -it <nombre imagen>
    ```

### Como publicar una imagen
- primero debe iniciar secion en tu cuenta de docker hub
    ```
    docker login
    ```
- cambiar nombre  o tag de una imagen para ello tambien hay una convencon de nombre que deberia de seguir el nombr e de una imagen y sigue haci quienEsElDuenioDelaImegen/queSoftwareContieneLaImagen:QueVersionDeEseSoftawareContieneLaImagen
    ```
    docker tag <nombre imagen> <duenio de la imagen>/<nuevo nombre de la imagen>:<version o tag>
    ```
- ahora ya puedes publicar tus imagenes
    ```
    docker push <duenio de la imagen>/<nuevo nombre de la imagen>:<version o tag>
    ```
### el sistema de capas de docker
- cada instruccion en el docker file es una capa a medida que este se ejecuta cada intruccion que se ejecuta es una capa mas para la imagen

### COMO DESARROLLAR CON DOCKER
    - --rm : significa si el contenedor no se queda encendido se eliminara

    ```
    docker run --rm -p 3000:3000 <nombre imagen>
    ```

### Arovechando el cache de capas para contruir correctamenete tus imagenes
- que es cache de capas?:
    - El cache de cpas en docker se refiere a la capcidad que tiene docker de guardar en cache las capas de una inagen durante el preoceso de contruccion.
    - Como ya se habia mencionado cada intruccion en un docker file es una capa 
    - Al ejecutar el comando `<docker build>` para contruir una imagen a partir de un Dockerfiel, docker verifica si las instrucciones son identicas a la de una imagen ya contruida anteriormente si es haci utiliza la capa almacenada en cache en lugar de reconstruirla desde cero y haci de esta manera poder ahorrar tiempo y recursos
    - <Importante> ALgo a tomar muy encuenta es lo siguiente
        - si cambias una linea de codigo en el proyecto en el cual estas configurando una imagen por mas que el docker file no haya cambiado nada,docker recostruira todo desde cero a pesar de que las ibntrucciones de docker file sean iguales al de la acache
        - Si cambias la version del FROM de docker file, docker iniciara de nuevo la reconstruccions de la imagen para evistar esto el docker file se debe confguar de la siguiente manera 
        
        ```
        FROM <nombre-de-la-imagen-base>:<tag>

        COPY ["package.json", "package-log.json", <ruta a la cual se copiara los archivos>]

        WORKDIR <rutaen la cual se se coiparon los archivos>

        RUN npm install

        COPY [".", <ruta a la cual se copiara los archivos>]

        EXPOSE 3000


        CMD ["node", "index.js"]
    
        ```
### Docker Networkibng: 

- Docker Networking es la funcionalidad de Docker que facilita la creación y gestión de redes virtuales para permitir la comunicación entre contenedores y otros recursos de red en entornos Docker. Esto es fundamental para construir aplicaciones distribuidas y escalables basadas en contenedores.

- Comandos:
    - lista las <docker networks> disponibles
    ```
    docker network ls
    ```
    - Creacion de una <docker network>
        - <--attachable> : le dice a docker que este red permita que otros contenedores se conecten a la red creada 
    ```
    docker network create --attachable <nombre de la red>
    ```
    - Informacion mas dettalalada de una red
    ```
    docker network inspect <nombre red>
    ```

    - Comando para conectar un contenedor a una red, este comnado recive dos parametros 
    ```
    docker network connect <nombre de la red> <nombre del contenedor a conectar>
    ```

    - Conectatndo una b de mongo a nuetra aplicacion
    - Comandos:
        - Creamos un contenedor a partir de l aimagen de mongo
        ```
        docker run -d --name db mongo:4.4
        ```
        - hacemos un build de la app 
        ```
        docker build -t <nombre de la app> <ruta en donde se encuentra el codigo de su app y el dpocker file>
        ```

        - Conecta la app con la red y tambien la bd
        - Ejecuita el comando para que automaticamente la app y ls bd se conecten al estar en la misma red
        ```
        docker run -d --name app -p 3000:3000 --env MONGO_URL=mongodb://db:27017/test app
        ```
        - explicacion:
            - `docker run`: Inicia un nuevo contenedor Docker.
            - `-d`: Ejecuta el contenedor en segundo plano (en modo detached).
            - `--name app`: Asigna el nombre "app" al contenedor.
            - `-p 3000:3000`: Mapea el puerto 3000 del host al puerto 3000 del contenedor. Esto permite acceder a la aplicación dentro del contenedor a través del puerto 3000 en el host.
            - `--env MONGO_URL=mongodb://db:27017/test`: Establece la variable de entorno "MONGO_URL" en el contenedor con el valor "mongodb://db:27017/test". Esta variable de entorno se puede utilizar dentro del contenedor para configurar la conexión a una base de datos MongoDB.
            - `app`: Especifica la imagen a utilizar para crear el contenedor.
## Docker Compose: La herramienta que nos permite hacer todo lo anterior de una maneramas sencilla `<la herramienta todo en uno>`
- docker compose es una una forma de definir y getionar aplicaciones multi contenedoras de manera declrativa en un archivo de configuracion que comunmente se llama <docker-compose.yml> 
- El archivo de configuración de Docker Compose, comúnmente llamado "<docker-compose.yml>", describe los diferentes <servicios> que componen tu aplicación, así como las <redes> y <volúmenes> necesarios para su funcionamiento. Puedes especificar detalles como la <imagen Docker> a utilizar, <los puertos que deben exponerse>, <las variables de entorno>, los <volúmenes> compartidos, las dependencias entre los <servicios>, entre otros.
- Estructura de configuracion del archivo <docker-compose.yml>:
```
VERSION: <indicas la verison revisar documentacion>

SERVICES:
    <aqui debe ir todos los servicos o componentes que necesita la aplicaicon apara su ejecucion>
```
- Ejemplo:

```
# inidca la version
version: "3.8"

# los servicios de la app
services:
    # servicio uno
    app:
        # la imagen que utilizara
        image: platziapp
        # variables de entorno
        environment:
            MONGO_URL: "mongodb://db:27017/test"
        # deoendecia si el servicio por el cual depende este servico no es levantado correctamente, este servico tambien fallara
        depends_on:
            - db
        # puerto en el que se ejecutara
        ports:
            # Expone el puerto
            - "3000:3000"
    # Servicio 2
    db:
        # imagen para el servicio
        image: mongo
```
- Comando para ejecutar
    - puede hacerlo especificanco los servcios o todo:
        - Ejecutando servico por servicio:
        ```
        docker-compose up -d <nombre servicio>
        ```
        - Ejecutando todo en uno:
        ```
        docker-compose up -d
        ```

#### Comandos de <docker-compose>
- listar
    ```
    docker-compose ps
    ```
- Inspeccinando un network
```
docker-compose inspect <nombre red>
```
- Viendo los logs de un servicio
```
docker-compose logs <nombre servicio>
```

- Viendo los logs de todos los servicios
```
docker-compose logs
```

- Ruta de la app dentro del contenedor
```
docker-compose exec <nombre contenedor>
```

- Destruyendo todo lo que se levanto en docker-compose
```
docker-compose down
```

### Docker Compose como herramienta de desarrollo



### Compose en equipo: override
- es similar al <docker-compose-file> que sirve para personalizar o hacer pequenios cambios propios para nuestro ambiente sobre el <docker-file> principal, sin la necesidad de alterar el archivo
- comando para levantar 2 contenedores en 2 puertos
```
docker-compose up -d --scale <nombre de la imagen>=2
```

### Administrando ambiente de docker:
- se refiere a como y de que manera se debe usar docker, en tu entorno de trabajp puedes tener muchas imagenes lo cual hasta cierto punto puede estar bien pero tambin se debe organizar, administrar el ambiente, verificar cuanto esacio ocupan
- Comandos para la adminitrtacion de contenedores:

    - Comando para eliminar todos los contenedores que ya no estan funcionando
    ```
    docker container prune
    ```

    - Comando para eliminar absolutamente todos los contenedores esten apagadas o en ejecucion:
    ```
    docker rm -f $(docker ps -aq)
    ```

    Eplicacion:
        - docker ps -aq: lo que hace es lo siguinete <docker ps -a> lo quhace es devolver todos los contenedores pero con el argumento `<q>` estamos sacando los id
        - Entonces todo el comando `<docker rm -f $(docker ps -aq)>` lo que ara es iterar sobre cada uno de los contenedores y ira matandolos uno por uno
        - este es un comando muy comodo para administrar ambiente
    
    - De igual manera un comando para eliminar todas la imagenes 
    ```
    docker rmi -f $(docker images -aq)
    ```
    Explicacion:
        - `<docker rmi>`: elimina imagenes
        - `<docker images -aq>` : retorna todad una lista de los id de las imgenes


    - Comnaod para borrar volumenes:
    ```
    docker volume prune
    ```

    - Comando para borrar network
    ```
    docker network prune
    ```

    - Comando para borrar todo
    ```
    docker system prune
    ```
#### Como limitar a los contenedores
- Comando para ver las atdisticas de contenedores
    ```
    docker stats
     ```
    
    - Comando para limitar memoria a un contenedor 
    ```
    docker run -d --name <nombre contenedor> --memory <cantidad memoria a asignar> <nombre imagen>
    ```
    - Explicacion:
        --memory <cantidad memoria a asignar> : podria indicar minimo `<6m>` de memoria pero si no se le asigna nada este utilizara lo que necesite
        - <Importante>: ALgo a tomar muy encuenta es que si le asignas menos ram de lo que neceita inicialemnte el contenedor, el contenedor entrara en un `<"Status": "Exited">` este se debe al error de `<"OOMKilled":"true">`, este error se debe a tiene menos ram de lo que el contenedor requiere 

## Deteniendo Contenedores Correctamente



## Contenedores ejecutables: ENTRYPOINT vs CMD
- Entrypoint es un nuevo comando para <docker file>, est ecomando lo que hace es tomar un coando inicial para que uando semle pase lagun parametro cuando se esta corriendo un contenedor a partir de la imagen
- Ejemplo de un <dockerfile>
    ```
    FROM ubuntu:trusty
    CMD ["/bin/ping", "-c", "3", "localhost"]
    ```
- creo la imagen <docker build -t <nombre imagen> <.>>
- creo un contenedor a partir de la imagen
    ```
    docker run -d --name <nombre> <nombre imagen> <parametro>
    ```
    - Explicacion:
        - si se le pasa el parametro tal i como se le hace en el ejemplo anterior y sobre el docker file que se presenta el cimando definoido sera reemplazado por el parametro que se le esta pasando, y es hay donde entra el <entrypoint>
- Ejemplo docker-file
    ```
    FROM ubuntu:trusty
    ENTRYPOINT [ "/bin/ping", "-c", "3",  ]
    CMD ["localhost"]

    ```
    - Estamos definirndo el comanod en el <ENTRYPOINT>

### Multi-stage build


### Docker en Docker
- a veces en el dia dia se necesita ejecutar secripts o alguna aplicacion que necesite por parte de su aplicacion, levantar cintenedores o ver el estado de docker o tirarle cntenedores a vomandos existentes, y para hacer ello es hay donce entra docker in docker

## Peroshel Rename
```
Rename-Item <nonbre viejo> -NewName <nuevo nombre>
```