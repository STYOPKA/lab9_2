public class Notebook extends Computer {
    private String model;
    private int memory;

    public Notebook(){
        super();
        model = "";
        memory = 0;
    }

    public Notebook (String firm, int weight, String model, int memory){
        super(firm, weight);
        this.model = model;
        this.memory = memory;
    }

    public void setModel(String name){
        this.model = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(int memory){
        this.memory = memory;
    }

    public int getMemory(){
        return memory;
    }

    @Override
    public String toString(){
        return getFirm() + " " + model + " " + getWeight() + " " + memory;
    }
}
