package DSA;

class containerWithMostWater {
    public int maxArea(int[] height) {
        int result = 0;
        int l = 0;
        int r = height.length - 1;
        int area = 1;
        while(l < r) {
            area = (r - l) * Math.min(height[l], height[r]);
            result = Math.max(result, area);

            if(height[l] < height[r])
                l++;
            else 
                r--;
        }

        return result;
    }
}