class Company
{
public static String getCompanyname(String ownerName)
{
System.out.println("running owner name:"+ ownerName);
if(ownerName=="ananya")
{
String company="google";
return company;
}
if(ownerName=="amu")
{
String company="myntra";
return company;
}
if(ownerName=="sonu")
{
String company="tcs";
return company;
}
if(ownerName=="janu")
{
String company="xworkz";
return company;
}
if(ownerName=="mythu")
{
String company="infosys";
return company;
}
if(ownerName=="apeksha")
{
String company="klynger";
return company;
}
if(ownerName=="megha")
{
String company="wipro";
return company;
}
if(ownerName=="manu")
{
String company="pesit";
return company;
}
if(ownerName=="anju")
{
String company="prestige";
return company;
}
if(ownerName=="ganu")
{
String company="coding";
return company;
}
if(ownerName=="jan")
{
String company="wing";
return company;
}
if(ownerName=="manjula")
{
String company="amazon";
return company;
}
else return "";
}
public static void main(String[]args){
	String name="ananya";
	String ref=Company.getCompanyname(name);
	System.out.println("company:"+ ref);
}
}

