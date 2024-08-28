package recap.design_patterns.state_design_pattern02;

public class MediaPlayerStopedState implements MediaPlayerState{

    //Medya Player'ın hangi durumu yansıtacağını override ettiğimiz metotlarda belirtebiliriz
    @Override
    public void pressPlay(MediaPlayerContext mediaPlayerContext) {
        mediaPlayerContext.setMediaPlayerState(new MediaPlayerPlayingState());
        System.out.println("Oynatma başladı.");
    }

    @Override
    public void pressPause(MediaPlayerContext mediaPlayerContext) {
        System.out.println("Oynatma durdu, duraklatılamaz");
    }

    @Override
    public void pressStop(MediaPlayerContext mediaPlayerContext) {
        System.out.println("Oynatnma zaten durdu");
    }
}
