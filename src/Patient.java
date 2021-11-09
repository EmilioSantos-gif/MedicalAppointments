public class Patient extends User{
    double weight;
    double height;

    Patient(String _name, String _email) {
        super(_name, _email);
    }

    //Setters
    public void setWeight(double _weight) {
        this.weight = _weight;
    }
    public void setHeight(double _height) {
        this.height = _height;
    }
    //Getters
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
}
