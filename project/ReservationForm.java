package project;

import java.time.LocalDate;

import java.util.Scanner;

public class ReservationForm extends  Reservation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReservationForm dd = new ReservationForm();
		
		
		System.out.println(dd.s);
		
		firstone();
		secondone();
		System.out.println(dd.d);
		thirdone();
		fourthone();
		
		System.out.println(Date);
		
		LocalDate id = LocalDate.now();
		System.out.println(id);
		fifthone();
		done();
		ten();
			
	}
	public static void firstone() {
		System.out.println(B);
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
	}
	public static void secondone() {
		System.out.println(c);
		Scanner sc = new Scanner(System.in);
		String gender = sc.next();
	}
	public static void thirdone() {
		System.out.println(k);
		Scanner sc = new Scanner(System.in);
		String from = sc.next();
	}
	public static void fourthone() {
		System.out.println(h);
		Scanner sc = new Scanner(System.in);
		String to = sc.next();
	}
	public static void fifthone() {
		System.out.println(fine);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		Scanner sc = new Scanner(System.in);
		int clause = sc.nextInt();
		System.out.println(coach);
		
		
		
		switch(clause) {
		case 1 : 
			System.out.println("Charges are Rocket high, \nFull of Security,\nPets allowed");
			break;
			
		case 2 :
			System.out.println("4Compartment + 2side compart, \nAverage Fare,\nNo pets allowed");
			break;
		case 3 :
			System.out.println("6:2 Compartment, \nAverage Rush and Less laguage space,\n Food not provided");
		break;
		case 4 :
			System.out.println("less privacy, \nNo spaces to sleep,\nvery less laguage Space");
			break;
		case 5 :
			System.out.println("No privacy, \nheavy Rush,\nall are unreserved coach b");
			break;
			
		}
	
		System.out.println(Email);
		String mail = sc.next();
		
		
		
	    
		
			 
				System.out.println(age);
				
				int no2 = sc.nextInt();
			
		
		
		if(clause==1 && no2<10) {
			System.out.println("For First Class-AC Your Ticket Price is : 450");
		}
		else if(clause==1 && no2>10) {
			System.out.println("For First Class-AC Your Ticket Price is : 650");
		}else if(clause==1 && no2>25){
			System.out.println("For First Class-AC Your Ticket Price is : 750");
		}else if(clause==1 && no2>40) {
			System.out.println("For First Class-AC Your Ticket Price is : 950");
		}
		else if(clause==2 && no2<10) {
			System.out.println("For First Class AC-2Tier Your Ticket Price is : 400");
		}
		else if(clause==2 && no2>10) {
			System.out.println("For First Class AC-2Tier Your Ticket Price is : 600");
		}else if(clause==2 && no2>25){
			System.out.println("For First Class AC-2Tier Your Ticket Price is : 700");
		}else if(clause==2 && no2>40) {
			System.out.println("For First Class AC-2Tier Your Ticket Price is : 900");
		}
		
		else if(clause==3 && no2<10) {
			System.out.println("For First Class AC-3Tier Your Ticket Price is : 350");
		}
		else if(clause==3 && no2>10) {
			System.out.println("For First Class AC-3Tier Your Ticket Price is : 500");
		}else if(clause==3 && no2>25){
			System.out.println("For First Class AC-3Tier Your Ticket Price is : 700");
		}else if(clause==3 && no2>40) {
			System.out.println("For First Class AC-3Tier Your Ticket Price is : 800");
	}
		else if(clause==4 && no2<10) {
		System.out.println("For Second Class Your Ticket Price is : 250");
	}
	else if(clause==4 && no2>10) {
		System.out.println("For Second Class Your Ticket Price is : 450");
	}else if(clause==4 && no2>25){
		System.out.println("For Second Class Your Ticket Price is : 500");
	}else if(clause==4 && no2>40) {
		System.out.println("For Second Class Your Ticket Price is : 500");
	}
	else if(clause==5 && no2<10) {
			System.out.println("For Third Class Your Ticket Price is : 150");
		}
		else if(clause==5 && no2>10) {
			System.out.println("For Third Class Your Ticket Price is : 200");
		}else if(clause==5 && no2>25){
			System.out.println("For Third Class Your Ticket Price is : 250");
		}else if(clause==5 && no2>40) {
			System.out.println("For Third Class Your Ticket Price is : 300");
			
		}else {
			System.out.println("no tickets available");
		}
		
		System.out.println(day);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		LocalDate travel = LocalDate.of(year, month, day);
		System.out.println(travel);
		System.out.println(train);
		if(month<=2) {
			System.out.println("Mangalore Mail Express at 8.00am ,\nVaigai Express at 12.30pm ,\nBrindhavan Express at 5.00pm");
		}
		else if(month>2) {
			
			System.out.println("Ajanta Express at 9.00am ,\nBlack Diamond Express at 2.00pm ,\nChalukya Express at 7.00pm");
		}else if(month>4) {
			System.out.println("Chamundi Express at 10.00am ,\nChennai mail Express at 1.00pm ,\nFlying Ranee Express at 6.30pm");
		}else if(month>6) {
			System.out.println("Hool Express at 9.30am ,\nKonark Express at 2.30pm ,\nKongu Express at 7.30pm");
		}else if(month>8) {
			System.out.println("Kovai Express at 10.30pm ,\nMithila Express at 3.00pm ,\nNellai Express at 8.00pm");
		}else if(month>10) {
			System.out.println("Pallavan Express at 10.00am ,\nTaj Express at 2.30pm ,\nTippu Express at 7.30pm");
		}else {
			System.out.println("no trians available");
		}
		
		
			System.out.println(choose);
			String nm = sc.next();
		
		
		}
	public static void done() {

	System.out.println(MobileNo);
	Scanner sc = new Scanner(System.in);
	
    	try {
    		int no =sc.nextInt();
    	}
    	catch(Exception e) {
    		System.out.println("ERROR IN TYPING MOBILE NUMBER");
    	}
	}

	public static void ten() {
		String[] str = {"Enter Your Payment Method :","UPI","DEBIT CARD","CREDIT CARD"};
		for(String ss:str) {
			System.out.println(ss);
			}
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		
		if(payment==1) {
			System.out.println("UPI");
		}else if(payment==2) {
			System.out.println("DEBIT CARD");
		}else if (payment==3){
			System.out.println("CREDIT CARD");
		}else {
			System.out.println("Choose any one");
		}
		
		if(payment==1) {
			System.out.println("Enter Your UPI PIN Number :");
			int oo = sc.nextInt();
			System.out.println("Make the payment");
		}else if(payment==2) {
			System.out.println("Enter Your Debit Card Number :");
			int tt = sc.nextInt();
			System.out.println("Enter Your CVV Code :");
			int gg = sc.nextInt();
			System.out.println("Make the payment");
			
		}else if(payment==3) {
			System.out.println("Enter Your Credit Card Number :");
			int ff = sc.nextInt();
			System.out.println("Enter Your CVV Code :");
			int pp = sc.nextInt();
			System.out.println("Make the payment");
		}
		
		System.out.println("YOU COMPLETED YOUR RESERVATION SUCCESSFULLY !!!");
		
		System.out.println("It will take some time to book your ticket");
		
		
		System.out.println("THANKS FOR REACHING US !!!!");
		
		
		
		
		
	
	}

	
	
}
