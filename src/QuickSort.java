public class QuickSort {
    public static int partition(int[] array, int l, int r)
    {
        int pivot=array[0];
        int storeindex=pivot+1;
        for(int i=pivot+1;i<array.length;i++)
        {
            if(array[i]<array[pivot]) {
                Swap(array, i, storeindex);
                storeindex++;
            }
            Swap(array,i,storeindex-1);
        }

        return pivot;
    }

    private static void Swap(int[] array, int i, int storeindex) {
          int temp=array[i];
          array[i]=array[storeindex];
          array[storeindex]=temp;
    }
    public static void qSort(int[] array,int l,int r)
    {
        if(l<r)
        {
            int pi=partition(array,l,r);
            qSort(array,l,pi-1);
            qSort(array,pi+1,r);
        }

    }


    public static void main(String[] arg)
    {
         int []array={6,3,9,5,2,8,7};
         qSort(array,0,array.length);
         
    }
}
