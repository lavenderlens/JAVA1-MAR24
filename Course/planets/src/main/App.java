package main;

import pojos.Planet;

public class App {
    public static void main(String[] args) {

        var earth = new Planet();
        earth.name = "Earth";
        earth.avgDistFromSun =92_956_050L;
        earth.isTerrestrial = true;
        earth.radius = 3958.8;
        earth.atmosphericConstituents = new String[]{"Nitrogen", "Oxygen"};

       var jupiter = new Planet();
       jupiter.name = "Jupiter";
       jupiter.avgDistFromSun = 483_638_564L;
       jupiter.isTerrestrial = false;
       jupiter.radius = 43_440.7;
       jupiter.atmosphericConstituents = new String[]{"Hydrogen", "Helium"} ;


        System.out.printf("Earths first atmospheric constituent %s\n ", earth.atmosphericConstituents[0]);
        System.out.printf("Jupiters first atompheric constiuent %s\n ", jupiter.atmosphericConstituents[0]);

        System.out.printf("Earths circumference is %s\n ",earth.circumference());
        System.out.printf("Jupiters circumference is %s\n", jupiter.circumference());

        System.out.printf("Distance between jupiter and earth is %d\n ", jupiter.relativeAvgDistFromSunComparedWith(earth));
        System.out.printf("Jupiter size compared with Earth is %.2f\n ", jupiter.relativeSizeComapredWith(earth));
        System.out.printf("is jupiter the same type as earth%s\n " , jupiter.isTheSameTypeAs(earth));

    }
}
