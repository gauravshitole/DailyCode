package java8;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class StremExamples {
    public static void main(String[] args) {

        Tomato redTomato=new Tomato(Color.RED,100);
        Tomato greenTomato1=new Tomato(Color.GREEN,60);
        Tomato greenTomato2=new Tomato(Color.GREEN,110);

        List<Tomato> tomatoList= Arrays.asList(redTomato,greenTomato1,greenTomato2);
        System.out.println(tomatoList);


        List<Tomato> tomatoStrem= Stream.of(redTomato,greenTomato1,greenTomato2).toList();
        System.out.println(tomatoStrem);


        List<Tomato> greenhwavyTomatoes=tomatoStrem.stream().filter(t->t.getColor().equals(Color.GREEN))
                .filter(tomato -> tomato.getWeight()>50)
                .collect(Collectors.toList());

        System.out.println("greentomato"+greenhwavyTomatoes);

        List<Tomato>tomatoListTwo= tomatoList.stream().limit(2).collect(Collectors.toList());

        System.out.println("List limit "+tomatoListTwo);

        List<Tomato>tomatoListSkipOne=tomatoList.stream().skip(0).collect(Collectors.toList());

        System.out.println("List Skip :" +tomatoListSkipOne);

        List<Color>tomatoColurList=tomatoList.stream().map(t->t.getColor()).collect(Collectors.toList());

        System.out.println("List of Colour is :"+tomatoColurList);

        List<Color>distinctTomatoColours=tomatoList.stream().map(t->t.getColor()).distinct().collect(Collectors.toList());
        System.out.println("distinctTomatoColours "+distinctTomatoColours);

        Set<Color> distinctTomatoColourset=tomatoList.stream().map(Tomato::getColor).collect(Collectors.toSet());
        System.out.println("dist tomato "+distinctTomatoColourset);

        Set<Color>distinctTomatoColourLinkedHashSet=tomatoList.stream().map(Tomato::getColor).collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("distinctHashMap"+distinctTomatoColourLinkedHashSet);





    }
}
