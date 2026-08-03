class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) continue;
            sb.append(c);
        }

        String str = sb.toString().toLowerCase();
        String revStr = sb.reverse().toString();

        return str.equals(revStr.toLowerCase());
        
    }
}
