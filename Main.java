public class Main {
    public static void main(String[] args) {
        Member[] members = {
            new PublisherMember("M001", "Bob", "Kigali Press"),
            new StudentMember("M002", "Alice", "S123"),   // has an ID
            new StudentMember("M003", "Dan", ""),          // no ID
            new LibrarianMember("M004", "Carol", "E456")
        };

        for (Member m : members) {
            System.out.println(m.getName() + " pays: " + m.calculateFees());
        }
    }
}