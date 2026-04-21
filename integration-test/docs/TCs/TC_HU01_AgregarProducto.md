# Casos de Prueba para HU01: Agregar Producto

## Escenario 1: Creación exitosa de un producto con todos los campos válidos

**Given** que la API de inventario está disponible y funcionando correctamente  
**And** que no existe un producto con el mismo nombre en el sistema  
**When** envío una solicitud POST a `/api/productos` con un cuerpo JSON válido que incluye `nombre`, `descripcion`, `precio` (positivo), `cantidad_stock` (entero >= 0) y `proveedor`  
**Then** la respuesta debe tener código 201 Created  
**And** el cuerpo de la respuesta debe contener el objeto del producto creado con un ID asignado  
**And** el producto debe estar disponible para consultas posteriores

## Escenario 2: Error por campo obligatorio faltante (nombre)

**Given** que la API de inventario está disponible  
**When** envío una solicitud POST a `/api/productos` con un cuerpo JSON que omite el campo `nombre`  
**Then** la respuesta debe tener código 400 Bad Request  
**And** el cuerpo de la respuesta debe incluir un mensaje de error claro indicando que el campo `nombre` es obligatorio

## Escenario 3: Error por precio inválido (negativo)

**Given** que la API de inventario está disponible  
**When** envío una solicitud POST a `/api/productos` con un cuerpo JSON que incluye un `precio` negativo  
**Then** la respuesta debe tener código 400 Bad Request  
**And** el cuerpo de la respuesta debe incluir un mensaje de error claro indicando que el precio debe ser positivo

## Escenario 4: Error por cantidad_stock inválida (negativa)

**Given** que la API de inventario está disponible  
**When** envío una solicitud POST a `/api/productos` con un cuerpo JSON que incluye una `cantidad_stock` negativa  
**Then** la respuesta debe tener código 400 Bad Request  
**And** el cuerpo de la respuesta debe incluir un mensaje de error claro indicando que la cantidad en stock debe ser mayor o igual a cero

## Escenario 5: Error por descripción faltante (si es obligatoria)

**Given** que la API de inventario está disponible  
**When** envío una solicitud POST a `/api/productos` con un cuerpo JSON que omite el campo `descripcion`  
**Then** la respuesta debe tener código 400 Bad Request  
**And** el cuerpo de la respuesta debe incluir un mensaje de error claro indicando que el campo `descripcion` es obligatorio

## Escenario 6: Error por proveedor faltante (si es obligatorio)

**Given** que la API de inventario está disponible  
**When** envío una solicitud POST a `/api/productos` con un cuerpo JSON que omite el campo `proveedor`  
**Then** la respuesta debe tener código 400 Bad Request  
**And** el cuerpo de la respuesta debe incluir un mensaje de error claro indicando que el campo `proveedor` es obligatorio

## Escenario 7: Creación exitosa con cantidad_stock cero

**Given** que la API de inventario está disponible  
**When** envío una solicitud POST a `/api/productos` con un cuerpo JSON válido donde `cantidad_stock` es 0  
**Then** la respuesta debe tener código 201 Created  
**And** el producto debe crearse correctamente

## Escenario 8: Error por datos no JSON o formato inválido

**Given** que la API de inventario está disponible  
**When** envío una solicitud POST a `/api/productos` con un cuerpo que no es JSON válido  
**Then** la respuesta debe tener código 400 Bad Request  
**And** el cuerpo de la respuesta debe incluir un mensaje de error claro sobre el formato inválido