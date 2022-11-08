// Given a matrix mat[][] of size N x M, where every row and column
// is sorted in increasing order, and a number X is given. The task
// is to find whether element X is present in the matrix or not.


class SearchInSortedMatrix
{
    public static int matSearch(int mat[][], int N, int M, int x)
    {
        
        //start from upper right corner
        int i=0;//points to current row
        int j=M-1;//points to current column 
        
        while(i<N && j>=0){
            //increment row pointer
            //go down rowise
            if(mat[i][j]<x)i++;
            
            //decrement column pointer
            //go left columnwise
            else if(mat[i][j]>x)j--;
            
            else if(mat[i][j]==x)return 1;
        }
        return 0;
    }
}
