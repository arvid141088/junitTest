package passengerEntryTests;

import org.junit.jupiter.api.Test;
import passenger_details.Passenger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    Passenger passenger;

    @Test
    void testPassenger(){
        passenger = new Passenger("Mr","John","1234567890","2222233333",17);
        assertEquals("Mr",passenger.getTitle());
        assertEquals("John",passenger.getName());
        assertEquals("1234567890",passenger.getId());
        assertEquals("2222233333",passenger.getPhone());
        assertEquals(17,passenger.getAge());
    }

    @Test
    void passengerFailTitle(){
        assertThrows(IllegalArgumentException.class,()->new Passenger("Mister","John","1234567890","2222233333",17));
    }

    @Test
    void passengerFailName(){
        assertThrows(IllegalArgumentException.class,()->new Passenger("Ms","Lu","1234567890","2222233333",17));
    }

    @Test
    void passengerFailId(){
        assertThrows(IllegalArgumentException.class,()->new Passenger("Mr","Luke","12345","2222233333",17));
    }
    @Test
    void passengerFailPhone(){
        assertThrows(IllegalArgumentException.class,()->new Passenger("Ms","Luke","1234567890","123",17));
    }
    @Test
    void passengerFailAge(){
        assertThrows(IllegalArgumentException.class,()->new Passenger("Mrs","Jane","1234567890","2222233333",10));
    }


}
