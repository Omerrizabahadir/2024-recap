package recap.design_patterns.state_design_pattern02;

public class Main {
    public static void main(String[] args) {

        //Context class'ından verileri yönetmeliyiz.
        MediaPlayerContext mediaPlayerContext =new MediaPlayerContext();

        // Medya oynatıcıyı başlat
        mediaPlayerContext.pressPlay(); // Çıktı: Oynatma başladı.

        System.out.println();

        // Medya oynatıcıyı duraklat
        mediaPlayerContext.pressPause(); // Çıktı: Oynatma durakladı.

        System.out.println();

        // Medya oynatıcıyı yeniden başlat
        mediaPlayerContext.pressPlay();

        System.out.println();

        //Medya oynatıcıyı durdur
        mediaPlayerContext.pressStop();


    }
}
