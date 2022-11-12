// Given a positive integer N, return the Nth row of pascal's triangle.
// Pascal's triangle is a triangular array of the binomial coefficients
// formed by summing up the elements of previous row

class PascalTriangle {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        double M=1e9+7;
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        
        //creating the 0th row
        ArrayList<Long> firstrow = new ArrayList<>();
        firstrow.add(1L);
        ans.add(firstrow);
        
        //start from 1st row
        for(int i=1;i<n;i++){
            ArrayList<Long> row = new ArrayList<>();
            //adding first element to current row
            row.add(1L);
            
            // calculating the middle element from the previous row element
            //The elements can be large so return it modulo 109 + 7.
            for(int j=1;j<i;j++){
                ArrayList<Long> prevRow=ans.get(i-1);
                long ele=(long)((prevRow.get(j-1)+prevRow.get(j))%M);
                row.add(ele);
            }
             //adding last element to current row
            row.add(1L);
            ans.add(new ArrayList<Long>(row));
            
        }
        return ans.get(n-1);
    }
}
