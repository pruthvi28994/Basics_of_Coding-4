package com.adapt.capgemini.caseStudy;

interface AdminService {
		public void createServiceDetails(ServiceDetails serviceDetails);
		ServiceDetails updateServiceDetails(ServiceDetails serviceDetails) throws ServiceDetailsNotFoundException;
		void deleteServiceDetails(int i) throws ServiceDetailsNotFoundException;
		ServiceDetails searchServiceDetails(int id) throws ServiceDetailsNotFoundException;
		ServiceDetails[] getServiceDetails();
}

class AdminServiceImpl implements AdminService{
	public static ServiceDetails[] serviceDetailsArray=new ServiceDetails[5];
	public static int count=0;
	@Override
	public void createServiceDetails(ServiceDetails serviceDetails) {
		serviceDetailsArray[count++]=serviceDetails;
		
	}

	@Override
	public ServiceDetails updateServiceDetails(ServiceDetails serviceDetails) throws ServiceDetailsNotFoundException{
		for(int i=0;i<5;i++) {
			if(serviceDetails.getServiceId()==serviceDetailsArray[i].getServiceId()) {
				serviceDetailsArray[i]=serviceDetails;
				return serviceDetailsArray[i];
			}
		}
		throw new ServiceDetailsNotFoundException();
	}

	@Override
	public void deleteServiceDetails(int id) throws ServiceDetailsNotFoundException{
		for(int i=0;i<5;i++) {
			if(serviceDetailsArray[i].getServiceId()==id) {
				serviceDetailsArray[i]=null;
			}
		}
		throw new ServiceDetailsNotFoundException();
	}

	@Override
	public ServiceDetails searchServiceDetails(int id) throws ServiceDetailsNotFoundException {
		for(int i=0;i<5;i++) {
			if(serviceDetailsArray[i].getServiceId()==id) {
				return serviceDetailsArray[i];
			}
		}
		throw new ServiceDetailsNotFoundException();
	}

	@Override
	public ServiceDetails[] getServiceDetails() {
		
		return serviceDetailsArray;
	}
	
}
