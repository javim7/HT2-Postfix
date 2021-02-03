/**
 * @author Javier Mombiela Carne 20067
 * Implementacion de la hoja de Trabajo 02 Algoritmos
 * y Estructura de Datos - 2 de febrero 2021 - 
 * clase Calculadora.java implementa CalculadoraInt
 */
public class Calculadora implements CalculadoraInt {


     /**
     * Metodo para poder hacer las operaciones aritmeticas
     * @param num1 valor del primer int que se pushe a la stack
     * @param num2 valor del segundo int que se pusheo a la stack
     * @param aString //valor del postfix
     * @return valor el resultado de cualquier operacion calculada
     */
    @Override
    public Double Calcular(int num1, int num2, String aString) {

        //creando variable nula 
        Double resultado = null;
        //StackVector<Integer> pila = new StackVector<Integer>();

        //if para ver que tipo de operador es el que tenemos
        if(aString.equals("+")) {//viendo si el operador es suma

            int suma = num1 + num2; //realizando la suma
           // pila.push(suma); //pusheando el resultado a la pila
            System.out.println("+                Sumar: pop, pop y push del resultado             " + suma);
            resultado = Double.valueOf(suma);


        } if(aString.equals("*")) {//viendo si el operador es multiplicacion

            int multip = num1 * num2; //realizando la suma
           // pila.push(multip); //pusheando el resultado a la pila
            System.out.println("*                Multiplicarar: pop, pop y push del resultado     " + multip);
            resultado = Double.valueOf(multip);


        } if(aString.equals("-")) {//viendo si el operador es resta

            int resta = num1 - num2; //realizando la suma
            //pila.push(resta); //pusheando el resultado a la pila
            System.out.println("-                Restar: pop, pop y push del resultado           " + resta);
            resultado = Double.valueOf(resta);


        } if(aString.equals("/")) {//viendo si el operador es division

            int divis = num1 / num2; //realizando la suma
            //pila.push(divis); //pusheando el resultado a la pila
            System.out.println("/                Dividir: pop, pop y push del resultado          " + divis);
            resultado = Double.valueOf(divis);


        } 

        return resultado;
    }
    
}
