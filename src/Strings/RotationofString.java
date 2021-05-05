package Strings;

public class RotationofString {
    public static void main(String[]strings)
    {
        String s="abcd";//abcdabcd
        String find="cdab";
        s=s.concat(s);
        int ans =s.indexOf(find);
        System.out.println(ans);

    }
}
