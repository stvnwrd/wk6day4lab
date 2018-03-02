import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Henry", "ZZ555555Z", 27000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Henry", databaseAdmin.getName());
    }


    @Test
    public void setName() {
        databaseAdmin.setName("Anne");
        assertEquals("Anne", databaseAdmin.getName());
    }

    @Test
    public void preventNullForSetName() {
        databaseAdmin.setName(null);
        assertEquals("Henry", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("ZZ555555Z", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(27000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(29000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        databaseAdmin.raiseSalary(-10000);
        assertEquals(27000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(270.00, databaseAdmin.payBonus(), 0.01);
    }

}
