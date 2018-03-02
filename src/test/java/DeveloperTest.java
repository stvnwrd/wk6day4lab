import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Frank", "AB123456C", 70000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Frank", developer.getName());
    }

    @Test
    public void setName() {
        developer.setName("Frances");
        assertEquals("Frances", developer.getName());
    }

    @Test
    public void preventNullForSetName() {
        developer.setName(null);
        assertEquals("Frank", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("AB123456C", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(70000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(50.02);
        assertEquals(70050.02, developer.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        developer.raiseSalary(-10000);
        assertEquals(70000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(700.00, developer.payBonus(), 0.01);
    }
}
