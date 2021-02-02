//importando clases externas
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Calculadora {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        //se utiliza un try catch para aseguranos que el archivo pueda ser leido correctamente 
        try{

            File archivoTexto = new File("datos.txt"); //creando nuestro nuevo archivo

            Scanner scan = new Scanner(archivoTexto); //instanciando la clase scanner con el archivo

            String postfixobtenido = scan.nextLine(); //guardando el postfix como una variable

            System.out.println("\nPostfix obtenido: " + postfixobtenido + "\n"); //imprimiendo el postfix

            System.out.println("ENTRADA          OPERACION                                       PILA");

            //pasando el postfix al metodo Calcu 
            Calcu(postfixobtenido);

        } catch (FileNotFoundException errorArchivoNoEncontrado) {
            // Se le advierte al usuario que el archivo no es existente, se termina el programa.
            System.out.println("El archivo de texto datos.txt no ha sido encontrado.");
        }

    }