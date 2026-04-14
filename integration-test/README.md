# Documentación del Proyecto Spring Boot CRUD

## Descripción General

Este proyecto es una aplicación de demostración construida con Spring Boot que implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para gestionar productos en un sistema de inventario. La aplicación utiliza Spring Data JPA para la persistencia de datos y proporciona una API REST para interactuar con los recursos.

## Tecnologías Utilizadas

- **Java 17**: Lenguaje de programación principal
- **Spring Boot 2.6.7**: Framework para el desarrollo de aplicaciones
- **Spring Data JPA**: Para el acceso a datos
- **MySQL**: Base de datos principal
- **H2 Database**: Base de datos en memoria para pruebas
- **Maven**: Gestión de dependencias y construcción
- **Lombok**: Para reducir el código boilerplate

## Arquitectura

La aplicación sigue el patrón de arquitectura MVC (Model-View-Controller) con las siguientes capas:

- **Controller**: Maneja las solicitudes HTTP y respuestas
- **Service**: Contiene la lógica de negocio
- **Repository**: Interfaz con la base de datos
- **Entity**: Representa las tablas de la base de datos

## Entidades

El proyecto maneja las siguientes entidades principales:

- **Product**: Representa los productos en el inventario
- **Provider**: Representa los proveedores de productos
- **Sale**: Representa las ventas realizadas

## Configuración

La aplicación se configura a través de archivos `application.properties` y `application.yml` ubicados en `src/main/resources/`.

### Configuración de Base de Datos

Por defecto, la aplicación está configurada para usar MySQL. Para desarrollo local, se puede usar H2 cambiando la configuración.

## Ejecución

Para ejecutar la aplicación:

```bash
mvn spring-boot:run
```

La aplicación estará disponible en `http://localhost:9191`

## API REST

La API proporciona endpoints para gestionar productos. Ver [documentación de API](api.md) para más detalles.

## Pruebas

El proyecto incluye pruebas unitarias e integración. Para ejecutar las pruebas:

```bash
mvn test
```

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/unrn/vv/crud/
│   │       ├── SpringBootCrudApplication.java
│   │       ├── controller/
│   │       │   └── ProductController.java
│   │       ├── entity/
│   │       │   ├── Product.java
│   │       │   ├── Provider.java
│   │       │   └── Sale.java
│   │       ├── repository/
│   │       │   └── ProductRepository.java
│   │       └── service/
│   │           └── ProductService.java
│   └── resources/
│       ├── application.properties
│       └── application.yml
└── test/
    ├── java/
    │   └── com/unrn/vv/crud/
    │       ├── SpringBootCrudApplicationTests.java
    │       └── TestH2Repository.java
    └── resources/
        └── application.properties
```

## Contribución

Para contribuir al proyecto, asegúrate de seguir las mejores prácticas de desarrollo y ejecutar todas las pruebas antes de enviar cambios.