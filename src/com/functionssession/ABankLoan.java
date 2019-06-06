package com.functionssession;

import java.util.ArrayList;

public class ABankLoan {
	public static void main(String[] args) {
		
	}
public void bankName()
{
	System.out.println("ABANK Loan Application and Details");
}

public String getApplicantName()
{
	String name = "Megan Copeland";
	System.out.println(name);
	return name;
}

public int getApplicantCategory()
{
	int category=2;
	System.out.println("Applicant comes under this category: ");
	return category;
}

public double getTotalAmount()
{
	double carprice = 12000;
	double loanapplied = 15500;
	double finalamount = carprice + loanapplied;
	return finalamount;
}

public boolean isEligible() {
	System.out.println("Is Applicant cleared Credit History check:");
	boolean flag = false;
	String Applicantname = "Megan";
	if(Applicantname.equalsIgnoreCase("Megan")) {
		System.out.println(Applicantname +" is eligible");
		flag = true;
	}
	return flag;
}
public float  paymentAmount(float interestamount,float monthlyinstalment)
{
	float payment = interestamount + monthlyinstalment;
	return payment;
}

public String[] loanTypeAndDetails(char l)
{	
	if(l == 'H')
	{
	String[] detailsofLoan = {"LocationofHouse","NoofBathrooms","New HouseorOldHouse"};	
	return detailsofLoan;
	}
	else if( l=='C')
	{
		String[] detailsofLoan = {"Car Model","Year of Making","Mileage"};
		return detailsofLoan;
	}
	else if(l=='S')
	{
		String[] detailsofLoan = {"Student average","Education Degree","PArents details"};
		return detailsofLoan;
	}
		
	else
	{
		System.out.println("No Loan details matched");
	}
	return null;
}

public ArrayList getApplicantDetails(String applicantName)
{
	ArrayList al = new ArrayList();
	if(applicantName.equalsIgnoreCase("Tom"))
	{
		al.add(arg0)
	}
	return al;
}
}