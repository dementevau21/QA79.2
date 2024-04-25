//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        {
            int initialaccount = 500; //начальный счет

            int replenishment = 1000; //пополнение

            int balance = initialaccount + replenishment; //общий баланс счета
            System.out.println("Итоговый баланс:" + balance);

            int bonus = balance * 1 / 100;
            if (balance > 1000) {
                balance = 1000;
            }
            System.out.println("Итоговый бонус:" + bonus);
        }
    }
}