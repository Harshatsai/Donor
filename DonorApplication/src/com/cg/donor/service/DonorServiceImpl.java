package com.cg.donor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.dao.IDonorDAO;
import com.cg.donor.dao.IDonorDAOimpl;
import com.cg.donor.exception.DonorException;

public class DonorServiceImpl implements IDonorService{
     IDonorDAO donordao=new IDonorDAOimpl();
	@Override
	public String addDonor(DonorBean donor) throws DonorException {
		String donorSeq; 
		donorSeq=donordao.addDonor(donor);
		return null;
	}

	@Override
	public DonorBean viewDonorDetails(String donorId) throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List retrieveAll() throws DonorException {
		// TODO Auto-generated method stub
		return null;
	}
	  public void validateDonor(DonorBean donorBean) throws DonorException
	  {
		    List<String> validationErrors =new ArrayList<String>();  
		  
	  
	
	if(!(isValidName(donorBean.getDoorName())))
	{
		validationErrors.add("\n Donar Name should be in Alphabets and minimum 3 Characters long!\n");
	}

	if(!(isValidAddress(donorBean.getAddress())))
	{
		validationErrors.add("\n Donar Name should be in Alphabets and minimum 3 Characters long!\n");
	}

	if(!(isValidPhoneNumber(donorBean.getPhoneNumber())))
	{
		validationErrors.add("\n Donar Name should be in Alphabets and minimum 3 Characters long!\n");
	}

	if(!(isValidAmount(donorBean.getDonatioAmount())))
	{
		validationErrors.add("\n Donar Name should be in Alphabets and minimum 3 Characters long!\n");
	}
	if(!validationErrors.isEmpty())
	   throw new DonorException(validationErrors +"");
	
	
	  }
	  private boolean isValidName(String doorName) {
			// TODO Auto-generated method stub
			Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
			Matcher nameMatcher=namePattern.matcher(doorName);
			return nameMatcher.matches();
		}

	private boolean isValidPhoneNumber(String phoneNumber) {
		Pattern phonePattern=Pattern.compile("^[6-9]{1}[0-9]{9}$");
		Matcher phoneMatcher=phonePattern.matcher(phoneNumber);
		
		return phoneMatcher.matches();
	}
private boolean isValidAmount(double donatioAmount) {
		
		return donatioAmount>0;
	}

	private boolean isValidAddress(String address) {
		// TODO Auto-generated method stub
		return (address.length() >6);
	}
	public boolean validateDonorId(String donorId)
	{
		 Pattern idPattern=Pattern.compile("[0-9]{1,4}");
		 Matcher idMatcher=idPattern.matcher(donorId);
		 if(idMatcher.matches())
			 
		return true;
		 else
			 return false;
		
	}

	
	
	

}
