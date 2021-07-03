package com.adapt.capgemini.caseStudy;

public interface CustomerService {
		public void createCustomer(Customer customer);
		Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
		public Customer searchCustomer(int id) throws CustomerNotFoundException;
		public void deleteCustomer(int id) throws CustomerNotFoundException;
		Customer[] getCustomers();
}
class CustomerServiceImpl implements CustomerService{
	public static Customer[] customerArray=new Customer[5];
	public static int count=0;
	@Override
	public void createCustomer(Customer customer) {
		customerArray[count++]=customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		for(int i=0;i<5;i++) {
			if(customerArray[i].getUserId()==customer.getUserId()) {
				//do update operations
				customerArray[i]=customer;
			}
		}
		throw new CustomerNotFoundException();
	}

	@Override
	public Customer searchCustomer(int id) throws CustomerNotFoundException{
		for(int i=0;i<5;i++) {
			if(customerArray[i].getUserId()==id)
				return customerArray[i];
		}
	    throw new CustomerNotFoundException();
	}

	@Override
	public void deleteCustomer(int id) throws CustomerNotFoundException {
		for(int i=0;i<5;i++) {
			if(customerArray[i].getUserId()==id)
				customerArray[i]=null;
		}
	    throw new CustomerNotFoundException();
		
	}

	@Override
	public Customer[] getCustomers() {
		return customerArray;
	}
	
}
