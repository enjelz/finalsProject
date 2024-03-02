package finalsProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingStorage {
	public enum RoomType {
		STANDARD, DELUXE, LUXURY,
	}

	public static List<Booking> data = new ArrayList<Booking>();

	public static boolean isBookingAvailable(RoomType type, LocalDate checkIn, LocalDate checkOut) {
		for (Booking booking : data) {
			if (booking.getRoomType() == type) {

				LocalDate current_checkIn = booking.getCheckInDate();
				LocalDate current_checkOut = booking.getCheckOutDate();

	            // Check for overlap
	            if (checkIn.isBefore(current_checkOut) && checkOut.isAfter(current_checkIn)) {
	                // There's an overlap, so booking is not available
	                return false;
	            }
			}
		}

		return true;
	}

	public static void addBooking(Booking booking) {
		int newId = 1;
		
		for (Booking existing: data) {
			newId = existing.getId() + 1; 
		}
		
		data.add(booking.setId(newId));
	}

}
