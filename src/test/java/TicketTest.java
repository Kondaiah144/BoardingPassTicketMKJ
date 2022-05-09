import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    Ticket ticket = new Ticket("John Doe", 33, "abc@gmail.com", "male", "123-123-1234", "01/01/2022", "IAD", "FRN", 1000);


    @Test
    void setPassengerNameTest() {
        ticket.setPassengerName("Joe Doe");
        Assertions.assertEquals("Joe Doe", ticket.getPassengerName());
    }

    @Test
    void calculatePriceTest() {
        Assertions.assertEquals(100, ticket.calculatePrice());
    }
}