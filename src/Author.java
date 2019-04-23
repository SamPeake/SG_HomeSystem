public class Author {
    private int authID;
    private String name;
    private String role;
    private int phoneNumber;

    public Author(int prevID, String inName, String inRole, int inPhoneNumber) {
        authID = prevID + 1;
        name = inName;
        role = inRole;
        phoneNumber = inPhoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAuthID() {
        return authID;
    }

    public String getName() {
        return name;
    }
}