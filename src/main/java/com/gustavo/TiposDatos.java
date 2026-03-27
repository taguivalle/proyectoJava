package com.gustavo;

public class TiposDatos {

    public static void main(String[] args) {

        // === TIPOS DE DATOS EN JAVA ===

        // 1. NÚMEROS ENTEROS
        int edad = 35;
        int cantidadEmpleados = 150;

        // 2. NÚMEROS CON DECIMALES
        double salario = 2500.75;
        @SuppressWarnings("unused")
        double precioProducto = 19.99;

        // 3. TEXTO
        String nombreEmpresa = "Mi Empresa S.A.";
        String direccion = "Calle Principal 123";

        // 4. UN SOLO CARÁCTER
        char categoria = 'A';
        @SuppressWarnings("unused")
        char piso = '3';

        // 5. VALORES LÓGICOS (TRUE/FALSE)
        boolean empresaActiva = true;
        boolean tieneParking = false;

        // === MOSTRAR TODOS LOS DATOS ===
        System.out.println("=== DATOS DE LA EMPRESA ===");
        System.out.println("Nombre: " + nombreEmpresa);
        System.out.println("Dirección: " + direccion);
        System.out.println("Cantidad de empleados: " + cantidadEmpleados);
        System.out.println("Edad promedio: " + edad + " años");
        System.out.println("Salario promedio: $" + salario);
        System.out.println("Categoría: " + categoria);
        System.out.println("¿Empresa activa?: " + empresaActiva);
        System.out.println("¿Tiene parking?: " + tieneParking);
    }
}