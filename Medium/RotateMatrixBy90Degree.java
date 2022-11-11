
// Given a square matrix of size N x N. 
// The task is to rotate it by 90 degrees
// in anti-clockwise direction without using
// any extra space. 

class RotateMatrixBy90Degree
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        //take transpose of a matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        //exchange first row with last row,2ns row with 2nd last row and so on...
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-i][j];
                matrix[n-1-i][j]=temp;
            }
        }
        
    }
}
