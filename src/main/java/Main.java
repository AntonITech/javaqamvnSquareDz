import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println();
        System.out.println("Количество чисел в деапазоне = " + service.calcSqrt(200, 300));
    }
}
