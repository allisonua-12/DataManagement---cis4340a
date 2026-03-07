public class R09_OBJ01_J {
    public int total; 
    public void add() {
        if (total < Integer.MAX_VALUE) {
            total++;
        } else {
            throw new ArithmeticException("Overflow");}
    }
    public void remove() {
        if (total > 0) {
            total--;
        } else {
            throw new ArithmeticException("Overflow");}
    }
    public static void main(String[] args) {
        System.out.println("Noncompliant OBJ01-J example");}
}
