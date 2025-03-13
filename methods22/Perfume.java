class Perfume {
    static void spray() {
        System.out.println("Spraying perfume");
        
    }
    static void applyPerfume() {
		Bracelet.removeBracelet();
		Bracelet.breakBracelet();
		Perfume.spray();
        System.out.println("Applying perfume");
    }
    static void refill() {
       System.out.println("refilling perfume");
    }
    static void mix() {
		Perfume.refill();
        System.out.println("mixing perfume");
    }
	public static void main(String[] args) {
		applyPerfume();
		mix();
	}
}