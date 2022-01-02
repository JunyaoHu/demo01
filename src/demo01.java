import java.util.Scanner;

public class demo01 {
    public static int str2num(StringBuffer strBuf) {
        int res = 0;
        for (int i = 0; i < strBuf.length(); i++) {
            int tmp = strBuf.charAt(i) - '0';
            res *= 10;
            res += tmp;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        try {
            str = sc.next();
        } catch (Exception e) {
            System.out.println("Error!");
        }

        StringBuffer number = new StringBuffer();
        StringBuffer upper = new StringBuffer();
        StringBuffer lower = new StringBuffer();

        int i = 0;
        char ch;
        while (i < str.length()) {
            ch = str.charAt(i);
            if('0' <= ch && ch <= '9') {
                do {
                    number.append(ch);
                    i++;
                    if(i < str.length()) ch=str.charAt(i);
                    else break;
                } while('0' <= ch && ch <= '9');
                int num = str2num(number);
                System.out.println(num);
                number = new StringBuffer();
            }

            else if ('A' <= ch && ch <= 'Z') {
                do {
                    upper.append(ch);
                    i++;
                    if(i < str.length()) ch=str.charAt(i);
                    else break;
                } while ('A' <= ch && ch <= 'Z');
                System.out.println(upper);
                upper = new StringBuffer();
            }

            else if ('a' <= ch && ch <= 'z') {
                do {
                    lower.append(ch);
                    i++;
                    if(i < str.length()) ch=str.charAt(i);
                    else break;
                }while('a' <= ch && ch <= 'z');
                System.out.println(lower);
                lower = new StringBuffer();
            }
        }
    }


}