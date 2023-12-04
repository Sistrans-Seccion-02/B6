# Parranderos con MongoDB (Demo)

Este proyecto busca representar de manera muy simple una aplicacion RESTful que permita hacer transacciones tipo CRUD. La base de datos es creada con MongoDB Atlas, la cual maneja clusters que proveen el servicio a los usuarios, en este caso, los estudiantes.

## Contenido

1. [Requisitos](#requisitos)
2. [Conexion del proyecto a la base de datos](#conexion-del-proyecto-a-la-base-de-datos)
3. [Colecciones](#colecciones)
4. [Tecnologias usadas](#tecnologias-usadas)
5. [Colaboración](#colaboración)


## Requisitos

- Java 8 o 7
- IDE de su preferencia
- Usuario en MongoDB
- Base de datos MongoDB en Atlas
- Extensiones para java en caso de usar Visual Studio Code (recomendado) 

## Conexion del proyecto a la base de datos

En el archivo del proyecto ubicado en src/main/resources/application.yml, donde dice "uri" ingresar el enlace de conexion a la base de datos de mongo creada por el estudiante en Atlas. El uri de conexion debe lucir como el siguiente ejemplo: mongodb+srv://admin:mongo@cluster0.ejemplo.mongodb.net/

## Colecciones

Cuando se crea una base de datos en Atlas MongoDB por lo general se pide una coleccion base para comenzar, por ello, a continuacion adjuntamos las colecciones usadas en este proyecto para usar alguna de estas como coleccion base (puede seleccionar cualquiera). La base de datos MongoDB usada para este proyecto, tiene estas colecciones creadas:

hotel
{
    "inicio": new Date("2023-12-22"),
    "fin": new Date("2023-12-28"),
    "diasreserva": 6,
    "checkin": true,
    "checkout": false,
    "habitaciones": [
      {
        "numero": 105,
        "dotacion": ["TV", "Aire acondicionado", "Cafetera"],
        "tipohabi": {
          "nombre": "Sencilla",
          "costo": 100,
          "capacidad": 1
        }
      }
    ],
    "clientes": [
      {
        "_id": 5,
        "tipoid": "CC",
        "nombre": "Juan Santos",
        "email": "juan.santos@example.com"
      }
    ],
    "consumos": [
      {
        "fecha": new Date("2023-12-28"),
        "pagado": true,
        "servicio": {
          "nombre": "Restaurante",
          "descripcion": "Almuerzo",
          "costo": 300
        }
      },
      {
        "fecha": new Date("2023-12-23"),
        "pagado": false,
        "servicio": {
          "nombre": "Spa",
          "descripcion": "Masaje",
          "costo": 100
        }
      },
      {
        "fecha": new Date("2023-12-24"),
        "pagado": false,
        "servicio": {
          "nombre": "Bar",
          "descripcion": "Cocteles",
          "costo": 200
        }
      }
    ]
  }


## Tecnologias usadas
                     
Este proyecto fue desarrollado haciendo uso de Spring, particularmente Spring Boot para el backend, con entorno de ejecucion node.js y thymeleaf para la conexion de un frontend local con los endpoints definidos. Se recomienda hacer lectura de la documentacion de dichas tecnologias.

## Colaboración
Proyecto desarrollado por Laura Murcia, Sara Benavides y Daniel Garcia


