package JavaOOPS;

public class MainMethod {

    public static void main(String[] args) {

        Elephant elephant = new Elephant("Jumbo", 2);
        
        elephant.details();
        elephant.run();
        elephant.eat();
        
        System.out.println();

        
        Cat cat = new Cat("Suzi", 2);
        
        cat.details();
        cat.run();
        cat.eat();
        
        System.out.println();
        
        Spider spider = new Spider("SpiderMan", 8);
        
        spider.details();
        spider.run();
        spider.eat();
    }       
}
