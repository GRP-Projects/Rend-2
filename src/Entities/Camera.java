package Entities;

public class Camera {
    Coordinate position;
    Angle angle;

    public Camera(double x, double y, double z) {
        this.position = new Coordinate(x, y, z);
    }
}