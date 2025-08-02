package basic.c00_helloworld;;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/

public class HelloWorldExercises {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
    System.out.println("Juan López");
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
    System.out.println("Hola\nMundo"); 
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
    // Imprimen por pantalla en una y 2 lineas
        // 4. Crea un comentario en varias líneas.
    /* Este 
     * es 
     * un 
     * comentario
     * en 
     * varias
     * lineas */
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
    System.out.println(" Mi edad es 52 \n Mi color favorito el Azul \n Mi ciudad natal Oviedo");
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
    System.err.println("Esto es un mensaje de error");
    
        // 7. Utiliza varios println para imprimir una frase.
    System.out.println("Este es un ejemplo  ");
    System.out.println("de como se escribe  ");
    System.out.println("una frase en varias ");
    System.out.println("lineas con println. ");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
    System.out.println("  _____  ");
    System.out.println(" /     \\ ");
    System.out.println("|  o o  |");
    System.out.println("|   ^   |");
    System.out.println("|  \\_/  |");
    System.out.println(" \\_____/ ");

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
    // Error: Main method not found in class HelloWorldExercises, please define the main method as:
    // public static void main(String[] args)

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    /*  OtraClase.java:1: error: class HelloWorldExercises is public, 
     	should be declared in a file named HelloWorldExercises.java
		public class HelloWorldExercises {
	*/

    }
}
