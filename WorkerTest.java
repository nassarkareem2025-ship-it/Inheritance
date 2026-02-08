import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

private Worker worker;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        worker = new Worker("123", "John", "Doe", "Engineer", 2000);
    }

    @Test
    void setIDNum() {
        worker.setIDNum("456");
        assertEquals("456", worker.getIDNum());
    }

    @Test
    void setFirstName() {
        worker.setFirstName("Jane");
        assertEquals("Jane", worker.getFirstName());
    }

    @Test
    void setLastname() {
        worker.setLastname("Smith");
        assertEquals("Smith", worker.getLastname());
    }

    @Test
    void setTitle() {
        worker.setTitle("Manager");
        assertEquals("Manager", worker.getTitle());
    }

    @Test
    void setYOB() {
        worker.setYOB(1998);
        assertEquals(1998, worker.getYOB());
    }

    @Test
    void testToString() {
        String result = worker.toString();
        assertNotNull(result);
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Doe"));
    }

    @Test
    void toCSVRecord() {
        String csv = worker.toCSVRecord();
        assertNotNull(csv);
        assertTrue(csv.contains(","));
    }

    @Test
    void toJSONRecord() {
        String json = worker.toJSONRecord();
        assertNotNull(json);
        assertTrue(json.contains("{"));
        assertTrue(json.contains("}"));
    }

    @Test
    void toXML() {
        String xml = worker.toXML();
        assertNotNull(xml);
        assertTrue(xml.contains("<"));
        assertTrue(xml.contains(">"));
    }

    @Test
    void setHourlyPayRate() {
        worker.setHourlyPayRate(25.50);
    }
}