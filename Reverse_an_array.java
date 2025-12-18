class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int right = arr.length-1;
        int left =0;
      while(left<right){
          int temp=0;
           temp =arr[left];
           arr[left]=arr[right];
          arr[right] = temp;
          left++;
          right--;
          
      }
    }
}
