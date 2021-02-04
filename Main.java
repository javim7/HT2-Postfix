//importando clases externas
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * @author Javier Mombiela Carne 20067
 * Implementacion de la hoja de Trabajo 02 Algoritmos
 * y Estructura de Datos - 2 de febrero 2021 - 
 * clase Main.java
 */
public class Main {

    
    /**
     * 
     * Metodo main  >>
     * Ejecuta el programa llamando a la funcion Main()
     * @param args Parametro utilizado por el metodo main del JDK
     * 
     */
    public static void main(String[] args) {

        //creando las instancias de clases
        Calculadora calcu = new Calculadora();


        //se utiliza un try catch para aseguranos que el archivo pueda ser leido correctamente 
        try{

            //creando variables
            File archivoTexto = new File("datos.txt"); //creando nuestro nuevo archivo

            Scanner scan = new Scanner(archivoTexto); //instanciando la clase scanner con el archivo

            String postfixObtenido = scan.nextLine(); //guardando el postfix como una variable

            System.out.println("\nPostfix obtenido: " + postfixObtenido + "\n"); //imprimiendo el postfix

            System.out.println("ENTRADA          OPERACION                                       PILA");

            //pasando el postfix al metodo Calcu 
            calcu.Calculo(postfixObtenido);

        } catch (FileNotFoundException errorArchivoNoEncontrado) {
            // Se le advierte al usuario que el archivo no es existente, se termina el programa.
            System.out.println("El archivo de texto datos.txt no ha sido encontrado.");
        }

    }
}
