package BackTracking;
import java.util.*;

public class count_backtarcking {
    public static void main(String[] args) {
        //System.out.println(count(3,3));
        //path("",3,3);
        //System.out.println(pathret("",3,3));
        boolean[][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        int[][] table=new int[board.length][board[0].length];
       // pathWithObstacle("", board, 0, 0);
        //allPaths("",board,0,0);
        allPathsPrint("", board, 0, 0, table, 1);
    }
    public static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;

    }

    public static void path(String result,int r,int c){
        if(r==1 && c==1){
            System.out.println(result);
            return;
        }
        if(r>1){
            path('D'+ result,r-1,c);
        }
        if(c>1){
            path('R'+result,r,c-1);
        }

    }

    public static ArrayList<String> pathret(String result,int r,int c){
        if(r==1 && c==1){
            //System.out.println(result);
            ArrayList<String> list=new ArrayList();
            list.add(result);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1){
            list.addAll(pathret('D'+ result,r-1,c));
        }
        if(c>1){
            list.addAll(pathret('R'+result,r,c-1));
        }
        return list;
    }
    public static void pathWithObstacle(String result,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(result);
        }
        if(maze[r][c]!=true){
            return;
        }
        if(r<maze.length-1){
            pathWithObstacle('D'+result, maze, r+1, c);
        }if(c<maze[0].length-1){
            pathWithObstacle('R'+result, maze, r, c+1);
        }
        return;
    }

    public static void allPaths(String result,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(result);
            return;
        }
        if(maze[r][c]==false){
            return;
        }

        maze[r][c]=false;

        if(r<maze.length-1){
            allPaths('D'+result,maze, r+1, c);
        }
        if(c<maze[0].length-1){
            allPaths('R'+result,maze,r,c+1);
        }
        if(r>0){
            allPaths('U'+result,maze,r-1,c);
        }
        if(c>0){
            allPaths('L'+result,maze, r, c-1);
        }

        maze[r][c]=true;
       
    }

    public static void allPathsPrint(String result,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            for(int[] arr:path){
                path[r][c]=step;
                System.out.println(Arrays.toString(arr));
               
            }
            System.out.println(result);
            System.out.println();
            return;
        }
        if(maze[r][c]==false){
            return;
        }

        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            allPathsPrint('D'+result,maze, r+1, c,path,step+1);
        }
        if(c<maze[0].length-1){
            allPathsPrint('R'+result,maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathsPrint('U'+result,maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathsPrint('L'+result,maze, r, c-1,path,step+1);
        }

        maze[r][c]=true;
        path[r][c]=0;
    }
    
}
