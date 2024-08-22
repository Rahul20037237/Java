package GroceryStore;
import java.util.*;
import java.io.*;

public class store{

    private static List<product> products = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();
    private static List<customer> customers = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Add Employee");
            System.out.println("3. Add Customer");
            System.out.println("4. View Products");
            System.out.println("5. View Employees");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    addProduct(reader);
                    break;
                case 2:
                    addEmployee(reader);
                    break;
                case 3:
                    addCustomer(reader);
                    break;
                case 4:
                    viewProducts();
                    break;
                case 5:
                    viewEmployees();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }

    private static void addProduct(BufferedReader reader) throws IOException {
        System.out.print("Enter product name: ");
        String name = reader.readLine();
        System.out.print("Enter product price: ");
        float price = Float.parseFloat(reader.readLine());
        System.out.print("Enter Quantityinstock: ");
        int quantityInStock = Integer.parseInt(reader.readLine());
        System.out.print("Enter category: ");
        String category= reader.readLine();
        System.out.println("Enter reorderlevel: ");
        int reorderlevel=Integer.parseInt(reader.readLine());
        products.add(new product(name, price,quantityInStock,category,reorderlevel));
        System.out.println("Product added successfully.");
    }

    private static void addEmployee(BufferedReader reader) throws IOException {
        System.out.print("Enter employee name: ");
        String name = reader.readLine();
        System.out.print("Enter employee position: ");
        String position = reader.readLine();
        System.out.print("Enter employee salary: ");
        float salary = Float.parseFloat(reader.readLine());
        System.out.print("Enter employee Experience: ");
        int exp = Integer.parseInt(reader.readLine());
        employees.add(new Employee(name, position,salary,exp));
        System.out.println("Employee added successfully.");
    }

    private static void addCustomer(BufferedReader reader) throws IOException {
        System.out.print("Enter customer name: ");
        String name = reader.readLine();
        System.out.print("Enter loyalty points: ");
        int loyaltyPoints = Integer.parseInt(reader.readLine());
        customers.add(new customer(name, loyaltyPoints));
        System.out.println("Customer added successfully.");
    }

    private static void viewProducts() {
        System.out.println("Products:");
        for (product product : products) {
            System.out.println(product);
        }
    }

    private static void viewEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
