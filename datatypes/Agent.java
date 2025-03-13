public class Agent
{
public static void purchase(String vegetable, int quantity)
{
System.out.println("purchasing");
System.out.println(vegetable+ " " +quantity);
Broker.brokerage(vegetable,quantity);
}
}
