class AreaPostOffice {
    public static void deliver(String customername, String address) {
        System.out.println("AreaPostOffice is processing the delivery");
		System.out.println(customername+ " " +address);
        SubRegionalPostOffice.deliver(customername, address);
    }
}