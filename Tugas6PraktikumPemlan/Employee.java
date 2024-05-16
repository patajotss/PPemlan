package Tugas6PraktikumPemlan;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoices = 0;
        for (Invoice invoice : invoices) {
            totalInvoices += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoices;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee: " + name + " (Reg. No: " + registrationNumber + ")");
        System.out.println("Salary: " + salaryPerMonth);
        System.out.println("Total Invoice Amounts: " + (salaryPerMonth - getPayableAmount()));
        System.out.println("Net Pay: " + getPayableAmount());
        System.out.println("Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println("  " + invoice.getDetails());
        }
    }
}
