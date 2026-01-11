class Solution {
    public  boolean isVowel(char a){
        a = Character.toLowerCase(a);
        return (a =='a'||a =='e'|| a=='i'||a=='o'|| a=='u');
    }
    public String reverseVowels(String s) {
        int l= 0;

        int n = s.length();
        char[] chars = s.toCharArray();
        int r= n-1;
        while(l<r){
            while(l<r && !isVowel(chars[l])){
                l++;
            }
             while(l<r && !isVowel(chars[r])){
                r--;
            }
            char temp = chars[l];
          chars[l] = chars[r];
          chars[r]=temp;
          l++;
          r--;
        }
        return new String(chars);
    }
}
