public int kthSmallest(int[][] matrix, int k) {
        // write your code here
        if (matrix == null || matrix.length == 0) {
            return -1;
        }
        if (matrix.length * matrix[0].length < k) {
            return -1;
        }
        
        int row=matrix.length;
        int col=matrix[0].length;
        
        boolean[][] visited=new boolean[row][col];
        visited[0][0]=true;
        
        PriorityQueue<Point> pq=new PriorityQueue<Point>(k,new cmp());
        pq.offer(new Point(0,0,matrix[0][0]));
        
        int count=0; Point ans;
        int[] dx={0,1};
        int[] dy={1,0};
        
        while (count<k-1){
            ans=pq.poll();
            
            for (int i=0;i<2;i++){
                int corx=ans.x+dx[i];
                int cory=ans.y+dy[i];
                
                if (isValid(row,col,corx,cory,visited)){
                    pq.offer(new Point(corx,cory,matrix[corx][cory]));
                    visited[corx][cory]=true;
                }
                
            }
            
            count++;
            
        }
        
        return pq.poll().val;
        
        
    }
    
    
    public boolean isValid(int row, int col,int i, int j, boolean[][] visited){
        if ((i<row && j<col) && visited[i][j]==false){
            return true;
        }
        
        return false;
    }
    
    class Point{
        int x;
        int y;
        int val;
        
        public Point(int x, int y, int val){
            this.x=x;
            this.y=y;
            this.val=val;
        }
    }
    
    class cmp implements Comparator<Point>{
        public int compare (Point p1, Point p2){
            return p1.val-p2.val;
        }
    }
    
 // This problem is very interesting, and it is not difficult to implement. The only point need to be careful
 // is how to go over the elements in a matrix. The use of dx, dy is very tricky.
