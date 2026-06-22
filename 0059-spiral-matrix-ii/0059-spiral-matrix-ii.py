class Solution(object):
    def generateMatrix(self, n):

        result = [[0] * n for _ in range(n)]

        left = 0
        right = n - 1
        top = 0
        bottom = n - 1

        num = 1

        while left <= right and top <= bottom:

            for col in range(left, right + 1):
                result[top][col] = num
                num += 1
            top += 1

            for row in range(top, bottom + 1):
                result[row][right] = num
                num += 1
            right -= 1

            if top <= bottom:
                for col in range(right, left - 1, -1):
                    result[bottom][col] = num
                    num += 1
                bottom -= 1

            if left <= right:
                for row in range(bottom, top - 1, -1):
                    result[row][left] = num
                    num += 1
                left += 1

        return result