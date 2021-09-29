import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils implements CharSequence {

    public Scanner sc;

    public Stringutils() {
        this.sc = new Scanner(System.in);
    }

    public void getSc() {
        sc.nextLine();
    }

    public static void main(String[] args) {

      Stringutils input = new Stringutils();
        System.out.println("Enter something: ");
      input.getSc();
        System.out.println(StringUtils.isNumeric(input));
        System.out.println(StringUtils.reverse(String.valueOf(input)));
    }




    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
