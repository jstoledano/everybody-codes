# Everybody Codes

Soluciones en Java a las quests de Everybody Codes, organizadas por año, quest y parte.

## Requisitos

- JDK 21.
- Eclipse con soporte para Java.
- JUnit 5 para los tests; el JAR está incluido en `lib/`.

Importa el proyecto en Eclipse con **File → Import → General → Existing Projects into Workspace**. Si Eclipse no reconoce el JRE configurado, selecciona tu JDK 21 en **Properties → Java Build Path → Libraries**.

## Estructura

```text
src/org/toledano/
├── cli/Main.java          # Ejecuta las soluciones con las notes
├── shared/                # Utilidades compartidas
└── y2024/Quest01.java      # Soluciones por año y quest
test/org/toledano/         # Tests con JUnit
resources/y2024/quest01/
└── part1.txt              # Notes de cada parte
lib/                      # Dependencia de JUnit
bin/                      # Archivos compilados, ignorados por Git
```

Los siguientes años siguen la misma estructura: `y2025`, `y2026`, etc.

## Resolver una quest

1. Implementa la solución en la clase del año y quest correspondiente. El ejecutor actual recibe métodos estáticos que aceptan un `String` y devuelven un `int`, como `Quest01.part1(String)`.
2. Guarda las notes en `resources/yAAAA/questQQ/partP.txt`, con dos dígitos para la quest. Cada parte tiene su propio archivo.
3. Añade una llamada a `solve` dentro de `Main.main()`:

   ```java
   solve(2024, 1, 1, org.toledano.y2024.Quest01::part1);

   // Añade estas llamadas cuando hayas implementado los métodos:
   // solve(2024, 1, 2, org.toledano.y2024.Quest01::part2);
   // solve(2025, 1, 1, org.toledano.y2025.Quest01::part1);
   ```

4. Ejecuta `Main.java` con **Run As → Java Application**. Usa la raíz del proyecto como directorio de trabajo para que se encuentren los archivos.

Cada llamada indica el año, la quest, la parte y el método que la resuelve. `solve` construye la ruta, lee las notes, elimina los espacios y saltos de línea de los extremos con `strip()` y muestra el resultado en la consola. Se ejecutan todas las llamadas activas en `main()`; comenta las que no quieras ejecutar.

## Tests

Ejecuta una clase de `test/` con **Run As → JUnit Test**. Usa ejemplos con resultados conocidos para comprobar las soluciones y `Main` para obtener la respuesta de las notes reales. Una respuesta aceptada por el sitio puede añadirse después como prueba de regresión.
