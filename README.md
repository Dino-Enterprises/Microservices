Proyecto Hazel
Este proyecto tiene como objetivo convertir una API monolítica a una arquitectura de microservicios utilizando Spring. El proyecto Hazel está dividido en varios microservicios interconectados que se comunican a través de una API Gateway.

Características principales
Conversión de una API monolítica a microservicios
Utilización de Spring Cloud para el desarrollo de microservicios
Utilización de Spring Cloud Gateway como API Gateway
Utilización de bases de datos distribuidas con Spring Data y Spring Cloud Config Server
Requisitos previos
Java 11 o superior
Docker
Maven
Instalación
Clonar el repositorio de Git:

bash
Copy code
git clone https://github.com/tu_usuario/proyecto-hazel.git
Navegar al directorio del proyecto:

bash
Copy code
cd proyecto-hazel
Construir las imágenes Docker de los microservicios:

arduino
Copy code
mvn spring-boot:build-image
Iniciar los contenedores de Docker de los microservicios:

Copy code
docker-compose up
Uso
Una vez que los microservicios están en ejecución, se puede acceder a la API a través de la URL de la API Gateway: http://localhost:8080.

Contribución
Si desea contribuir al proyecto, siga los siguientes pasos:

Hacer un fork del repositorio.
Crear una rama con la nueva funcionalidad o corrección de errores.
Realizar los cambios necesarios en la nueva rama.
Realizar un pull request de la nueva rama al repositorio original.
Autores
Nombre Apellido (tu_email@tu_correo.com)
Licencia
Este proyecto está bajo la Licencia MIT.
