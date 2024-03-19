package main;

import pojos.Route;
import pojos.RouteType;

public class App {
    public static void main(String[] args) {

        var route1 = new Route();
        var route2 = new Route();
        var route3 = new Route();
        System.out.println(route3.id);//1003
        // we may reference a static filed from a non-static context
        // we should not
        System.out.println(route3.nextId);//1004
        // instead, we should reference the class
        System.out.println(Route.nextId);

        // same with calling static methods
        // we can call on an instance but should not
        System.out.println(route3.toMiles(50));//no
        System.out.println(Route.toMiles(50));//yes

        var route4 = new Route(RouteType.WALKING);
        var route5 = new Route(RouteType.CYCLING);
        var route6 = new Route(RouteType.WALKING);

        // after enum:
        System.out.println(route4.type == route6.type);//true
        // Strings in apps are fragile, easily broken
        System.out.println(route4.type == route6.type);//true
        // the above is cumbersome and also fragile
        var route7 = new Route(RouteType.DRIVING, 4, 5);
        var route8 = new Route(RouteType.DRIVING, 4, 5);
        System.out.println(route7.type == route8.type);//true


        // before enum:
//        System.out.println(route4.type == route6.type);//false
//        // Strings in apps are fragile, easily broken
//        System.out.println(route4.type.equalsIgnoreCase(route6.type));//true
//        // the above is cumbersome and also fragile
//        var route7 = new Route("Driving", 4, 5);
//        var route8 = new Route("Drive", 4, 5);
//        System.out.println(route7.type.equalsIgnoreCase(route8.type));//false

        System.out.println(routeLength(route8.end, route8.start));
        System.out.println(route7.routeLengthFromInstance());
    }//end main
//    in here, outside the main method but inside the class
    // we may for convenience define static methods
    public static int routeLength(int end, int start){
        return end - start;
    }
}
