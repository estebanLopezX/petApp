import model.Department;

public class milk {
    
    public static void main(String[] args) {
        String[] s1 = {"1", "15", "Boyacá"};
        Department d1 = new Department(s1);
        String[] s2 = {"2", "5", "Antioquia"};
        Department d2 = new Department(s2);
        String[] s3 = {"3", "8", "Atlantico"};
        Department d3 = new Department(s3);

        Department[] departments = {d1,d2,d3};
        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i].details());
        }
    }
}
