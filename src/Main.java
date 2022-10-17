import java.util.Arrays;

public class Main {
    public static String toString (int number){
    return "Task " + number;

    }
    public static int changeValue(Integer value){
        return value = 22;
    }
    public static Integer[] changeValue(Integer[] integers){

       return  integers = new Integer[]{1,2};
    }
    public static Integer[] changeValue1(Integer[] numbers){
         numbers[0] = 99;
         return numbers;
    }
     static void changePerson(Person person){
        person = new Person("Ilya"," Lagutenko");
    }
    static void changePerson1(Person person){

    }


    public static void main(String[] args) {
        System.out.println(toString(5));
        int value = 33;
        System.out.println(changeValue(value));
        System.out.println(value);
        System.out.println();

        System.out.println(toString(6));
        Integer val = 33;
        changeValue(val);
        System.out.println(val);
        System.out.println(changeValue(val));
        System.out.println();

        System.out.println(toString(7));
        Integer[] integers = new Integer[]{3,4};
        changeValue(integers);
        Arrays.stream(integers).forEach(System.out::print);
        System.out.println();


        System.out.println(toString(8));
        Integer[] numbers = new Integer[]{3,4};
        changeValue1(numbers);
        Arrays.stream(numbers).forEach(System.out::print);
        System.out.println();

        System.out.println(toString(9));
        Person person = new Person(" Lyapis"," Trubetskoy");
        changePerson(person);
        System.out.println(person);
        System.out.println();

        System.out.println(toString(10));
        person = new Person(" Lyapis"," Trubetskoy");
        changePerson1(person);
        System.out.println(person);







    }
}