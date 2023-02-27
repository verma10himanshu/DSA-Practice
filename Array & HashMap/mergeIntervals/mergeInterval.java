package mergeIntervals;

public class mergeInterval {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1)
            return intervals;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       List<int[]>list= new ArrayList<>();

       for(int [] interval: intervals){
           if(list.size()==0){
               list.add(interval);
           }else{
               int [] persent=list.get(list.size()-1);
               if(interval[0]<=persent[1]){
                   persent[1]=Math.max(interval[1],persent[1]);
               }else{
                   list.add(interval);
               }
           }
       }
       return  list.toArray(new int[list.size()][]);

        
    }
    
}
