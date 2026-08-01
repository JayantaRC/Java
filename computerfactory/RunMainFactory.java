package com.mycompany.computerfactory;

class RunMainFactory {

    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "hp", "240w");

        Monitor theMonitor = new Monitor(27, "2540 x 1440", "27 inch Beast", "hp");

        Motherboard theMotherboard = new Motherboard(4, 6, "v2.44", "nForce", "nVIDIA");

        PersonalComputer thePC = new PersonalComputer(
                theCase,
                theMonitor,
                theMotherboard,
                "2208",
                "hp");

        thePC.getComputercase().pressPowerButton();

        thePC.getMonitor().drawPixelAt(10, 10, "red");

        thePC.getMotherboard().loadProgram("Windows OS");

        thePC.getMotherboard().printDetails();

    }

}
