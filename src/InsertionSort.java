public class InsertionSort {
    public static  void main(String[] arg)
    {
        int [] a={10,9,12,22,18};
        for(int i=0;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while( j>=0 && a[j]>temp)
            {
                    a[j+1]=a[j];
                 j--;
            }
              a[j+1]=temp;
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }
}
