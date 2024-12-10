public class MergeSortedArray {
    //Sorted LinkedLists
    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] b={2,4,6};
        int n=a.length;
        int m=b.length;
        int i1=0,i2=0;
        int i=0;
        
        int ans[] = new int[n+m];
        while(i1<n && i2<m){
            if(a[i1]<b[i2]){
                ans[i++]=a[i1++];
            }else{
                ans[i++]=b[i2++];
            }
        }
        while(i1<n){
            ans[i++]=a[i1++];
        }
        while (i2<m) {
            ans[i++]=b[i2++];
        }

        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}
