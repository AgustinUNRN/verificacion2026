# Documentación de la API REST

## Base URL
```
http://localhost:9191
```

## Endpoints de Productos

### 1. Crear un Producto
**POST** `/products`

Crea un nuevo producto en el sistema.

**Request Body:**
```json
{
  "name": "Producto Ejemplo",
  "quantity": 10,
  "price": 99.99,
  "provider": {
    "id": 1
  }
}
```

**Response:**
```json
{
  "id": 1,
  "name": "Producto Ejemplo",
  "quantity": 10,
  "price": 99.99,
  "provider": {
    "id": 1,
    "name": "Proveedor Ejemplo"
  }
}
```

**Status Codes:**
- `201 Created`: Producto creado exitosamente
- `400 Bad Request`: Datos inválidos

### 2. Obtener Todos los Productos
**GET** `/products`

Retorna una lista de todos los productos.

**Response:**
```json
[
  {
    "id": 1,
    "name": "Producto 1",
    "quantity": 5,
    "price": 50.00,
    "provider": {
      "id": 1,
      "name": "Proveedor 1"
    }
  },
  {
    "id": 2,
    "name": "Producto 2",
    "quantity": 15,
    "price": 75.00,
    "provider": {
      "id": 2,
      "name": "Proveedor 2"
    }
  }
]
```

**Status Codes:**
- `200 OK`: Lista retornada exitosamente

### 3. Obtener un Producto por ID
**GET** `/products/{id}`

Retorna un producto específico por su ID.

**Parámetros de URL:**
- `id` (integer): ID del producto

**Response:**
```json
{
  "id": 1,
  "name": "Producto Ejemplo",
  "quantity": 10,
  "price": 99.99,
  "provider": {
    "id": 1,
    "name": "Proveedor Ejemplo"
  }
}
```

**Status Codes:**
- `200 OK`: Producto encontrado
- `404 Not Found`: Producto no encontrado

### 4. Actualizar un Producto
**PUT** `/products/update/{id}`

Actualiza un producto existente.

**Parámetros de URL:**
- `id` (integer): ID del producto a actualizar

**Request Body:**
```json
{
  "name": "Producto Actualizado",
  "quantity": 20,
  "price": 149.99
}
```

**Response:**
```json
{
  "id": 1,
  "name": "Producto Actualizado",
  "quantity": 20,
  "price": 149.99,
  "provider": {
    "id": 1,
    "name": "Proveedor Ejemplo"
  }
}
```

**Status Codes:**
- `200 OK`: Producto actualizado exitosamente
- `404 Not Found`: Producto no encontrado

### 5. Eliminar un Producto
**DELETE** `/products/{id}`

Elimina un producto del sistema.

**Parámetros de URL:**
- `id` (integer): ID del producto a eliminar

**Response:**
```
"product removed !! 1"
```

**Status Codes:**
- `200 OK`: Producto eliminado exitosamente
- `404 Not Found`: Producto no encontrado

## Modelos de Datos

### Product
```json
{
  "id": "integer (auto-generado)",
  "name": "string",
  "quantity": "integer",
  "price": "double",
  "provider": "Provider (opcional)",
  "sales": "Set<Sale> (opcional)"
}
```

### Provider
```json
{
  "id": "integer (auto-generado)",
  "name": "string",
  "phone": "string",
  "street": "string"
}
```

### Sale
```json
{
  "id": "integer (auto-generado)",
  "sale_date": "date",
  "total": "double",
  "state": "string",
  "products": "Set<Product>"
}
```

## Consideraciones Generales

- Todos los endpoints requieren Content-Type: application/json
- Las respuestas de error incluyen un mensaje descriptivo
- Los IDs son auto-generados por la base de datos
- Las relaciones con Provider y Sales son opcionales en algunas operaciones

## Ejemplos de Uso con cURL

### Crear producto:
```bash
curl -X POST http://localhost:9191/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Nuevo Producto","quantity":5,"price":25.00}'
```

### Obtener todos los productos:
```bash
curl -X GET http://localhost:9191/products
```

### Obtener producto por ID:
```bash
curl -X GET http://localhost:9191/products/1
```

### Actualizar producto:
```bash
curl -X PUT http://localhost:9191/products/update/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Producto Modificado","quantity":10,"price":30.00}'
```

### Eliminar producto:
```bash
curl -X DELETE http://localhost:9191/products/1
```