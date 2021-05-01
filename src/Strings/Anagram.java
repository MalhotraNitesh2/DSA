package Strings;
public class Anagram {
     static boolean check(String s1, String s2)
     {
         if(s1.length()==s2.length()) {
             int[] count = new int[26];
             for (int i = 0; i < s1.length(); i++) {
                 ++count[s1.charAt(i)-'a'];
             }
             for (int i = 0; i < s2.length(); i++) {
                 --count[s2.charAt(i)-'a'];
             }
             for (int j = 0; j < 26; j++) {
                 if (count[j] != 0)
                 {return false;}
             }
                     return true;
             }


         return false;
     }
    public static void main(String[] arg)
    {
         String s1="geeks";
         String s2="skeeg";
         System.out.print(check(s1,s2));
    }
}
