public class TestFizzBuzz {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 100; i++) {
            fizzBuzz.setNumber(i);
            fizzBuzz.checkFizz(fizzBuzz.getNumber());
            fizzBuzz.checkBuzz(fizzBuzz.getNumber());
            fizzBuzz.checkFizzBuzz(fizzBuzz.isBuzz(), fizzBuzz.isFizz());
            fizzBuzz.print(fizzBuzz.getNumber());
        }
    }
}