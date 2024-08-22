package recap.java_8.predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFilterOnList {

    public static void main(String[] args) {

        //İsimlerin listesini oluşturma
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David","Samantha");

        //nesne oluştur metodu çağırmak için
        PredicateFilterOnList predicateFilterOnList=new PredicateFilterOnList();

        //5 harften uzun isimleri filtreleme
        List <String> longerThanFiveLetter = predicateFilterOnList.filterNameByPredicate(names,predicateFilterOnList.getNameMoreThanFiveLetters());

        System.out.println("Names which longer than five letter is : "+longerThanFiveLetter);
    }
   public Predicate<String> getNameMoreThanFiveLetters(){
        return name -> name.length() > 5;
   }
   public List<String> filterNameByPredicate(List <String> names, Predicate <String> predicate){
        return names.stream().filter(predicate).collect(Collectors.toList());
   }
}
