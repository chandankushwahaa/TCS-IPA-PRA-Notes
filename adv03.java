/*
   Create a class Institute with below attributes:
   instituteId - int
   instituteName - String
   noOfStudentPlaced - int
   noOfStudentsCleared - int
   location  - String
   grade  - String

   Write getters, setters for the above attributes. Create constructor which takes parameter in the sequence except grade.
   Create class Solution with main method, implement two static methods;-
   findNumClearanceByLoc()
   updateInstitutionGrade(), in Solution class.

findNumClearanceByLoc(): This will take two input parameters, array of institute objects and String parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as parameter.
If no institution with the given location is present in the array of the institution objects. then the method should return 0.

updateInstitutionGrade(): This method will take a String parameter institutionName, along with the array of institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the institution object.

Before returning the object, the grade should be arrived based on the rating calculation mentioned below.
This grade value should be assigned to the object. If any of the above conditions are not met, then the method should return null.

The grade attribute should be calculated as follow:
If the rating gt>=80, than grade should be A , else grade should be B.
NOTE: No institute object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

FOr findNumClearedByLoc(): The main method should print the noOfClearance as it is, if the returned value is greater than 0,
or it should print "There is no cleared students."

For updateInstitutionGrade method(): The main method should print the instutionName and grade of the returned
instutution object. The institutionName and grade should be concatinated while printing.
If returned value is null print "No institute"


INPUT:
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

OUTPUT:
22000
Karunya::A

*/
import java.util.*;

public class adv03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institute[] arr = new Institute[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            arr[i] = new Institute(a, b, c, d, e);
        }

        String location = sc.nextLine();
        String name = sc.nextLine();

        int res = findNumClearanceByLoc(arr, location);
        if (res > 0) {
            System.out.println(res);
        } else {
            System.out.println("There is no cleared students.");
        }

        Institute res2 = updateInstitutionGrade(name, arr);
        if (res2 == null) {
            System.out.println("There is no cleared students.");
        } else {
            System.out.println(res2.getInstituteName() + " :: " + res2.getGrade());
        }
    }

    public static int findNumClearanceByLoc(Institute arr[], String location) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i].getLocation().equals(location)) {
                sum += arr[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institute updateInstitutionGrade(String instituteName, Institute arr[]) {
        for (int i = 0; i < 4; i++) {
            if (arr[i].getInstituteName().equals(instituteName)) {
                int rating = (arr[i].getNoOfStudentPlaced() * 100) / (arr[i].getNoOfStudentsCleared());
                if (rating >= 80) {
                    arr[i].setGrade("A");
                } else {
                    arr[i].setGrade("B");
                }
                return arr[i];
            }
        }
        return null;
    }
}

class Institute {
    int instituteId;
    String instituteName;
    int noOfStudentPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;

    // Constructor
    Institute(int instituteId, String instituteName, int noOfStudentPlaced, int noOfStudentsCleared, String location) {
        this.instituteId = instituteId;
        this.instituteName = instituteName;
        this.noOfStudentPlaced = noOfStudentPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
        this.grade = "N/A";  // default grade
    }

    // Getter
    public int getInstituteId() {
        return instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public int getNoOfStudentPlaced() {
        return noOfStudentPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    // Setter
    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public void setNoOfStudentPlaced(int noOfStudentPlaced) {
        this.noOfStudentPlaced = noOfStudentPlaced;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
