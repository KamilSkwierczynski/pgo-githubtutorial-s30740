import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class test {
    @Test
    void test_Discount_1(){
        osoba osoba = new osoba(7,"Warszawa","Friday");
        assertEquals(100, osoba.cena());
    }
    @Test
    void test_Discount_średni(){
        osoba osoba = new osoba(17,"Warszawa","Monday");
        assertEquals(100, osoba.cena());
    }
    @Test
    void test_Discount_młody(){
        osoba osoba = new osoba(9,"Warszawa","Monday");
    }
}