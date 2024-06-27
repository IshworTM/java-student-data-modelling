package ChapterThree.Lab4;
public class Cars {
    String modelName;
    int price;
    boolean hasKey;
    
    Cars(){
        price =100;
        modelName = "sujan lama";
        hasKey = false;
    }
    Cars(String modelName, int price){
        this.price = price;
        this.modelName = modelName;
        hasKey = false;
    }
    public void start() {
        if(this.hasKey){
            System.out.println("Hello");
        }
        
    }
    public static void main (String[] args) {
        Cars teslaCyberTruck = new Cars("Model CyberTruck", 200);
        System.out.println("Obj one" + teslaCyberTruck.price);

        Cars bmwCar = new Cars("Model I8", 400);
        System.out.println("Obj two" + bmwCar.price);



    }


}
