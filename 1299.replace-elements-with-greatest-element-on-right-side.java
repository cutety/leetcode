/*
 * @lc app=leetcode id=1299 lang=java
 *
 * [1299] Replace Elements with Greatest Element on Right Side
 */

// @lc code=start
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
           int nextMax=Math.max(max, arr[i]);
           arr[i]=max;
           max=nextMax;
        }
        return arr;
    }
}
// @lc code=end
/*
15/15 cases passed (2 ms)
Your runtime beats 43.13 % of java submissions
Your memory usage beats 11.34 % of java submissions (52.6 MB)
*/

