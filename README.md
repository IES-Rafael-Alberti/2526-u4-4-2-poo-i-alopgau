
# Práctica 4.2: Programación orientada a objetos I

## Identificación de la Actividad

- **ID de la Actividad:** 4.2
- **Módulo:** PROG (Programación)
- **Unidad de Trabajo:** U4 - Programación Orientada a Objetos I
- **Fecha de Creación:** 16/01/2026
- **Fecha de Entrega:** 18/01/2026
- **Alumno:**
  - **Nombre y Apellidos:** Antonio López Gautier
  - **Correo electrónico:** alopgau418@g.educaand.es
  - **Iniciales del Alumno:** ALG

## Descripción de la Actividad

Esta práctica consiste en la implementación de varios programas en Kotlin que demuestran los conceptos fundamentales de la Programación Orientada a Objetos (POO). Se incluyen cuatro ejercicios principales:

1. **Clase Coche**: Implementación de una clase que representa un coche con validación de datos en el constructor.
2. **Clase Rectángulo**: Clase que representa un rectángulo con cálculo de área y perímetro.
3. **Clase Persona**: Clase que representa una persona con cálculos de IMC y comparaciones.
4. **Clase Tiempo**: Clase que maneja operaciones con horas, minutos y segundos.

Cada ejercicio incluye tanto la definición de la clase como un programa principal (`main`) que demuestra su funcionamiento.

## Instrucciones de Compilación y Ejecución

### Requisitos Previos:

- Kotlin 1.8+ instalado
- IntelliJ IDEA o cualquier editor de texto con soporte para Kotlin

### Pasos para Compilar y Ejecutar el Código:

Para cada archivo .kt, puedes compilar y ejecutar usando el compilador de Kotlin:

```bash
# Compilar
kotlinc nombre_archivo.kt -include-runtime -d nombre_archivo.jar

# Ejecutar
java -jar nombre_archivo.jar
```

Alternativamente, puedes ejecutarlos directamente con Kotlin:

```bash
kotlin nombre_archivo.jar
```

Para los archivos en el paquete `org.iesra` (Coche.kt, CocheMain.kt, Tiempo.kt, TiempoMain.kt), asegúrate de mantener la estructura de directorios:

```
src/
└── org/
    └── iesra/
        ├── Coche.kt
        ├── CocheMain.kt
        ├── Tiempo.kt
        └── TiempoMain.kt
```

## Desarrollo de la Actividad

### Ejercicio 1: Clase Coche

#### Descripción del Desarrollo

La clase `Coche` se implementa en el archivo `Coche.kt` dentro del paquete `org.iesra`. Esta clase representa un coche con las siguientes propiedades:

- `color`: Variable mutable que define el color del coche
- `marca`: Propiedad inmutable con getter personalizado que capitaliza la primera letra
- `modelo`: Propiedad inmutable con getter personalizado que capitaliza la primera letra
- `numCaballos`: Potencia del coche en caballos
- `numPuertas`: Número de puertas del coche
- `matricula`: Matrícula del coche

El bloque `init` incluye validaciones para:

- La matrícula debe tener exactamente 7 caracteres
- El número de caballos debe estar entre 70 y 700 (inclusive)
- El número de puertas debe estar entre 3 y 5 (inclusive)

#### Programa Principal

El archivo `CocheMain.kt` contiene el programa principal que prueba la clase `Coche`:

1. Crea un coche válido (`c1`)
2. Intenta crear coches con datos inválidos y captura las excepciones
3. Prueba casos límite para número de puertas, matrícula y caballos

#### Ejemplos de Ejecución

- **Entrada:** Creación de `Coche("Amarillo", "Seat", "ibiza", 200, 4, "1101GJB")`
- **Salida Esperada:** "Seat Ibiza Amarillo de 200 caballos, 4 puertas y matrícula 1101GJB"
- **Error al crear con 6 puertas:** "Número puertas inválido"
- **Error al crear con matrícula de 8 caracteres:** "Matrícula inválida"

### Ejercicio 2: Clase Rectángulo

#### Descripción del Desarrollo

La clase `Rectangulo` se implementa en el archivo `POO1.kt`. Características principales:

- Propiedades privadas `base` y `altura`
- `companion object` con contador de instancias
- ID único por instancia basado en el contador
- Métodos `calcularArea()` y `calcularPerimetro()` que imprimen los resultados
- Validación en el `init` para asegurar base y altura positivas

#### Programa Principal

El `main` en el mismo archivo crea tres rectángulos y muestra:

