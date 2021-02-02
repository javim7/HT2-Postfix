/**
 * @author Javier Mombiela Carne 20067
 * Implementacion de la hoja de Trabajo 02 Algoritmos
 * y Estructura de Datos - 2 de febrero 2021 - 
 * clase Stack.java tiene las funciones de un stack
 */

public interface Stack<E> 
{

    /**
     * Metodo push
     * @param item Parametro para ver que item se agrega a la fila
     */
   public void push(E item);
   
   
    /**
     * Metodo pop, para remover el item de arriba del stack
     * @param 
     */
   public E pop();
   
    /**
     * Metodo peek, para ver el item de arriba del stack
     * @param 
     */
   public E peek();
  
    /**
     * Metodo empty, para ver si el stack esta vacio o no
     * @param 
     */
   public boolean empty();
   
    /**
     * Metodo size, para ver el tamano del stack
     * @param 
     */
   public int size();
   

}