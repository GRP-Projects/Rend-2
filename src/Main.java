import Entities.Environment;
import Entities.Face;
import Entities.Coordinate;

public class Main {
    public static void main(String[] args) {
        Environment environment = new Environment();
        environment.addObject("./Models/Cube.obj");
        RendFrame frame = new RendFrame();
    }
}