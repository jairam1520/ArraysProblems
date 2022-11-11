/*
You don't need to read input or print anything. 
Complete the function findK() which takes the matrix A[ ][ ], 
number of rows N, number of columns M, and integer K as input 
parameters and returns the Kth element in the spiral traversal 
of the matrix
*/

class SpiralMatrix
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int top=0;
	    int down=n-1;
	    int left=0;
	    int right=m-1;
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    int dir=0;
	    
	    while(top<=down && left<=right){
	        //traverse left to right
	        if(dir==0){
	            for(int i=left;i<=right;i++){
	                ans.add(a[top][i]);
	            }
	            top++;
	        }
	        //traverse top to down
	        if(dir==1){
	            for(int i=top;i<=down;i++){
	                ans.add(a[i][right]);
	            }
	            right--;
	        }
	        //traverse right to left
	        if(dir==2){
	            for(int i=right;i>=left;i--){
	                ans.add(a[down][i]);
	            }
	            down--;
	        }
	        //traverse down to top
	        if(dir==3){
	            for(int i=down;i>=top;i--){
	                ans.add(a[i][left]);
	            }
	            left++;
	        }
	        
	        dir=(dir+1)%4;
	    }
	    return ans.get(k-1);
	    
	}
	
}
