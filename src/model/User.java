package model;

public class User {
    public int id;
    public String username; 
    public String password;   
    public String fullname;
    public String email;
    public String phone;
    public int usertype;  //1 administrador, 2 empresa 3 civil
    public String salt;      //llave para encriptar las contraceñas o desencriptar"para camuflar los datos"

    public String details(){
        String s = "";
        s += "username: "+ username + "\n";
        s += "fulname: "+ fullname + "\n";
        s += "fulname: "+ fullname + "\n";
        s += "email: "+ email + "\n";
        s += "phone: "+ phone + "\n";
        s += "User Type: "+ usertype +"(" + userTypeNames(usertype)+ ")\n";
    
        return s;
    }
public String userTypeNames(int usertype){
    String[] types = {"Administrator","Company","civil"};
    return types[usertype -1];
}

}
