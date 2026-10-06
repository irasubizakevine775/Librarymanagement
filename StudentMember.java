public class StudentMember extends Member {
    private String studentId;

    public StudentMember(String id, String name, String studentId) {
        super(id, name);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    @Override
    public double calculateFees() {
        if (studentId != null && !studentId.trim().isEmpty()) {
            return 0;
        }
        return FLAT_FEE;
    }

    @Override
    public String toString() {
        return "StudentMember{" + super.toString() + ", studentId='" + studentId + "'}";
    }
}