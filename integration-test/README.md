# integration-test

## Requisitos previos
- Java 17 o superior
- Maven 3.8.1 o superior

## Compilar el proyecto
Para compilar el proyecto, ejecuta el siguiente comando en la raíz del proyecto:

```bash
mvn clean install

mvn spring-boot:run

mvn test
```

### Para compilar la aplicación sin correr los test
```bash
mvn install -DskipTests
```

## Configuración del proyecto

El proyecto utiliza un archivo `application.properties` o `application.yml` para manejar las configuraciones. Este archivo se encuentra en el directorio `src/main/resources`.

### Configuraciones comunes

Algunas configuraciones comunes que puedes ajustar incluyen:

- **Puerto del servidor**: Puedes cambiar el puerto en el que se ejecuta la aplicación modificando la propiedad `server.port`. Por ejemplo:
  ```properties
    server.port=8081
    spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos
    spring.datasource.username=usuario
    spring.datasource.password=contraseña


### Perfiles de configuración
Podes definir diferentes perfiles de configuración (por ejemplo, dev, test, prod) utilizando archivos como application-dev.properties o application-prod.properties. Para activar un perfil específico, usa la propiedad spring.profiles.active:

```properties
    spring.profiles.active=dev
