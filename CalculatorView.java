import java.util.Scanner;

public class CalculatorView {
    private CalculatorPresenter presenter;
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void setPresenter(CalculatorPresenter presenter) {
        this.presenter = presenter;
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.print("Введите число: ");
            double number = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /): ");
            String operator = scanner.next();

            presenter.performOperation(number, operator);

            System.out.print("Продолжить? (y/n): ");
            String choice = scanner.next();

            running = choice.equalsIgnoreCase("y");
        }
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
