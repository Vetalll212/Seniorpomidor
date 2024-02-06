public abstract class Transport {

    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinate;



    public Transport(float speed, int weight, String color, byte[] coordinate){
        System.out.println("Object created");
        setValues(speed, weight, color, coordinate);
//        System.out.println(getValues());
    }
    public Transport(){}
    public Transport(float speed, byte[] coordinate){
        this.speed = speed;
        this.coordinate = coordinate;
//        System.out.println(getValues());
  }
    public void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();
    public  String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color +".\n";
        String infoCoordinate = "Coordinates: \n";

        for(int i = 0; i < coordinate.length; i++)
        infoCoordinate += coordinate[i] + "\n";

        return info + infoCoordinate;

    }
    class Engine {
        private boolean isReady;
        private int km;
        public void setValues (boolean isReady, int km){
        this.isReady = isReady;
        this.km = km;
        }

        public void isReady (boolean isReady){
            this.isReady = isReady;
        }
        public void info(){
            if(isReady)
                System.out.println("Двигатель готов");
            else
                System.out.println("Неисправность двигателя. Пробег составил:" + km + "км");
        }
    }

}
