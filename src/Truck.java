public class Truck extends Transport {
    private boolean isLoaded;

    public Truck(float speed, byte[] coordinate) {
        super(speed, coordinate);
    }

    public Engine engine = new Engine();
    @Override
    public void moveObject(float speed) {
        System.out.println("Наш обьект двигается со скоростью: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    public Truck(float speed, byte[] coordinate, boolean isLoaded) {
        super(speed, coordinate);
        this.isLoaded = isLoaded;
    }


    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded){
        super.setValues(speed, weight, color, coordinate);
       this.isLoaded = isLoaded;
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded() {
        if (isLoaded)
            return "Грузовик загружен";
        else
            return "Грузовик не загружен";




    }
}