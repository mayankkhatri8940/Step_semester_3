package session3;

public class main {
    public static void main(String[] args) {
        PlacementRecord p1 = new PlacementRecord("Ravi", "TCS", 4.5);
        PlacementRecord p2 = new PlacementRecord("Anitha", "Zoho", 6.2);
        PlacementRecord p3 = new PlacementRecord("Karthik", "Infosys", 4.0);
        PlacementRecord[] records = {p1, p2, p3};
        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
}
