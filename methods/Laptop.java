class Laptop {
    public static  void powerOn() {
        System.out.println("Laptop is turning on");
    }
    public static void powerOff() {
        System.out.println("Laptop is shutting down");
    }
    public  static void openApp() {
        System.out.println("Opening app");
    }
    public static void connectWiFi() {
        System.out.println("Connecting to WiFi");
    }
    public static void adjustBrightness() {
        System.out.println("Adjusting brightness");
    }
    public static void checkBattery() {
		 System.out.println("Checking Battery");
	}
        public static void checkRAM(){
		System.out.println("Checking RAM");
		}
        public static void checkProcessor(){
		System.out.println("Checking Processor");
}
        public static void main(String[] args) {
        Laptop.powerOn();
        Laptop.openApp();
        Laptop.connectWiFi();
        Laptop.adjustBrightness();
        Laptop.checkBattery();
        Laptop.checkRAM();
		Laptop.checkProcessor();
    }
}