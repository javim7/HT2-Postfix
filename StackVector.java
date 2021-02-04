//importando clase de ArrayList
import java.util.ArrayList;


/**
 * @author Javier Mombiela Carne 20067
 * Implementacion de la hoja de Trabajo 02 Algoritmos
 * y Estructura de Datos - 2 de febrero 2021 - 
 * clase StackVector.java
 */
public class StackVector<E>
 implements Stack<E>, CalculadoraInt
{
	protected ArrayList<E> data;


    /**
     * Metodo para crear un stack vacio
     * @param 
     */
	public StackVector()
	{
		data = new ArrayList<E>();
	}


    /**
     * Metodo para agregar un nuevo item al tope del stack
     * @param item
     */
    @Override
	public void push(E item)
	{
		data.add(item);
	}

    /**
     * Metodo para remover el item de hasta arriba
     * @param 
     */
    @Override
	public E pop()
	{
		return data.remove(size()-1);
	}

    /**
     * Metodo para ver el elemento de hasta arriba
     * @param 
     * @return el elemento de hasta arriba de la stack
     */
    @Override
	public E peek()
	{
		return data.get(size() - 1);
	}
    
    /**
     * Metodo para ver el tamano del stack
     * @param 
     * @return un int con el numero de elementos en el stack
     */
    @Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
    /**
     * Metodo para ver si el stack esta vacio o no
     * @param 
     * @return se retorna true si stack esta vacia
     */
    @Override
	public boolean empty()
	
	{
		return size() == 0;
	}

    @Override
    public String Calculo(String Postfix) {
        // TODO Auto-generated method stub
        return null;
    }
}