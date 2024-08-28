package recap.design_patterns.use_without_state_design_pattern02;

public class MediaPlayer {
    private static final int STOPPED = 0;
    private static final int PLAYING = 1;
    private static final int PAUSED = 2;

    private int currentState;

    public MediaPlayer() {
        this.currentState = STOPPED;  //başlangıç durumu
    }

    public void pressplay() {
        switch (currentState) {
            case STOPPED:
                System.out.println("Oynatma başladı.");
                currentState = PLAYING;
                break;
            case PLAYING:
                System.out.println("Oynatma zaten devam ediyor.");
                break;
            case PAUSED:
                System.out.println("Oynatma yeniden başlatıldı.");
                currentState = PLAYING;
                break;
        }
    }

    public void pressPause() {
        switch (currentState) {
            case PLAYING:
                System.out.println("Oynatma duraklatıldı.");
                currentState = PAUSED;
                break;
            case PAUSED:
                System.out.println("Oynatma zaten duraklatıldı.");
                break;
            case STOPPED:
                System.out.println("Oynatma durdu, duraklatılamaz.");
                break;
        }
    }

    public void pressStop() {
        switch (currentState) {
            case PLAYING:
                System.out.println("Oynatma durdu.");
                currentState = STOPPED;
                break;
            case PAUSED:
                System.out.println("Oynatma durdu.");
                currentState = STOPPED;
                break;
            case STOPPED:
                System.out.println("Oynatma zaten durdu.");
                break;
        }
    }

}