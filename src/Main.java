import Entities.Environment;

public class Main {
    public static void main(String[] args) {
        Environment environment = new Environment();
        RendFrame frame = new RendFrame(environment);
        environment.addObject("./Models/Cube.obj");
    }
}