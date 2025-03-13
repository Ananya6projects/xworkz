class Bakery
{
public static void buy(String itemName, int quantity)
{
System.out.println("running buy in Bakery");
System.out.println(itemName+ " " +quantity);
}
public static void open(boolean yesorno)
{
System.out.println(yesorno);
}
public static void close(boolean yesorno)
{
System.out.println(yesorno);
}
public static void owner(String names)
{
System.out.println(names);
}
public static void cashier(String name)
{
System.out.println(name);
}
}