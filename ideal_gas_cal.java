class ideal_gas_cal{
    final double gas_constant = 8.314; // J/(mol*K)

    public void calculatePressure() {
        double volume = 0.0224;
        double temperature = 273.15;
        double moles = 1.0;

        double pressure = (moles * gas_constant * temperature) / volume;
        System.out.printf("Pressure: %.2f Pa, in atm: %.2f atm\n", pressure, pressure / 101325);

    }

    public void calculateVolume() {
        double pressure = 101325;
        double temperature = 273.15;
        double moles = 1.0;

        double volume = (moles * gas_constant * temperature) / pressure;
        System.out.printf("Volume: %.2f m^3, in L: %.2f L\n", volume, volume * 1000);
    }

    public void calculateTemperature() {
        double pressure = 101325;
        double volume = 0.0224;
        double moles = 1.0;

        double temperature = (pressure * volume) / (moles * gas_constant);
        System.out.printf("Temperature: %.2f K, in Celsius: %.2f degree C\n", temperature, temperature - 273.15);
    }

    public void calculateMoles() {
        double pressure = 101325;
        double volume = 0.0224;
        double temperature = 273.15;

        double moles = (pressure * volume) / (gas_constant * temperature);
        System.out.printf("Moles: %.3f mol\n", moles);
    }
}