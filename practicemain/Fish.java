
package com.mycompany.practicemain;

public class Fish extends Animal{
    
    private int gills;
    private int fins;

    public Fish(int gills, int fins, String type, double weight) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }
    
    private void moveMuscles() {
        System.out.print("muscles moving ");
    }
    
    private void moveBackFin() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" + "gills=" + gills + ", fins=" + fins + '}';
    }
    
    
}
