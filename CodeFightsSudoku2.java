boolean sudoku2(char[][] grid) {
    //boolean[] int_present = new boolean[10];
    for(int i=0; i<grid.length; i++){
        boolean[] int_present = new boolean[10];
        boolean[] int_present1 = new boolean[10];
        for(int j=0;j<grid[i].length; j++){
        if(grid[i][j]!='.'){
        int k = (int) grid[i][j] - 48;
        if(int_present[k] == false){
        int_present[k] = true;
        }
        else{
            return false;
        }
        }
        if(grid[j][i]!='.'){
        int x = (int) grid[j][i] -48;
        if(!int_present1[x]){
        int_present1[x] = true;
        }
        else{
            return false;
        }
        }
        }
    }
     for (int x = 0; x < 9; x += 3) {
        for (int y = 0; y < 9; y += 3) {
            HashSet<Character> set = new HashSet<Character>();
            for (int i = x; i < x + 3; i++) {
                for (int j = y; j < y + 3; j++) {
                    if(!set.add(grid[i][j]) && grid[i][j] != '.') return false;
                }
            }
          }
    }
    
    return true;
}
