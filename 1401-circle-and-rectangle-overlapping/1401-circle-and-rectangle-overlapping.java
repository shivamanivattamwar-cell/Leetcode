class Solution {
    public boolean checkOverlap(int radius, int xC, int yC, int x1, int y1, int x2, int y2) {
        int px=Math.max(x1,Math.min(xC,x2));
        int py=Math.max(y1,Math.min(yC,y2));

        int ds= (px-xC)*(px-xC)+(py-yC)*(py-yC);

        return ds<=radius*radius;
    }
}