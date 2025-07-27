abstract class inten_solu_calculate {
    public abstract void calculate();

    public void runCalculation() {
        this.calculate();
    }
}

class molar_calc extends inten_solu_calculate {
    private double mole_mlar;
    private double volume;

    private void input_molar() { 
        mole_mlar = 2.0; //INPUT HERE
        volume = 24; //INPUT HERE
    }

    @Override
    public void calculate() {
        input_molar();
        double molar = mole_mlar / volume;
        System.out.printf("Molarity is %.3f mol/l\n", molar);
    }
}

class molal_calc extends inten_solu_calculate { 
    private double mole_mlal;
    private double mass_solution;

    private void input_molal() { 
        mole_mlal = 2.0; //INPUT HERE
        mass_solution = 12; //INPUT HERE
    }

    @Override
    public void calculate() {
        input_molal();
        double molal = mole_mlal / mass_solution;
        System.out.printf("Molality is %.3f mol/kg\n", molal);
    }
}
