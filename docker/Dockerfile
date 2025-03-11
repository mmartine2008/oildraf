# Imagen base con JDK 17 y Maven
FROM maven:3.9.6-eclipse-temurin-17 AS builder

# Establecer directorio de trabajo
WORKDIR /src

# Copiar archivos de configuración y código fuente
#COPY pom.xml .
#RUN mvn dependency:go-offline

#COPY src ./src

# Construir la aplicación
# RUN mvn package -DskipTests

# Imagen para ejecutar la aplicación
# FROM eclipse-temurin:17-jdk

# Establecer directorio de trabajo en la nueva imagen
# WORKDIR /app

# Copiar el JAR generado en la imagen anterior
#COPY --from=builder /app/target/*.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
#ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["tail", "-f", "/dev/null"]

