public abstract class Animal {
    protected String food;

    protected Animal(String f) {
        this.food = f;
    }

    public void eat(){
        System.out.println("Jem " + food);
    }

    public abstract void makeNoise();
}
