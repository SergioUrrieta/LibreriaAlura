# 📚 LiterAlura – Challenge Java

LiterAlura es un proyecto backend desarrollado en **Java con Spring Boot**, cuyo objetivo es construir un catálogo de libros y autores a partir de datos obtenidos desde la API pública **Gutendex** (Project Gutenberg).  
El sistema permite buscar libros, almacenar información en una base de datos relacional y realizar consultas avanzadas mediante consola.

Este proyecto forma parte de un **challenge de Java**, enfocado en el consumo de APIs, manipulación de JSON, persistencia de datos y buenas prácticas de desarrollo backend.

---

## 🚀 Tecnologías utilizadas

- **Java JDK** 17+
- **Spring Boot** 3.2.3
- **Maven** 4+
- **Spring Data JPA**
- **PostgreSQL** 16+
- **Jackson** 2.16
- **API Gutendex** (Project Gutenberg)

---

## 🧠 Funcionalidades principales

### 📖 Libros
- Buscar libro por título (consumiendo la API Gutendex)
- Guardar libros en la base de datos
- Listar todos los libros buscados
- Mostrar libros filtrados por idioma
- Estadísticas de cantidad de libros por idioma

### ✍️ Autores
- Guardar autores asociados a los libros
- Listar todos los autores registrados
- Listar autores que estaban vivos en un año determinado

### 🖥️ Interacción
- Menú interactivo por consola
- Validación de entradas del usuario
- Manejo de errores básicos

---

## 🌐 API utilizada

**Gutendex API**  
Catálogo de más de 70.000 libros de dominio público.

- URL base:  https://gutendex.com/
