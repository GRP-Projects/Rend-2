package Entities;
import Entities.Descriptors.Angle;
import Entities.Descriptors.Coordinate;
import Entities.Descriptors.Face;

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
