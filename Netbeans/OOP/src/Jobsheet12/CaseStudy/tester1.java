package Jobsheet12.CaseStudy;

/**
 *
 * @author Aikacchii
 */
public class tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Aika", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Minami", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e;
        Payable p;
        
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
        p = iEmp;
        e = eBill;
        
    }
}
