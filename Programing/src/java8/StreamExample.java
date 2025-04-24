package java8;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {


        List<String> batsman = Arrays.asList("Rohit","Dhoni","Virat","Hardik");
        List<String>bowler = Arrays.asList("Rahul","Shami");
        List<String>keepers = Arrays.asList("Dhoni");
        List<List<String>> cricket=new ArrayList<>();
        cricket.add(batsman);
        cricket.add(bowler);
        cricket.add(keepers);

        System.out.println(cricket);


        List<String>playList=cricket.stream().flatMap(Collection::stream).collect(Collectors.toList());;
        System.out.println(playList);




        Tomato redTomato=new Tomato(Color.RED,100);
        Tomato greenTomato1=new Tomato(Color.GREEN,60);
        Tomato greenTomato2=new Tomato(Color.GREEN,100);
        Tomato greenTomato3=new Tomato(Color.GREEN,100);

        List<Tomato> tomatoList= Arrays.asList(redTomato,greenTomato1,greenTomato2);

        long GreeenColourTomatoCut= tomatoList.stream().filter(tomato -> tomato.getColor().equals(Color.GREEN) &&tomato.getWeight()<100).count();

        Optional<Tomato> firstGreenTomato=tomatoList.stream().filter(tomato -> tomato.getColor().equals(Color.GREEN)).findFirst();

        System.out.println("Find First:" +firstGreenTomato);

        System.out.println(GreeenColourTomatoCut);
        Optional<Tomato>LargestTomatoWeight=tomatoList.stream().filter(Sanju->Sanju.getWeight()<60).findFirst();

        boolean isAllGreenTomatoes=tomatoList.stream().allMatch(t->t.getColor().equals(Color.RED));
        System.out.println("AllMatch :"+isAllGreenTomatoes);

        boolean isNoneMatchingWithYellow=tomatoList.stream().noneMatch(t->t.getColor().equals(Color.GREEN));
        System.out.println(isNoneMatchingWithYellow);

        long redTomatoCount = tomatoList.stream().filter(tomato -> tomato.getColor().equals(Color.RED)).count();
        System.out.println("Count Of Red Colour:"+redTomatoCount);


    }
}
