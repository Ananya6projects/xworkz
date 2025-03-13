class Bitcoin {
    public static void mine() {
        System.out.println("Mining Bitcoin");
        
    }
    public static void trade() {
		Currency.convert();
		Currency.destroy();
		
		Bitcoin.mine();
        System.out.println("Trading Bitcoin");
    }
    public static void invest() {
        System.out.println("investing Bitcoin");
    }
    public static void withdraw() {
		Bitcoin.invest();
        System.out.println("withdrawing Bitcoin");
    }
	public static void main(String[] args) {
	trade();
	withdraw();
	}
}