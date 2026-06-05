package ejemplo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Rectangulo4.
 *
 * @author Manuel García García
 * @version 1.0
 */
public class RectanguloTest4 {

    /**
     * Comprueba que el cálculo del área y del perímetro
     * de un rectángulo es correcto.
     */
    @Test
    void test() {
        Rectangulo4 r = new Rectangulo4(3, 4);

        assertAll(
                () -> assertEquals(12, r.area()),
                () -> assertEquals(14, r.perimetro())
        );
    }
}