class Solution {
    public int numOfWays(int n) {
        int MOD = 1000000007;
        long typeA = 6; // 3 colors for first cell, 2 for second, 1 for third (all different)
        long typeB = 6; // 2 cells same, one different (3 options for pair, 2 for remaining, 1 for different color)
        
        for (int i = 2; i <= n; i++) {
            long newTypeA = (2 * typeA + 2 * typeB) % MOD;
            long newTypeB = (2 * typeA + 3 * typeB) % MOD;
            typeA = newTypeA;
            typeB = newTypeB;
        }
        return (int)((typeA + typeB) % MOD);
    }
}