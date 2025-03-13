class Currency {
    static void exchange() {
        System.out.println("Exchanging currency");
        
    }
    static void convert() {
		Wallet.close();
		Wallet.spendMoney();
		Currency.exchange();
        System.out.println("Converting currency");
    }
    static void printMoney() {
        System.out.println("printing currency");
    }
    static void destroy() {
		Currency.printMoney();
        System.out.println("destroying currency");
    }
	public static void main(String[] args) {
	convert();
	destroy();
	}
}