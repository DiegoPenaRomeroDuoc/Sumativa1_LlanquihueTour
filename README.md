# 🧠 Llanquihue Tour – Desarrollo Orientado a Objetos I (Sumativa 1)

## 👤 Autor del proyecto

* **Nombre completo:** Diego Peña Romero
* * **Profesor:** Jorge Eduardo Carmona LLancavil
* **Carrera:** Analista programador computacional
* **Sede:** Campus Virtual // Duoc Online

---

## 📘 Descripción general del sistema

**Llanquihue Tour** es una agencia de turismo de la comuna de Llanquihue, Región de Los Lagos. Hoy la información de sus clientes y guías se gestiona de forma manual, lo que genera datos duplicados, desorganizados y sin diferenciación de roles.

Este proyecto, desarrollado en Java para la asignatura *Desarrollo Orientado a Objetos I*, propone un **modelo de clases** que representa a las personas vinculadas a la agencia. Aplica encapsulamiento, herencia, composición, validación de datos y organización en paquetes.

---

## 🧱 Estructura general del proyecto

```
📁 src/
├── app/         # Clase principal con el método main
│   └── Main.java
└── model/       # Clases de dominio
    ├── Direccion.java
    ├── Persona.java
    ├── Cliente.java
    └── Guia.java
```

### Clases implementadas

| Clase | Paquete | Descripción |
|-------|---------|-------------|
| `Direccion` | model | Calle, número (texto, por ejemplo `0521` o `S/N`), complemento opcional (villa, depto, parcela), comuna y región. Se usa por **composición** dentro de `Persona`. |
| `Persona` | model | Clase base: RUT, nombre, apellido, teléfono y una `Direccion`. |
| `Cliente` | model | Hereda de `Persona`. Agrega el tour contratado y la cantidad de pasajeros. |
| `Guia` | model | Hereda de `Persona`. Agrega los idiomas y los años de experiencia. |
| `Main` | app | Crea tres objetos (dos clientes y un guía), los muestra por consola con `toString()` y ejecuta pruebas de validación. |

### Relaciones entre clases

* **Composición:** `Persona` contiene un objeto `Direccion` como atributo.
* **Herencia:** `Cliente` y `Guia` extienden `Persona` y usan `super` para reutilizar sus datos y su `toString()`.

### Principios de POO aplicados

* **Encapsulamiento:** todos los atributos son `private`, con getters y setters públicos.
* **Constructores:** inicializan los objetos usando los setters, por lo que los datos se validan desde la creación.
* **toString():** cada clase muestra sus datos de forma legible, con cada dato en su propia línea.
* **Validación de datos:** los setters rechazan datos inválidos lanzando una `IllegalArgumentException` con un mensaje claro.

### Validaciones implementadas

| Clase | Regla |
|-------|-------|
| `Direccion` | Calle, número, comuna y región no pueden estar vacíos. El complemento es opcional. |
| `Persona` | RUT, nombre, apellido y teléfono no pueden estar vacíos. La dirección no puede ser nula. |
| `Cliente` | El tour contratado no puede estar vacío. Los pasajeros deben ser mayor que 0. |
| `Guia` | Los idiomas no pueden estar vacíos. Los años de experiencia no pueden ser negativos. |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```
git clone https://github.com/DiegoPenaRomeroDuoc/Sumativa1_LlanquihueTour.git
```

2. Abre el proyecto en IntelliJ IDEA.
3. Abre el archivo `Main.java` del paquete `app`.
4. Presiona el botón verde **Run** junto al método `main`.
5. Revisa los resultados en la consola.

---

## 🖥️ Ejemplo de salida

```
---- Cliente ---
RUT: 12.345.678-9
Nombre: Camila Soto
Teléfono: +56911112222
Dirección: Av. Ernesto Ewert 120, Llanquihue, Los Lagos
Tour contratado: Paseo lacustre
Pasajeros: 3

---- Guía ---
RUT: 10.987.654-3
Nombre: Marta Álvarez
Teléfono: +56955556666
Dirección: Calle Errázuriz 0521, Villa Los Lagos, Puerto Varas, Los Lagos
Idiomas: Español, Inglés
Años de experiencia: 8

=== PRUEBAS DE VALIDACIÓN ===
1. Direccion -> El número no puede estar vacío. Si no tiene numero ingresar como: S/N
2. Persona -> El nombre no puede estar vacío
3. Cliente -> La cantidad de pasajeros debe ser mayor que 0
4. Guia -> Los años de experiencia no pueden ser negativos
5. Cliente -> La dirección no puede ser nula
```

---

**Repositorio GitHub:** https://github.com/DiegoPenaRomeroDuoc/Sumativa1_LlanquihueTour

**Fecha de entrega:** 09/11/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
