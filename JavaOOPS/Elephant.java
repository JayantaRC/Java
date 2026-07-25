
package JavaOOPS;


public class Elephant extends Animal {

    public Elephant(String name, int eyes) {
        super(name, eyes);
    }
    
    @Override
    public void run() {
        System.out.println(name + " is walking slowly");
    }
    
    @Override
    public void eat() {
        System.out.println(name+" is eating");
    }
    
}
