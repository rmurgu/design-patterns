package structural.adapter;

public class Client {

    public static void main(String[] args) {
        // Class adapter demo
        System.out.println("Class adapter demo");
        System.out.println("=========================");

        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        populate(classAdapter);
        BusinessCardDesigner cardDesigner = new BusinessCardDesigner();
        System.out.println(cardDesigner.designCard(classAdapter));



        // Object adapter demo
        System.out.println("\n\nObject adapter demo");
        System.out.println("=========================");

        Employee employee = new Employee();
        populate(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        System.out.println(cardDesigner.designCard(objectAdapter));
    }

    private static void populate(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Cybersecurity engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, NY");
    }
}
