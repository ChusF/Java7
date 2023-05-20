import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int summa = service.sumSales(sales);
        System.out.println("Сумма продаж за год:" + summa);

    }
}

