public class BmiService {

    public int calculate(int weight, float height) {

        int index = (int) (weight / (height * height));

        return index;

    }

}
