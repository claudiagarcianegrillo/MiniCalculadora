/**
 * Clase que nos proporciona operaciones matemáticas como son
 * la raíz cuadrada y el valor absoluto
 *
 * @author Claudia Garcia
 * @version 1.0
 * @since 1.0
 */

public class MiniCalculadora {

    /**
     * Calcula la raíz cuadrada de un número
     *
     * @param numero Número del cual se desea obtener la raíz cuadrada
     * @return Nos devuelve la raíz cuadrada del número que hayamos introducido
     * @see Math#sqrt(double)
     * @throws IllegalArgumentException Por si el número es negativo
     */

    public double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

}
