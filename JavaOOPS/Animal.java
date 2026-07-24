package JavaOOPS;
//name, eyes, run, eat

public class Animal {

    int eyes;
    String name;
    String creature;

    public Animal(int eyes, String name, String creature) {
        this.eyes = eyes;
        this.name = name;
        this.creature = creature;
    }

    public void details() {
        System.out.println("This animal which is " + creature + " has a name \"" + name + "\"");
        System.out.println(name + " has " + eyes + " eyes");
    }

}
