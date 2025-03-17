class BaloonRun{

public static void main(String... args)
{
Baloon baloon=new Baloon("star" , "blue");
System.out.println("baloonrun"+ baloon.shape+ "," +baloon.color  );
baloon.shape="circle";//re instatiation
baloon.color="red";
System.out.println("baloonrun1"+ baloon.shape+ "," +baloon.color  );

Baloon baloon1=new Baloon("heart","pink",5.5,10,20,'m');
System.out.println("baloon1:"+baloon1.shape+","+baloon1.color+","+baloon1.capacity+","+baloon1.cost+","+baloon1.nobaloon+","+baloon1.size);

}

}