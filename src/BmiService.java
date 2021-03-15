public class BmiService {
    public double calculate (int weight,double height){
        double  BodyMassIndex = weight / (height*height);
        return BodyMassIndex;
    }
}
