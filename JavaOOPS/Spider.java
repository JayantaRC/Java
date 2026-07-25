
package JavaOOPS;


public class Spider extends Animal {
    
    public Spider(String name, int eyes) {
        super(name, eyes);
    }
    
    public void run() {
        System.out.println(name+" is crawling");
    }
    
    public void eat() {
        System.out.println(name+" is eating ants");
    }
    
}
