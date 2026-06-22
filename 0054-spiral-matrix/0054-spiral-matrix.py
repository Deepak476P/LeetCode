class Solution(object):
    def spiralOrder(self, matrix):
        top=0
        left=0
        right=len(matrix[0])-1
        bottom=len(matrix)-1
        result=[]
        while top<=bottom and left <= right:

            for row in range (left,right+1):
                result.append(matrix[top][row])
            top+=1

            for col in range (top,bottom+1):
                result.append(matrix[col][right])
            right-=1

            if top<=bottom:
                for row in range(right,left-1,-1):
                    result.append(matrix[bottom][row])
                bottom-=1

            if left<=right:
                for col in range(bottom,top-1,-1):
                    result.append(matrix[col][left])
                left+=1

        
        return result
