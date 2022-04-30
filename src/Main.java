public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 68; //вес в киллограммах
        float height = (float) 1.57;  //рост в метрах

        int bmi = service.calculate(weight, height);
        System.out.println(bmi);


    }
}
