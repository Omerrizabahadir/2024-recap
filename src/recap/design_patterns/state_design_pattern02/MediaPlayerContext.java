package recap.design_patterns.state_design_pattern02;

public class MediaPlayerContext {

    //Context davranışları kullanarak durumları düzenler.
    //örneğin mEDYA pLAYER DURDU durumundaysa başlatı gibi

    private MediaPlayerState mediaPlayerState;

    public MediaPlayerContext() {
        this.mediaPlayerState = new MediaPlayerStopedState();   //Başlangıç durumu "Durdu"

    }

    public void setMediaPlayerState(MediaPlayerState mediaPlayerState) {
        this.mediaPlayerState = mediaPlayerState;
    }
    //MediaPlayer da pressPlay() metodunu çağırır.medya oynatıcıyı oynatma durumuna getirmek için çağrılır.
    public void  pressPlay(){
        mediaPlayerState.pressPlay(this);
    }
    //MediaPlayer da pressPause() metodunu çağırır.
    public void pressPause(){
        mediaPlayerState.pressPause(this);
    }
    //MediaPlayer da pressStop() metodunu çağırır.
    public void pressStop(){
        mediaPlayerState.pressStop(this);

        /*
        this anahtar kelimesi, Context sınıfının mevcut örneğini (bu örnekte MediaPlayer sınıfının bir örneğini) temsil eder.
        Bu, Context sınıfının bir metodunun State arayüzü veya sınıfındaki ilgili metoda geçilmesi gereken bir parametredir.
        this, Context nesnesinin kendisini işaret eder ve State nesnesinin bu nesne üzerinde işlemler yapmasını sağlar.
         */
    }
}
