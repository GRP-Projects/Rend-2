package Entities;

public class Coordinate {
    double[] coordinates;

    public Coordinate(double x, double y, double z) {
        this.coordinates = new double[]{x, y, z};
    }

    public void printCoordinates() {
        System.out.print(coordinates[0] + ", ");
        System.out.print(coordinates[1] + ", ");
        System.out.print(coordinates[2]);
        System.out.println("");
    }
}
