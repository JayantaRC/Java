package JavaOOPS;

public class Animal2 extends Animal {

    String run;
    String eat;

    public Animal2(String run, String eat, int eyes, String name, String creature) {
        super(eyes, name, creature);
        this.run = run;
        this.eat = eat;
    }

    public void function() {
        super.details();
        System.out.println(name + " is " + run);
        System.out.println(name + " is eating " + eat);
    }

}
