import java.util.HashMap;

class StaffProfile {

    int employeeCode;
    String fullName;
    String division;
    double annualIncome;

    StaffProfile(int employeeCode, String fullName, String division, double annualIncome) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.division = division;
        this.annualIncome = annualIncome;
    }

    void printProfile() {
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Full Name: " + fullName);
        System.out.println("Division: " + division);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("------------------------");
    }
}

public class StaffMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, StaffProfile> companyStaff = new HashMap<>();

        // Store employee records
        companyStaff.put(301, new StaffProfile(301, "Meena", "Finance", 420000));
        companyStaff.put(302, new StaffProfile(302, "Sathish", "Marketing", 480000));
        companyStaff.put(303, new StaffProfile(303, "Deepa", "Operations", 360000));

        // Retrieve all records
        System.out.println("All Company Staff:");

        for (StaffProfile profile : companyStaff.values()) {
            profile.printProfile();
        }

        // Retrieve a particular record using employee code
        System.out.println("Search Employee Code 302:");

        StaffProfile searchedProfile = companyStaff.get(302);

        if (searchedProfile != null) {
            searchedProfile.printProfile();
        } else {
            System.out.println("Employee record not found");
        }

        // Check whether employee exists
        System.out.println("Employee Code 305 Exists: "
                + companyStaff.containsKey(305));

        // Display total number of records
        System.out.println("Total Staff: " + companyStaff.size());
    }
}