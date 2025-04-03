package xworkz.ananya.src.com.xworkz.inheritence.internal.Assesment;
class AreaPostOffice{
	public static void deliver(String customerName,String address){
		System.out.println(customerName);
		System.out.println(address);
		SubRegionalPostOffice.deliver(customerName,address);
	}
}