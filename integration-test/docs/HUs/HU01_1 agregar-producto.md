# Historia de Usuario: Agregar Producto

## Como
Desarrollador que consume la API de inventario

## Quiero
Enviar una solicitud para crear un nuevo producto a través de la API

## Para
Registrar productos en el sistema sin depender de una interfaz gráfica, y permitir su gestión desde aplicaciones o servicios externos

## Criterios de Aceptación

1. La API debe exponer un endpoint `POST /api/productos` para crear un producto.
2. El endpoint debe aceptar un cuerpo JSON con los campos: `nombre`, `descripcion`, `precio`, `cantidad_stock` y `proveedor`.
3. La API debe validar los datos recibidos y devolver un error con código `400 Bad Request` si faltan campos obligatorios o el precio/cantidad no son válidos.
4. Si la creación es exitosa, la API debe responder con `201 Created` y el objeto del producto creado en el cuerpo de la respuesta.
5. El producto creado debe quedar disponible para consultas posteriores a través del endpoint de listado o búsqueda.
6. En caso de error, la respuesta debe incluir un mensaje claro en formato JSON.

## Notas
- `precio` debe ser un número positivo.
- `cantidadStock` debe ser un entero mayor o igual a cero.
- `proveedor` puede ser un nombre o identificador de quien suministra el producto.
