package JavaOOPS;
//name, eyes, run, eat

public class Animal {

    String name;
    int eyes;

    public Animal(String name, int eyes) {
        this.name = name;
        this.eyes = eyes;
    }
    
    public void details() {
        
        System.out.println("This animal has a name \"" + name + "\"");
        System.out.println(name + " has " + eyes + " eyes");
    }
    
    public void run() {
        System.out.println(name + " is moving");
        
    }
    
    public void eat() {
        System.out.println(name + " is eating grass, plants");
    }

}
