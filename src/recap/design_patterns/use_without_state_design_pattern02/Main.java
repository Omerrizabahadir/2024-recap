package recap.design_patterns.use_without_state_design_pattern02;

public class Main {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();

        //medya oynatıcısı başlat
        mediaPlayer.pressplay();        //medya oynatıcısı başladı

        //medya oynatıcısı duraklat
        mediaPlayer.pressPause();

        //medya oynatıcısı durdur
        mediaPlayer.pressStop();


    }

}
