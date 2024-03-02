package finalsProject;

import java.time.LocalDate;

import finalsProject.BookingStorage.RoomType;


//builder pattern
public class Booking { 
	private int id;
	
	private LocalDate checkInDate;
	private LocalDate checkOutDate;

	private int adult;
	private int children;
	private long numOfDays;
	private int numOfGuests;

	private double totalPrice;
	
	private RoomType roomType;
	
	public int getId() {
		return this.id;
	}
	
	public Booking setId(int num) {
		id = num;
		
		return this;
	}

	public LocalDate getCheckInDate() {
		return this.checkInDate;
	}

	public Booking setCheckInDate(LocalDate date) {
		checkInDate = date;

		return this;
	}

	public LocalDate getCheckOutDate() {
		return this.checkOutDate;
	}

	public Booking setCheckOutDate(LocalDate date) {
		checkOutDate = date;

		return this;
	}

	public int getAdult() {
		return this.adult;
	}

	public Booking setAdult(int num) {
		adult = num;

		return this;
	}

	public int getChildren() {
		return this.children;
	}

	public Booking setChildren(int num) {
		children = num;

		return this;
	}

	public long getNumOfDays() {
		return this.numOfDays;
	}

	public Booking setNumOfDays(long num) {
		numOfDays = num;

		return this;
	}

	public int getNumOfGuests() {
		return this.numOfGuests;
	}

	public Booking setNumOfGuests(int num) {
		numOfGuests = num;

		return this;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public Booking setTotalPrice(double num) {
		totalPrice = num;

		return this;
	}

	public RoomType getRoomType() {
		return this.roomType;
	}

	public Booking setRoomType(RoomType type) {
		roomType = type;

		return this;
	}

}
