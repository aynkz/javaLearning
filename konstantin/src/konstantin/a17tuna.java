package konstantin;


//import java.util.Scanner;

public class a17tuna {
	private String girlName;
	
	public a17tuna (String name) { //������� ������� ��������� ��������
		girlName=name;
	}
	
	
	public void setName (String name){ //����� � ������� �������� ���
		
		girlName=name;
	}	
public String getName() { //����� ��������� ��� ����� ����������
return girlName;
	}	
public void saying() { //����� ��������� ����� getName
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
	
	
	
	

