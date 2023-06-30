public class Animal {
    private final String name;
    private final String color;
    private final String type;
    private int age;

    public Animal(String name, String color, String type, int age) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printDetails(){
        String formattedString = "Animal's name: %s\nAnimal's color: %s\nAnimal's type: %s\nAnimal's age: %d\n";

        System.out.printf((formattedString) + "%n", name, color, type, age);
    }
}
