package WhatsApp;

public class WhatsAppChats {

	public WhatsAppChats(String contactName)
	{
		System.out.println("Select "+contactName);
		System.out.println("Send a message");
	}
	public WhatsAppChats(String contactName, char gender, int time)
	{
		this("Bill");
		System.out.println("Select "+contactName+" whose gender is "+gender);
		System.out.println("Send a message at "+time);
	}
	
	public WhatsAppChats(String contactName, String mms)
	{
		this("Sam",'M',1400);
		System.out.println("Select "+contactName);
		System.out.println("Send mms msg");
	}
	public WhatsAppChats(int time,String contactName)
	{
		this("Jack","Image");
		System.out.println(time+" Select "+contactName);
		System.out.println("Copy paste & send msg");
	}
	
	public WhatsAppChats(int time)
	{
		
		System.out.println(time);
		System.out.println("Copy paste & send msg");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WhatsAppChats wac= new WhatsAppChats(1100,"Joe");//
		
		
	}
}