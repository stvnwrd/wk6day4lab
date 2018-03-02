import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("June", "FF098765F", 90000.00, "Methodology Logistics");
    }

    @Test
    public void hasName() {
        assertEquals("June", manager.getName());
    }

    @Test
    public void setName() {
        manager.setName("Terry");
        assertEquals("Terry", manager.getName());
    }

    @Test
    public void preventNullForSetName() {
        manager.setName(null);
        assertEquals("June", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("FF098765F", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(90000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Methodology Logistics", manager.getDeptName());
    }


    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(95000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        manager.raiseSalary(-10000);
        assertEquals(90000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(900.00, manager.payBonus(), 0.01);
    }
}
