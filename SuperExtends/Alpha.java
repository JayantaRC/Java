
package SuperExtends;


public class Alpha {

    String radiationType;
    int penetrationLevel;

    Alpha(String radiationType, int penetrationLevel) {
        this.radiationType = radiationType;
        this.penetrationLevel = penetrationLevel;
    }

    void display() {
        System.out.println("Radiation Type: " + radiationType);
        System.out.println("Penetration Level: " + penetrationLevel);
    }
}
