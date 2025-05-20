class Ticket{
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNumber, String customerName, int seatNumber){
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }
    public int getTicketNumber(){
        return ticketNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public String bookedTicketDetails(){
        return "Ticket Number: " + ticketNumber + " Customer Name: " + customerName + " Seat Number: " + seatNumber;
    }
}

class BookingSystem{
    private Ticket[] tickets;
    private static final int MAX_SEATS = 10;

    public BookingSystem(){
        tickets = new Ticket[MAX_SEATS];
    }
    public boolean bookTicket(int ticketNumber, String customerName, int seatNumber){
        if (seatNumber < 1 || seatNumber > MAX_SEATS){
            System.out.println("Invalid seat number.");
            return false;
        }
        if (tickets[seatNumber - 1] != null){
            System.out.println("seat " + seatNumber + " is already booked.");
            return false;
        }
        tickets[seatNumber - 1] = new Ticket(ticketNumber, customerName, seatNumber);
        System.out.println("Ticket booked successfully for " + customerName + " at seat " + seatNumber);
        return true;
    }

    public boolean cancelTicket(int ticketNumber){
        for(int i = 0; i < MAX_SEATS; i++){
            if(tickets[i] != null && tickets[i].getTicketNumber() == ticketNumber){
                tickets[i] = null;
                System.out.println("Ticket " + ticketNumber + "cancelled successfully.");
                return true;
            }
        }
            System.out.println("Ticket " + ticketNumber + " not found.");
            return false;
    }
    public void displayBookings(){
        System.out.println("Current Booking: ");
        for(int i=0; i < tickets.length; i++){
            if (tickets[i] != null){
                System.out.println(tickets[i].bookedTicketDetails());
            }
        }
    }
}

class TicketBookingSystem{
    public static void main(String[] args){
        BookingSystem bookingSystem = new BookingSystem();

        bookingSystem.bookTicket(1, "Alice", 1);
        bookingSystem.bookTicket(2, "Bob", 2);
        bookingSystem.bookTicket(3, "Charlie", 3);

        bookingSystem.cancelTicket(2);

        bookingSystem.bookTicket(4, "David", 2);

        bookingSystem.displayBookings();
    }
}