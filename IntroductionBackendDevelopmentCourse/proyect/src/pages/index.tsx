import type { HeadFC, PageProps } from "gatsby"
import styled from '@emotion/styled';
import React, { useState } from 'react';
import NeonThemeComponent from "../components/NeonThemeComponent  ";



const NeonText = styled.h1`
  font-size: 3.5rem;
  font-weight: bold;
  color: #fff;
  text-align: center;
`;


const NeonTextH3 = styled.h1`
  font-size: 2.125rem;
  font-weight: bold;
  color: #fff;
  
`;

interface Role {
  title?: string;
  description?: string;
}

interface Container {
  title: string;
  children: Role[];
  descripcion?: string;
}

const item = (title?: string, description?: string) => {
  return { title, description };
};

const container = (title: string, children: Role[], descripcion?: string) => {
  return { title, children, descripcion };
};

const items: Container[] = [
  container('Roles del desarrollo backend', [
    item('Programador', 'Un rol principal es el de programador en el que se dedican a escribir codigo, codigo que es el nucleo de la aplicacion y este se encarga del procesamineto de datos, define la logica del negocio, interaccion con la base de datos, y la comunicacion con el frontend, que se pondra en un servidor y se expondra a millones de usuarios mediante la web. Los programadores backend utilizan lenguajes de programacion tales como java, python, Nodejs y trabajan en la implementacion de funcionalidades y servicios que reponderan a las solicitudes del cliente'),
    item('DB admin (administrador de base de datos)', 'es un rol especializado en administración de bases de datos. Se encarga de diseñar, implementar y mantener la estructura de la base de datos que respalda la aplicación. Esto incluye definir las tablas, índices, relaciones y reglas de integridad necesarias para almacenar y organizar los datos de manera eficiente y segura. También se preocupa por la seguridad de los datos y establece los permisos adecuados para garantizar que solo usuarios autorizados tengan acceso a la información sensible.'),
    item('Server Admin (Administrador de servidor)', 'es responsable de administrar y mantener el servidor en el que se aloja la aplicación. Esto implica tareas como la configuración del servidor, la instalación de software, la gestión de recursos del servidor, el monitoreo del rendimiento, la implementación de medidas de seguridad y la solución de problemas relacionados con el servidor. El objetivo es asegurarse de que el servidor esté funcionando de manera eficiente, segura y disponible para atender las solicitudes de los usuarios de la aplicación.'),
  ]),
];

const items2: Container[] = [
  container('Navegadores', [
    item('HTML (HyperText Markup Language)', 'Se utiliza para estructurar el contenido de la página web, como texto, imágenes, formularios, etc.'),
    item('CSS (Cascading Style Sheets):', 'Se encarga de aplicar estilos visuales al contenido HTML, como diseño, colores, fuentes, etc. Se mencionan algunas librerías CSS como `Tailwind`, `Bootstrap` y `Foundation` que facilitan el proceso de diseño.'),
    item('Javascript', 'Es un lenguaje de programación que permite agregar interactividad y dinamismo a las páginas web. Se mencionan algunos frameworks populares como `Angular`, `React` y `Vue`, que facilitan el desarrollo de aplicaciones web complejas.'),
  ], 'Los navegadores web son aplicaciones que interpretan y muestran contenido web. Utilizan tres tecnologías principales'),
  container('Móvil', [
    item('IOS', 'Para crear aplicaciones para dispositivos Apple (iPhone, iPad), se utilizan principalmente los lenguajes de programación `Swift` y `Objective-C`.'),
    item('Android', 'Para crear aplicaciones para dispositivos Android, los lenguajes de programación más comunes son `Kotlin` y `Java`.'),
    item('Cross-platform (plataformas cruzadas)', ' En este enfoque, se desarrolla una base de código única que se puede utilizar para crear aplicaciones para múltiples plataformas, como iOS y Android. Algunas tecnologías populares para esto son `React Native`, `Flutter` y `.NET MAUI`.'),
  ], 'En el contexto móvil, hay tres ecosistemas principales'),
];


