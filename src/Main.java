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
        d = (Dog)animal;                 // nie każde zwierzę jest psem, ale wymuszamy operację przypisania (rzutujemy)
        d.eat();
        d.makeNoise();

        Hippo hippo = new Hippo("warzywa");
        hippo.eat();
        hippo.makeNoise();
        System.out.println(hippo);
        
        animal = hippo;
        animal.eat();
        animal.makeNoise();
        System.out.println(animal);

        Hippo h;
        h = (Hippo)animal;
        // d = (Dog)animal;              // usuń komentarz żeby zobaczyć co dzieje się przy niepoprawnym rzutowaniu
    }
}
