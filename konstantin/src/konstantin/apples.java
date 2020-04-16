package konstantin;
//System.out.println();

import java.util.Scanner; //сохранять введённые данные
import java.util.EnumSet;
import java.util.Random; //выводить рандомно числа


class apples{
public static void main(String args[]){
	
	//Java Programming Tutorial - 49 - Inheritance
		tuna tunaObject = new tuna();
		potpie potObject = new potpie();
		food	foodObject = new food();
	tunaObject.eat();
	potObject.eat();
	foodObject.eat();
	
	
	//Java Programming Tutorial - 49 - Inheritance
}
	
	
	
	
	
	//Java Programming Tutorial - 48 - final
	/*tuna tunaObject = new tuna (10);
	
		for (int i = 0; i<5;i++) {
		tunaObject.add();
		System.out.printf("%s", tunaObject);
		
	}}*/
	
	
	//Java Programming Tutorial - 47 - More on Static
	/*tuna members1 = new tuna ("Megan","Fox");
	tuna members2 = new tuna ("Natali","Portman");
	tuna members3 = new tuna ("Taylor","Swift");

	
	System.out.println();
	System.out.println(members1.getFirst());
	System.out.println(members1.getLast());
	System.out.println(members1.getMembers());
	
	
	System.out.println(tuna.getMembers());//quantity
	
}*/
	
	//Java Programming Tutorial - 46 - Static
	/*tuna members1 = new tuna ("Megan","Fox");
	tuna members2 = new tuna ("Natali","Portman");
	tuna members3 = new tuna ("Taylor","Swift");
}*/

	//Java Programming Tutorial - 45 - EnumSet range
	/*
	for(tuna people:tuna.values()) 
		System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
	
	
	System.out.println("\nAnd now for the range of constants!!!\n");
	
	
	for (tuna people: EnumSet.range(tuna.kelsey, tuna.nicole)) //вывести только часть значений
		System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
	}
	*/
	
	
	
	//Java Programming Tutorial - 44 - Enumeration
	/*for(tuna people:tuna.values()) 
		System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
	}*/
	
	//Java Programming Tutorial - 43 - Composition
	/*
	potpie potObject=new potpie (4,5,6);	
	tuna tunaObject=new tuna ("Greg",potObject);
	System.out.println(tunaObject);
	}*/
	
	
//Java Programming Tutorial - 42 - toString	
	//potpie potObject=new potpie (4,5,6);
	//}	/



//Java Programming Tutorial - 41 - Building Objects for Constructors
/*tuna tunaObject = new tuna();	
tuna tunaObject2 = new tuna(5);	
tuna tunaObject3 = new tuna(5,13);		
tuna tunaObject4 = new tuna(5,13,43);	

System.out.printf("%s\n",tunaObject.toMilitary());
System.out.printf("%s\n",tunaObject2.toMilitary());
System.out.printf("%s\n",tunaObject3.toMilitary());
System.out.printf("%s\n",tunaObject4.toMilitary());
}	*/
	
	
	
	
	//Java Programming Tutorial - 39 - Multiple Constructors
	
			
//	Java Programming Tutorial - 38 - Public, Private and this
	//Java Programming Tutorial - 37 - Display Regular time
	
	/*
	tuna tunaObject = new tuna();
	System.out.println(tunaObject.toMilitary());
	tunaObject.setTime(13,27,6);
	System.out.println(tunaObject.toMilitary());
	
	tunaObject.setTime(13,27,6);
	System.out.println(tunaObject.toMilitary());
	System.out.println(tunaObject.toString());
	
	
	tunaObject.setTime(3,27,6);
	System.out.println(tunaObject.toString());
	}
	*/
	
	
	
	
	//Java Programming Tutorial - 36 - Time Class
	/*
	tuna tunaObject = new tuna();
	System.out.println(tunaObject.toMilitary());
	tunaObject.setTime(13,27,6);
	System.out.println(tunaObject.toMilitary());

}*/
	
	
	
	
	//Java Programming Tutorial - 35 - Variable Length Arguments Среднее число
/*	System.out.println(average(43,56,76,8,65,76,2,31));
}

public static int average (int...numbers) {
int total=0;
for (int x:numbers)
	total+=x;
return total/numbers.length;
	
}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Java Programming Tutorial - 34 - Table for Multi Arrays (Таблица для нескольких массивов)
/*	int firstarray[][]={{8,9,10,11},{12,13,14,15}};
	int secondarray[][]={{30,31,32,33},{43},{4,5,6}};
	System.out.println("This is first array");
	display (firstarray);
	
	
	
	System.out.println("This is second array");
	display (secondarray);
	
}
	
	public static void display (int x[][]) {
		for (int row=0;row<x.length;row++) {
			for (int column=0; column<x[row].length;column++) {
				System.out.print(x[row][column]+"\t");
				
			}
			System.out.println();
		}
	}
	*/
	
	
	//Java Programming Tutorial - 33 - Multidimensional Arrays
	/*int firstarray[][]={{8,9,10,11},{12,13,14,15}};
	int secondarray[][]={{30,31,32,33},{43},{4,5,6}};
	System.out.println(firstarray[0][3]);*/
	
	
	//int k1q[]={3,4,5,6,7};
	
	
	
	
	//Java Programming Tutorial - 32 - Arrays in Methods
	/*
	int k1q[]={3,4,5,6,7};
	change(k1q);
	
	for (int y:k1q)
		System.out.println(y);

}

public static void change (int x[]) {
	for (int counter=0; counter<x.length;counter++) 
		x[counter]+=5;
		
		}
*/		



	
	
	
	
