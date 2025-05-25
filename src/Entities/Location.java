package Entities;

public class Location {
    double[] coordinates;
    double[] angle;

    public Location(double x, double y, double z) {
        this.coordinates = new double[]{x, y, z};
        this.angle = new double[]{0, 0, 0};
    }
}
