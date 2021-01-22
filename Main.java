import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k;

        System.out.print("Введите количество автоматов: ");
        System.out.println();

        k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            StateMachine machine = new StateMachine();
            machine.InputStateAndTransition();
            System.out.println("Нетривиальность "+(i+1)+" автомата: ");
            machine.ShowNontriviality();
        }
    }
}
