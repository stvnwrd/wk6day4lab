import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Lorraine", "JJ999999J", 120000.00, "Methodology Logistics & Incremental Semantic Enhancement", 20000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Lorraine", director.getName());
    }

    @Test
    public void setName() {
        director.setName("George");
        assertEquals("George", director.getName());
    }

    @Test
    public void preventNullForSetName() {
        director.setName(null);
        assertEquals("Lorraine", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JJ999999J", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(120000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Methodology Logistics & Incremental Semantic Enhancement", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(20000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(0.01);
        assertEquals(120000.01, director.getSalary(), 0.01);
    }

    @Test
    public void preventsNegativeRaise(){
        director.raiseSalary(-10000);
        assertEquals(120000.00, director.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(2400.00, director.payBonus(), 0.01);
    }

}
