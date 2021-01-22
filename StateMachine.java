import java.util.Scanner;

public class StateMachine {
    public int state;
    public int transition;


    Scanner scanner = new Scanner(System.in);

    public void InputStateAndTransition(){
        System.out.println("Введите количетсво состояний: ");
        state = scanner.nextInt();
        System.out.println("Введите количетсов переходов: ");
        transition = scanner.nextInt();
    }
    public void ShowNontriviality(){
        int nontriviality = 19* transition+(state+239)*(state+366)/2;
        System.out.println(nontriviality);
    }
}
