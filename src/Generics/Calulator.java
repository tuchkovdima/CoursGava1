package Generics;

import java.util.List;


public class Calulator {
    // список получает все что угодно, что отнаследованено от намбера преобразует в добл суммируеет и возвращает
    public static Double sum (List<? extends Number> numbers){// будет суммировать любые списки чисел
        //можно вместо экстендс писать super - это любой класс от которого наследуется наммбер
        // проходимсяя по намберс
      return   numbers.stream().map(n -> ((Number)n).doubleValue()).reduce((n1,n2)-> n1 + n2).get();
    }
}
