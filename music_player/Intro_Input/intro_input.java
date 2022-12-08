package music_player.Intro_Input;

import java.util.*;
import music_player.LinkedList.Track_LL;

public class intro_input{
    public static int no;
    static Scanner sc=new Scanner(System.in);

    public static void intro(){
        // MENU SHOWN AT THE STARTING
        System.out.println("1.ADD A TRACK");
        System.out.println("2.LIST OF TRACKS");
        System.out.println("3.REMOVE A TRACK");
        System.out.println("4.PLAY A TRACK");
        System.out.println("5.FOR EXITING");
        System.out.println();
    }

    public static int input(){
        // TAKING INPUT FOR THE MENU SHOWN.
        System.out.print("ENTER THE INPUT : ");
            int input_01=sc.nextInt();
            System.out.println();
            return input_01;
    }

    public static void Printing_track(Track_LL Tracks){
        // PRINTING THE TRACK DETAILS
        Tracks.Print_ListofTracks();
        System.out.println(); 
    }

    public static void Add_Track(Track_LL Tracks){
        // ADDING THE TRACK ( ADDING IN THE LINKEDLIST )
        System.out.print("ENTER TRACK : ");
        String Tracktobe_Added=sc.next();
        Tracks.Add_Track(Tracktobe_Added);

        System.out.println("TRACK ADDED !!");
        System.out.println();
    }

    public static void Remove_Track(Track_LL Tracks){
        // REMOVE THE TRACK ( REMOVE FROM THE LINKEDLIST )
        Tracks.Print_ListofTracks();
        Tracks.Remove_Track();

        System.out.println("TRACK REMOVED !!");
        System.out.println();
    }

    public static void Play_track(Track_LL Tracks){
        //  PLAYING THE TRACK
        Tracks.Print_ListofTracks();
        System.out.print("ENTER THE TRACK U WANT TO PLAY : ");
        no=sc.nextInt();
        String Track_Name=Tracks.Play_Track(no);
        System.out.println();
        System.out.println("TRACK -> "+Track_Name+" IS PLAYING CURRENTLY");
        System.out.println();
        Change_track(Tracks);
    }

    public static void Change_track(Track_LL Tracks){
        // CHANGING THE CURRENT TRACK TO PREV / NEXT.
        System.out.print("WANT TO CHANGE TRACK ? Y(1)/N(0) : ");
        int temp=sc.nextInt();
        if(temp==1){
            System.out.println();
            System.out.print("PREV(0) / NEXT(1) : ");
            int temp_2=sc.nextInt();
            System.out.println();
            if(temp_2==1){
                // FOR PLAYING NEXT TRACK
                String Next_Track=Tracks.Play_Next();
                System.out.println();
                System.out.println("NOW TRACK IS CHANGED TO -> "+Next_Track);
                System.out.println();
            }
            else if(temp_2==0){
                // FOR PLAYING PREV TRACK
                String Prev_Track=Tracks.Play_Prev();
                System.out.println();
                System.out.println("NOW TRACK IS CHANGED TO -> "+Prev_Track);
                System.out.println();
            }
            else{
                // FOR INVALID INPUT
                System.out.println("INVALID INPUT !");
            }
        }
        else if(temp==0){
            // FOR NOT CHANGING THE TRACK
            System.out.println("OK !! THANKS");
        }
        else{
            // FOR INVALID INPUT
            System.out.println("INVALID INPUT !!");
        }
    }
}