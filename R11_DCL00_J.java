public class R11_DCL00_J {
    static int value = Helper.number + 1;
    public static void main(String[] args) {
        System.out.println("Value: " + value);}
}
class Helper {
    static int number = R11_DCL00_J.value + 1;}
