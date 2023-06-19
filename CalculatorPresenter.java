public class CalculatorPresenter {
  private CalculatorModel model;
  private CalculatorView view;

  public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
      this.model = model;
      this.view = view;
      this.view.setPresenter(this);
  }

  public void performOperation(double number, String operator) {
      switch (operator) {
          case "+":
              model.add(number);
              break;
          case "-":
              model.subtract(number);
              break;
          case "*":
              model.multiply(number);
              break;
          case "/":
              model.divide(number);
              break;
          default:
              // Обработка некорректной операции
      }

      view.displayResult(model.getResult());
  }
}
