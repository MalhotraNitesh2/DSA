package Strings;

public class BinaryString {
    public static boolean isbinary(String str){
        int len=str.length();
        int flag=0;
        for(int i=0;i<len;i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '0')
                        flag=1;
        }
        if(flag==1)
            return false;
        else
        return true;

    }

    public static void main(String[]arg)
    {
        String str="010101010100101";
        System.out.println(isbinary(str));

    }

}
