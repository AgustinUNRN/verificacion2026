# Descripción de las Entidades

## Entidad Product

Representa un producto en el sistema de inventario.

### Atributos

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `id` | `int` | Identificador único del producto (auto-generado) |
| `name` | `String` | Nombre del producto |
| `quantity` | `int` | Cantidad disponible en inventario |
| `price` | `double` | Precio del producto |
| `provider` | `Provider` | Proveedor del producto (relación Many-to-One) |
| `sales` | `Set<Sale>` | Ventas en las que participa el producto (relación Many-to-Many) |

### Relaciones

- **Provider**: Un producto pertenece a un proveedor
- **Sale**: Un producto puede estar en múltiples ventas

### Código de la Entidad

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    @ManyToMany(mappedBy = "products")
    private Set<Sale> sales;

    // Constructor adicional
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
```

---

## Entidad Provider

Representa un proveedor de productos.

### Atributos

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `id` | `int` | Identificador único del proveedor (auto-generado) |
| `name` | `String` | Nombre del proveedor |
| `phone` | `String` | Número de teléfono del proveedor |
| `street` | `String` | Dirección del proveedor |

### Relaciones

- **Product**: Un proveedor puede suministrar múltiples productos

### Código de la Entidad

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "providers")
public class Provider {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String phone;
    private String street;
}
```

---

## Entidad Sale

Representa una venta realizada en el sistema.

### Atributos

| Atributo | Tipo | Descripción |
|----------|------|-------------|
| `id` | `int` | Identificador único de la venta (auto-generado) |
| `sale_date` | `LocalDate` | Fecha en que se realizó la venta |
| `total` | `double` | Monto total de la venta |
| `state` | `String` | Estado de la venta (ej: "completed", "pending") |
| `products` | `Set<Product>` | Productos incluidos en la venta (relación Many-to-Many) |

### Relaciones

- **Product**: Una venta puede incluir múltiples productos

### Código de la Entidad

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue
    private int id;
    private LocalDate sale_date;
    private double total;
    private String state;

    @ManyToMany
    @JoinTable(
        name = "sale_products",
        joinColumns = @JoinColumn(name = "sale_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products;
}
```

---

## Tabla de Relaciones Many-to-Many

La relación entre `Sale` y `Product` se maneja a través de una tabla intermedia `sale_products`:

| Columna | Tipo | Descripción |
|---------|------|-------------|
| `sale_id` | `int` | ID de la venta (clave foránea) |
| `product_id` | `int` | ID del producto (clave foránea) |

---

## Consideraciones de Diseño

### Anotaciones JPA Utilizadas

- `@Entity`: Marca la clase como entidad JPA
- `@Table`: Especifica el nombre de la tabla
- `@Id`: Marca el campo como clave primaria
- `@GeneratedValue`: Genera automáticamente el valor del ID
- `@ManyToOne`: Define relación muchos a uno
- `@ManyToMany`: Define relación muchos a muchos
- `@JoinColumn`: Especifica la columna de unión
- `@JoinTable`: Define la tabla intermedia para relaciones many-to-many

### Lombok

Se utiliza Lombok para generar automáticamente:
- Getters y setters (`@Data`)
- Constructores con todos los parámetros (`@AllArgsConstructor`)
- Constructor sin parámetros (`@NoArgsConstructor`)

### Validaciones

Actualmente no se implementan validaciones Bean Validation (como `@NotNull`, `@Size`), pero se pueden agregar según los requisitos del negocio.

### Estrategia de Generación de IDs

Se utiliza la estrategia de generación automática de Hibernate/JPA, que típicamente usa secuencias o auto-incremento dependiendo del dialecto de la base de datos.