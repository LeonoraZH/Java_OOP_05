public class CalculatorModel {
  private double result;

  public void add(double number) {
      result += number;
  }

  public void subtract(double number) {
      result -= number;
  }

  public void multiply(double number) {
      result *= number;
  }

  public void divide(double number) {
      if (number != 0) {
          result /= number;
      } else {
          // Обработка деления на ноль
      }
  }

  public double getResult() {
      return result;
  }
}
