public class Lens {
    String type;
    int focalLength;

    Lens(String type, int focalLength) {
        this.type = type;
        this.focalLength = focalLength;
    }

    void showDetails() {
        System.out.println("Lens Type: " + type + ", Focal Length: " + focalLength);
    }
}
