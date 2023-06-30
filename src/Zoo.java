import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animalList = new ArrayList<>();

    void addAnimal(Animal animal){
        animalList.add(animal);
    }

    void printDetails(){
        if (animalList == null || animalList.size() == 0){
            System.out.println("Errore: non ci sono animali.");
        } else {
            for(Animal animal : animalList){
                animal.printDetails();
            }
        }
    }

    public void filterByType(String type){
    boolean animalFound = false;


        for(Animal animal : animalList){
            if(animal.getType().equalsIgnoreCase(type)){
                animal.printDetails();
                animalFound = true;
            }
        }
        if(!animalFound){
            System.out.println("Errore: tipo di animale non trovato.");
        }
    }

    public void averageAge(String type){
        boolean animalFound = false;
        double somma = 0;
        double numeroAnimali = 0;

        for(Animal animal : animalList){
            if(animal.getType().equalsIgnoreCase(type)){
                numeroAnimali++;
                somma += animal.getAge();
                animalFound = true;
            }
        }
        if (animalFound) {
            somma /= numeroAnimali;
            System.out.println(somma);
        } else{
            System.out.println("Errore: tipo di animale non trovato.");
        }
    }




}
