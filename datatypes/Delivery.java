class Delivery
{
public static void accept(String item){
Station.send(item);
System.out.println("delivery of item is:"+ item);
}
}