public class Dog extends Animal {
    private String name;

    /**
     * Konstruktor przygotowujący obiekt klasy Dog
     *
     * Pierwszą instrukcją jest wywołanie konstruktora klasy Animal.
     * Konstruktor klasy bazowej ZAWSZE musi pierwszym poleceniem
     * konstruktowa. W tym miejscu super() będzie zastąpione przez
     * Animal().
     *
     * @param n imię psa
     * @param f pożywienie
     */
    public Dog(String n, String f){
        super(f);
        name = n;
    }

    /**
     * Pies wydaje swoje odgłosy.
     */
    @Override
    public void makeNoise() {
        System.out.println(name + ": Hau! Hau!");
    }

    /**
     * Przedefiniowujemy metodę toString() z klasy Animal.
     *
     * Metody odziedziczone z klas nadrzędnych można użyć w dowolnym miejscu
     * metody.
     *
     * @return opis zwierzęcia
     */
    public String toString() {
        return "Jestem pies " + name + " " + super.toString();
    }
}
