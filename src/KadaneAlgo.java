public class KadaneAlgo {
    public static int kadane(int []arr)
    {
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<arr.length;i++)
        {
            currsum=currsum+arr[i];
            if(currsum>maxsum)
            {
                maxsum=currsum;
            }
            if(currsum<0) {
                currsum = 0;
            }

        }
        return maxsum;
    }
    public static void main(String[] arg)
    {
       int []a={-1,1,2,-4,-7};

       System.out.print(kadane(a));
    }
}
