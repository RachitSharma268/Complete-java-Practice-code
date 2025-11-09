package regular.Arrays;

public class RainWater {
    public static int trappedRainWater(int height[]){
        int len = height.length;

        //Calculate the Left max boundary - array.
        int leftMax[] = new int[len];
        leftMax[0] = height[0];
        for(int i=1; i<len; i++){
            leftMax[i] = Math .max(height[i], leftMax[i-1]);
        }


        //Calculate the Right max boundary - array.
        int rightMax[] = new int[len];
        rightMax[len-1] = height[len-1];
        for(int i=len-2; i>=0; i--){
            rightMax[i] = Math .max(height[i], rightMax[i+1]);
        }

        //Loop
        int trappedWater = 0;
        for(int i=0; i<len; i++){
            // WaterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water = waterlevel-height[i]
            trappedWater += waterLevel - height[i];

        }
        return trappedWater;
    }

    // main method.

    public static void main(String args[]){
        int height[] = {2,4,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
