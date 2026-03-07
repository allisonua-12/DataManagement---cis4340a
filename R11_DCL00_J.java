public class R11_DCL00_J {
    static int value = 1;
    public static void main(String[] args) {
        System.out.println("Value: " + value);
        System.out.println("Number: " + Helper.getNumber());}
}
class Helper {
    static int getNumber() {
        return R11_DCL00_J.value + 1;}
}
