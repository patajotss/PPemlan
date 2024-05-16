package Tugas6PraktikumPemlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Employee Payroll System");

        System.out.print("Enter employee registration number: ");
        int registrationNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary per month: ");
        int salaryPerMonth = scanner.nextInt();
        
        ArrayList<Invoice> invoices = new ArrayList<>();
        System.out.print("Enter the number of invoices: ");
        int numberOfInvoices = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfInvoices; i++) {
            System.out.println("Enter details for invoice " + (i + 1) + ":");

            System.out.print("Product name: ");
            String productName = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per item: ");
            int pricePerItem = scanner.nextInt();
            scanner.nextLine();

            invoices.add(new Invoice(productName, quantity, pricePerItem));
        }

        Invoice[] invoiceArray = new Invoice[invoices.size()];
        invoiceArray = invoices.toArray(invoiceArray);
        Employee employee = new Employee(registrationNumber, name, salaryPerMonth, invoiceArray);

        employee.printEmployeeDetails();

        scanner.close();
    }
}
