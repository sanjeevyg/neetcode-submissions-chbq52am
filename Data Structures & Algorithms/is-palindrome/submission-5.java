class Solution {
    public boolean isPalindrome(String s) {
        // char[] arr = s.toCharArray();
        // if
        
        // for(int i = 0; i < arr.length; i ++) {
        //         char left = arr[i];
        //         char right = arr[arr.length - 1 - i];


        //         if (!Character.isLetterOrDigit(left)) continue;
        //         if (!Character.isLetterOrDigit(right)) continue;
        //         System.out.println(left + " : " + right);
        //         if(Character.toLowerCase(left) != Character.toLowerCase(right)) return false;
        // }

        int left = 0;
        int right = s.length() - 1;
        // System.out.println(s.charAt(right));
        while(left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if(leftChar != rightChar) {
                return false;
            }
            left++;
            right--;

        }
        
        return true;
     
    }
}
