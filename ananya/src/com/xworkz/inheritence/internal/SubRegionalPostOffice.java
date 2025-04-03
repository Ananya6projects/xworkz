package xworkz.ananya.src.com.xworkz.inheritence.internal;
class SubRegionalPostOffice{
	public static void deliver(String customerName,String address){
		System.out.println(customerName);
		System.out.println(address);
		RegionalPostOffice.deliver(customerName,address);
	}
}