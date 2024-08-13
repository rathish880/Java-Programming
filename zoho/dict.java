package zoho;

public class dict {
    public static void main(String[] args) {
        char[][] grid= {{'a','z','o','l'},
                        {'n','x','h','o'},
                        {'v','y','i','v'}, 
                        {'o','r','s','e'}}; 
        String[] dict={"van","zoho","love","are","is"};
       
        for(String str:dict){
            if(findWord(grid,str)){
                System.out.println(str);
            }
        }
    }
    public static boolean findWord(char[][] grid,String word){
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==word.charAt(0) && findPath("",word,grid,row,col)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean findPath(String processed,String unprocessed,char[][] grid,int row,int col){
        if(unprocessed.length()==0){
            return true;
           
           // index+=1;
            
            
            //findPath("",grid,0,0);
        }
        if(row>=grid.length ||col>=grid[0].length || grid[row][col]!=unprocessed.charAt(0))
            return false;

        char ch=unprocessed.charAt(0);
        grid[row][col]='#';

        boolean found=findPath(processed+ch,unprocessed.substring(1),grid,row+1,col)||
                       findPath(processed+ch,unprocessed.substring(1),grid,row,col+1);
          
        grid[row][col]=ch;     
           
        return found;
        

    }
}

// for (String word : dict) {
//     if (findWordInGrid(word, grid)) {
//         System.out.println("Word found: " + word);
//     } else {
//         System.out.println("Word not found: " + word);
//     }
// }
// }

// public static boolean findWordInGrid(String word, char[][] grid) {
// for (int row = 0; row < grid.length; row++) {
//     for (int col = 0; col < grid[0].length; col++) {
//         if (grid[row][col] == word.charAt(0) && findPath("", word, grid, row, col)) {
//             return true;
//         }
//     }
// }
// return false;
// }

// public static boolean findPath(String processed, String unprocessed, char[][] grid, int row, int col) {
// if (unprocessed.length() == 0) {
//     return true; // Word found
// }

// if (row >= grid.length || col >= grid[0].length || grid[row][col] != unprocessed.charAt(0)) {
//     return false; // Out of bounds or character does not match
// }

// char temp = grid[row][col];
// grid[row][col] = '#'; // Mark as visited

// boolean found = findPath(processed + temp, unprocessed.substring(1), grid, row + 1, col) ||
//                 findPath(processed + temp, unprocessed.substring(1), grid, row, col + 1);

// grid[row][col] = temp; // Unmark visited

// return found;
// }
// }
    
    

