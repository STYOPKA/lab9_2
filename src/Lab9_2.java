// Базовый класс – компьютер. Производные – ноутбук и смартфон. Создать класс РемонтСервис, который может
// содержать оба вида объектов. Предусмотреть метод подсчета отдельно ремонтируемых ноутбуков и смартфонов
// (использовать оператор instanceof).

public class Lab9_2 {

    public static void main(String[] args) {
        RemService rs = new RemService();

        // добавим в сервис 2 смартфона и 1 ноутбук
        rs.addComputer(new Smartphone("android", 220, "Nexus7", 5.0));
        rs.addComputer(new Smartphone("apple", 200, "iPhone7", 3.0));
        rs.addComputer(new Notebook("acer", 2, "aspire one", 2048));

        System.out.println("В сервисе: " + rs.getNotebookCount() + " ноутбука");
        System.out.println("В сервисе: " + rs.getSmartphoneCount() + " смартфона");
    }}
