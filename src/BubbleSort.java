public class BubbleSort {
    public static void main(String[] arg)
    {
        int [] a={10,9,12,22,18};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }

            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }

    }

}
