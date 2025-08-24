class Solution {
    public void rotate(int[] arr, int k) {
        
        int n = arr.length;
        k=k%n;
        
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-(i+1)]=temp;
        }

        for(int i=0;i<k/2;i++){
            int temp=arr[i];
            arr[i]=arr[k-(i+1)];
            arr[k-(i+1)]=temp;
        }
        for(int i=k;i<(n+k)/2;i++){
            int temp=arr[i];
            arr[i]=arr[(n-i)+(k-1)];
            arr[(n-i)+(k-1)]=temp;
        }
    }
}