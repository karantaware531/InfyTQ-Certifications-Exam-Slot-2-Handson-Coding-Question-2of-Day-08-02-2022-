import java.util.*;

public class StringVowelConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<Character> vowels = new ArrayList<Character>();
        ArrayList<Character> cons = new ArrayList<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels.add(ch);
            else
                cons.add(ch);
        }

        Collections.sort(vowels);
        Collections.sort(cons);
        int m1 = 0;
        if (vowels.size() > 0) {
            char a = vowels.get(0);
            m1 = str.indexOf(a);
        }
        int x = cons.size();
        int m2 = 0;
        if (x > 0) {
            char b = cons.get(x - 1);
            m2 = str.lastIndexOf(b);
        }
        String res = "";
        for (Character it : vowels)
            res += it;
        if (m1 > 0) {
            res = res + m1;
        } else
            res = res + "NA-1";
        for (Character it : cons)
            res += it;
        if (m2 > 0) {
            res = res + m2;
        } else
            res = res + "NA-1";
        System.out.println(res);
        sc.close();
    }
}