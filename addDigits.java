class addDigits {
    public int addDigits(int num) {
        while(num>=10 ){
          num=  add(num);
        }
        return num;
    }
    int add(int sum){
          int res =0;
        while(sum>0){
            int digit = sum%10;
             res+=digit;
             sum/=10;
        }
        return res;
    }
}
