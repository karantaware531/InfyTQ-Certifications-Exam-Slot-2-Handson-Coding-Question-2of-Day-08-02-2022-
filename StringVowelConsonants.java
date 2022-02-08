/*
Consider a non-empty string instr consisting of only lower-case alphabets. Identify and print the string outstr, based on the below logic:
 
 * Identify all the vowels in instr and add them to outstr in lexicographical order'
 * Considering the first vowel fvowel in outstr. find the index of the first occurrence of fvowel 
    in instr and append it to outstr
 * If there is no vowel in instr add "NA" and append "-1" in place of index
 * Identify all the consonants in instr and append them to outstr in lexicographical order
 * Considering the last consonant Iconsonant in outstr, find the index of the last occurrence of 
    Iconsonant in instr and add it to outstr
 * If there is no consonant in instr add "NA" and append "-1" in place of index.
 
Note: Lexicographical order is "abcde....xyz".

INPUT FORMAT: String instr by Standard Input String.

OUTPUT FORMAT: Print outstr to the Standard Output String.

SAMPLE INPUT 1: 
temperature

SAMPLE OUTPUT 1:
aeeeu6mprrtt7

EXPLAINATION:-
For the given instr-
the vowels present in the string are "e", "e", "a"," "u", "e". Adding them to outstr based on the lexicographical ordering, outstr becomes "aeeeu". 
The first vowel in outstr, fvowel, is "a" and the index position of the first occurrence "a" in instr,i.e., "temperature", is 6. Add the index to outstr to get "aeeeu6".
The consonants present in instr are "t", "m", "p", "r", "t", "r". Adding them to outstr based on the lexicographical order, outstr becomes "aeeeu6mprrtt". The last consonant in outstr, Iconsonant, is "t" and the index position of last occurrence of "t" in instr, i.e.,"temperature", is 7.
Add the index to outstr to get "aeeeu6mpmtt7"
Hence the OUTPUT.

SAMPLE INPUT 2:
rhythm

SAMPLE OUTPUT 2:
NA-1hhmrty2

EXPLAINATION:-
For the given instr, there are no vowels. So add "NA" to outstr and append "-1" in place of index to get outstr as "NA-1".
The consonants present in instr are "r", "h", "y", "t", "h", "m". Adding them to outstr based on the lexicographical order, outstr becomes "NA-1hhmrty". The last consonant in outstr. Iconsonant, is "y" and the index position of last occurrence of mathcal "y" in instr, i.e., "rhythm", is 2.
Add the index to outstr to get "NA-1hhmrty2".
Hence the OUTPUT.*/

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
