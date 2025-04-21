
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngan
 */
public class StudentTest {
    @Test
    public void testGetName() {
        Student s = new Student("S001", "Alice", 20);
        assertEquals(s.getName(), "Alice");
    }

    @Test
    public void testSetAge() {
        Student s = new Student("S002", "Bob", 22);
        s.setAge(25);
        assertEquals(s.getAge(), 25);
    }

    @Test
    public void testUpdateName() {
        Student s = new Student("S003", "Charlie", 21);
        s.updateName("David");
        assertEquals(s.getName(), "David");
    }
    
}