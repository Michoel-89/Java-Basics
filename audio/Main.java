package audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // Your Java code goes here

        Scanner scanner = new Scanner(System.in);

        File file = new File("audio/Sample.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        String response = "";

        while (!response.equals("Q")) {
            System.out.println("P  = play, S = stop, R = reset, Q = quit");
            System.out.println("Enter your choice");

            response = scanner.next();
            response = response.toUpperCase();

            switch(response) {
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                break;
                default: System.out.println("invalid input");
            }
        }
    }
}
