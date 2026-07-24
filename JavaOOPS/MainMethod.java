package JavaOOPS;

public class MainMethod {

    public static void main(String[] args) {

        Animal2 elephant = new Animal2("Running", "plants", 2, "Jumbo", "an elephant");
        elephant.function();

        Animal2 cat = new Animal2("Running", "fish", 2, "Suzi", "a cat");
        cat.function();
        
        Animal2 spider = new Animal2("hunting", "ant", 8, "Spiderman", "a spider");
        spider.function();

    }
}
