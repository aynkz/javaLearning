package konstantin;

//import java.util.Scanner;

public class Logical_Operators {
		public static void main(String args[]){
	//Scanner bucky = new Scanner (System.in);
	int boy, girl;
	boy = 10;
	girl = 44;
	
	//if (boy>10 && girl <60) { // if both have to be true
	if (boy>10 || girl <40) { // one of this have to be true
		System.out.println("You can enter");	
	}
	else
	{
		System.out.println("You can not enter");	
	}
	
	
	
	/*int tuna = 5;
	int bass = 18;
	tuna *=  8;
	tuna = tuna + 5;
	++tuna;
	System.out.println(tuna--);
	System.out.println(tuna);
	/*
double girls, boys, people;
girls = 11;
boys = 3;
people = girls % boys;
*/
}}
