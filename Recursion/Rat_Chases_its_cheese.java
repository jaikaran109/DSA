public class Rat_Chases_its_cheese {
    static boolean found = false;
    public static void main(String[] args) {
        int r = 5 ; 
        int c = 4 ; 
        char [][] path = {{'O','X','O','O'}, {'O','O','O','X'}, {'X','O','X','O'}, {'X','O','O','X'}, {'X','X','O','O'}} ;
        int [][] desti = new int [r][c] ; 
        chesse(r-1,c-1,0,0,path, "", desti) ;
        if(!found)
            System.out.println("NO PATH FOUND");
    }

    public static void chesse(int r, int c , int currR , int currC , char [][] path , String ans, int [][] desti)
    {
        if(currC < 0 || currC > c  || currR < 0 || currR > r || path[currR][currC] == 'X')
        {
            return ; 
        }
        desti[currR][currC] = 1;
        if(currC == c && currR == r)
        {
            found = true ;
            for (int i = 0; i < desti.length; i++) {
            for (int j = 0; j < desti[0].length; j++) {
                System.out.print(desti[i][j]+" ");
            }
            System.out.println();
        }
            return ; 
        }
        path[currR][currC] = 'X' ;
        chesse(r, c, currR+1, currC, path, ans+"D",desti);
        chesse(r, c, currR, currC-1, path, ans+"L", desti);
        chesse(r, c, currR, currC+1, path, ans+"R", desti);
        chesse(r, c, currR-1, currC, path, ans+"U", desti);
        path[currR][currC] = 'O' ; 
        desti[currR][currC] = 0 ;
    }
}
