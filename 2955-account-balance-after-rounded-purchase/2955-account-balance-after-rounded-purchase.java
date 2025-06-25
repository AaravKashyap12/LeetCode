class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - calculateNearest10(purchaseAmount);
    }

    int calculateNearest10(int num) {
        if (num % 10 < 5) {
            return (num / 10) * 10;
        } else {
            return (num / 10) * 10 + 10;
        }
    }
}
