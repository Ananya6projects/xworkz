class Trafficsignal {
    static void red() {
        System.out.println("Stop at red light");
        
    }
    static void green() {
        System.out.println("Go at green light");
    }
    static void yellow() {
		Lipstick.sale();
		Lipstick.remove();
		Trafficsignal.red();
		System.out.println("yellow light");
	   
    }
    static void walk() {
		Trafficsignal.green();
		System.out.println("walk");
        
    }
	public static void main(String[] args) {
	yellow();
	walk();
	}
}