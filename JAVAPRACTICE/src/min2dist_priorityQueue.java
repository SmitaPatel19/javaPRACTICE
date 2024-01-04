import java.util.*;
public class min2dist_priorityQueue {

    public static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        Point(int x,int y,int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }

        @Override
        public int compareTo(Point p2){
            return this.dist-p2.dist;  //ascending order,min at start
        }
    }

    public static void main(String[] args) {
        
        PriorityQueue<Point> pq=new PriorityQueue<>();
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        int n=pts.length;
        for(int i=0;i<n;i++){
            int dist=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], dist));
        }

        for(int i=0;i<k;i++){
            System.out.println("Square of distance = "+ pq.peek().dist+" ("+pq.peek().x + "," + pq.remove().y+")");
        }
    }
}
