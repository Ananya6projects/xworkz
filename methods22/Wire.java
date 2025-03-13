class Wire {
    static void connect() {
        System.out.println("Wire is connected");
        
    }
    static void disconnect() {
		Gold.melt();
		Gold.craft();
		Wire.connect();
        System.out.println("Wire is disconnected");
    }
    static void install() {
        System.out.println("Wire is installed");
    }
    static void repair() {
		Wire.install();
        System.out.println("Wire got repaired");
    }
	public static void main(String[] args) {
		disconnect();
		repair();
	}
}