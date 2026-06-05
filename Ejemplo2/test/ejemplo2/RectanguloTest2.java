

/* ESTA PAQUETE JAVA LLAMADA EJEMPLO2 SERA UTILIZADA PARA CAMBIAR LOS VALORES
Y VER LOS RESULTADOS QUE NOS MUESTRA. */

package ejemplo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest2 {

	@Test
	void test() {
		Rectangulo2 r = new Rectangulo2(5, 0);
		
		assertAll(
				() -> assertEquals(0, r.area()),
				() -> assertEquals(0, r.perimetro())	
		);
	}
}  