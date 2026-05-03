import java.util.Scanner;

public class piyush_magical_park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int row = sc.nextInt() ;
        int col = sc.nextInt() ;
        int minstrength = sc.nextInt() ;
        int startingStrength = sc.nextInt() ;
        char park[][] = new char[row][col] ;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length; j++) {
                park[i][j] = sc.next().charAt(0) ;
            }
        }
        sc.close();

        boolean canEscape = true;
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                char cell = park[i][j] ;
                if(cell == '#')
                {
                    break ; // jump to next row
                }
                else if(cell == '.')
                {
                    startingStrength -= 2 ;
                }
                else if(cell == '*')
                {
                    startingStrength += 5 ;
                }

                startingStrength-- ;         // for moving in cell

                if(startingStrength < minstrength)
                {
                    canEscape = false;
                    break ;
                }
            }
        }

        if(canEscape)
        {
            System.out.println("Yes");
            System.out.println(startingStrength);
        }
        else{
            System.out.println("No");
        }
    }
}
