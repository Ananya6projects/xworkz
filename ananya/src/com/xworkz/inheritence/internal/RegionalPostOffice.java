package xworkz.ananya.src.com.xworkz.inheritence.internal;
class RegionalPostOffice{
	public static void deliver(String customerName,String address){
		System.out.println(customerName);
		System.out.println(address);
		PostHeadMaster.deliver(customerName,address);
	}
}