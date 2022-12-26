public class Smartphone extends Computer {
    private String model;
    private double cameraResolution;

    public Smartphone(){
        super();
        model = "";
        cameraResolution = 0;
    }

    public Smartphone (String firm, int weight, String model, double cameraResolution){
        super(firm, weight);
        this.model = model;
        this.cameraResolution = cameraResolution;
    }

    public void setModel(String name){
        this.model = name;
    }

    public String getModel(){
        return model;
    }

    public void setCameraResolution(int cameraResolution){
        this.cameraResolution = cameraResolution;
    }

    public double getCameraResolution(){
        return cameraResolution;
    }

    @Override
    public String toString(){
        return getFirm() + " " + model + " " + getWeight() + " " + cameraResolution;
    }
}
