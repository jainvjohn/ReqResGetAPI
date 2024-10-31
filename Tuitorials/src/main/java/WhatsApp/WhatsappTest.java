package WhatsApp;

public class WhatsappTest {

	static int phoneno ;
	static String email;
	
	public static int getOTPNumber(int phoneno)
	{
		return phoneno;
	}
	
	public static String getEmail()
	{
		return email;
	}
	
	public void loginViaOTP(int phoneno)
	{
		System.out.println("Login via OTP");
		System.out.println("Enter your phone number");
		this.phoneno=phoneno;
		System.out.println(getOTPNumber(phoneno));
	}
	
	public void loginViaEmail(String email)
	{
		System.out.println("Enter ur email");
		this.email=email;
		System.out.println(getEmail());
	}
	
	public void loginViaWeb(int phoneno)
	{
		System.out.println("Login via OTP to Web");
		System.out.println("Enter your phone number to login to Web");
		System.out.println(getOTPNumber(phoneno));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WhatsappTest wts= new WhatsappTest();
		wts.loginViaEmail("jj@yahoo.forex.in");
		wts.loginViaOTP(313432333);
		wts.loginViaWeb(122222222);
	}

}
