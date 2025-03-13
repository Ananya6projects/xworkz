public class Shop
{
public static void sell(String vegetable, int quantity)
{
System.out.println("selling");
System.out.println(vegetable+ " " +quantity);
Agent.purchase(vegetable,quantity);
}
}