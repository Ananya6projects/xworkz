class Hospital{
public static void checkup(String patientname,int age,long mobile,String email,String sickness){
System.out.println("hospital checkup:" +patientname +" " +age +" " +mobile +" " +email +" " +sickness);
Doctor.treatment(patientname,age);
}
}