package ejemplo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    void test() {
        Rectangle r = new Rectangle(3, 4);

        assertAll(
                () -> assertEquals(12, r.surface()),
                () -> assertEquals(14, r.perimeter())
        );
    }
}