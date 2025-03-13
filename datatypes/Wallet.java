class Wallet {
    static void open() {
        System.out.println("Opening wallet");
        
    }
    static void close() {
		Perfume.applyPerfume();
		Perfume.mix();
		Wallet.open();
        System.out.println("Closing wallet");
    }
    static void storeMoney() {
      System.out.println("storeMoney in wallet"); 
    }
    static void spendMoney() {
		Wallet.storeMoney();
      System.out.println("spending Money for food");  
    }
	public static void main(String[] args) {
		close();
		spendMoney();
	}
}