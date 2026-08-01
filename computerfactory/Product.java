package com.mycompany.computerfactory;

public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}

class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(int size, String resolution, String model, String manufacturer) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {

        System.out.println(String.format("Drawing pixel at %d,%d in "
                + "color %s ", x, y, color));
    }
}

class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(int ramSlots, int cardSlots, String bios, String model, String manufacturer) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is loading now...");
    }

    public void printDetails() {
        System.out.println("=== Motherboard Details ===");
        System.out.println("Model: " + getModel());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("RAM Slots: " + ramSlots);
        System.out.println("Card Slots: " + cardSlots);
        System.out.println("BIOS: " + bios);
    }
}

class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String powerSupply, String model, String manufacturer) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}
