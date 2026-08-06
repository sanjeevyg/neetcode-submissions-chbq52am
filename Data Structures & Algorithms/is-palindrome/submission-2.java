class Solution {
    public boolean isPalindrome(String s) {
        //use stringBuidler to append string
        //use java isLetterOrDigit method to skip non-alphanumeric characters
        //use reverse() method to see if they are palindrome

        char[] str = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb.reverse().toString());
        if (sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase())) {
            return true;
        }

        return false;
    }
}
