package konstantin;

import java.util.Scanner;

class a16apples{
public static void main(String args[]){
	Scanner input = new Scanner (System.in);
    a16tuna a16tunaObject = new a16tuna ();// ����������� ������ a16tuna
	System.out.println("Enter name of first gf here: "); // ����� ������� �� ���� ������
	String temp = input.nextLine(); // �������� ����� ����������� � temp

	
//	System.out.println("Your first gf was %s" + temp);
	
	
	a16tunaObject.setName(temp);
	a16tunaObject.saying();

	
	
	
	
	
	//String name = input.nextLine(); //������� ������ � ���������� ���������
	//a16tuna.simpleMessage(name);
	
/*	double a16tuna;
	a16tuna = 5.28;
	System.out.print("I want ");
	System.out.print(a16tuna);
	System.out.println(" movies");
	System.out.print(" apples ");*/
	//System.out.println("Hello youtube!");
	
	


	}
}



