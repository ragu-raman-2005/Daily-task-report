import java.util.ArrayList;

class StaffMember {

    int staffId;
    String staffName;
    String team;
    double monthlyPay;

    StaffMember(int staffId, String staffName, String team, double monthlyPay) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.team = team;
        this.monthlyPay = monthlyPay;
    }

    void showDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Team: " + team);
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("------------------------");
    }
}

public class StaffListDemo {

    public static void main(String[] args) {

        ArrayList<StaffMember> staffRecords = new ArrayList<>();

        // Store staff records
        staffRecords.add(new StaffMember(201, "Karthik", "Development", 35000));
        staffRecords.add(new StaffMember(202, "Anitha", "HR", 30000));
        staffRecords.add(new StaffMember(203, "Vijay", "Testing", 28000));

        // Retrieve all records
        System.out.println("All Staff Records:");

        for (StaffMember staff : staffRecords) {
            staff.showDetails();
        }

        // Retrieve a particular record
        System.out.println("Retrieve Staff at Index 1:");

        StaffMember selectedStaff = staffRecords.get(1);
        selectedStaff.showDetails();
    }
}