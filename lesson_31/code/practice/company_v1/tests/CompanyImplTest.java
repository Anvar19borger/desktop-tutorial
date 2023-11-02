package practice.company_v1.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company_v1.dao.Company;
import practice.company_v1.dao.CompanyImpl;
import practice.company_v1.model.Employee;
import practice.company_v1.model.Manager;
import practice.company_v1.model.SalesManager;
import practice.company_v1.model.Worker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {


    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager(102, "Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Gans", "Bauer", 30, 80, 5);

        // dobavim e elementi massiva v company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);

        }


    }

    @Test
    void addEmployee() {
        // ne mmojim dobavit null
        assertFalse(company.addEmployee(null));
        // nemojim dobavit vtoroi ras,uje suschestvueschego
        assertFalse(company.addEmployee(e[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dubin ", 55, 160, 6000, 6);
        assertTrue(company.addEmployee(employee1));// dobaveli sotrudnika .Sosdali novogo sotrudnika
        assertEquals(5, company.quantity());// teper v kompanii 5 sotrudnikov
        //Sosdaeem eschee odnogo
        Employee employee2 = new Manager(106, "Peeter", "Dubko ", 55, 160, 6000, 6);
        assertFalse(company.addEmployee(employee2));// ne mojim privisit copacity
        company.printEmployees();

    }

    @Test
    void removeEmployee() {
        // udoljaem sotrudnika
        company.printEmployees();
        System.out.println("-----------------------------");
        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity());// sotrudnikov ctalo 1 mmensche
        assertNull(company.removeEmployee(102));// dvajdi  ne mojim udolit
        assertNull(company.findEmployee(102));// n mojim naiti poslee udolenija
        company.printEmployees();
    }

    @Test
    void findEmployee() {
        company.printEmployees();
        // ichm satrudnika po id
        assertEquals(e[1], company.findEmployee(102));
        // idchim  ne suscheestvueschgo satrudnika
        assertNull(company.findEmployee(105));

    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());

    }

    @Test
    void totalSalaryTest() {
        assertEquals(12100, company.totalSalary(), 0.01);
    }

    @Test
    void avgSalaryTest() {
        assertEquals(12100.0 / 4, company.avgSalary(), 0.01);
    }

    @Test
    void totalSalesTest() {
        assertEquals(55000, company.totalSales());

    }

    @Test
    void printEmployeesTest() {
        company.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThanTest() {
        Employee[] actual = company.findEmployeesHoursGreaterThan(100);
        Employee[] expected = {e[0], e[1], e[2]};
        assertArrayEquals(expected, actual);

    }

    @Test
    void findEmployeesSalaryRangeTest() {
        company.printEmployees();
        Employee[] actual = company.findEmployeesSalaryRange(2900, 6000);
        Employee[] expected = {e[0], e[2]};
        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));

    }
}