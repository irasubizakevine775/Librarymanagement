public abstract class Member {
    protected static final double FLAT_FEE = 5000;

    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public abstract double calculateFees();

    @Override
    public String toString() {
        return "Member{id='" + id + "', name='" + name + "'}";
    }
}