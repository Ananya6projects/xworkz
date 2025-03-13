class Globe {
    public static void rotate() {
        System.out.println("The globe is rotating on its axis");
    }
    public static void showContinents() {
        System.out.println("Displaying all continents on the globe");
    }
    public static void markCountries() {
        System.out.println("Marking different countries on the globe");
    }
    public static void displayTimeZones() {
        System.out.println("Showing time zones around the world");
    }
    public static void highlightOceans() {
        System.out.println("Highlighting all major oceans on the globe");
    }
    public static void zoomInLocation() {
        System.out.println("Zooming in to a specific location on the globe");
    }
    public static void spinFast() {
        System.out.println("Spinning the globe faster");
    }
    public static void stopRotation() {
        System.out.println("Stopping the globe's rotation");
    }

    public static void main(String[] args) {
        rotate();
        showContinents();
        markCountries();
        displayTimeZones();
        RCB.selectPlayers();
        RCB.trainTeam();
        RCB.playMatch();
    }
}
