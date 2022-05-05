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
    ///
    String ETA;
    int price;
    int boardingPassNo;


    //Constructors

    public Ticket() {
    }

    public Ticket(String passengerName, int passengerAge, String passengerEmail, String passengerGender, String passengerPhoneNo, String departureDate, String originAirport, String destinationAirport) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerEmail = passengerEmail;
        this.passengerGender = passengerGender;
        this.passengerPhoneNo = passengerPhoneNo;
        this.departureDate = departureDate;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
    }

    public Ticket(String passengerName, int passengerAge, String passengerEmail, String passengerGender, String passengerPhoneNo, String departureDate, String originAirport, String destinationAirport, String ETA, int price, int boardingPassNo) {
        this.passengerName = passengerName;
        this.passengerAge = passengerAge;
        this.passengerEmail = passengerEmail;
        this.passengerGender = passengerGender;
        this.passengerPhoneNo = passengerPhoneNo;
        this.departureDate = departureDate;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
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

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
                ", ETA='" + ETA + '\'' +
                ", price=" + price +
                ", boardingPassNo=" + boardingPassNo +
                '}';
    }

    //Methods
    public void addTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Passenger Name: ");
        this.setPassengerName(scanner.nextLine());
        System.out.print("Passanger Age: ");
        this.setPassengerAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Passanger Email: ");
        this.setPassengerEmail(scanner.nextLine());
        System.out.print("Passenger Gender: ");
        this.setPassengerGender(scanner.nextLine());
        System.out.print("Phone No: ");
        this.setPassengerPhoneNo(scanner.nextLine());
        System.out.print("Departure Date: ");
        this.setDepartureDate(scanner.nextLine());
        System.out.print("Origin Airport: ");
        this.setOriginAirport(scanner.nextLine());
        System.out.print("Destination Airport: ");
        this.setOriginAirport(scanner.nextLine());

        //this.shift = scanner.nextLine();
    }


}
