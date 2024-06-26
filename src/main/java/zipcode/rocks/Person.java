package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String favDrink;
    private String favColor;
    private String month;
    private boolean hasPet;

    public Person(String fname, String lname) {
        this.firstname = fname;
        this.lastname = lname;


    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFavDrink() {
        return favDrink;
    }

    public void setFavDrink(String favDrink) {
        this.favDrink = favDrink;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public boolean isHasPet() {
        return hasPet;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return this.firstname +" " + this.lastname + ", " + this.favDrink + ", " + this.favColor + ", " + this.month + ", " + this.hasPet;
    }
}
