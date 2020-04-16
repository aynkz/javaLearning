package konstantin;
//import java.util.Scanner;



//Java Programming Tutorial - 49 - Inheritance
public class tuna extends food {
	
	
	

	
}
	
	
	//Java Programming Tutorial - 48 - final
/*
private int sum;
private final int NUMBER; //always this variable without changes


public tuna (int x) {
	NUMBER = x;	
	}
	
public void add() {
	sum+=NUMBER;	
}

public String toString() {
	return String.format("sum = %d\n", sum);
	

}



}*/
	
	
	
	//Java Programming Tutorial - 47 - Static
	/*
		
		private String first;	
		private String last;	
		private static int members = 0;	
		
		public tuna (String fn, String ln) {
			first = fn;
			last = ln;
			members++;
			System.out.printf("Constructor for %s %s, members in the club: %d\n", first,last,members);
			}
		
		public String getFirst() {
		return first;		
		}
		
		public String getLast() {
			return last;		
			}
		
		public static int getMembers() {
			return members;
			
		}
		
		
		
	
}
	*/
	
	//Java Programming Tutorial - 46 - Static
	/*
	private String first;	
	private String last;	
	private static int members = 0;	
	
	public tuna (String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n", first,last,members);
		}
}
*/

//Java Programming Tutorial - 45 - EnumSet range
/*	 public enum tuna {
			k1q("nice","22"),
			kelsey("cutie","10"),
			julia("bigmistake","12"),
		 	nicole("italian","13"),
		 	candy("different","14"),
		 	erin("iwish","16");
			
		private final String desc;
		private final String year;	

		tuna (String description, String birthday){
		desc= description;
		year= birthday;
		}

		public String getDesc() {
		return desc;	
		}


		public String getYear() {
		return year;	
		}



		}

*/





//Java Programming Tutorial - 44 - Enumeration
/* 
 public enum tuna {
	k1q("nice","22"),
	kelsey("cutie","10"),
	julia("bigmistake","12");
	
private final String desc;
private final String year;	

tuna (String description, String birthday){
desc= description;
year= birthday;
}

public String getDesc() {
return desc;	
}


public String getYear() {
return year;	
}



}*/

	/*
	 Java Programming Tutorial - 43 - Composition
	private String name;
	private potpie birthday;
	
	public tuna(String theName, potpie theDate) {
		name = theName;
		birthday = theDate;
		}
	
	public String toString() {
		return String.format ("My name is %s, my brithday is %s",name,birthday);
	}
	
}*/
	
	
	//Java Programming Tutorial - 41 - Building Objects for Constructors
	//Java Programming Tutorial - 40 - Set and Get Methods
	// Programming Tutorial - 39 - Multiple Constructors
	/*
	private int hour;
	private int minute;
	private int second;
	
	public tuna() {
	this(0,0,0);	
		
	}
	
	public tuna(int h) {
		this(h,0,0);	
			
		}
	
	public tuna(int h, int m) {
		this(h,m,0);	
			
		}
	
	
	public tuna(int h,int m, int s) {
		setTime (h,m,s);
		
		}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	
	public void setHour (int h) {
	hour = ((h>=0 && h<24)?h:0);	
	}
	
		public void setMinute (int m) {
		minute = ((m>=0 && m<60)?m:0);	
		}
	
	
	public void setSecond (int s) {
		second = ((s>=0 && s<60)?s:0);	
		}
		
	public int getHour () {
		return hour;
		}
	
	public int getMinute () {
		return minute;
		}
		
	public int getSecond () {
		return second;
		}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	
	
	
}	
}	
*/
	
	
	
	
	//Java Programming Tutorial - 38 - Public, Private and this
	/*
	public void setTime(int h,int m, int s) {
		 
		   this.hour = ((h>=0 & h<24) ? h:0);
		   minute = ((m>=0 && m<60 ) ? m:0);
		   second = ((s>=0 && s<60 ) ? s:0);
			
		}
	
	
	
}*/




	//Java Programming Tutorial - 37 - Display Regular time
	
	/*
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h,int m, int s) {
		 
	   hour = ((h>=0 & h<24) ? h:0);
	   minute = ((m>=0 && m<60 ) ? m:0);
	   second = ((s>=0 && s<60 ) ? s:0);
		
	}
	
public String toMilitary() {
	return String.format("%02d:%02d:%02d", hour, minute, second);
}


public String toString() {
	return String.format("Hello %02d:%02d:%02d %s",(( hour == 0||hour == 12)?12:hour%12), minute, second, (hour<12?"AM":"PM"));

	
}

}
	*/
	
	
	
	//Java Programming Tutorial - 36 - Time Class
	/*
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h,int m, int s) {
		 
	   hour = ((h>=0 & h<24) ? h:0);
	   minute = ((m>=0 && m<60 ) ? m:0);
	   second = ((s>=0 && s<60 ) ? s:0);
		
	}
	
public String toMilitary() {
	return String.format("%02d:%02d:%02d", hour, minute, second);
}

}*/
	
	
	
	
	

	/*
	private String girlName;
	
	public tuna (String name) { //вывести заранее указанные значения
		girlName=name;
	}
	
	
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
	
	*/
	
	
	
	/*if (boy>10 || girl <40) { // one of this have to be true
		System.out.println("You can enter");	
	}
	else
	{
		System.out.println("You can not enter");	
	}*/
	
	
	
	

