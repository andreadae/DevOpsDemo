package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testPerson() {
        var Person1 = new Person(1, "name");
        assertEquals("name", Person1.getName());
        assertEquals(1, Person1.getId());
    }
    
}
