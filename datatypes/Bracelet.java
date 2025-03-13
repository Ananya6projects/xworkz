class Bracelet {
    static void wear() {
        System.out.println("Wearing bracelet");
        
    }
    static void removeBracelet() {
		Wire.disconnect();
		Wire.repair();
        Bracelet.wear();
		System.out.println("Removing bracelet");
    }
    static void donate() {
        System.out.println("donating bracelet");
    }
    static void breakBracelet() {
			Bracelet.donate();
      System.out.println("brakeing bracelet");
    }
	public static void main(String[] args) {
		removeBracelet();
		breakBracelet();
	}
	
}