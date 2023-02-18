package tankWater;

public class tankWater {
    public int maxArea(int[] height) {
        int maxarea=0;
        for(int i=0; i<height.length-1; i++){
            for(int j=i+1; j<height.length; j++){
                int area=(j-i)*Math.min(height[i],height[j]);
                maxarea=Math.max(area,maxarea);
            }
        }
        return maxarea;
    }
    
}
