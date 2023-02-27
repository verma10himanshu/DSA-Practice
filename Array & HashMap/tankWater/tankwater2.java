package tankWater;

public class tankwater2 {
    public int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
        int max_area=0;
        while(l<h){
            int area=(h-l)*Math.min(height[l],height[h]);
            max_area=Math.max(area,max_area);
            if(height[l]<height[h]){
                l++;
            }else{
                h--;
            }
        }
        return max_area;
    }
    
}
