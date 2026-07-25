
package JavaOOPS;


public class Cat extends Animal {

    public Cat(String name, int eyes) {
        super(name, eyes);
    }
    
    @Override
    public void run() {
        System.out.println(name+" is running fast");
    }
    
    @Override
    public void eat() {
        System.out.println(name+" is eating fish");
    }
    
}
