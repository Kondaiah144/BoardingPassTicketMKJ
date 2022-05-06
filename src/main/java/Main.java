import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Ticket> TicketArray = new ArrayList<Ticket>();
    private static Ticket ticket1 = new Ticket("John Doe", 33, "abc@gmail.com","male","123-123-1234", "01/01/2022","IAD", "FRN", 1000);
    private static Ticket tempTicket = new Ticket();

    public static void main(String[] args) throws ParseException {
//        Date d1 = new Date();
//        System.out.println("Current date is " + d1);
//        //Date d2 = new Date(2323223232L);
//        //System.out.println("Date represented is "+ d2 );
//
//        Date d3 = new Date(2022,01, 01);
//        System.out.println(d3);

        String sDate1="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1+"\t"+date1);

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
                    System.out.println("You selected to Delete a Ticket");
                    //register();
                    //foodMenu();
                    break;
                case 3:
                    System.out.println("You selected to Display Tickets Info...");
//                    for (Ticket ticket: TicketArray) {
//                        System.out.println("Index: " + TicketArray.indexOf(ticket));
//                        System.out.println("Passanger Name: " + ticket.getPassengerName());
//                        System.out.println("Age: " + ticket.getPassengerAge());
//                        System.out.println("Phone No: " + waiter.getPhoneNo());
//                        System.out.println("Employee ID: " + waiter.getEmployeeID());
//                        System.out.println("Shift: " + waiter.getShift());
//                        System.out.println();
//                      }

                    break;
                case 4:
                    System.out.println("You selected to Exit...");
                    System.exit(0);
                default:
                    System.out.println("Incorrect Entry, please select between 1-4");
            }
        }
    }

        public static int pickMenuEntry() {
            System.out.println("""
                =======================
                1- Book a Flight / Create a Ticket
                2- Delete Existing Ticket
                3- Display Tickets Info
                4- Exit
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
        TicketArray.add(tempTicket);

        System.out.println(TicketArray);

        tempTicket.calculatePrice();
        System.out.println("Ticket calculated price: " + tempTicket.getPrice());
        System.out.println(TicketArray);
        //tempTicket.setPrice();

        }


    }

