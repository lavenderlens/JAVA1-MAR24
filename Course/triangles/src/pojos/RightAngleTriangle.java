package pojos;

public class RightAngleTriangle {

    public double opposite;
    public double adjacent;

    public double unknownAngle(){

        var rad = Math.atan(opposite / adjacent);
        return  Math.toDegrees(rad);
    }

    public double unknownSide(){
        var sidesqured = Math.pow(opposite,2) + Math.pow(adjacent,2);
        return Math.sqrt(sidesqured);

    }

}
