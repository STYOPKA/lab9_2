import java.util.ArrayList;


public class RemService {

    private ArrayList<Computer> masComp = new ArrayList<>();

    public RemService () { }

    public RemService(ArrayList<Computer> n){
        masComp = n;
    }

    public void addComputer(Computer m){
        masComp.add(m);
    }

    public void deleteCar(Computer m) {
        masComp.remove(m);
    }

    public void deleteCar(int i) {
        masComp.remove(i);
    }

    public void printComputersInService() {
        System.out.println("В сервисе: ");
        for (Computer a : masComp){
            System.out.println("\t"+a.toString());
        }
    }

    // возвращает кво ноутбуков в сервисе
    public int getNotebookCount() {
        int c = 0;
        for (Computer a : masComp) {
            if (a instanceof Notebook) {
                c++;
            }
        }
        return c;
    }


    // возвращает кво смартфонов в сервисе
    public int getSmartphoneCount() {
        int c = 0;
        for (Computer a : masComp) {
            if (a instanceof Smartphone) {
                c++;
            }
        }
        return c;
    }
}