const items3: Container[] = [
  container('Python', [
    item('Django', 'Es un framework web de alto nivel y de propósito general que utiliza Python. Es conocido por su enfoque en la simplicidad y la rapidez de desarrollo.'),
    item('Flask', 'Es un microframework ligero que facilita la creación rápida de aplicaciones web con Python.'),
    item('Fast Api', 'Es un framework moderno y de alto rendimiento para construir APIs con Python, conocido por su velocidad y facilidad de uso.'),
  ]),
  container('JavaScript/TypeScript', [
    item('Express', 'Es un framework de JavaScript que se utiliza para construir aplicaciones web y APIs. Es simple y flexible, lo que permite a los desarrolladores tener más control sobre su código.'),
    item('NestJS', 'Es un framework de TypeScript para la creación de aplicaciones escalables y eficientes, basado en los principios de Angular.')
  ]),
  container('Ruby', [
    item('Ruby on Rails', 'Es un framework web escrito en Ruby que sigue la convención sobre configuración. Es conocido por su enfoque en la productividad y la facilidad de uso.')
  ]),
  container('PHP', [
    item('Laravel', 'Es un framework web de código abierto escrito en PHP que sigue el patrón de diseño MVC (Modelo-Vista-Controlador). Es conocido por su elegancia y su gran comunidad.'),
    item('Symfony', 'Es otro framework PHP de alto rendimiento que se centra en la modularidad y la reutilización de componentes.')
  ]),
  container('Java', [
    item('Spring', 'Es un framework de Java ampliamente utilizado que proporciona una amplia gama de funcionalidades y herramientas para el desarrollo web.'),
  ]),
  container('Go', [
    item('Gin', 'Es un framework web escrito en Go que se destaca por su velocidad y eficiencia.')
  ]),
  container('C#', [
    item('.NET Core', 'Es un framework de código abierto desarrollado por Microsoft que se puede utilizar con C# para crear aplicaciones web y servicios.')
  ]),
];

const items4: Container[] = [
  container('Como se construye el backend', [
    item('Son los sistemas o aplicaciones que reciben las solicitudes realizadas por los clientes a través de la API y responden proporcionando los datos o ejecutando las operaciones solicitadas.'),
    item('El `Mesero`', ' actúa como una API que recibe las solicitudes de los clientes (mediante el frontend) y toma las órdenes. El mesero representa los puntos de acceso (endpoints/APIs) en el backend que reciben las peticiones del cliente.'),
    item(' La `Cocina`', 'es donde se prepara la comida, es decir, donde ocurre la lógica del backend. Aquí se encuentran los `Chefs` que son los desarrolladores que construyen la lógica para procesar las solicitudes y generar respuestas. Los `Implementos` son las librerías y herramientas que los desarrolladores utilizan para facilitar el desarrollo (por ejemplo, bases de datos, herramientas de manejo de archivos, etc.). Y las `Recetas` son los frameworks que proporcionan patrones de trabajo y soluciones predefinidas para ciertos problemas comunes en el desarrollo backend.'),
  ], 'para ejemplificar tomaremos como referencia un restaurante')
];
const items5: Container[] = [
  container('Servidores', [
    item('Son los sistemas o aplicaciones que reciben las solicitudes realizadas por los clientes a través de la API y responden proporcionando los datos o ejecutando las operaciones solicitadas.'),
    item('Las APIs exponen puntos de acceso conocidos como `endpoints` o rutas, que definen qué operaciones y recursos están disponibles para ser utilizados por los clientes. Cada endpoint corresponde a una funcionalidad específica que se puede solicitar a través de la API. Por ejemplo, en una API de un servicio de usuarios, podrían existir endpoints como `/users` para obtener la lista de usuarios, `/users/create` para crear un nuevo usuario y `/users/:id` para obtener la información de un usuario específico, donde `:id` representa el identificador único del usuario.'),
    item('Para intercambiar datos entre los clientes y los servidores a través de la API, es común utilizar formatos de empaquetado como `JSON` o `XML`. Estos formatos permiten estructurar y codificar la información para que pueda ser enviada y recibida correctamente.'),
    item('Para intercambiar datos entre los clientes y los servidores a través de la API, es común utilizar formatos de empaquetado como `JSON` o `XML`. Estos formatos permiten estructurar y codificar la información para que pueda ser enviada y recibida correctamente.'),
  ])
];

interface HttpStatus {
  category: string;
  codes: {
    code: number;
    description: string;
  }[];
}

