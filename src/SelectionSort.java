

public class SelectionSort {
    public static void main(String[] arg) {
        int[] a ={3,44,10,2,5,42,11};
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int temp=a[i];
            int j=i-1;

            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for(int k=0;k<n;k++)
        System.out.println(a[k]);

    }
}
