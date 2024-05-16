package model;

public class Department {
    public int id;
    public int DANEId;
    public String name;

    public Department() {
    }

    public Department(String[] data) {
        this.id     = Integer.parseInt(data[0]);
        this.DANEId = Integer.parseInt(data[1]);
        this.name   = data[2];
    }

    public String details() {
        String s = "";
        s += "Id    : " +this.id + "\n";
        s += "DANEId: " +this.DANEId + "\n";
        s += "Name  : " +this.name + "\n";
        return s;
    }
}