	//Java Programming Tutorial - 31 - Enhanced for Loop	
	/*int k1q[]={3,4,5,6,7};
	int total=0;
	
	for(int x:k1q) {
		total+=x;
		System.out.println(total);	*/
		/*result 
 
7
12
18
25
		 
		
	}*/
	//System.out.println(total); }
	//result 25

	
	
	
//	Java Programming Tutorial - 30 - Array Elements as Counters
/*	
	Random rand = new Random ();
	int freq[]=new int[7];
	for (int roll=1; roll<1000;roll++) {
		++freq[1+rand.nextInt(6)];
		
			}	
	
	System.out.println("Face\t Frequenscy");
	for (int face=1; face<freq.length;face++) {
		System.out.println(face+"\t "+freq[face]);
	}
*/	
	
//Java Programming Tutorial - 29 - Summing Elements of Arrays
	//int k1q[]={21,16,86,21,3};// array k1q better
/*	int sum=0;
	for (int counter=0; counter<k1q.length;counter++) {
		sum+=k1q[counter];
		
			}	
	
	System.out.println(sum); }*/
	
	
//Java Programming Tutorial - 28 - Creating an Array Table	
//	System.out.println("Index\tValue");	
//int k1q[]={2,4,5,7,9};// array k1q better	
/*for (int counter=0; counter<k1q.length;counter++) {
System.out.println(counter + "\t" + k1q[counter]);
	}
*/

//Java Programming Tutorial - 27 - Introduction to Arrays

//int k1q[]={2,4,5,7,9};// array k1q better
//System.out.println(k1q[0]);


//int k1q[]=new int[10];// array k1q
/*k1q[0]=87;
k1q[1]=543;
k1q[9]=65;


}
*/
	
	
	
	
	
	
	
	
//	Java Programming Tutorial - 26 - Random Number Generator
	/*
	Random dice = new Random();
	int number;
	
	for (int counter=1; counter<=10;counter++) {
		number=1+dice.nextInt(6);// quantity parameters
				System.out.println(number + " ");
	}
}
	*/
	
	
	
	
	
	
	//Java Programming Tutorial - 25 - Math Class Methods	
//System.out.println(Math.abs(-26.7)); // 26.7
//System.out.println(Math.ceil(7.4)); // 8.0
//System.out.println(Math.floor(7.4)); // 7.0	
//System.out.println(Math.max(8.6,5.2)); //8.6	
//System.out.println(Math.min(8.6,5.2)); //5.2
//System.out.println(Math.pow(5,3)); //125
//	System.out.println(Math.sqrt(9)); //3	квадрат
	
	
	
// Java Programming Tutorial - 24 - do while Loops
// do look make it at list one run
	/*
	int counter = 15;
do {
	System.out.println(counter);
	counter++;
} while (counter <=10);
}	*/
	
	
	
	
	
	
//Java Programming Tutorial - 23 - Compound Interest Program
//A=P(1+R)^n	
	/*double amount;
	double principal =10000 ;
	double rate = .01; //1 percent for day
	for (int day=1; day<=20;day++) {
	amount = principal*Math.pow(1+rate,day);
	System.out.println(day + "  " + amount);
		}}*/
	
	
	
	
	
	//Java Programming Tutorial - 22
	/*for (int counter=6; counter<=21;counter++) {
		
		System.out.println(counter);	
}	}*/
	
	
	
	
	
	//Java Programming Tutorial - 21
/*	Scanner input = new Scanner (System.in);	
	int total = 0;
	int grade, average;
	int counter = 0;
	
	while (counter < 10) {
		grade = input.nextInt();
		total = total + grade;
		counter++;
	
	}
	average = total/10;
	
	System.out.println("Your average is " + average );*/
	
	
	//Java Programming Tutorial - 20
/*	int age = 21;
	System.out.println(age >50 ? "You are old":"You are young"); }
*/	
	
	
	//Java Programming Tutorial - 19
	/*int age = 45;

	if (age>=60) 
		System.out.println("You are senior citizen ");
	else if (age>=50)
		System.out.println("You are in your 50s ");
	else if (age>=40)
		System.out.println("You are in your 40s ");
		else
		System.out.println("You are a young buck ");
	}
	*/
	
	
	//Java Programming Tutorial - 18
	/*
int age = 60;

if (age<50) {
	System.out.println("You are young ");
}
else
{
	System.out.println("You are old ");
	if (age>75) {
		System.out.println("You are really old ");
		}
	else {
		System.out.println("Don't worry you aren't that old");
		
	}
}
	}
*/

/*
tuna tunaObject = new tuna ("Violet");// подключение класса tuna	
tuna tunaObject2 = new tuna ("Nastya");// подключение класса tuna	
tunaObject.saying();
tunaObject2.saying();
	*/
	//Scanner input = new Scanner (System.in);
   
	//System.out.println("Enter name of first gf here: "); // вывод запроса на ввод данных
	//String temp = input.nextLine(); // введённые данне поместились в temp

	
//	System.out.println("Your first gf was %s" + temp);
	
	
	//tunaObject.setName(temp);
	
	
	
	
	
	
	//String name = input.nextLine(); //вывести вместе с предыдущим значением
	//tuna.simpleMessage(name);
	
/*	double tuna;
	tuna = 5.28;
	System.out.print("I want ");
	System.out.print(tuna);
	System.out.println(" movies");
	System.out.print(" apples ");*/
	//System.out.println("Hello youtube!");
	
	


//	}
}



