package recap.design_patterns.state_design_pattern02;

public class MediaPlayerPausedState implements MediaPlayerState{

    //Medya Player'ın hangi durumu yansıtacağını override ettiğimiz metotlarda belirtebiliriz
    @Override
    public void pressPlay(MediaPlayerContext mediaPlayerContext) {
        mediaPlayerContext.setMediaPlayerState(new MediaPlayerPlayingState());
        System.out.println("Onatma yeniden başlatıldı");
    }

    @Override
    public void pressPause(MediaPlayerContext mediaPlayerContext) {
        System.out.println("Oynatma zaten duraklatıldı.");
    }

    @Override
    public void pressStop(MediaPlayerContext mediaPlayerContext) {
        mediaPlayerContext.setMediaPlayerState(new MediaPlayerStopedState());
        System.out.println("Oynatma zaten durdu.");
    }
}
