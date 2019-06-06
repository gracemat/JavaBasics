package com.functionssession;

import java.util.ArrayList;

public class ABankLoan {
	public static void main(String[] args) {
		ABankLoan obj = new ABankLoan();
		obj.bankName();
		
		String applname = obj.getApplicantName();
		System.out.println(applname);
		
		int c=obj.getApplicantCategory();
		System.out.println(c);
		
		double am=obj.getTotalAmount();
		System.out.println(am);
		
		System.out.println(obj.isEligible());
		
		double payamount = obj.paymentAmount(2020.5f, 100.5f);
		System.out.println(payamount);
		
		String loan=obj.getDiffLoan("Home");
		System.out.println(loan);

		String loanarrDetails[] = obj.loanTypeAndDetails('h');
		//System.out.println(loanarrDetails);
		for(int i=0;i<loanarrDetails.length;i++) {
		System.out.println(loanarrDetails[i]);
		}
		
		ArrayList<Object> arrobj = obj.getApplicantDetails("Ram");
		System.out.println(arrobj);
		
		ArrayList<Object> arrobj2 = obj.getApplicantDetails("Tom");
		for(int i=0;i<4;i++)
			{
			System.out.println(arrobj2.get(i));
			}
		
		
	
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
	double registration = 5500;
	double finalamount = carprice + registration;
	return finalamount;
}

public boolean isEligible() {//we need two return statements here one for if block and other for method
	System.out.println("Is Applicant cleared Credit History check:");
	boolean flag = false;
	String Applicantname = "Megan";
	if(Applicantname.equalsIgnoreCase("Megan")) {
		System.out.println(Applicantname +" is eligible");
		flag = true;
	}
	return flag;
}

public float  paymentAmount(float interestamount,float monthlyinstalment)//Generic method
{
	System.out.println("Payment this month is: ");
	float payment = interestamount + monthlyinstalment;
	return payment;
}

public String getDiffLoan(String loanName) {
	if(loanName.equalsIgnoreCase("Home"))
	{
		return "12-years";
	}
	else if(loanName.equalsIgnoreCase("Vehicle"))
	{
		return "6-years";
	}
	else if(loanName.equalsIgnoreCase("Student"))
	{
		return "10 years";
	}
	else
	{
		System.out.println("No specific Loan");
	}
	return null;
}

public String[] loanTypeAndDetails(char l)//to get result as many values you can use Array or ArrayList
{	
	if(l == 'H'|| l=='h')
	{
	String[] detailsofLoan = {"LocationofHouse","NoofBedrooms","NoofBathrooms","New House or Old House"};	
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

public ArrayList<Object> getApplicantDetails(String applicantName)
{
	ArrayList<Object> al = new ArrayList<Object>();
	if(applicantName.equalsIgnoreCase("Tom"))
	{
		al.add("Home Loan");
		al.add(2200);
		al.add(12);
		al.add(300000);
	}
	else if(applicantName.equalsIgnoreCase("Ram"))
	{
		al.add("Student Loan");
		al.add(1200);
		al.add(6);
		al.add(100000);
	}
	else if(applicantName.equalsIgnoreCase("Alice"))
	{
		al.add("Vehicle Loan");
		al.add(900);
		al.add(5);
		al.add(10000);
	}
	
	return al;
}
}