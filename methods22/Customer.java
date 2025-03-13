public class Customer
{
public static void buy(String vegetable, int quantity)
{
System.out.println("buying");
System.out.println(vegetable+ " " +quantity);
Shop.sell(vegetable,quantity);
}
}