const httpStatusData: HttpStatus[] = [
  {
    category: '1XX (Informacional)',
    codes: [
      { code: 100, description: 'Continuar - El servidor ha recibido la solicitud del cliente y espera que el cliente continúe enviando el resto de la solicitud.' },
      { code: 102, description: 'Procesando - El servidor ha recibido y está procesando la solicitud, pero aún no ha terminado de enviar una respuesta.' },
    ],
  },
  {
    category: '2XX (Éxito)',
    codes: [
      { code: 200, description: 'OK - La solicitud ha sido exitosa y el servidor envía la respuesta solicitada.' },
      { code: 201, description: 'Creado - La solicitud ha sido exitosa, y como resultado se ha creado un nuevo recurso en el servidor.' },
      { code: 204, description: 'Sin contenido - La solicitud ha sido exitosa, pero no hay contenido para enviar en la respuesta (generalmente utilizado en respuestas a solicitudes de tipo DELETE).' },
    ],
  },
  {
    category: '3XX (Redirecciones)',
    codes: [
      { code: 300, description: 'Múltiples opciones - Indica que el recurso solicitado tiene múltiples opciones disponibles y el cliente debe elegir una de ellas.' },
      { code: 301, description: 'Movido permanentemente - El recurso solicitado ha sido movido permanentemente a una nueva ubicación.' },
      { code: 307, description: 'Redirección temporal - La solicitud debe ser redirigida temporalmente a otra ubicación.' },
      { code: 308, description: 'Redirección permanente - Similar al 301, pero asegura que el cliente utilice siempre la nueva URL en futuras solicitudes.' },
    ],
  },
  {
    category: '4XX (Errores del cliente)',
    codes: [
      { code: 400, description: 'Solicitud incorrecta - El servidor no pudo entender la solicitud del cliente, debido a un formato incorrecto o datos faltantes.' },
      { code: 401, description: 'No autorizado - El cliente debe autenticarse para obtener acceso al recurso solicitado.' },
      { code: 404, description: 'No encontrado - El servidor no pudo encontrar el recurso solicitado en el servidor.' },
      { code: 409, description: 'Conflicto - La solicitud no se pudo completar debido a un conflicto en el estado actual del recurso.' },
    ],
  },
  {
    category: '5XX (Errores del servidor)',
    codes: [
      { code: 500, description: 'Error interno del servidor - El servidor ha encontrado una situación inesperada que le impide completar la solicitud.' },
      { code: 502, description: 'Bad Gateway - La puerta de enlace o servidor intermedio recibió una respuesta inválida del servidor final.' },
      { code: 504, description: 'Gateway Timeout - El servidor final no respondió a tiempo.' },
    ],
  },
];

// // Iterar y mostrar la información de cada código de estado
// httpStatusData.forEach((statusCategory) => {
//   console.log(`Categoría: ${statusCategory.category}`);
//   statusCategory.codes.forEach((status) => {
//     console.log(`  Código: ${status.code}`);
//     console.log(`  Descripción: ${status.description}`);
//   });
//   console.log('----------------------');
// });


