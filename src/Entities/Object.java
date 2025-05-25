package Entities;
import java.util.ArrayList;

public class Object {
    ArrayList<Face> faces;
    Coordinate position;
    Angle angle;
    public Object(ArrayList<Face> inputFaces) {
        this.faces = inputFaces;
        position = new Coordinate(0, 0, 0);
        angle = new Angle();
    }

    public ArrayList<Face> getFaces() {
        return faces;
    }
}
