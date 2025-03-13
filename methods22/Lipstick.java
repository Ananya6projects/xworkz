class Lipstick {
    public static void apply() {
        System.out.println("Applying lipstick");
        
    }
    public static void remove() {
		Lipstick.apply();
        System.out.println("Removing lipstick");
		
    }
    public static void use() {
        System.out.println("use lipstick");
    }
    public static void sale() {
        Lipstick.use();
		System.out.println("Sale Lipstick");
    }
	
	public static void main(String[] args) {
        sale();
		remove();
}
}