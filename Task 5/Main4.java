interface OptimizableModel{
    void quantize();

}
class ResNet18 implements OptimizableModel{
    public void quantize(){

System.out.println("ResNet18");

}

}

class MobileNet implements OptimizableModel{
    public void quantize(){
        System.out.println("MobileNet");
    }
}
class InferenceEngine{
    void optimize(OptimizableModel model){
        model.quantize();

    }
}
public class Main4{
    public static void main(String[] args){

InferenceEngine e =
new InferenceEngine();
e.optimize(new ResNet18());
e.optimize(new MobileNet());
}
}
