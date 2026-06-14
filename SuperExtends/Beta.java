
package SuperExtends;


public class Beta extends Alpha {

    String shield;

    Beta(String radiationType, int penetrationLevel, String shield) {
        super(radiationType, penetrationLevel);
        this.shield = shield;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Shield: " + shield);
    }
}
