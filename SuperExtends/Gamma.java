
package SuperExtends;


public class Gamma extends Beta {

    String effect;

    Gamma(String radiationType,
          int penetrationLevel,
          String shield,
          String effect) {

        super(radiationType, penetrationLevel, shield);
        this.effect = effect;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Effect: " + effect);
    }
}
