# Guía de Configuración y Despliegue

## Requisitos del Sistema

### Software Requerido
- **Java**: Versión 17 o superior
- **Maven**: Versión 3.8.1 o superior
- **MySQL**: Versión 8.0 o superior (para producción)
- **Git**: Para control de versiones

### Verificación de Versiones
```bash
java -version
mvn -version
mysql --version
```

## Configuración de la Base de Datos

### 1. Instalar MySQL
Descarga e instala MySQL desde el sitio oficial: https://dev.mysql.com/downloads/mysql/

### 2. Crear la Base de Datos
```sql
CREATE DATABASE vv_practica;
```

### 3. Usuario de Base de Datos
Crea un usuario con permisos adecuados:
```sql
CREATE USER 'root'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON vv_practica.* TO 'root'@'localhost';
FLUSH PRIVILEGES;
```

## Configuración de la Aplicación

### Archivo application.properties
El archivo principal de configuración se encuentra en `src/main/resources/application.properties`:

```properties
# Puerto del servidor
server.port=9191

# Configuración de MySQL
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/vv_practica
spring.datasource.username=root
spring.datasource.password=root

# Configuración JPA/Hibernate
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
```

### Archivo application.yml (Alternativo)
También puedes usar `application.yml` para configuración:

```yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/vv_practica
    username: root
    password: root
  jpa:
    show-sql: true
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQL5Dialect

server:
  port: 9191
```

## Compilación y Ejecución

### 1. Clonar el Repositorio
```bash
git clone <url-del-repositorio>
cd integration-test
```

### 2. Compilar el Proyecto
```bash
mvn clean compile
```

### 3. Ejecutar las Pruebas
```bash
mvn test
```

### 4. Empaquetar la Aplicación
```bash
mvn clean package
```

### 5. Ejecutar la Aplicación
```bash
# Opción 1: Usando Maven
mvn spring-boot:run

# Opción 2: Ejecutando el JAR
java -jar target/integration-test-0.0.1-SNAPSHOT.jar
```

## Perfiles de Configuración

### Perfil de Desarrollo
Crea `application-dev.properties`:

```properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/vv_practica_dev
spring.jpa.show-sql=true
logging.level.com.unrn.vv.crud=DEBUG
```

Activar con:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

### Perfil de Producción
Crea `application-prod.properties`:

```properties
server.port=8080
spring.datasource.url=jdbc:mysql://prod-server:3306/vv_practica
spring.jpa.show-sql=false
logging.level.root=INFO
```

### Perfil de Testing (H2)
Para usar H2 en memoria durante pruebas:

```properties
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## Variables de Entorno

Puedes usar variables de entorno para configuración sensible:

```properties
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.url=${DB_URL}
```

Ejecutar con variables:
```bash
export DB_USERNAME=root
export DB_PASSWORD=root
mvn spring-boot:run
```

## Despliegue

### 1. Build para Producción
```bash
mvn clean package -DskipTests
```

### 2. Ejecutar como Servicio
```bash
# Crear directorio de logs
mkdir -p /var/log/spring-boot-crud

# Ejecutar la aplicación
java -jar target/integration-test-0.0.1-SNAPSHOT.jar \
  --spring.profiles.active=prod \
  > /var/log/spring-boot-crud/app.log 2>&1 &
```

### 3. Usando Docker (Opcional)
Si tienes Docker instalado:

```dockerfile
FROM openjdk:17-jdk-alpine
COPY target/integration-test-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```

```bash
docker build -t spring-boot-crud .
docker run -p 9191:9191 spring-boot-crud
```

## Monitoreo

La aplicación incluye Spring Boot Actuator para monitoreo:

- **Health Check**: `http://localhost:9191/actuator/health`
- **Info**: `http://localhost:9191/actuator/info`
- **Metrics**: `http://localhost:9191/actuator/metrics`

## Solución de Problemas

### Error de Conexión a MySQL
- Verifica que MySQL esté ejecutándose
- Confirma las credenciales en `application.properties`
- Asegúrate de que la base de datos existe

### Puerto Ocupado
- Cambia el puerto en `application.properties`
- Mata procesos usando el puerto: `lsof -ti:9191 | xargs kill -9`

### Errores de Build
- Limpia el cache de Maven: `mvn clean`
- Actualiza dependencias: `mvn dependency:resolve`

### Logs de Debug
Activa logs detallados agregando:
```properties
logging.level.com.unrn.vv.crud=DEBUG
logging.level.org.springframework.web=DEBUG
```