package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD BonJovi = new CD(30);
        DVD StarshipTroopers = new DVD(500);

        System.out.println(BonJovi.spinDisc());
        System.out.println(StarshipTroopers.spinDisc());

    }
}
