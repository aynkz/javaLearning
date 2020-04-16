package konstantin;

import java.util.Scanner;

class a16apples{
public static void main(String args[]){
	Scanner input = new Scanner (System.in);
    a16tuna a16tunaObject = new a16tuna ();// подключение класса a16tuna
	System.out.println("Enter name of first gf here: "); // вывод запроса на ввод данных
	String temp = input.nextLine(); // введённые данне поместились в temp

	
//	System.out.println("Your first gf was %s" + temp);
	
	
	a16tunaObject.setName(temp);
	a16tunaObject.saying();

	
	
	
	
	
	//String name = input.nextLine(); //вывести вместе с предыдущим значением
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



