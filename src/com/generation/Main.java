package com.generation;

public class Main {

    public static void main(String[] args) {
	// const edad = 31;
        String nombre = "Javier Eduardo";
        byte num1 = 10;


        short num2 = 10;
        int num3 = 10;
        long num4 = 10;

        //datos primitivos decimales
        float decimal1 = 10.1234534f; //Decimal siempre debe agregar una "f" al final
        double decimal2 = 10.121231231241246d; //doucle necesita agregar "d" al final

        //datos primitivos char
        char caracter = 'a';

        //dato primitivo boolean
        boolean verdadero = true;

        //sucesion de numeros (automatica)

        short numShort1 = num1; // Se puede cambiar segun la cadena de sucesion
        int numInt1 = numShort1; //Se puede de descendente a ascendente
        // short numShort2 = numInt1; No se puede de ascendente a descendente

        //sucesion de numeros reversa (no automatica)
        short numShort2 = (short) numInt1;
        System.out.println(numShort2 + "   " + num1);

        byte numByte1 = 120;
        byte numByte2 = 120;
        // byte suma = numByte1 + numByte2; Error por que se desborda
        // short suma = numByte1 + numByte2; Error se necesita parcear
        short suma = (short)(numByte1 + numByte2);
        System.out.println("La suma es " + suma);

        //operadores aritmeticos en Java
        // + Sumar o concatenar cademas
        // - Restar
        // * Multiplicar
        // / Dividir
        // % Residuo

        //Declarar variables, hacer las operaciones basicas e imprimir por consola
        short primero = 999;
        short segundo = 454;

        short suma1 = (short) (primero + segundo);
        short resta1 = (short) (primero - segundo);
        int multiplicacion1 = primero * segundo;
        float dividir1 = (float)primero / segundo;
        System.out.println("///////////////////////////");
        System.out.println("Los numeros  son " + primero + " y " + segundo);
        System.out.println("Suma = " + suma1);
        System.out.println("Resta = " + resta1);
        System.out.println("Multiplicacion = " + multiplicacion1);
        System.out.println("Division = " + dividir1);

    }
}
