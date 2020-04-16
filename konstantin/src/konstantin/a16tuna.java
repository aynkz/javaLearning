package konstantin;


//import java.util.Scanner;

public class a16tuna {
	private String girlName;
	public void setName (String name){ //класс в который поподает имя
		
		girlName=name;
	}	
public String getName() { //класс выводящий имя через переменную
return girlName;
	}	
public void saying() { //класс выводящий класс getName
	System.out.println("Your first gf was %s " + getName());
}


}
	
	
	
	
	
	/*if (boy>10 || girl <40) { // one of this have to be true
		System.out.println("You can enter");	
	}
	else
	{
		System.out.println("You can not enter");	
	}*/
	
	
	
	

