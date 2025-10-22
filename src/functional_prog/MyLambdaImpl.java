package functional_prog;

import java.util.List;

public class MyLambdaImpl implements MyFuncInterface {
    @Override
    public <T> T filter(List<T> list) {

        for (T t : list) {

            if (t instanceof String) {
                System.out.println(t + " is String");
            }
            if (t instanceof Integer) {

                System.out.println(t + " is an Integer");
            }
        }

        return null;
    }
}
