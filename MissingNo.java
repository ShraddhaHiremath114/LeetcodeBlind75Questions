public class MissingNo {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int n=arr.length;
        int nsum=n*(n+1)/2;
        int sum=0;
        for(int val:arr){
            sum+=val;
        }
        System.out.println(nsum-sum);
    }
}
