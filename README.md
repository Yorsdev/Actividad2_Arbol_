## 📌 ¿Qué es un árbol binario?

Un árbol binario es una estructura de datos formada por nodos, donde cada nodo puede tener como máximo dos hijos:

- **Hijo izquierdo**
- **Hijo derecho**

En este proyecto se utiliza un **Árbol Binario de Búsqueda (BST)**, el cual organiza los datos de la siguiente manera:

- Los valores **menores** se ubican a la **izquierda**
- Los valores **mayores** se ubican a la **derecha**

Esto permite que los datos se mantengan ordenados automáticamente y facilita las búsquedas.

## ⚙️ ¿Cómo se implementó?

El proyecto fue desarrollado en Java utilizando una clase principal llamada **Arbol**, la cual contiene una clase interna **Nodo**.

### 🔹 Clase Nodo

Cada nodo contiene:

- `llave`: un número entero que identifica el nodo
- `contenido`: un dato asociado (en este caso, frutas)
- `izquierda`: referencia al hijo izquierdo
- `derecha`: referencia al hijo derecho
- `padre`: referencia al nodo padre

### 🔹 Funcionalidades implementadas

#### ✔ **Inserción**

Se implementa el método `insertar(int llave, String contenido)` que:

1. Recorre el árbol desde la raíz
2. Ubica la posición correcta según las reglas del BST
3. Inserta el nuevo nodo

#### ✔ **Recorrido Inorden**

Se implementa el método `recorrer()` que internamente usa recursividad:

**Orden del recorrido:**
Izquierda → Nodo → Derecha

text

Esto permite mostrar los datos ordenados automáticamente.

#### ✔ **Búsqueda**

Se implementan dos métodos:

- `buscar(int valor)` → retorna `true` o `false`
- `buscarYMostrar(int valor)` → muestra el resultado en consola:
  - "Número encontrado"
  - "No existe"

## 💻 Ejemplo de ejecución en consola

==== RECORRIDO INORDEN ====
Indice 1 fruta Uva
Indice 4 fruta Naranja
Indice 7 fruta Pera
Indice 8 fruta Manzana
Indice 9 fruta Sandía

==== BÚSQUEDA Y MUESTRA ====
Clave 4: Número encontrado
Clave 5: No existe
Clave 7: Número encontrado

<img width="1890" height="1008" alt="Captura desde 2026-03-23 21-55-29" src="https://github.com/user-attachments/assets/dc47f1ba-8111-4cc6-a85e-f368b5e71350" />



## 👥 Integrantes del grupo

- [Jorge Andrés González Foronda - Desarrollador]

## 📎 Notas

Este proyecto fue desarrollado como parte del aprendizaje de estructuras de datos, con el objetivo de comprender el funcionamiento de los árboles binarios y su implementación en Java.
