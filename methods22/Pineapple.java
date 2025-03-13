class Pineapple {
    static void eat() {
        System.out.println("Eating pineapple");
        
    }
    static void peel() {
		Brand.advertise();
		Brand.reject();
		Pineapple.eat();
        System.out.println("Peeling pineapple");
    }
    static void makeJuice() {
		
        System.out.println("making pineapple juice");
    }
    static void grow() {
		Pineapple.makeJuice();
        System.out.println("growing pineapple");
    }
	public static void main(String[] args) {
		peel();
		grow();
	}
}