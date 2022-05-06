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
    ///
    String ETA;
    double price;
    int boardingPassNo;


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

    public Ticket(String passengerName, int passengerAge, String passengerEmail, String passengerGender, String passengerPhoneNo, String departureDate, String originAirport, String destinationAirport, int flightMiles, String ETA, double price, int boardingPassNo) {
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

    public int getBoardingPassNo() {
        return boardingPassNo;
    }

    public void setBoardingPassNo(int boardingPassNo) {
        this.boardingPassNo = boardingPassNo;
    }

    //To String
    @Override
    public String toString() {
        return "Ticket{" +
                "passengerName='" + passengerName + '\'' +
                ", passengerAge=" + passengerAge +
                ", passengerEmail='" + passengerEmail + '\'' +
                ", passengerGender='" + passengerGender + '\'' +
                ", passengerPhoneNo='" + passengerPhoneNo + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", originAirport='" + originAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", flightMiles=" + flightMiles +
                ", ETA='" + ETA + '\'' +
                ", price=" + price +
                ", boardingPassNo=" + boardingPassNo +
                '}';
    }

    //Methods
    public void addTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Passenger Name & Lastname: ");
        this.setPassengerName(scanner.nextLine());
        System.out.print("Passanger Age: ");
        this.setPassengerAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Passanger Email: ");
        this.setPassengerEmail(scanner.nextLine());
        System.out.print("Passenger Gender (male/female): ");
        this.setPassengerGender(scanner.nextLine());
        System.out.print("Phone No: ");
        this.setPassengerPhoneNo(scanner.nextLine());
        System.out.print("Departure Date: ");
        this.setDepartureDate(scanner.nextLine());
        System.out.print("Origin Airport: ");
        this.setOriginAirport(scanner.nextLine());
        System.out.print("Destination Airport: ");
        this.setOriginAirport(scanner.nextLine());
        System.out.print("Flight Miles: ");
        this.setFlightMiles(scanner.nextInt());
        scanner.nextLine();

        //this.shift = scanner.nextLine();
    }

    public void calculateETA() {

    }

    public void calculatePrice() {
        this.price = this.flightMiles*.1;
        if (this.getPassengerAge() <= 12){
            this.setPrice((int) (this.getPrice()*.50));
        } else if (this.getPassengerAge() >= 60){
            this.setPrice((int) (this.getPrice()*.40));
        } else if (this.getPassengerAge() > 12 && this.getPassengerAge()<60 && this.getPassengerGender().equals("female")){
            this.setPrice((int) (this.getPrice()*.75));
        }


    }

    public void calculateBoardingPassNo() {

    }


}
