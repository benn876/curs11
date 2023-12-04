package org.fasttrackit.curs11.code.records;

import static org.fasttrackit.curs11.code.records.ElectronicsType.WASHING_MACHINE;

public class Main {
    public static void main(String[] args) {
        Electronics myElectornics = new Electronics("myElectronics", "BEKO", 400, WASHING_MACHINE);
        System.out.println(myElectornics.name());
        System.out.println(myElectornics.producer());
        System.out.println(myElectornics.price());
        System.out.println(myElectornics);
        myElectornics.saySomething();
    }
}
