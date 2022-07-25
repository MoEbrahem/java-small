package tictactoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static ArrayList<Integer>playerpositions=new ArrayList<Integer>();
    static ArrayList<Integer>Cpupositions=new ArrayList<Integer>();
    
    
    public static void main(String[] args) {
    char[][] gameBoard ={{' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},    
        {' ','|',' ','|',' '}};
         
    printGameBoard(gameBoard);
         
         
         while(true){
         Scanner scan =new Scanner(System.in);
         System.out.println("Enter your placement (1-9):");
         
         int playerposition= scan.nextInt();
         while(playerpositions.contains(playerposition)|| Cpupositions.contains(playerpositions)){
         System.out.println("position taken! Enter a correct position");
         playerposition =scan.nextInt();
         
         }
         placepiece (gameBoard, playerposition, "player");
                  String result=checkWinner();
if(result.length()>0){
System.out.println(result);
break;
}
         Random rand =new Random();
         int Cpuposition = rand.nextInt(9)+1;
         while(playerpositions.contains(Cpuposition)|| Cpupositions.contains(Cpupositions)){
             Cpuposition = rand.nextInt(9)+1;
         }
         placepiece (gameBoard, Cpuposition, "Cpu");
       
         printGameBoard(gameBoard);
         
         result=checkWinner();
         if(result.length()>0){
         System.out.println(result);
         break;
         
         }
         }
         }   
         
public static void printGameBoard(char[][] gameBoard){        
        for(char[]row:gameBoard){
           for(char c:row){
        System.out.print(c);
           }
    System.out.println();
        }
    }
    public static void placepiece(char [][] gameBoard,int position ,String user){
        char symbol =' ';
        if(user.equals("player")){
             symbol ='x';
             playerpositions.add(position);
        }else if(user.equals("Cpu")){
        symbol ='o';
        Cpupositions.add(position);
        
        }
            
        switch(position){
             case 1:
                 gameBoard[0][0] = symbol;
                 break;
             case 2:
                 gameBoard[0][2] = symbol;
                 break;
             case 3:
                 gameBoard[0][4] = symbol;
                 break;
             case 4:
                 gameBoard[2][0] = symbol;
                 break;
             case 5:
                 gameBoard[2][2] = symbol;
                 break;
             case 6:
                 gameBoard[2][4] = symbol;
                 break;
             case 7:
                 gameBoard[4][0] = symbol;
                 break;    
             case 8:
                 gameBoard[4][2] = symbol;
                 break;
             case 9:
                 gameBoard[4][4] = symbol;
                 break;     
         }
    
    }
      public static String checkWinner(){
      
          List topRow=Arrays.asList(1,2,3);
          List midRow=Arrays.asList(4,5,6);
          List botRow=Arrays.asList(7,8,9);
          
          List leftcol=Arrays.asList(1,4,7);
          List midcol=Arrays.asList(2,5,8);
          List rightcol=Arrays.asList(3,6,9);
         
          List cross1=Arrays.asList(1,5,9);
          List cross2=Arrays.asList(7,5,3);
          
          List<List> winning = new ArrayList<List>();
          winning.add(topRow);
          winning.add(midRow);
          winning.add(botRow);
          winning.add(leftcol);
          winning.add(midcol);
          winning.add(rightcol);
          winning.add(cross1);
          winning.add(cross2);
          
          for(List l :winning)
          if(playerpositions.containsAll(l)){
             return "congratulations you win!";
          }else if(Cpupositions.contains(l)){
               return"Cpu wins! sorry:(";
          }else if(playerpositions.size()+Cpupositions.size()==9){
              return "CAT!";
          
          }
          
      return "";
      }  
}
    
    
    


