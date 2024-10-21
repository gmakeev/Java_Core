/* 1)Указать значения величин a и b после выполнения следующих операторов присваивания:
a = 5.8
b = -1.7
b =a
a =b
*/
package homeworks.hw1;

public class HT1_1 {
    public static void main(String[] args) {

        double a = 5.8;
        System.out.println("a = " + a); // 5.8
        double b = -1.7;
        System.out.println("b = " + b); // -1.7

        b = a;
        System.out.println("b = " + b); // 5.8

        a = b;
        System.out.println("a = " + a); // 5.8
    }
}
