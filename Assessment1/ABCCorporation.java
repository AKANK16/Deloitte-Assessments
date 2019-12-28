import java.util.Scanner;

public class ABCCorporation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ID ="ABCCust";
		String Password="abc@123";
		String inputID=" ";
		String inputPassword=" ";
		
		int choice;
		int count=3;
		Scanner sc= new Scanner(System.in);
	
		Customer custDB[] = new Customer[10];
		custDB[0]=new Customer(612,"AAA","Aaa@gmail.com",123445613);
		custDB[1]=new Customer(123,"SSS","sss@gmail.com",456595613);
		custDB[2]=new Customer(212,"rrr","Coder@gmail.com", 65647478);
		
		System.out.println("Enter ID: ");
		inputID= sc.next();
		System.out.println("Enter password: ");
		inputPassword= sc.next();
		int Id;
		
		if(inputID.equalsIgnoreCase(ID)   && inputPassword.equalsIgnoreCase(Password))
		{
			do
			{
				System.out.println("\nChoose Operation: \n1.Add Customer Details.\n2.Print Customer Details.\n3.Edit Existing Details.\n4.Delete Existing Customer details.\n5.Exit.\n");
				choice=sc.nextInt();
				switch(choice)
				{
					case 1:
						System.out.println("Enter new Customer details: ");
						Id=sc.nextInt();
						String name=sc.next();
						String email=sc.next();
						long number=sc.nextLong();
						custDB[count]=new Customer(Id,name,email,number);
						count++;
						break;
					case 2:
						System.out.println("Customer Details are :");
						Id=sc.nextInt();
						for(int k=0;k<count; k++)
						{					
							System.out.println(custDB[k]);
						}

						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
				}
				
			}
			while(choice!=5);
			
		}
		
	}

}
