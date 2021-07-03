package com.adapt.capgemini.caseStudy;

public interface BookingDetailsService {
	void addBookingDetails(BookingDetails bookingDetails);
    BookingDetails updateBookingDetails(BookingDetails bookingDetails);
    void deleteBookingDetails(int bookingId);
    BookingDetails[] getBookingDetails();
    BookingDetails[] searchByUserId(int customerId);
    BookingDetails[] searchByBookingId(int bookingId);
}
class BookingDetailsServiceImpl implements BookingDetailsService{
	public static BookingDetails[] bookingDetailsArray=new BookingDetails[5];
	public static int count=0;
	@Override
	public  void addBookingDetails(BookingDetails bookingDetails) {
		bookingDetailsArray[count++]=bookingDetails;
		
	}

	@Override
	public BookingDetails updateBookingDetails(BookingDetails bookingDetails) {
		for (int i = 0; i < 5; i++) {
			if(bookingDetails.getBookingId()==bookingDetailsArray[i].getBookingId()) {
				bookingDetailsArray[i]=bookingDetails;
				return bookingDetailsArray[i];
			}
		}
		return null;
	}

	@Override
	public void deleteBookingDetails(int bookingId) {
		for (int i = 0; i < 5; i++) {
			if(bookingDetailsArray[i].getBookingId()==bookingId) {
				bookingDetailsArray[i]=null;
			}
		}
	}

	@Override
	public BookingDetails[] getBookingDetails() {
		return bookingDetailsArray;
	}

	@Override
	public BookingDetails[] searchByUserId(int customerId) {
		BookingDetails customerdetails[]=new BookingDetails[5];
		int j=0;
		for (int i = 0; i < 5; i++) {
			if(bookingDetailsArray[i].getCustomerId()==customerId) {
				customerdetails[j++]=bookingDetailsArray[i];
			}
		}
		return customerdetails;
		
	}

	@Override
	public BookingDetails[] searchByBookingId(int bookingId) {
		BookingDetails customerdetails[]=new BookingDetails[5];
		int j=0;
		for (int i = 0; i < 5; i++) {
			if(bookingDetailsArray[i].getCustomerId()==bookingId) {
				customerdetails[j++]=bookingDetailsArray[i];
			}
		}
		return customerdetails;
	}
	
}


interface UserService{
	void bookingDetails(BookingDetails bookingDetails);
	BookingDetails[] getBookingDetails(int userId);
}
class UserServiceImpl implements UserService
{
	@Override
	public void bookingDetails(BookingDetails bookingDetails) {
		new BookingDetailsServiceImpl().addBookingDetails(bookingDetails);
		
	}

	@Override
	public BookingDetails[] getBookingDetails(int userId) {
		return BookingDetailsServiceImpl.bookingDetailsArray;
	}
}
