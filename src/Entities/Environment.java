package Entities;

import Entities.Descriptors.Coordinate;
import Entities.Descriptors.Face;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Environment {
    ArrayList<Camera> cameras;
    ArrayList<Object> objects;
    public Environment() {
        this.cameras = new ArrayList<Camera>();
        this.objects = new ArrayList<Object>();
    }

    public Object getObject(int i) {
        return objects.get(i);
    }

    public void addObject(String path) {
        ArrayList<Face> faces = new ArrayList<>();
        try {
            File modelFile = new File(path);
            Scanner fileReader = new Scanner(modelFile);
            ArrayList<Coordinate> coordinates = new ArrayList<>();
            while (fileReader.hasNextLine()) {
                String nextLine = fileReader.nextLine();
                if (nextLine!="" && nextLine.charAt(0)=='v') {
                    String[] points = nextLine.substring(2, nextLine.length()).split(" ");

                    double x = Double.parseDouble(points[0]);
                    double y = Double.parseDouble(points[1]);
                    double z = Double.parseDouble(points[2]);

                    coordinates.add(new Coordinate(x,y,z));
                } else if (nextLine!="" && nextLine.charAt(0)=='f') {
                    String[] newFace = nextLine.substring(2, nextLine.length()).split(" ");

                    int a = Integer.parseInt(newFace[0])-1;
                    int b = Integer.parseInt(newFace[1])-1;
                    int c = Integer.parseInt(newFace[2])-1;

                    faces.add(new Face(coordinates.get(a), coordinates.get(b), coordinates.get(c)));
                }
            }
            objects.add(new Object(faces));
        } catch(FileNotFoundException e) {
            System.out.println("Failed to read file.");
        }
    }
}
