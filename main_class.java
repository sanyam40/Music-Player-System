import java.util.Scanner;
import music_player.Intro_Input.intro_input;
import music_player.LinkedList.*;

public class main_class{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // CREATING A CIRCULAR DOUBLY LINKDEDLIST
        Track_LL Tracks=new Track_LL();
        
        System.out.println("----- WELCOME TO MUSIC PLAYER APP -----");
        System.out.println();
   
        while(true){
            System.out.println("-----------------------------------------");
            intro_input.intro();
            int input_01=intro_input.input();
            
            if(input_01==1){ 
                // ADDING THE TRACK
                intro_input.Add_Track(Tracks);
            }
            else if(input_01==2){
                // PRINTING THE TRACKS
                intro_input.Printing_track(Tracks);
            }
            else if(input_01==3){
                // REMOVING THE TRACK
                intro_input.Remove_Track(Tracks);
            }
            else if(input_01==4){
                // PLAY THE TRACK
                intro_input.Play_track(Tracks);
            }
            else if(input_01==5){
                // BREAKING THE LOOP
                System.out.println("THANKS FOR USING OUR SERVICES :) ");
                System.out.println();
                break;
            }
            else{
                //FOR INVALID INPUT
                System.out.println("INVALID INPUT !!");
            } 
        } 
        sc.close();
    }
}