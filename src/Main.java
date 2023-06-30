public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Micino","Bianco","Gatto",3);
        Animal animal2 = new Animal("Fuffi","Nero","Cane",5);
        Animal animal3 = new Animal("Luna","Arancione","Cane",7);

        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        zoo1.addAnimal(animal3);

        zoo1.filterByType("gatto");

        zoo1.averageAge("cane");
    }
}
