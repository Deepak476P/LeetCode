class Solution(object):
    def maxProfit(self, prices):
        l = 0
        r = 1
        mp = 0

        while r < len(prices):

            if prices[l] < prices[r]:
                mp = max(mp, prices[r] - prices[l])
            else:
                l = r

            r += 1

        return mp