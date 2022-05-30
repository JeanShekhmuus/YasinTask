public class FizzBuzz {

    private int number;
    private boolean fizz;
    private boolean buzz;
    private boolean fizzBuzz;

    public void checkFizz(int number) {
        if (number % 3 == 0) {
            setFizz(true);
        } else {
            setFizz(false);
        }
    }

    public void checkBuzz(int number) {
        if (number % 5 == 0) {
            setBuzz(true);
        } else {
            setBuzz(false);
        }
    }

    public void checkFizzBuzz(boolean buzz, boolean fizz) {
        if (buzz == true && fizz == true) {
            setFizzBuzz(true);
        } else {
            setFizzBuzz(false);
        }
    }

    public void print(int number) {
        if (isFizzBuzz() == true) {
            System.out.println("FizzBuzz");
        } else if (isBuzz() == true && isFizz() == false) {
            System.out.println("Buzz");
        } else if (isBuzz() == false && isFizz() == true) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFizz() {
        return fizz;
    }

    public void setFizz(boolean fizz) {
        this.fizz = fizz;
    }

    public boolean isBuzz() {
        return buzz;
    }

    public void setBuzz(boolean buzz) {
        this.buzz = buzz;
    }

    public boolean isFizzBuzz() {
        return fizzBuzz;
    }

    public void setFizzBuzz(boolean fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }
}
