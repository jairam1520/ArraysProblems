  /*
Given a boolean 2D array of n x m dimensions where
each row is sorted. Find the 0-based index of the 
first row that has the maximum number of 1's.
*/
class RowWithMaxOnes {
    int rowWithMax1s(int arr[][], int n, int m) {
        //start from top right corner
        //if current element is 1 decrement column index(go left)
        //if current elemet is 0 increment row index(go down)
        int i=0;
        int j=m-1;
        int row=-1;
        while(i<n && j>=0){
            //move to left column
            while(j>=0 && arr[i][j]==1){
                j--;
                row=i;
            }
            //move down to next row
            i++;
        }
        return row;
    }
}
