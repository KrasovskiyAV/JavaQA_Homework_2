public class Main {
    public static void main(String[] args) {
        int price = 15897; // стоимость билета в рублях
        int rubForMile = 20; // количество рублей для одной бонусной мили
        int bonus = price / rubForMile; // количество бонусных миль
        System.out.println("Количество бонусных миль - " + bonus);
    }
}