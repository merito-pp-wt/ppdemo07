public class Dog extends Animal {
    private String name;

    public Dog(String n, String f){
        super(f);
        name = n;
    }

    @Override
    public void makeNoise() {
        System.out.println("Hau! Hau!");
    }
}
