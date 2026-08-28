package session3;

public class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }
    public void printRecord() {
        System.out.println(studentName + " | " + company + " | Rs " + packageLpa + " LPA");
    }
}
