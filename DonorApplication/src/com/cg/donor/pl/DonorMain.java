package com.cg.donor.pl;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.exception.DonorException;
import com.cg.donor.service.DonorServiceImpl;
import com.cg.donor.service.IDonorService;

public class DonorMain {

static Scanner sc=new Scanner(System.in);
static IDonorService donorService=null;
static DonorServiceImpl donorServiceImpl=null;


public static void main(String args[])
{
	DonorBean donorBean=null;
	String donorId=null;
	int Option=0;
	while(true)

{
	   System.out.println();
	   System.out.println();
	   System.out.println("ICARE CAPGEMINI TRUST");
	   System.out.println("-----------------------------\n");
	   
	   
	   System.out.println("1.Add Donator");
	   System.out.println("2.view Donator");
	   System.out.println("3.Retrieve all Donator");
	   System.out.println("4.Exit");
	   System.out.println("-------------------");
	   System.out.println("select an option");
	   try
	   {
		   Option=sc.nextInt();
		   switch (Option)
		   {
		   case 1:
			      while(donorBean==null)
			      {
			    	  donorBean=PopulateDonorBean();
			      }
			      try
			      {
			    	  donorService=new DonorServiceImpl();
			    	  donorId=donorService.addDonor(donorBean);
			    	  System.out.println("Donor details has been successfully registered");
			    	  System.out.println("Donator ID is:"+ donorId);
			      }
			      catch(DonorException donorException)
			      {
			    	  System.err.println("ERROR:"+donorException.getMessage());
			      }
			      finally
			      {
			    	  donorId=null;
			    	  donorService=null;
			    	  donorBean=null;
			      }
			    	  break;
		   case 2:
			   
			       break;
		   case 3:
			   
		       break;
		   case 4:
			   
		       break;
		   default:
			   
		       break;
			     
		   }
	   }
	   catch(Exception e)
	   {
		   
	   }
  }
}


private static DonorBean PopulateDonorBean() throws DonorException {
	  DonorBean donorBean=new DonorBean();
	  System.out.println("Enter the Donor name");
	    donorBean.setDoorName(sc.next());
	  
	  System.out.println("Enter number:");
	     donorBean.setPhoneNumber(sc.next());
	  System.out.println("Enter donor address");
	     donorBean.setAddress(sc.next());
	  System.out.println("Enter the donor amount");
	     donorBean.setDonatioAmount(sc.nextFloat());
	  System.out.println("Enter the donation amount");
	  try
	  {
		  donorBean.setDonatioAmount(sc.nextFloat());
	  }
	  catch(InputMismatchException im)
	  {
		  sc.nextLine();
		   System.out.println("please enter a numeric value for donation amount,try again");
	  }
	   donorServiceImpl=new DonorServiceImpl();
	    
	  try{
		  donorServiceImpl.validateDonor(donorBean);
		  return donorBean;
	  }
	  catch(DonorException  donorException)
	  {
		   System.err.println("Invalid data:");
		   System.err.println(donorException.getMessage()+"\n Try again..");
		   System.exit(0);
		   
	  }
	return null;
}

}
