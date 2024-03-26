package pojos;

public class Journey {
    public double distance;
    public double averageSpeed;

    public double getTime() {
        return distance/averageSpeed;
    }


}
