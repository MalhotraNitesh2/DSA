package Strings;

public class LeetCode1700 {
    static void leftSandwiches(int[] students,int[]sandwiches)
    {
        int[] count=new int[2];
        for(int i=0;i<students.length;i++)
            count[students[i]]++;
        for(int i=0;i<students.length;i++)
        {
            if(--count[sandwiches[i]]<0)
                break;
        }
         System.out.println(Math.max(count[0],count[1]));
    }
    public static void main(String[]arg)
    {
        int []students={1,1,0,0};
        int[] sandwiches={0,1,0,1};
        leftSandwiches(students,sandwiches);

    }
}
