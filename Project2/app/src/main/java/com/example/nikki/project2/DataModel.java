package com.example.nikki.project2;

/**
 * Created by NIKKI on 30/12/2016.
 */

public class DataModel {

    String name;
    String address;
    String area;
    String city;
    String state;
    String website;
    String contactno;
    String facility;
    String timeslot;
    String capacity;
    String eventamount;
    String bookingamout;

    public DataModel(String name, String address, String area, String ciy, String state, String website, String contactno, String facility, String timeslot, String capacity, String eventamount, String bookingamout)
    {
        this.name=name;
        this.address=address;
        this.area=area;
        this.city=ciy;
        this.state=state;
        this.website=website;
        this.contactno=contactno;
        this.facility=facility;
        this.timeslot=timeslot;
        this.capacity=capacity;
        this.eventamount=eventamount;
        this.bookingamout=bookingamout;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getWebsite() {
        return website;
    }

    public String getContactno() {
        return contactno;
    }

    public String getFacility() {
        return facility;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getEventamount() {
        return eventamount;
    }

    public String getBookingamout() {
        return bookingamout;
    }
}
