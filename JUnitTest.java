// importando clases externas para que funcionen las pruebas
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * @author Javier Mombiela Carne 20067
 * Implementacion de la hoja de Trabajo 02 Algoritmos
 * y Estructura de Datos - 2 de febrero 2021 - 
 * clase Calculadora.java implementa CalculadoraInt
 */
public class JUnitTest {

    // Instancias de la clase Calculadora y StackVector.
    Calculadora calcu = new Calculadora();
    StackVector<Integer> pila = new StackVector<Integer>();

    // test 1 calculadora
    @Test
    public void pruebaCalcu1() {
        assertEquals(calcu.Calculo("1 2 + 4 * 3 +"), "15");
    }

    // test 2 calculadora
    @Test
    public void pruebaCalcu2() {
        assertEquals(calcu.Calculo("5 7 + 2 *"), "24");
    }

    // Test de  push y size
    @Test
    public void testPila1() {
        pila.push(7);
        assertEquals(pila.size(), 1);
    }

    // Test push y pop
    @Test
    public void testPila2() {
        pila.push(8);
        assertEquals(pila.pop(), 8);
    }

    // Test de push y peek
    @Test
    public void testPila3() {
        pila.push(5);
        assertEquals(pila.peek(), 5);
    }

}