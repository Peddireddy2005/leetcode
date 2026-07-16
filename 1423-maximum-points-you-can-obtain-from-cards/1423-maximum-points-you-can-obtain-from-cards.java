class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int currentSum = 0;
        for (int i = n - k; i < n; i++) {
            currentSum += cardPoints[i];
        }
        int maxSum = currentSum;
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
            currentSum -= cardPoints[n - k + i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}