public class Admin {
    int adminID;
    String adminName;

    public Admin(int adminId, String adminName) {
        this.adminID = adminId;
        this.adminName = adminName;

    }

    public void update(){
        System.out.println("The settings for admin are updated.");
    }
}
