import java.util.Arrays;
class Hotel
{
	public static void main(String[] args) {
String[] hotelNames={"empire","hote","sanmati"};
hotelNames[2]="udupi";
System.out.println(Arrays.toString(hotelNames));
String ref=hotelNames[1];

System.out.println(ref);
}
}