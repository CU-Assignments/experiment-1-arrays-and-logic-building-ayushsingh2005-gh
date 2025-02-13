public class Solution {
    public boolean isPalindrome(String s) {
        // Create two pointers: left and right
        int left = 0, right = s.length() - 1;

        // Convert to lowercase and ignore non-alphanumeric characters
        while (left < right) {
            // Move left pointer to the next valid character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Move right pointer to the previous valid character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Not a palindrome
            }

            // Move both pointers inward
            left++;
            right--;
        }

        // If we finish the loop without returning false, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: "A man, a plan, a canal: Panama"
        String testCase1 = "A man, a plan, a canal: Panama";
        System.out.println("Test case 1: " + solution.isPalindrome(testCase1)); // Output: true

        // Test case 2: "race a car"
        String testCase2 = "race a car";
        System.out.println("Test case 2: " + solution.isPalindrome(testCase2)); // Output: false

        // Test case 3: " "
        String testCase3 = " ";
        System.out.println("Test case 3: " + solution.isPalindrome(testCase3)); // Output: true
    }
}
