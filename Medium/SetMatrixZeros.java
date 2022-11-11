//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
class SetMatrixZeros {
/************* TC=O(n*m) & SC=O(1)************/
    public void setZeroes(int[][] matrix) {
        

        //row count
        int m=matrix.length;
        //column count
        int n=matrix[0].length;

        //check if first row contains 0 and store in flag
        boolean firstRow=false;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstRow=true;
                break;
            }
        }
      
      //check if first col contains 0 and store in flag
        boolean firstCol=false;
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstCol=true;
                break;
            }
        }
      
        //use 0th row and 0th col for determining whether corresponding row or col contains zero 
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
      //update row and column(set zero) with refrence to 0th row and 0th col
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
      
        //if 0th row contains 0(use flag to determine) ,update 0th row
        if(firstRow){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
      //if 0th col contains 0(use flag to determine) ,update 0th row
        if(firstCol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        
    }
  
 /*********** TC=O(n*m) & SC=O(n)+O(m)******/
  public void setZeroes(int[][] matrix) {
        

        int m=matrix.length;
        int n=matrix[0].length;

        //maintain two arrays to strore which row and col contains zero
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
    //update matrix with refrence to above two arrays
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
