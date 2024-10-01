package com.nicolasgarcia.clases;

public class Algoritmo {
    
    // Método estático que verifica si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    // Método estático que verifica si un número es primo
    public static boolean esPrimo(int numero) {
        if(numero <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Método estático que retorna el String en reversa
    public static String stringEnReversa(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    
    // Método estático que verifica si un String es un palíndromo
    public static boolean esPalindromo(String texto) {
        String reversa = stringEnReversa(texto);
        return texto.equals(reversa);
    }
    
    // Método estático que genera la secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int numero) {
        for(int i = 1; i <= numero; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}