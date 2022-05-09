import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Ticket> TicketArray = new ArrayList<Ticket>();
    // Example ticket "ticket1":
    private static Ticket ticket1 = new Ticket("John Doe", 33, "abc@gmail.com", "male", "123-123-1234", "01/01/2022", "IAD", "FRN", 1000);
    // tempTicket will be used when getting entry from user, to add to TicketArray (Array List of "Ticket" objects:
    private static Ticket tempTicket = new Ticket();
    // private static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    private static Path filePath = Paths.get("C:\\java-Training\\java-projects\\BoardingPassTicketMKJ\\BoardingPassTicketMKJ\\src\\main\\resources\\ticket.txt");

    public static void main(String[] args) throws ParseException {
//        Date d1 = new Date();
//        System.out.println("Current date is " + d1);
//        //Date d2 = new Date(2323223232L);
//        //System.out.println("Date represented is "+ d2 );
//
//        Date d3 = new Date(2022,01, 01);
//        System.out.println(d3);

//        String sDate1="31/12/1998";
//        //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//        Date date1 = dateFormatter.parse(sDate1);
//        System.out.println(sDate1+"\t"+date1);
//        System.out.println(date1+1);


        menuEntry();

    }

    public static void menuEntry() {
        System.out.println("""
                \n======================================================================
                Welcome to ACME Airways. You are going on a trip.  This application
                will assits you in getting you a boarding pass / ticket.  Please read
                the prompts carefully to get you through this process as quickly a possible.
                ========================================================================
                """);

        while (true) {
            switch (pickMenuEntry()) {
                case 1:
                    System.out.println("You selected to Book a Flight / Create a Ticket...");
                    createTicket();
                    break;
                case 2:
                    System.out.println("You selected to Display Tickets Info...");
                    for (Ticket ticket : TicketArray) {
                        System.out.println("Index: " + TicketArray.indexOf(ticket));
                        System.out.println("Passanger Name: " + ticket.getPassengerName());
                        System.out.println("Age: " + ticket.getPassengerAge());
                        System.out.println("Email: " + ticket.getPassengerEmail());
                        System.out.println("Gender: " + ticket.getPassengerGender());
                        System.out.println("Phone No: " + ticket.getPassengerPhoneNo());
                        System.out.println("Departure Date: " + ticket.getDepartureDate());
                        System.out.println("Origin Airport: " + ticket.getOriginAirport());
                        System.out.println("Destination Airport: " + ticket.getDestinationAirport());
                        System.out.println("Flight Miles: " + ticket.getFlightMiles());
                        System.out.println("ETA: " + ticket.getETA());
                        System.out.println("Price: " + ticket.getPrice());
                        System.out.println("Boarding Pass No: " + ticket.getBoardingPassNo());

                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("You selected to Exit...");
                    System.exit(0);
                default:
                    System.out.println("Incorrect Entry, please select between 1-3");
            }
        }
    }

    public static int pickMenuEntry() {
        System.out.print("""
                =======================
                1- Book a Flight / Create a Ticket
                2- Display Tickets Info
                3- Exit
                =======================
                    """);
        return scanner.nextInt();
    }

    public static void createTicket() {
        //add test ticket1
//        TicketArray.add(ticket1);
//        System.out.println(ticket1);

        //add tempTicket
        tempTicket.addTicket();
        tempTicket.calculatePrice();
        System.out.println();  // Empty line
        System.out.println("Ticket price ($1 per 10 miles is list price): " + tempTicket.getPrice());
        //tempTicket.setPrice();

        // Calc ETA:
        tempTicket.calculateETA();
        //System.out.println("Ticket calculated ETA: " + tempTicket.getETA());

        // Calculate Boarding Pass No:
        tempTicket.calculateBoardingPassNo();
        //System.out.println("Boarding Pass Ticket No: " + tempTicket.getBoardingPassNo());

        //Finally add ticket to Ticket Array and print out the array:
        TicketArray.add(tempTicket);
        System.out.println("//// TicketArray as below ////");  // To be removed
        System.out.println(TicketArray);


        //---Create file
        // if (createdFilePath != null) {
        if (Files.exists(filePath)) {
            System.out.println("\nFile already exists.");
        } else {
            System.out.println("\nCalling the create a file method...");
            createAFile();
        }

        //---Update the file with the new Ticket info
        System.out.println("\nCalling the update a file method...");
        //writeToAFile(firstName,lastName,age,userID,password);
        writeToAFile(tempTicket);


    }

    //Creating file
    public static void createAFile() {
        try {
            Files.createFile(filePath);
            System.out.println("File created: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Write to a file
    public static void writeToAFile(Ticket tempTicket)  {
        try {
            Files.writeString(filePath, "Index: " + TicketArray.indexOf(tempTicket) + "," + "\n");
            Files.writeString(filePath, "Passenger Name: " + tempTicket.getPassengerName() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Age: " + tempTicket.getPassengerAge() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Email: " +tempTicket.getPassengerEmail() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Gender: " + tempTicket.getPassengerGender() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Phone No: " +tempTicket.getPassengerPhoneNo() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Departure Date: " + tempTicket.getDepartureDate() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Origin Airport: " +tempTicket.getOriginAirport() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Destination Airport: " +tempTicket.getDestinationAirport() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Flight Miles: " +String.valueOf(tempTicket.getFlightMiles()) + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "ETA: " +tempTicket.getETA() + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Price($): " +String.valueOf(tempTicket.getPrice()) + "," + "\n", StandardOpenOption.APPEND);
            Files.writeString(filePath, "Boarding Pass No: " +tempTicket.getBoardingPassNo() + "," + "\n", StandardOpenOption.APPEND);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
