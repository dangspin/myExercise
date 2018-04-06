class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        fill(image, sr, sc, newColor, image[sr][sc]);
        
        return image;
    }
    
    public void fill(int[][] image, int sr, int sc, int newColor, int target) {
        int m = image.length;
        int n = image[0].length;
        
        if (sr <0 || sr >=m || sc < 0 || sc >= n) {
            return ;
        }
        
        if (image[sr][sc] == target) {
            image[sr][sc] = -1;
            
            fill(image, sr +1 , sc, newColor, target);
            fill(image, sr -1 , sc, newColor, target);
            fill(image, sr, sc+1, newColor, target);
            fill(image, sr, sc-1, newColor, target);
            
            image[sr][sc] = newColor;
        }
    }
}
