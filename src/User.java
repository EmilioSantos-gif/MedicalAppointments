public class User {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private int id;
    //Constructor
    User (String _name, String _email) {
        this.name = _name;
        this.email = _email;
    }
    //Setters
    public void setName (String _name) {
        this.name = _name;
    }
    public void setEmail (String _email) {
        this.email = _email;
    }
    public void setAddress(String _address) {
        this.address = _address;
    }
    public void setPhoneNumber(String _phoneNumber) {
        this.phoneNumber = _phoneNumber;
    }
    public void setId(int _id) {
        this.id = _id;
    }
    //Getters
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getId() {
        return id;
    }
}
