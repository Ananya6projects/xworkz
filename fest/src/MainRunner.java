public class MainRunner {
    public static void main(String[] args) {
        Lens lens = new Lens("Zoom", 50);
        Lamp lamp = new Lamp(500, "White");

        Projector projector = new Projector(lens, lamp);
        projector.displayProjectorDetails();
    }
}
