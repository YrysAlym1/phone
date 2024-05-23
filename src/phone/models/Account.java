package phone.models;

public class Account {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String IDPassport;

    public Account(){}
    public Account(long id, String firstName, String lastName, int age, String IDPassport) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.IDPassport = IDPassport;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIDPassport() {
        return IDPassport;
    }

    public void setIDPassport(String IDPassport) {
        this.IDPassport = IDPassport;
    }
}
