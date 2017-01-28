package customerpack;

/**
 * Created by NIKKI on 20/01/2017.
 */

public class CustomerProfileDataModel {

    String name;
    String emailid;
    String password;
    String mobileno;
    String gender;
    String address;
    String dateofbirth;

    public CustomerProfileDataModel(String name,String emailid,String password,String mobileno,String gender,String address,String dateofbirth)
    {
        this.name=name;
        this.emailid=emailid;
        this.password=password;
        this.mobileno=mobileno;
        this.gender=gender;
        this.address=address;
        this.dateofbirth=dateofbirth;
    }


    public String getName() {
        return name;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileno() {
        return mobileno;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }
}
