class Gold {
    static void shine() {
        System.out.println("Gold is shining");
        
    }
    static void melt() {
		Pineapple.peel();
		Pineapple.grow();
		Gold.shine();
        System.out.println("Gold is melting");
    }
    static void sellGold() {
     
		System.out.println("Gold is selling fast");
    }
    static void craft() {
        Gold.sellGold();
		System.out.println("Gold is used for craft");
    }
	public static void main(String[] args) {
	melt();
	craft();
	}
	
	
}