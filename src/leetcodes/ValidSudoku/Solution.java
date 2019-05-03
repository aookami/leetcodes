class Solution {
    
    boolean checkSquare(char[][] board, int square){
      List<Character> squareList = new  ArrayList<>();

        int coordx = 1, coordy = 1;
        
            if(square==0){
                coordx = 1;
                coordy = 1;
            }else if (square==1){
                coordx = 1;
                coordy = 4;
            }else if (square==2){
                coordx = 1;
                coordy = 7;
            }else if (square==3){
                coordx = 4;
                coordy = 1;
            }else if (square==4){
                coordx = 4;
                coordy = 4;
            }else if (square==5){
                coordx = 4;
                coordy = 7;
            }else if (square==6){
                coordx = 7;
                coordy = 1;
                
            }else if (square==7){
                coordx = 7;
                coordy = 4;
            }else if (square==8){
                coordx = 7;
                coordy = 7;
            }
        
        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                Character val = board[coordx+i][coordy+j];
                if(squareList.contains(val) && val != '.'){
                    return false;
                }else{
                    squareList.add(val);
                }
                
            }
        }
        return true;
        
    }
    boolean checkLine(char[][] board, int line){
        List<Character> lineList = new  ArrayList<>();
        
        for(int i = 0; i < 9; i++){
             Character val = board[line][i];
                if(lineList.contains(val) && val != '.'){
                    return false;
                }else{
                    lineList.add(val);
                }
        }
        return true;
        
    }
    boolean checkColumn(char[][] board, int column){
        
            List<Character> columnList = new  ArrayList<>();

           for(int i = 0; i < 9; i++){
             Character val = board[i][column];
                if(columnList.contains(val) && val != '.'){
                    return false;
                }else{
                    columnList.add(val);
                }
        }
        return true;
        
    }
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9 ; i++){
            if(!checkSquare(board, i))
                return false;
            if(!checkLine(board, i))
                return false;
            if(!checkColumn(board, i))
                return false;
            
        
        }
        return true;
        
    }
}
