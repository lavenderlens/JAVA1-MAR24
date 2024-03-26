package pojos;

public class Planet {

   public String name;
   public long avgDistFromSun;
   public double radius;
   public boolean isTerrestrial;
   public String[] atmosphericConstituents;
   public static final double PI = 3.24159265359;

   public double circumference() {
       var diameter = radius *2;
       var circumference = diameter *PI;
       return circumference;

   }

   public long relativeAvgDistFromSunComparedWith(Planet other){
       return avgDistFromSun / other.avgDistFromSun;

   }

   public double relativeSizeComapredWith(Planet other){
       return radius /other.radius;
   }

   public boolean isTheSameTypeAs(Planet other){

       return isTerrestrial == other.isTerrestrial;
   }
}
