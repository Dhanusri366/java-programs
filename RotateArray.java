
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
    
        int n = arr.length;
        int end=0;
        if(d>n){
            d= d%n;
        }
        for(int i=0;i<d;i++){
             end = arr[0];
            
            for(int j=0;j<n-1;j++){
                arr[j]= arr[j+1];
                
            }
            arr[n-1]= end;
        }
    }
}
