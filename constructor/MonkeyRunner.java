class MonkeyRunner
{
public static void main(String[] args)
{
Monkey m1=new Monkey();
System.out.println("Monkey color:"+m1.color);
System.out.println("Monkey size:"+m1.size);
m1.color="brown";
System.out.println("Updated Monkey color:"+m1.color);
m1.size=10;
System.out.println("Updated monkey size:"+m1.size);
}
}