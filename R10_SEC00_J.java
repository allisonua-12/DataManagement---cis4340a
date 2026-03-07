public class R10_SEC00_J {
    public static String getAdminPassword() {
        return "SuperSecretPassword123"; }
    public static void main(String[] args) {
        System.out.println("Leaked password: " + getAdminPassword());}
}
