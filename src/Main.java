public class Main {
    public static void main(String[] args) {

        int balans = 600;//
        int replenishment = 600;//
        int total = (balans + replenishment);
        int bonus = total / 100;

        System.out.print("Боланс до пополнения:");
        System.out.print(balans);
        System.out.print(".Баланс после пополнения:");
        System.out.print(balans + replenishment);
        if (total >= 1000) {
            System.out.print(".Бонусов начислено:");
            System.out.print(total/100);

        } else {
            System.out.print(".Бонусов:");
            System.out.print(bonus = 0);
        }
        System.out.print(".Баланс с бонусами:");
        System.out.print(total + bonus);


    }
}