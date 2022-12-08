package music_player.LinkedList;

import java.util.Scanner;
import music_player.Intro_Input.intro_input;

// CREATING DATA_STRUCTURE OF LINKEDLIST
public class Track_LL{
    static Node head;
    Scanner sc=new Scanner(System.in);

    public class Node{
        String data;
        Node next;
        Node prev;

        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
// TO INSERT TRACK IN LIST ( INSERTING NODE IN LINKEDLIST )
    public void Add_Track(String data){
        Node n1=new Node(data);
        n1.next=head;
        if(head!=null){
            head.prev=n1;
        }
        head=n1;
    }
// TO REMOVE TRACK FROM LIST ( REMOVING NODE FROM LINKEDLIST )
    public void Remove_Track(){
        System.out.print("ENTER TRACK TO REMOVE : ");
        int n=sc.nextInt();

        Node temp=head;
        if (n == 0) {
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null&&i<n-1;i++){
            temp=temp.next;
        }
        Node next=temp.next.next;
        temp.next=next;
    }

//TO PRINT THE LIST OF TRACK ( PRINTING THE LINKEDLIST )   
    public void Print_ListofTracks(){
        Node temp=head;
        int i=1;
        while(temp!=null){
            System.out.println(i+"."+temp.data);
            temp=temp.next;
            i++;
        }
    }
// TO CHANGE CURRENT TRACK TO NEXT TRACK ( CHANGING TO NEXT NODE )
    public String Play_Next(){
        int n=intro_input.no;
        Node temp=head;
        int i;
        String tt;
        for(i=1;i!=n;i++){
            temp=temp.next;
        }
        if(temp.prev!=null){
            tt=temp.next.data;
            return tt;
        }
        else{
            // IF THERE IS NO NEXT TRACK ( NODE )
            System.out.println("THERE IS NO NEXT TRACK !!");
        }
        return null;
    }
// TO CHANGE CURRENT TRACK TO PREV TRACK ( CHANGING TO PREV NODE )
    public String Play_Prev(){
        int n=intro_input.no;
        Node temp=head;
        int i;
        String tt="";
        for(i=1;i!=n;i++){
            temp=temp.next;
        }
        if(temp.prev!=null){
            tt=temp.prev.data;
            return tt;
        }
        else{
            // IF THERE IS NO PREV TRACK ( NODE ) 
            System.out.println("THERE IS NO PREV TRACK !!");
        }
        return null;
    }
// TO PLAY THE TRACK FROM THE LIST 
    public String Play_Track(int n){
        Node temp=head;
        int i;
        for(i=1;i!=n;i++){
            temp=temp.next;
        }
        String t=temp.data;
        return t;
    }
}

