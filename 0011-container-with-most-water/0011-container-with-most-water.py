class Solution(object):
    def maxArea(self, height):
        maxarea=0
        left=0
        right=len(height)-1

        while left<right:
            area=(min(height[left],height[right]))*(max(left,right)-min(left,right))
            maxarea=max(maxarea,area)
            if height[left]>height[right]:
                right-=1
            else:
                left+=1

        return maxarea
        