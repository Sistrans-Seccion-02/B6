# Parranderos con MongoDB (Demo)

Este proyecto busca representar de manera muy simple una aplicacion RESTful que permita hacer transacciones tipo CRUD. La base de datos es creada con MongoDB Atlas, la cual maneja clusters que proveen el servicio a los usuarios, en este caso, los estudiantes.

## Contenido

1. [Requisitos](#requisitos)
2. [Conexion del proyecto a la base de datos](#conexion-del-proyecto-a-la-base-de-datos)
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

## Tecnologias usadas
                     
Este proyecto fue desarrollado haciendo uso de Spring, particularmente Spring Boot para el backend, con entorno de ejecucion node.js y thymeleaf para la conexion de un frontend local con los endpoints definidos. Se recomienda hacer lectura de la documentacion de dichas tecnologias.

## Colaboración
Proyecto desarrollado por los monitores del curso Sistemas Transaccionales, especificamente, de las secciones 2 y 3. (2023-02)
- Version inicial: [Nathalia Quiroga, Laura Martinez]
- Version Final: [Juan Coronel, Daniel Aguilera]
- Revisión: ...

