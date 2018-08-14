package FinalProect.Test.TestPro;

public class User {


    private int ID;
    private String Name;
    private String Price;

    public User(int ID, String name, String price) {
        this.ID = ID;
        Name = name;
        Price = price;
    }

    public User() {


    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}

