public class OceanRunner {
    public static void main(String[] args) {
        Ocean ocean = new Pacific();
        ocean.depth();
        ocean.marineLife();
        ocean.waves();
        ocean.temperature();
        ocean.tides();

        System.out.println("-----------");

        Pacific pacific = new Pacific();
        pacific.depth();
        pacific.marineLife();
        pacific.waves();
        pacific.temperature();
        pacific.tides();
    }
}
