package AnnotationAndLombok;

import Lambda.Employee;

public class Main {

    public static void main(String[] args) {
        //Аннотация - чтобы помечать куски кода и несут функциональную нагрузку

        /**
         * Меттод любой можем пометить
         * @Deprecated метод устарел
         */

        second second = null;
        second.com();//@Deprecated

        //lombok позволяет писать аннотации которые выполняются в процессе коммпиляции
        //@toString все будет перечисолено как в ламбоке, над классом пишется
        // также можно не писать гет и сет, а над соответствующими переменными написать @Getter and @Setter
        // можно запретить null перед типом переменной поставить @NotNull и автоматически вызывется нулл поинтер эксептион
// чтобы не писать конструктор @AllargsConstructor

        // у аннотаций можно зававать параметры
        //@toString (exclude = "worcstart") исключаем воркстарт, чтобы его не печатал
    }
}
