package com.adapt.capgemini.caseStudy;

class BookingDetails
{
    private int bookingId;
    private int customerId;
    private int userId;
    private String status;
    
    BookingDetails(){
    }
    
    BookingDetails(int bookingId,int customerId,int userId,String status)
    {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.userId = userId;
        this.status = status;
    }
    
    public int getBookingId()
    {
        return bookingId;
    }
    
    public void setBookingId(int bookingId)
    {
        this.bookingId = bookingId;
    }
    
    public int getCustomerId()
    {
        return customerId;
    }
    
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
    
    public int getUserId()
    {
        return userId;
    }
    
    public void setUserId(int userId)
    {
        this.userId = userId;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
}
