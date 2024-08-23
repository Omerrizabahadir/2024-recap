package recap.java_8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream03 {
    public static void main(String[] args) {

        //Verilen Liste
        List<Match> matchList = Arrays.asList(
                new Match("FootballMatch",11),
                new Match("BasketballMatch",7),
                new Match("Soccer",7),
                new Match("Tennis",2)
        );

        Optional <String> matchName = matchList.stream()
                .map(Match::getName)
                .filter(name-> name.endsWith("Match"))   //Match ile bitenleri alacak
                .sorted()                                //sıralayacak
                .findFirst();                            //ilk sıradaki BasketBallMatch 'i yazacak

        System.out.println("Result : "+ matchName.orElse("match no found"));


    }

}
class Match {
    public Match(String name, int playerCount) {
        this.name = name;
        this.playerCount = playerCount;
    }

    private String name;
    private int playerCount;

    public String getName() {
        return name;
    }

    public int getPlayerCount() {
        return playerCount;
    }
}