import java.util.HashSet;
class MissingNumberInRange {
    public int missingNumber(int[] arr) {
        
        int min = arr[0];
        int max = arr[0];
        HashSet<Integer> set = new HashSet<>();
        for(int a:arr){
            if(min>a)
            min = a;
            if(max<a)
            max = a;
        }
       
        for(int a : arr)set.add(a);
        for(int i = 1;i<=max+1;i++){
            if(!set.contains(i)  )
            return i;
        }
        return 1;
    }
}
