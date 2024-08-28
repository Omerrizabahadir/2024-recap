package recap.design_patterns.state_design_pattern02;

public interface MediaPlayerState {

    //Medya Player 'ın farklı durumlarını abstract metotlarla belirttim
    void pressPlay(MediaPlayerContext mediaPlayerContext);
    void pressPause(MediaPlayerContext mediaPlayerContext);
    void pressStop(MediaPlayerContext mediaPlayerContext);
}
