// Абстрактний базовий клас, що представляє загальний пристрій
abstract class Appliance {
    private final String name;
    private final int power; // У ватах
    private boolean isPluggedIn;
    private final double electromagneticRadiation; // У мікротеслах

    public Appliance(String name, int power, double electromagneticRadiation) {
        this.name = name;
        this.power = power;
        this.electromagneticRadiation = electromagneticRadiation;
        this.isPluggedIn = false;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return isPluggedIn ? power : 0;
    }

    public double getElectromagneticRadiation() {
        return electromagneticRadiation;
    }

    public void plugIn() {
        isPluggedIn = true;
    }

    public void unplug() {
        isPluggedIn = false;
    }

    @Override
    public String toString() {
        return String.format("%s (Потужність: %dW, Електромагнітне випромінення: %.2fµT, Увімкнено: %b)",
                name, power, electromagneticRadiation, isPluggedIn);
    }
}
