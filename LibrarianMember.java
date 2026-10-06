
public class LibrarianMember extends Member {
    private String employeeNumber;

    public LibrarianMember(String id, String name, String employeeNumber) {
        super(id, name);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() { return employeeNumber; }
    public void setEmployeeNumber(String employeeNumber) { this.employeeNumber = employeeNumber; }

    @Override
    public double calculateFees() {
        return 0;
    }

    @Override
    public String toString() {
        return "LibrarianMember{" + super.toString() + ", employeeNumber='" + employeeNumber + "'}";
    }
}
