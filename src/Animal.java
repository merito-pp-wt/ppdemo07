/**
 * Klasa reprezentująca zwierzę.
 * Klasa jest abstrakcyjna więc nie można tworzyć jej obiektów.
 */
public abstract class Animal {
    protected String food;

    protected Animal(String f) {
        this.food = f;
    }

    public void eat(){
        System.out.println("Jem " + food);
    }

    public String toString() {
        return "jem " + food;
    }

    /**
     * Metoda abstrakcyjna - nie zawiera żadnego kodu
     * MUSI być zdefiniowana w klasie podrzędnej.
     */
    public abstract void makeNoise();
}
