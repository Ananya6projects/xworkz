public class Lamp {
    int brightness;
    String color;

    Lamp(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
    }

    void showDetails() {
        System.out.println("Lamp Brightness: " + brightness + ", Color: " + color);
    }
}
