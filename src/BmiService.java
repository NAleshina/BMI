public class BmiService {
    public float calculate(float weight, float height) {
        float height1 = height * height;
        return weight / height1;
    }
}
