package WhatsApp;

public class WhatsAppHomeScreen {

	public void emptyScreen()
	{
		System.out.println("No chats found");
	}
	
	public void sendMessage(String contactName)
	{
		System.out.println("Send message to : "+contactName );
	}
	
	public void sendMessage(int noOfContacts)
	{
		System.out.println("No of contacts present : "+noOfContacts);
	}
	public void sendMessage(String contactName,int noOfContacts)
	{
		System.out.println("Send message to "+ noOfContacts+"nd contact with name : "+contactName);
	}
	
	public void sendMessage(int noOfContacts,String contactName)
	{
		System.out.println("Send message to "+ noOfContacts+"nd contact with name : "+contactName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WhatsAppHomeScreen whms= new WhatsAppHomeScreen();
		whms.emptyScreen();
		whms.sendMessage(3);
		whms.sendMessage("Gil");
		whms.sendMessage(2, "Sil");
		whms.sendMessage("Sack", 3);
	}

}
