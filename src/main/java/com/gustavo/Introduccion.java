package com.gustavo;

// ============================================
// CLASE: Introduccion
// Propósito: Guía introductoria sobre Java y
// conceptos fundamentales de programación
// ============================================

public class Introduccion {

        public static void main(String[] args) {

                // ============================================
                // SECCIÓN 1: ¿Qué es el software?
                // ============================================
                System.out.println("=== INTRODUCCIÓN AL SOFTWARE ===\n");

                System.out.println("""
                                Un software podemos verlo como una herramienta que nos sirve para
                                realizar nuestro trabajo, facilitarnos la búsqueda de información
                                o simplemente tener un tiempo de ocio. Son muchas las cosas que
                                hoy hacemos gracias a los programas informáticos, ya sea desde
                                nuestros ordenadores o dispositivos móviles.
                                """);

                System.out.println("""
                                Existen muchos tipos de software, unos se instalan localmente en
                                nuestros ordenadores, otros funcionan bajo un servidor con el que
                                accedemos por medio de un navegador.
                                """);

                System.out.println("""
                                Pero las preguntas que nos planteamos en esta unidad son:
                                  - ¿Qué hay detrás de estos programas?
                                  - ¿Cómo se construyó esta aplicación?
                                """);

                System.out.println("""
                                Está claro que hay un gran trabajo detrás de cada pantalla,
                                cuando pulsamos un botón.
                                """);

                System.out.println("""
                                Todo proyecto de software tiene un ciclo de vida para
                                desarrollarse y consta de una serie de pasos que se van
                                completando en diferentes tiempos.
                                """);

                System.out.println("""
                                Este ciclo de desarrollo depende directamente de la
                                metodología que utilizamos para el mismo, y no es más que
                                una estrategia que debemos seguir.
                                """);

                // ============================================
                // SECCIÓN 2: Variables y Tipos de Datos
                // ============================================
                System.out.println("\n=== VARIABLES Y TIPOS DE DATOS ===\n");

                System.out.println("""
                                En Java, una variable es un espacio en memoria donde almacenamos
                                información. Cada variable tiene un tipo que define qué clase de
                                datos puede guardar.
                                """);

                System.out.println("""
                                Tipos de datos primitivos más comunes:
                                  - int: números enteros (ej: 25, -10)
                                  - double: números decimales (ej: 3.14, -2.5)
                                  - char: un solo carácter (ej: 'A', 'z')
                                  - boolean: verdadero o falso (true/false)
                                  - String: texto (ej: "Hola mundo")
                                """);

                System.out.println("""
                                Ejemplo de declaración:
                                  int edad = 25;
                                  double precio = 19.99;
                                  String nombre = "Juan";
                                  boolean activo = true;
                                """);

                // ============================================
                // SECCIÓN 3: Operadores
                // ============================================
                System.out.println("\n=== OPERADORES ===\n");

                System.out.println("""
                                Los operadores nos permiten realizar operaciones con variables.
                                """);

                System.out.println("""
                                Operadores aritméticos:
                                  +  Suma
                                  -  Resta
                                  *  Multiplicación
                                  /  División
                                  %  Módulo (resto de división)
                                """);

                System.out.println("""
                                Operadores de comparación:
                                  ==  Igualdad
                                  !=  Desigualdad
                                  >   Mayor que
                                  <   Menor que
                                  >=  Mayor o igual
                                  <=  Menor o igual
                                """);

                System.out.println("""
                                Operadores lógicos:
                                  &&  AND (y)
                                  ||  OR (o)
                                  !   NOT (no)
                                """);

                // ============================================
                // SECCIÓN 4: Estructuras de Control
                // ============================================
                System.out.println("\n=== ESTRUCTURAS DE CONTROL ===\n");

                System.out.println("""
                                Las estructuras de control permiten tomar decisiones y repetir
                                acciones en nuestro programa.
                                """);

                System.out.println("""
                                Condicionales (if-else):
                                  if (edad >= 18) {
                                      System.out.println("Eres mayor de edad");
                                  } else {
                                      System.out.println("Eres menor de edad");
                                  }
                                """);

                System.out.println("""
                                Bucles (loops):
                                  - for: cuando sabemos cuántas veces repetir
                                  - while: mientras una condición sea verdadera
                                  - do-while: ejecuta al menos una vez, luego repite
                                """);

                System.out.println("""
                                Ejemplo de bucle for:
                                  for (int i = 0; i < 5; i++) {
                                      System.out.println("Iteración número: " + i);
                                  }
                                """);

                // ============================================
                // SECCIÓN 5: Métodos (Funciones)
                // ============================================
                System.out.println("\n=== MÉTODOS ===\n");

                System.out.println("""
                                Un método es un bloque de código que realiza una tarea específica
                                y puede ser reutilizado varias veces.
                                """);

                System.out.println("""
                                Ventajas de usar métodos:
                                  - Reutilización de código
                                  - Mejor organización
                                  - Más fácil de depurar
                                  - Código más legible
                                """);

                System.out.println("""
                                Ejemplo de método:
                                  public static int sumar(int a, int b) {
                                      return a + b;
                                  }

                                  // Uso:
                                  int resultado = sumar(5, 3);  // resultado = 8
                                """);

                // ============================================
                // SECCIÓN 6: Clases y Objetos
                // ============================================
                System.out.println("\n=== CLASES Y OBJETOS ===\n");

                System.out.println("""
                                Java es un lenguaje orientado a objetos. Todo en Java está
                                relacionado con clases y objetos.
                                """);

                System.out.println("""
                                - Clase: Es como un plano o plantilla (ej: "Coche")
                                - Objeto: Es una instancia concreta de una clase (ej: "Mi Toyota rojo")
                                """);

                System.out.println("""
                                Ejemplo básico:
                                  public class Coche {
                                      String marca;
                                      String modelo;

                                      public void arrancar() {
                                          System.out.println("El coche está arrancando");
                                      }
                                  }

                                  // Crear objeto:
                                  Coche miCoche = new Coche();
                                  miCoche.arrancar();
                                """);

                // ============================================
                // SECCIÓN 7: Conclusión
                // ============================================
                System.out.println("\n=== CONCLUSIÓN ===\n");

                System.out.println("""
                                Has recorrido los conceptos fundamentales de Java:
                                  1. Introducción al software
                                  2. Variables y tipos de datos
                                  3. Operadores
                                  4. Estructuras de control
                                  5. Métodos
                                  6. Clases y objetos
                                """);

                System.out.println("""
                                Estos son los cimientos sobre los que se construyen programas
                                más complejos. La práctica constante es la clave para dominar
                                cualquier lenguaje de programación.
                                """);

                System.out.println("""
                                ¡Sigue aprendiendo y experimentando!
                                """);
        }
}