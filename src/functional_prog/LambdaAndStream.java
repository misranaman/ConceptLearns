package functional_prog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndStream {

    public static void main(String[] args) {

        //convertMapToStream();

        //convertListToStream();
    }


    public static void convertMapToStream() {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

    }

    public static void convertListToStream() {

        List<Integer> iList = new ArrayList<>();

        iList.add(1);
        iList.add(2);
        iList.add(3);
        iList.add(4);
        iList.add(5);

        final var collect = iList.stream().filter(i -> i > 3).collect(Collectors.toList());

        //System.out.println(collect);
        iList.forEach(i -> {
            System.out.println(i);
        });


    }

    public static void myLambda(MyFuncInterface lambdaImpl) {

        Serializable i = lambdaImpl.filter(List.of(1, 2, 3, 4, 5, 6, 7, 8, "String"));
        System.out.println(i);
    }
}
