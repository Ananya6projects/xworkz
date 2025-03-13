class Station
{
public static void send(String item)
{
Courier.paper(item);
System.out.println("Station is running:"+ item);
}
}