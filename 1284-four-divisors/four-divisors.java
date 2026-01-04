class Solution {
    public int sumFourDivisors(int[] nums) {
        int total = 0;
        for (int num : nums) {
            int sum = 0, count = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int div = num / i;
                    if (i == div) {
                        count++;
                        sum += i;
                    } else {
                        count += 2;
                        sum += i + div;
                    }
                    if (count > 4) break;
                }
            }
            if (count == 4) total += sum;
        }
        return total;
    }
}