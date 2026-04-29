class Main{
    public static void main(String[] args) {
        
    }
}

class Car{
    protected  String model="default";
    protected  String brand="default";
    protected  String engine="default";

    Car(String model,String brand,String engine){
        this.model=model;
        this.engine=engine;
        this.brand=brand;
    }
    Car(){

    }
}

class Automatic extends Car{
    Automatic(){
        super();
    }
    Automatic(String model,String engine, String brand){
        super(model,brand,engine);
    }
}

class Manual extends Car{
    Manual(){
        super();
    }
    Manual(String model,String engine, String brand){
        super(model,brand,engine);
    }
}