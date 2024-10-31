
public class JavaMethods1
{
	
	static int userId=3201;
	static String userName="JVJ";
	static String userEmail="jvj@yahoo.in";
	static String doj;
	static String tenure;
	
	public static void employeeDetails(String companyName)
	{
		if ((companyName.equals("Test Yantra"))|| (companyName.contains("Test")))
			{
			System.out.println("Tier4 company");
			doj="2018July";
			tenure="2 years";
			System.out.println(doj);
			System.out.println(tenure);
			}
		else if(companyName.contains("IB") || companyName.contains("LTI"))
		{
			System.out.println("Tier1 company");
			doj=null;
			tenure="0 years";
			System.out.println(doj);
			System.out.println(tenure);
			}
		else
		{
			System.out.println("Not worked");
		}
	}
	
	
	public static void employeeUserDetails()
	{
		System.out.println("User Name : " + userName);
		System.out.println("User Email : " + userEmail);
		System.out.println("User "
				+ "ID : " + userId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
employeeDetails("TestYantra");
employeeDetails("LTI");
employeeDetails("IB");
employeeUserDetails();

	}

}
