class Brand {
    static void displayBrand() {
        System.out.println("This is a famous brand");
        
    }
    static void advertise() {
		Trafficsignal.yellow();
		Trafficsignal.walk();
		Brand.displayBrand();
        System.out.println("Brand is advertising");
    }
    static void endorse() {
        System.out.println("Brand is endorsing");
    }
    static void reject() {
		Brand.endorse();
        System.out.println("Brand is rejecting");
    }
	public static void main(String[] args) {
		advertise();
		reject();
		}
		
}