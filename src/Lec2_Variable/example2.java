
package Lec2_Variable;

public class example2 {
public static void main( String [] args){
    int x =1;
    int y = x+ ++x - x-- - x++ + x- x--;
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    int a = 1;
    int z = a - a-- - a++ + --a -a + a-- + a;
    System.out.println("a = " + a);
    System.out.println("z = " + z);
}   
}
