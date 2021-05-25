public class BinarySearch {
     static int binarySearch(int[] arr,int key,int low,int high){
       while(low<=high)
       {
           int mid=(low+high)/2;
           if(arr[mid]==key)
               return mid;
           else if(key>arr[mid])
               low=mid+1;
           else if(key<arr[mid])
               high=mid-1;
       }
       return -1;

    }
    public static void main(String[] arg)
    {
        int [] arr={-4,-1,3,7,10,11};
        int low=0;
        int high=arr.length;
        System.out.print(binarySearch(arr,3,low,high));

    }
}
