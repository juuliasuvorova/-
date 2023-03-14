package first;
public class First {
    public static void main(String[] args) {
         for (int i = 1; i <= 100; i++) { /* перебираем числа от 1 до 100 */
            if (i % 3 == 0 && i % 5 == 0) { /*проверяем кратность числа на 3 и 5*/
                System.out.println("FizzBuzz")}else if (i % 3 == 0 ) { /*проверяем кратность числа на 3*/
                System.out.println("Fizz");
            }else if (i % 5 == 0) { /*проверяем кратность числа на 5*/
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
