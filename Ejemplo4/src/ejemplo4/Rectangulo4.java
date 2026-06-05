package ejemplo4;

/**
 * Representa un rectángulo definido por su ancho y su alto.
 *
 * @author Manuel García García
 * @version 1.0
 */
public class Rectangulo4 {

    private int ancho;
    private int alto;

    /**
     * Crea un rectángulo con las dimensiones indicadas.
     *
     * @param ancho ancho del rectángulo
     * @param alto alto del rectángulo
     */
    public Rectangulo4(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Calcula el área del rectángulo.
     *
     * @return área del rectángulo
     */
    public int area() {
        return ancho * alto;
    }

    /**
     * Calcula el perímetro del rectángulo.
     *
     * @return perímetro del rectángulo
     */
    public int perimetro() {
        return 2 * ancho + 2 * alto;
    }
}
