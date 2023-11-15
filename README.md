# Parranderos con MongoDB (Demo)

Este proyecto, propuesto por Wilfredy Santamaria, busca representar de manera muy simple una aplicacion RESTful que permita hacer transacciones tipo CRUD en una base de datos no relacional. La base de datos es creada con MongoDB Atlas, la cual maneja clusters que proveen el servicio a los usuarios, en este caso, los estudiantes. Dado que la materia de ingenieria de sistemas, Sistemas Transaccionales, ahora incluye un nuevo modulo el cual versa sobre las bases de datos no-relacionales (No SQL), se considera que construir una aplicacion guia es muy provechoso para el aprendizaje y puesta en practica de conocimientos para los estudiantes.

## Contenido

1. [Requisitos](#requisitos)
2. [Conexion del proyecto a la base de datos](#Conexion)
4. [Tecnologias usadas](#tecnologias)
5. [Colaboración](#colaboración)


## Requisitos

- Java 8 o 7
- IDE de su preferencia
- Usuario en MongoDB
- Base de datos MongoDB en Atlas
- Extensiones para java en caso de usar Visual Studio Code (recomendado) 

## Conexion del proyecto a la base de datos

En el archivo del proyecto ubicado en src/main/resources/application.yml, donde dice "uri" ingresar el enlace de conexion a la base de datos de mongo creada por el estudiante en Atlas.

## Tecnologias usadas

Este proyecto fue desarrollado haciendo uso de Spring, particularmente Spring Boot para el backend, con entorno de ejecucion node.js y thymeleaf para la conexion de un frontend local con los endpoints definidos. Se recomienda hacer lectura de la documentacion de dichas tecnologias.


