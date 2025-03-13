class Broker
{
public static void brokerage(String vegetable,int quantity){
System.out.println("Brokerage is running");
System.out.println(vegetable+ " " +quantity);
Farmer.farm(vegetable,quantity);
}
}