public class R10_SEC00_J {
    public static String getAdminPassword() {
        throw new SecurityException("Access to sensitive information is denied.");}
    public static void main(String[] args) {
        try {
            System.out.println(getAdminPassword());
        } catch (SecurityException e) {
            System.out.println("Sensitive information was protected.");}
    }
}
