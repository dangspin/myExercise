class Solution:
    """
    @param: A: An integer array
    @param: queries: The query list
    @return: The number of element in the array that are smaller that the given integer
    """
    def countOfSmallerNumber(self, A, queries):
        # write your code here
        res=[]
        
        for i in queries:
            res.append(self.findQuery(A,i))
            
        return res
        
        
    def findQuery(self,A,query):
        
        sum=0
        for i in A:
            if (i<query):
                sum=sum+1
        return sum
