public class Computer {

    private String firm;
    private int weight;

    public void setFirm(String firm){
        this.firm = firm;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getFirm(){
        return firm;
    }

    public int getWeight(){
        return weight;
    }

    public Computer() {
        firm = "Без названия";
    }

    public Computer(String firm, int weight){
        this.firm = firm;
        this.weight = weight;
    }
}
