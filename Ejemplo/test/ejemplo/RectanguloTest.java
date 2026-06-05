package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 public class RectanguloTest {

	@Test
	void test() {
		Rectangulo r = new Rectangulo(3, 4);
		
		assertAll(
				() -> assertEquals(12, r.area()),
				() -> assertEquals(14, r.perimetro())	
		);
	}

}
