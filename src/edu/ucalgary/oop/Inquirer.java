package edu.ucalgary.oop;

public class Inquirer {

    private String firstName;
    private String lastName;
    private String ServicesPhoneNum;
    private String info;

    public Inquirer(String firstName, String lastName, String ServicesPhoneNum, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ServicesPhoneNum = ServicesPhoneNum;
        this.info = info;
    }
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getServicesPhoneNum() {return ServicesPhoneNum;}
    public void setServicesPhoneNum(String ServicesPhoneNum) {this.ServicesPhoneNum = ServicesPhoneNum;}

    public String getInfo() {return info;}
    public void setInfo(String info) {this.info = info;}


}
