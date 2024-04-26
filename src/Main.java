//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        int initialAccount = 200; //начальный счет

        int replenishment = 1200; //пополнение
        int balance = initialAccount + replenishment; //общий баланс счета
        System.out.println("Итоговый баланс:" + balance);

        int bonus; // бонус
        if (balance > 1000) {
            bonus = replenishment / 100;
            System.out.println("Итоговый бонус:" + bonus);
        } else {

            bonus = 0;

            System.out.println("Итоговый бонус:" + bonus);

        }
    }
}