package week13.inheritance;

public class Audiobook extends Book{

    int lengthOfRecording;
    String narrator;

    public Audiobook(String title, String type, String author, double price, int lengthOfRecording, String narrator) {
        super(title, type, author, price);
        this.lengthOfRecording = lengthOfRecording;
        this.narrator = narrator;
    }



}