1. El identificador de cada rectángulo
2. Su área calculada
3. Su perímetro calculado

#### Ejecución

**Salida típica:**

```
Rectángulo 1:
El area del rectángulo 1 es 10
El perimetro del rectángulo 1 es 14
Rectángulo 2:
El area del rectángulo 2 es 21
El perimetro del rectángulo 2 es 20
```

### Ejercicio 3: Clase Persona

#### Descripción del Desarrollo

La clase `Persona` en `POO2.kt` es la más compleja e incluye:

- Dos constructores (primario y secundario con nombre)
- Cálculo automático del IMC como propiedad privada
- Método `equals()` personalizado basado en peso y altura
- Métodos para determinar si peso/altura están por encima de la media
- Sistema interactivo para establecer nombre
- Método `obtenerDesc()` que genera descripciones detalladas

#### Características Destacadas

1. **Companion Object:** Contiene contador y método estático `obtenerDescIMC()`
2. **Encapsulamiento:** Propiedades privadas con getters y setters controlados
3. **Cálculo IMC:** Implementación completa con categorías (insuficiente, saludable, sobrepeso, obesidad)
4. **Interactividad:** Uso de `readln()` para entrada de usuario

#### Programa Principal

El `main` prueba múltiples funcionalidades:

1. Crea personas con diferentes constructores
2. Modifica y consulta propiedades
3. Compara personas usando el método `equals()`
4. Demuestra el cálculo y descripción del IMC

### Ejercicio 4: Clase Tiempo

#### Descripción del Desarrollo

La clase `Tiempo` en `Tiempo.kt` (paquete `org.iesra`) maneja horas, minutos y segundos con:

- Validación de rangos (horas 0-23, ajuste automático de minutos/segundos > 59)
- Setters personalizados que ajustan valores excedentes
- Métodos para operaciones temporales: `incrementar()`, `decrementar()`, `sumar()`, `restar()`
- Métodos de comparación: `comparar()`, `esMayorQue()`, `esMenorQue()`
- Métodos de copia: `copiar()` y `copiar(t: Tiempo)`

#### Funciones Especiales

- **Normalización automática:** Si segundos o minutos exceden 59, se convierten a la unidad superior
- **Validación en operaciones:** Las operaciones que exceden 24h o bajan de 0h devuelven `null` o `false`
- **Setters inteligentes:** Ajustan valores automáticamente

#### Programa Principal

`TiempoMain.kt` incluye:

1. Función `pedirTiempo()` para entrada de usuario con manejo de excepciones
2. Pruebas de creación con valores límite
3. Demostración de todas las operaciones de la clase
4. Manejo de errores en operaciones inválidas

## Resultados de Pruebas

### Coche

✅ Validación correcta de matrícula (7 caracteres)  
✅ Validación correcta de caballos (70-700)  
✅ Validación correcta de puertas (3-5)  
✅ Formateo automático de marca y modelo

### Rectángulo

✅ Contador de instancias funcional  
✅ Cálculos correctos de área y perímetro  
✅ Validación de valores positivos

### Persona

✅ Cálculo correcto del IMC  
✅ Comparación de objetos con `equals()`  
✅ Sistema interactivo de nombre  
✅ Descripciones detalladas según categorías

### Tiempo

✅ Normalización automática de valores  
✅ Operaciones aritméticas con validación  
✅ Métodos de comparación y copia  
✅ Manejo de entradas inválidas

## Conclusiones

Esta práctica ha permitido aplicar los conceptos fundamentales de POO en Kotlin:

1. **Encapsulamiento:** Uso de modificadores de visibilidad (`private`, `val`/`var`)
2. **Constructores:** Implementación de constructores primarios y secundarios
3. **Validación:** Uso de `require()` y bloques `init` para validar datos
4. **Propiedades:** Implementación de getters y setters personalizados
5. **Métodos estáticos:** Uso de `companion object` para funcionalidad a nivel de clase
6. **Sobreescritura:** Implementación de `toString()` y `equals()`
7. **Manejo de excepciones:** Uso de `try-catch` para validaciones

Los ejercicios cubren desde conceptos básicos (Rectángulo) hasta implementaciones más complejas (Persona, Tiempo), demostrando una progresión adecuada en la dificultad.

## Referencias y Fuentes

- Documentación oficial de Kotlin: https://kotlinlang.org/docs/
- Apuntes de clase: U4: 2. POO I
- Ejemplos y ejercicios proporcionados por el profesor
