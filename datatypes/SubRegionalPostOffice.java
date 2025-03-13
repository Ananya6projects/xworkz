class SubRegionalPostOffice {
    public static void deliver(String customername, String address) {
        System.out.println("SubRegionalPostOffice is processing the delivery");
		System.out.println(customername+ " " +address);
        RegionalPostOffice.region(customername, address);
    }
}