const IndexPage: React.FC<PageProps> = () => {

  return (
    <main className="container mx-auto grid gap-5 py-5">
      <NeonText className='neon-text bg-gray-900 rounded-lg p-6'>INTRODUCCION BACKEND</NeonText>
      {items.map((item, index) => (
        <div key={index}>
          <NeonTextH3 className='neon-text bg-gray-900 my-5 rounded-lg p-6'>{item.title}</NeonTextH3>
          {item.children.map((role, index) => (
            <div key={index} className='my-1'>
              <NeonThemeComponent title={role.title} description={role.description} />
            </div>
          ))}
        </div>
      ))}

      <div className="grid gap-3">
        <NeonTextH3 className='neon-text bg-gray-900 my-5 rounded-lg p-6'>Frontend (Clientes)</NeonTextH3>
        <NeonThemeComponent description='El frontend es la parte de una aplicación o sitio web donde los usuarios interactúan directamente. Los elementos con los que los usuarios pueden interactuar incluyen navegadores web, dispositivos móviles (como teléfonos y tabletas) y dispositivos IoT (Internet of Things).
          Dentro del frontend, se utilizan varias tecnologías para crear la interfaz de usuario y permitir la interacción:' />
        <ol className="grid gap-5">
          {items2.map((item, index) => (
            <li className="grid gap-2" key={index}>
              <NeonThemeComponent title={item.title} description={item.descripcion} />
              <ul className="grid gap-1 ml-5">
                {item.children.map((itemChild, index) => (
                  <li key={index}>
                    <NeonThemeComponent title={itemChild.title} description={itemChild.description} />
                  </li>
                ))}
              </ul>
            </li>
          ))}
        </ol>
      </div>

      <div className="grid gap-3">
        <NeonTextH3 className='neon-text bg-gray-900 my-5 rounded-lg p-6'>Backend (servidor)</NeonTextH3>
        <NeonThemeComponent description='El backend es la parte de una aplicación que se encarga de la lógica y el procesamiento de datos. Contiene la lógica de negocio, la interacción con la base de datos y se encarga de proporcionar datos y funcionalidades al frontend. Algunas tecnologías comunes utilizadas para el desarrollo del backend incluyen:' />
        <ol className="grid gap-5">
          {items3.map((item, index) => (
            <li className="grid gap-2" key={index}>
              <NeonThemeComponent title={item.title} description={item.descripcion} />
              <ul className="grid gap-1 ml-5">
                {item.children.map((itemChild, index) => (
                  <li key={index}>
                    <NeonThemeComponent description={`${itemChild.title}: ${itemChild.description}`} />
                  </li>
                ))}
              </ul>
            </li>
          ))}
        </ol>
      </div>


      <div>
        <NeonThemeComponent title='Como conectamos el backend con el frontend' description='La conexión entre el frontend y el backend se realiza a través de APIs (Application Programming Interfaces) que utilizan el protocolo HTTP para comunicarse. El frontend realiza solicitudes a estas APIs para obtener datos o realizar acciones, y el backend procesa esas solicitudes y proporciona las respuestas adecuadas.' />
      </div>

      <div className="grid gap-3 mt-8">
        <ol className="grid gap-5">
          {items4.map((item, index) => (
            <li className="grid gap-2" key={index}>
              <NeonThemeComponent title={item.title} description={item.descripcion} />
              <ul className="grid gap-1 ml-5">
                {item.children.map((itemChild, index) => (
                  <li key={index}>
                    <NeonThemeComponent title={itemChild.title} description={itemChild.description} />
                  </li>
                ))}
              </ul>
            </li>
          ))}
        </ol>
      </div>


      <div className="grid gap-3">
        <NeonTextH3 className='neon-text bg-gray-900 my-5 rounded-lg p-6'>Definieniendo el protocolo HTTP</NeonTextH3>
        <NeonThemeComponent title='El protocolo HTTP (Hypertext Transfer Protocol)' description='es un protocolo de aplicación utilizado para la transferencia de datos entre un cliente (como un navegador web) y un servidor web.' />
        <NeonThemeComponent title='El protocolo HTTPS (HTTP Secure)' description='es una versión segura del protocolo HTTP que utiliza cifrado SSL/TLS para proteger los datos en tránsito.' />
        <NeonThemeComponent title='Los Codigos de estado' description='El protocolo HTTP (Hypertext Transfer Protocol) utiliza códigos de estado de tres dígitos para indicar el resultado de una solicitud realizada por un cliente al servidor web. Estos códigos de estado se incluyen en la respuesta del servidor y proporcionan información sobre si la solicitud se ha realizado correctamente o si ha ocurrido algún error. A continuación, se definen los principales códigos de estado del protocolo HTTP junto con sus descripciones:' />
        <ol className="grid gap-5">
          {httpStatusData.map((item, index) => (
            <li className="grid gap-2" key={index}>
              <NeonThemeComponent title={item.category} />
              <ul className="grid gap-1 ml-5">
                {item.codes.map((itemChild, index) => (
                  <li key={index}>
                    <NeonThemeComponent description={`${itemChild.code}: ${itemChild.description}`} />
                  </li>
                ))}
              </ul>
            </li>
          ))}
        </ol>
        <NeonThemeComponent description='Es importante mencionar que existen muchos más códigos de estado en HTTP que cubren diferentes situaciones y escenarios, pero estos son algunos ejemplos clave. Los códigos de estado permiten que el cliente y el servidor se comuniquen y entiendan el resultado de una solicitud, lo que ayuda a diagnosticar y solucionar problemas durante las interacciones entre el cliente y el servidor web.' />
        <NeonThemeComponent description={`Esto no son todos los codigos de estado puedes revisar la pagina para poder entender los codigos de estado de una manera muy divertida y la pagina es: http.cat`} />
      </div>
      <div className="grid gap-5">
        <NeonTextH3 className='neon-text bg-gray-900 my-5 rounded-lg p-6'>Aprendiendo el concepto de APIs</NeonTextH3>
        <NeonThemeComponent description={`Las APIs (Interfaces de Programación de Aplicaciones) son conjuntos de reglas y protocolos que permiten que diferentes componentes de software se comuniquen entre sí. Actúan como puntos de acceso que permiten que una aplicación o sistema interactúe con otro para acceder a sus servicios, funcionalidades y datos.\nEl funcionamiento de las APIs implica dos roles principales:`} />
        <NeonThemeComponent title='Clientes' description='Son las aplicaciones o sistemas que envían solicitudes a través de la API para acceder a los servicios o datos proporcionados por otro sistema o servidor.' />
        <ol className="grid gap-5">
          {items5.map((item, index) => (
            <li className="grid gap-2" key={index}>
              <NeonThemeComponent title={item.title} description={item.descripcion} />
              <ul className="grid gap-1 ml-5">
                {item.children.map((itemChild, index) => (
                  <li key={index}>
                    <NeonThemeComponent description={itemChild.title} />
                  </li>
                ))}
              </ul>
            </li>
          ))}
        </ol>
        <NeonThemeComponent description='Un tipo de API muy conocido y ampliamente utilizado es `REST API` (Representational State Transfer), una arquitectura que se basa en el protocolo HTTP y que utiliza verbos HTTP (GET, POST, PUT, DELETE, etc.) para realizar operaciones en los recursos expuestos mediante los endpoints.'/>
      </div>
    </main>
  )
}

export default IndexPage

export const Head: HeadFC = () => <title>Home Page</title>
function createItem(arg0: string, arg1: string): never {
  throw new Error("Function not implemented.");
}

