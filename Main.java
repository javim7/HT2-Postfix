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

    
    /**
     * Metodo que se encarga de verificar si el elemento es un digito o no
     * Hace las operaciones en base a que tipo de elementos son
     * @param Postfix Operacion que se analiza del archivo .txt
     */
    public static void Calcu(String Postfix) { //creando el metodo Calcu para poder hacer las operaciones

        //creando la intancia de nuestra clase StackArraylist<E>
        StackArrayList<Integer> pila = new StackArrayList<Integer>();

        //eliminando los espacios del postfix y guardandola como una nueva varaible
        String nuevoPostfix = Postfix.replace(" ", "");

        //creando un for loop para poder iterar toda la string y verificar los elementos dentro de la misma
        for(int i = 0; i < nuevoPostfix.length(); i++) {

            String aString = Character.toString(nuevoPostfix.charAt(i)); //convirtiendo el char a string

             //haciendo un try catch para poder ver si los elementos son integers o no
             try 
             { 
                 //si el elemento es un entero, se pushea a la pila
                 pila.push(Integer.parseInt(aString));
                 if(i==0) {
                    System.out.println(aString + "                Push Operando                                    " + aString);
                 } else {
                    System.out.println(aString + "                Push Operando                                    "  +  Character.toString(nuevoPostfix.charAt(i-1)) + "," + aString);
                 }
                 
                 
             }  
             catch (Exception e)  //separando los elementos que no son enteros
             { 

                //ya que hay una excecpcion, significa que tenemos un operador, por lo que tenemos que popear los dos numeros anteriores
                int num1 = pila.pop();
                int num2 = pila.pop();
                
                //if para ver que tipo de operador es el que tenemos
                if(aString.equals("+")) {//viendo si el operador es suma

                    int suma = num1 + num2; //realizando la suma
                    pila.push(suma); //pusheando el resultado a la pila
                    System.out.println("+                Sumar: pop, pop y push del resultado             " + suma);

                } if(aString.equals("*")) {//viendo si el operador es multiplicacion

                    int multip = num1 * num2; //realizando la suma
                    pila.push(multip); //pusheando el resultado a la pila
                    System.out.println("*                Multiplicarar: pop, pop y push del resultado     " + multip);


                } if(aString.equals("-")) {//viendo si el operador es resta

                    int resta = num1 - num2; //realizando la suma
                    pila.push(resta); //pusheando el resultado a la pila
                    System.out.println("-                Restar: pop, pop y push del resultado           " + resta);


                } if(aString.equals("/")) {//viendo si el operador es division

                    int divis = num1 / num2; //realizando la suma
                    pila.push(divis); //pusheando el resultado a la pila
                    System.out.println("/                Dividir: pop, pop y push del resultado          " + divis);


                } 

            }

        }

        //se finalizan las operaciones pero el resultado esta hasta arriba de la pila
        //se hace un peek para poder obtener dicho resultado
        System.out.println("\nResultado de (" + Postfix + ") es: " + pila.peek() + "\n");


    }
    
}
