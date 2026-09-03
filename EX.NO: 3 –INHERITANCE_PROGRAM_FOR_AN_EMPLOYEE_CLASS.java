class Employee {
    String emp_name, emp_id, address, mail_id, mobile_no;

    Employee(String name, String id, String addr, String mail, String mobile) {
        emp_name = name;
        emp_id = id;
        address = addr;
        mail_id = mail;
        mobile_no = mobile;
    }
}

class AssociateProfessor extends Employee {
    double basicPay;

    AssociateProfessor(String name, String id, String addr,
                       String mail, String mobile, double bp) {
        super(name, id, addr, mail, mobile);
        basicPay = bp;
    }

    void generatePaySlip() {
        double da = basicPay * 0.90;
        double hra = basicPay * 0.12;
        double pf = basicPay * 0.14;
        double staffFund = basicPay * 0.002;

        double gross = basicPay + da + hra;
        double net = gross - pf - staffFund;

        System.out.println("\n--- ASSOCIATE PROFESSOR PAY SLIP ---");
        System.out.println("Name        : " + emp_name);
        System.out.println("ID          : " + emp_id);
        System.out.println("Basic Pay   : " + basicPay);
        System.out.println("DA          : " + da);
        System.out.println("HRA         : " + hra);
        System.out.println("PF          : " + pf);
        System.out.println("Staff Fund  : " + staffFund);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary  : " + net);
    }
}

class Professor extends Employee {
    double basicPay;

    Professor(String name, String id, String addr,
              String mail, String mobile, double bp) {
        super(name, id, addr, mail, mobile);
        basicPay = bp;
    }

    void generatePaySlip() {
        double da = basicPay * 0.90;
        double hra = basicPay * 0.12;
        double pf = basicPay * 0.14;
        double staffFund = basicPay * 0.002;

        double gross = basicPay + da + hra;
        double net = gross - pf - staffFund;

        System.out.println("\n--- PROFESSOR PAY SLIP ---");
        System.out.println("Name        : " + emp_name);
        System.out.println("ID          : " + emp_id);
        System.out.println("Basic Pay   : " + basicPay);
        System.out.println("DA          : " + da);
        System.out.println("HRA         : " + hra);
        System.out.println("PF          : " + pf);
        System.out.println("Staff Fund  : " + staffFund);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary  : " + net);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        AssociateProfessor ap = new AssociateProfessor(
            "Arun", "AP101", "Chennai",
            "arun@gmail.com", "9876543210", 50000
        );

        Professor p = new Professor(
            "Kumar", "P101", "Villupuram",
            "kumar@gmail.com", "9876501234", 60000
        );

        ap.generatePaySlip();
        p.generatePaySlip();
    }
}
