public class Projector {
    Lens lens;
    Lamp lamp;

    Projector(Lens lens, Lamp lamp) {
        this.lens = lens;
        this.lamp = lamp;
    }

    void displayProjectorDetails() {
        lens.showDetails();
        lamp.showDetails();
    }
}
