import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    private SalaryWorker worker;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        worker = new SalaryWorker("000005", "John", "Doe", "Mr.", 2000);
    }

    @Test
    void setAnnualSalary() {
        worker.setAnnualSalary(52000);

    }

    @Test
    void displayWeeklyPay() {
        worker.setAnnualSalary(52000);
    }

    @Test
    void toCSVRecord() {
        worker.setAnnualSalary(52000);
        String csv = worker.toCSVRecord();
        assertNotNull(csv);
        assertTrue(csv.contains("52000"));
    }

    @Test
    void toJSONRecord() {
        worker.setAnnualSalary(52000);
        String json = worker.toJSONRecord();
        assertNotNull(json);
        assertTrue(json.contains("52000"));
    }

}