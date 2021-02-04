/**
 * @author Javier Mombiela Carne 20067
 * Implementacion de la hoja de Trabajo 02 Algoritmos
 * y Estructura de Datos - 2 de febrero 2021 - 
 * clase Calculadora.java implementa CalculadoraInt
 */
public class Calculadora implements CalculadoraInt {


     /**
     * Recibe el postfix y hace los calculos
     * @param Postfix Operacion que se analiza del archivo .txt
     * @return resultado retorna el resultado como una string
     */
    @Override
    public String Calculo(String expresion) {

        //creando la intancia de nuestra clase StackArraylist<E>
        StackVector<Integer> pila = new StackVector<Integer>();
        String resultado = null;

        //eliminando los espacios del postfix y guardandola como una nueva varaible
        String nuevoPostfix = expresion.replace(" ", "");

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
             catch (Exception e)  //separando los elementos que no son numeros
             { 

                //ya que hay una excecpcion, significa que tenemos un operador, por lo que tenemos que popear los dos numeros anteriores
                int num1 = pila.pop();
                int num2 = pila.pop();

                if(aString.equals("+")) {//viendo si el operador es suma

                    int suma = num1 + num2; //realizando la suma
                    pila.push(suma); //pusheando el resultado a la pila
                    System.out.println("+                Sumar: pop, pop y push del resultado             " + suma);
                   // resultado = Double.valueOf(suma);
        
        
                } if(aString.equals("*")) {//viendo si el operador es multiplicacion
        
                    int multip = num1 * num2; //realizando la suma
                    pila.push(multip); //pusheando el resultado a la pila
                    System.out.println("*                Multiplicarar: pop, pop y push del resultado     " + multip);
                   // resultado = Double.valueOf(multip);
        
        
                } if(aString.equals("-")) {//viendo si el operador es resta
        
                    int resta = num1 - num2; //realizando la suma
                    pila.push(resta); //pusheando el resultado a la pila
                    System.out.println("-                Restar: pop, pop y push del resultado           " + resta);
                    //resultado = Double.valueOf(resta);
        
        
                } if(aString.equals("/")) {//viendo si el operador es division
        
                    int divis = num1 / num2; //realizando la suma
                    pila.push(divis); //pusheando el resultado a la pila
                    System.out.println("/                Dividir: pop, pop y push del resultado          " + divis);
                    //resultado = Double.valueOf(divis);
        
        
                } 

                //obteniendo el resultado de los calculos al mandar los dos ints que se popearon y el postfix
                //int resultado = (int)Math.round(calcu.Calculo(num1, num2, aString));
                //pila.push(resultado); //se suma el resultado al stack para poder resolver el postfix

            }

        }

        //guardadno el peek como int asi tenemos el resultado final guardado
        int peek = pila.peek();
        //haciendo que el resultado se vuelva string y asi poder retornarlo
        resultado = Integer.toString(peek);

        //se finalizan las operaciones pero el resultado esta hasta arriba de la pila
        //se hace un peek para poder obtener dicho resultado
        System.out.println("\nResultado de (" + expresion + ") es: " + resultado + "\n");

        //retornando el resultado
        return resultado;
    }
    
}
