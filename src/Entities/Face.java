package Entities;

public class Face {
    Coordinate[] points;

    public Face(Coordinate a, Coordinate b, Coordinate c) {
        points = new Coordinate[]{a, b, c};
    }

    public Coordinate[] getPoints() {
        return points;
    }
}
