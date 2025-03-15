package my_lambda;

import java.util.List;

public interface MyFuncInterface {

    <T> T filter(List<T> list);
}
