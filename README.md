# API-Rest Oildraf

## Instalacion

# Docker
    Construir la imagen desde ./docker/buildDockerImage.sh
    Levantar la imagen con ./docker/run.sh
# App
    Iniciar el docker
    Acceder al container de java
    Ejecutar 
        mvn compile
        mvn spring-boot:run

    Esto deja corriendo un servidor en la 8080 del contenedor.
    Para probar usar:

        curl -X GET http://localhost:8080/api/check

        curl -X POST "http://localhost:8080/api/validate" \
            -H "Content-Type: application/json" \
            -d '{"nombre": "Mariano", "password": "1234"}'


