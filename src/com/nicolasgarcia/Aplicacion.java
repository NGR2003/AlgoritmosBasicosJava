package com.nicolasgarcia;

import com.nicolasgarcia.clases.Algoritmo;

public class Aplicacion {
	public static void main(String args[]) {
		System.out.println(Algoritmo.esPar(4)); 
        System.out.println(Algoritmo.esPar(5)); 
        
        System.out.println(Algoritmo.esPrimo(7)); 
        System.out.println(Algoritmo.esPrimo(6)); 
        
        System.out.println(Algoritmo.stringEnReversa("hola")); 
        System.out.println(Algoritmo.stringEnReversa("anita")); 
        
        System.out.println(Algoritmo.esPalindromo("roma")); 
        System.out.println(Algoritmo.esPalindromo("anita")); 
        
        Algoritmo.secuenciaFizzBuzz(15);
	}
}
