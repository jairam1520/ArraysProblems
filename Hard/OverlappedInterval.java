class OverlappedInterval
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        //sort the intervals array by the start time( 0th index of 1D array)
        Arrays.sort(Intervals, new Comparator<int[]>() {
            
          @Override              
          // Compare values according to columns
          public int compare(final int[] entry1, 
                             final int[] entry2) {
  
            if (entry1[0] > entry2[0])
                return 1;
            else
                return -1;
          }
        });
        
        //add the first interval to the result
        List<int[]> list = new ArrayList<>();
        list.add(Intervals[0]);
        
        //itr which will point to last interval in our result
        int curr=0;
        
        //start from 1st interval since we already added the 0th interval
        for(int i=1;i<Intervals.length;i++){
            //last interval from the result
            int[] prevInterval=list.get(curr);
            
            //current interval
            int[] currInterval=Intervals[i];
            
            //if cureent and prev intervals are overlapping then update the end time of prev 
            //interval as end time of current interval
            if(prevInterval[1]<=currInterval[1] && prevInterval[1]>=currInterval[0]){
                list.get(curr)[1]=currInterval[1];
            }
            //if current and prev interval are not overlapping then just add current interval to result
            //and move itr to next interval
            else if(prevInterval[1]<currInterval[0]){
                list.add(currInterval);
                curr++;
            }
        }
        
        
        // for(int i=0;i<Intervals.length;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.print(Intervals[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //System.out.println(Arrays.toString(list.get(0)));
        return list.toArray(new int[list.size()][]);
    }
}
