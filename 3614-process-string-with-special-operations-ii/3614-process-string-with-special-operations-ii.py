class Solution(object):
    def processStr(self, s, k):
        n = len(s)

        # Calculate final length
        length = 0
        for ch in s:
            if ch == '*':
                if length > 0:
                    length -= 1
            elif ch == '#':
                length *= 2
            elif ch == '%':
                pass
            else:
                length += 1

        if k >= length:
            return '.'

        # Walk backwards
        for i in range(n - 1, -1, -1):
            ch = s[i]

            if ch == '#':
                length //= 2
                k %= length

            elif ch == '%':
                k = length - 1 - k

            elif ch == '*':
                length += 1

            else:
                length -= 1

                if k == length:
                    return ch

        return '.'