public class Main {
    public static void main(String[] args) {
        try {
            // Створення колекції із приладами
            CustomSet<Appliance> applianceSet = new CustomSet<>();
            applianceSet.add(new WashingMachine());
            applianceSet.add(new Refrigerator());
            applianceSet.add(new Microwave());

            // Показ початкових приладів
            System.out.println("Прилади в колекції:");
            applianceSet.forEach(System.out::println);

            // Додавання нового приладу в колекцію
            Appliance fan = new Appliance("Фен", 50, 10) {};
            applianceSet.add(fan);
            System.out.println("\nПісля додавання фену:");
            applianceSet.forEach(System.out::println);

        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
        }
    }
}
