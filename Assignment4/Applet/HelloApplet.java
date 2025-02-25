import java.applet.Applet;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class HelloApplet extends Applet implements Runnable {
    private String message = "Hello Applet";
    private boolean blink = true;
    private Thread blinkThread;
    private Clip clip;
    private Image backgroundImage;

    // Initialize the applet
    public void init() {
        // Load the background image
        backgroundImage = getImage(getCodeBase(), "bg.jpg"); // bg.jpg should be in the same folder as the applet

        // Play background sound using javax.sound.sampled.Clip
        try {
            // Load the audio file from the applet's codebase using URL
            URL soundURL = getCodeBase(); // getCodeBase returns the applet's directory URL
            soundURL = new URL(soundURL, "tune.wav"); // Assuming tune.wav is in the same folder
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // This makes the sound loop continuously
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        // Start the blinking thread
        blinkThread = new Thread(this);
        blinkThread.start();
    }

    // Paint the applet
    public void paint(Graphics g) {
        // Draw the background image
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

        // Draw the blinking message
        if (blink) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString(message, getWidth() / 4, getHeight() / 2); // Position the message at the center
        }
    }

    // Run method for blinking effect
    public void run() {
        while (true) {
            try {
                Thread.sleep(500); // Blink interval (500 ms)
                blink = !blink; // Toggle the blink state
                repaint(); // Redraw the applet
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Stop the sound when the applet is destroyed
    public void stop() {
        if (clip != null) {
            clip.stop(); // Stop the sound when the applet is closed
        }
    }
}
