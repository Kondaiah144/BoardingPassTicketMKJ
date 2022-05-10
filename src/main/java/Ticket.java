import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ticket {
    //Fields
    String passengerName;
    int passengerAge;
    String passengerEmail;
    String passengerGender;
    String passengerPhoneNo;
    String departureDate;
    String originAirport;
    String destinationAirport;
    int flightMiles;
    /// Following will be calculated:
    String ETA;
    double price;
    String boardingPassNo;


    //Constructors

    public Ticket() {
    }

    public Ticket(String passengerName, int passengerAge, String passengerEmail, String passengerGender, String passengerPhoneNo, String departureDate, String originAirport, String destinationAirport, int flightMiles) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerEmail = passengerEmail;
        this.passengerGender = passengerGender;
        this.passengerPhoneNo = passengerPhoneNo;
        this.departureDate = departureDate;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.flightMiles = flightMiles;
    }

    public Ticket(String passengerName, int passengerAge, String passengerEmail, String passengerGender, String passengerPhoneNo, String departureDate, String originAirport, String destinationAirport, int flightMiles, String ETA, double price, String boardingPassNo) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerEmail = passengerEmail;
        this.passengerGender = passengerGender;
        this.passengerPhoneNo = passengerPhoneNo;
        this.departureDate = departureDate;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.flightMiles = flightMiles;
        this.ETA = ETA;
        this.price = price;
        this.boardingPassNo = boardingPassNo;
    }

    // Getters and Setters

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getPassengerGender() {
        return passengerGender;
    }

    public void setPassengerGender(String passengerGender) {
        this.passengerGender = passengerGender;
    }

    public String getPassengerPhoneNo() {
        return passengerPhoneNo;
    }

    public void setPassengerPhoneNo(String passengerPhoneNo) {
        this.passengerPhoneNo = passengerPhoneNo;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public int getFlightMiles() {
        return flightMiles;
    }

    public void setFlightMiles(int flightMiles) {
        this.flightMiles = flightMiles;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBoardingPassNo() {
        return boardingPassNo;
    }

    public void setBoardingPassNo(String boardingPassNo) {
        this.boardingPassNo = boardingPassNo;
    }

    //To String
    @Override
    public String toString() {
        return "Ticket{" +
                "passengerName='" + passengerName + '\'' + "\n"+
                ", passengerAge=" + passengerAge + "\n"+
                ", passengerEmail='" + passengerEmail + '\'' + "\n"+
                ", passengerGender='" + passengerGender + '\'' + "\n"+
                ", passengerPhoneNo='" + passengerPhoneNo + '\'' + "\n"+
                ", departureDate='" + departureDate + '\'' + "\n"+
                ", originAirport='" + originAirport + '\'' + "\n"+
                ", destinationAirport='" + destinationAirport + '\'' + "\n"+
                ", flightMiles=" + flightMiles + "\n"+
                ", ETA='" + ETA + '\'' + "\n"+
                ", price($)=" + price + "\n"+
                ", boardingPassNo=" + boardingPassNo + "\n"+
                '}';
    }

    //Methods
    public void addTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Passenger Name & Lastname: ");
        this.setPassengerName(scanner.nextLine());
        System.out.print("Passenger Age: ");
        this.setPassengerAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Passenger Email: ");
        this.setPassengerEmail(scanner.nextLine());
        System.out.print("Gender (male/female): ");
        this.setPassengerGender(scanner.nextLine());
        System.out.print("Phone No: ");
        this.setPassengerPhoneNo(scanner.nextLine());
        System.out.print("Departure Date (DD/MM/YYYY): ");
        this.setDepartureDate(scanner.nextLine());
        System.out.print("Origin Airport - Three Digit Code: ");
        this.setOriginAirport(scanner.nextLine().toUpperCase());
        System.out.print("Destination Airport - Three Digit Code: ");
        this.setDestinationAirport(scanner.nextLine().toUpperCase());
        System.out.print("Flight Miles: ");
        this.setFlightMiles(scanner.nextInt());
        scanner.nextLine();
        //this.shift = scanner.nextLine();
    }

    public void calculateETA() {
        // https://beginnersbook.com/2017/10/java-add-days-to-date/
        // Calculate days to add per flight Miles ....(MM)
        double daysToAddDouble = this.flightMiles*.001;
        int daysToAdd = (int) daysToAddDouble;

        //Given Date in String format
        String oldDate = this.getDepartureDate();
        System.out.println("Original Departure Date (before addition): "+oldDate);
        //Specifying date format that matches the given date:
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        try{
            //Setting the date to the given date
            c.setTime(sdf.parse(oldDate));
        }catch(ParseException e){
            e.printStackTrace();
        }
        //Number of Days to add
        c.add(Calendar.DAY_OF_MONTH, daysToAdd);
        //Date after adding the days to the given date
        String newDate = sdf.format(c.getTime());
        //Displaying the new Date after addition of Days
        System.out.println("New ETA Date after Addition of Days (1 day per 1000 miles): "+newDate);
        // Set the ETA with added number of days.... (MM)
        this.setETA(newDate);
    }

    public double calculatePrice() {
        this.price = this.flightMiles*.1;
        if (this.getPassengerAge() <= 12){
            this.setPrice((int) (this.getPrice()*.50));
        } else if (this.getPassengerAge() >= 60){
            this.setPrice((int) (this.getPrice()*.40));
        } else if (this.getPassengerAge() > 12 && this.getPassengerAge()<60 && this.getPassengerGender().equals("female")){
            this.setPrice((int) (this.getPrice()*.75));
        }
        System.out.println();  // Empty line
        System.out.println("Ticket price ($1 per 10 miles is list price): " + this.getPrice());
        // Return the calculated price:
        return this.price;  //for Test purposes here
    }

    public void calculateBoardingPassNo() {
        // ACME + Origin Airport + Dest Airport + currentTimeMillis() method returns the current time in milliseconds since 1/1/1970
        this.setBoardingPassNo("ACME-" + this.getOriginAirport() + "-" + this.getDestinationAirport() + "-" + System.currentTimeMillis());
        System.out.println("Boarding Pass Ticket No: " + this.getBoardingPassNo());

    }


}
