public class Main {
    public static void main(String[] args) {
        Dog reks = new Dog("Reks", "mięso");

        System.out.println(reks);
        reks.eat();
        reks.makeNoise();

        Animal animal = reks;            // każdy Pies JEST Zwierzęciem (Dog IS Animal)
        System.out.println(animal);
        animal.eat();                    // metoda klasy Dog
        animal.makeNoise();              // metoda klasy Dog

        Dog d;
        d = (Dog)animal;                 // nie każde zwierzę jest psem, ale wymuszamy (rzutujemy)
        d.eat();
        d.makeNoise();

        Hippo hippo = new Hippo("warzywa");
        hippo.makeNoise();
        animal = hippo;
        animal.makeNoise();

        Hippo h;
        h = (Hippo)animal;
        d = (Dog)animal;
    }
}