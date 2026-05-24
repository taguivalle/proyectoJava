package com.gustavo;

// ============================================
// CLASE: Fundamentos
// Propósito: Explicación detallada sobre 
// programas, algoritmos, hardware/software y tipos de código
// ============================================

public class Fundamentos {

        public static void main(String[] args) {

                // ============================================
                // SECCIÓN 1: Concepto de Programa Informático
                // ============================================
                System.out.println("=== CONCEPTO DE PROGRAMA INFORMÁTICO ===\n");

                System.out.println("""
                                Los ordenadores son un conjunto de elementos de hardware altamente
                                complejos, comunicados entre sí por medio de circuitos. Para llevar
                                a cabo sus funciones, necesitan programas que les indiquen qué hacer
                                de forma ordenada.
                                """);

                System.out.println("""
                                Un programa es capaz de realizar tres tipos de operaciones:
                                  1. Aritméticas.
                                  2. Lógicas (comparación de valores).
                                  3. Almacenar la información.
                                """);

                System.out.println("""
                                Definición: Un conjunto de órdenes que se ejecutan en el ordenador
                                para conseguir un objetivo. Estas órdenes se proporcionan a través
                                de un código, mediante algoritmos escritos en un lenguaje de
                                programación.
                                """);

                // ============================================
                // SECCIÓN 2: Algoritmo vs Programa
                // ============================================
                System.out.println("\n=== ALGORITMO VS PROGRAMA ===\n");

                System.out.println("""
                                Algoritmo: Conjunto de procedimientos con los que, al ser procesados,
                                se consigue una acción. Pueden estar compuestos por textos, números
                                o símbolos.
                                """);

                System.out.println("""
                                Programa: Conjunto de instrucciones que procesa un ordenador con el
                                fin de obtener un resultado. Es la expresión de uno o más algoritmos
                                codificados en un lenguaje de programación.
                                """);

                // ============================================
                // SECCIÓN 3: Hardware y Software
                // ============================================
                System.out.println("\n=== HARDWARE Y SOFTWARE ===\n");

                System.out.println("""
                                Hardware: Elementos físicos (microprocesador, RAM, disco duro) que
                                realizan operaciones mediante impulsos eléctricos.
                                """);

                System.out.println("""
                                Software: Instrucciones que indican al hardware qué tareas realizar.
                                El hardware necesita del software para funcionar.
                                """);

                System.out.println("""
                                Estructura funcional:
                                  - Entrada: Periféricos para introducir datos.
                                  - Procesamiento: CPU realiza cálculos.
                                  - Salida: Periféricos para mostrar resultados.
                                """);

                // ============================================
                // SECCIÓN 4: Lenguajes de Programación y Ejemplo Ensamblador
                // ============================================
                System.out.println("\n=== LENGUAJES DE PROGRAMACIÓN ===\n");

                System.out.println("""
                                El ordenador trabaja en base 2 (binario: 1 y 0). Para los humanos,
                                es difícil codificar directamente en binario.
                                """);

                System.out.println("""
                                Lenguaje Ensamblador: Usa instrucciones directas del microprocesador.
                                Es de bajo nivel y difícil de codificar, pero permite comunicación
                                directa con el hardware.
                                """);

                System.out.println("--- EJEMPLO: Imprimir '¡Hola mundo!' en Ensamblador (MS-DOS) ---\n");

                // Mostramos el código ensamblador como texto formateado
                System.out.println("""
                                STACK     SEGMENT STACK      ; Segmento de pila
                                DW     64 DUP (?)            ; Define espacio en la pila
                                STACK     ENDS               ; Segmento de datos

                                SALUDO DB    "!Hola mundo!",13,10,"$" ; Cadena
                                DATA      ENDS

                                CODE      SEGMENT ; Segmento de Código
                                ASSUME CS:CODE, DS:DATA, SS:STACK

                                INICIO:                      ; Punto de entrada al programa
                                MOV  AX,DATA                ; Pone dirección en AX
                                MOV  DS,AX           ;Pone la dirección en los registros
                                MOV  DX,OFFSET SALUDO    ; Obtiene dirección del mensaje
                                MOV  AH,09H       ; Función: Visualizar cadena
                                INT     21H       ; Servicio: Funciones alto nivel DOS

                                MOV  AH,4CH               ; Función: Terminar
                                INT     21H

                                CODE      ENDS
                                END  INICIO           ; Marca fin y define INICIO
                                """);

                System.out.println("\n--- COMPARACIÓN: La misma tarea en Java ---\n");

                System.out.println("""
                                En Java, la misma operación es mucho más simple y legible:

                                public class HolaMundo {
                                    public static void main(String[] args) {
                                        System.out.println("!Hola mundo!");
                                    }
                                }
                                """);

                System.out.println("""
                                Observa la diferencia:
                                  - En Ensamblador: ~15 líneas, manejo de registros, segmentos y llamadas al sistema.
                                  - En Java: 4 líneas, abstracción total del hardware.
                                """);

                // ============================================
                // SECCIÓN 5: Tipos de Software
                // ============================================
                System.out.println("\n=== TIPOS DE SOFTWARE ===\n");

                System.out.println("""
                                1. Sistema Operativo: Intermediario entre hardware, aplicaciones y
                                   usuario. Gestiona recursos y periféricos.
                                """);

                System.out.println("""
                                2. Aplicaciones: Programas con funciones específicas instaladas en
                                   el ordenador (navegadores, editores, juegos).
                                """);

                System.out.println("""
                                3. Drivers (Controladores): Programas que indican al sistema operativo
                                   cómo operar con periféricos específicos (impresoras, tarjetas gráficas).
                                """);

                // ============================================
                // SECCIÓN 6: Código Fuente, Objeto y Ejecutable
                // ============================================
                System.out.println("\n=== CICLO DE VIDA DEL CÓDIGO ===\n");

                System.out.println("""
                                Código Fuente: Instrucciones escritas por el programador en un
                                lenguaje legible (Java, C++). Debe ser fácil de leer, tener
                                comentarios y ser flexible.
                                """);

                System.out.println("""
                                Código Objeto: Traducción del código fuente a código máquina (binario).
                                El ordenador lo entiende mejor, pero aún necesita ser enlazado.
                                """);

                System.out.println("""
                                Código Ejecutable: Archivo final (.exe, .class) listo para ser
                                ejecutado por el Sistema Operativo. Es el resultado de compilar
                                y enlazar el código objeto.
                                """);

                System.out.println("""
                                Nota importante: El 80% de la vida útil de un software se produce
                                en la fase de mantenimiento.
                                """);

                System.out.println("\n--- Fin de la sección Fundamentos ---");
        }
}