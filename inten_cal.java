class inten_solu_calculate{
    public void molar(){
        molar_calc mc = new molar_calc();
        mc.molar_formula();
    }

    public void molal(){
        molal_calc ml = new molal_calc();
        ml.molal_formula();
    }
}

class molar_calc extends inten_solu_calculate{
    double mole_mlar;
    double volume;
    void input_molar(){
        mole_mlar = 2.0;
        volume = 24;
    }

    void molar_formula(){
        input_molar();
        double molar = mole_mlar/volume;
        System.out.printf("Molarity is %.3f mol/l\n", molar);
    }
}

class molal_calc extends inten_solu_calculate{

    double mole_mlal;
    double mass_solution;

    void input_molal(){
        mole_mlal = 2.0;
        mass_solution = 12;
    }

    void molal_formula(){
        input_molal();
        double molal = mole_mlal/mass_solution;
        System.out.printf("Molality is %.3f mol/kg\n", molal);
    }
}