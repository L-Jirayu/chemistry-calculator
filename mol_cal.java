class formula_calulate extends mol_calculate{
    double mol_mass;
    double mol_volume;
    double mol_gas;
}

class input_infor_mm extends mol_calculate{
    private final double mass = 30;
    private final double molecular_mass = 60;

    public double get_mM(){
        return mass;
    }
    public double get_mW(){
        return molecular_mass;
    }
}

class input_infor_mv extends mol_calculate{
    private final double volume = 33.6;
    
    public double get_mV(){
        return volume;
    }
}

class input_infor_mg extends mol_calculate{
    private final double atom = 24.08 * Math.pow(10,23);

    public double get_mG(){
        return atom;
    }
}

class mol_calculate{
    public void mass(){
        input_infor_mm imm = new input_infor_mm();
        formula_calulate mm = new formula_calulate();

        mm.mol_mass = (imm.get_mM())/(imm.get_mW());
        System.out.printf("Mol is %.2f%n", mm.mol_mass);
    }

    public void volume(){
        input_infor_mv imv = new input_infor_mv();
        formula_calulate mv = new formula_calulate();

        mv.mol_volume = (imv.get_mV())/22.4;
        System.out.printf("Mol is %.2f%n",mv.mol_volume);
    }

    public void atom(){
        input_infor_mg img = new input_infor_mg();
        formula_calulate mg = new formula_calulate();


        mg.mol_gas = (img.get_mG())/(6.02 * (Math.pow(10, 23)));
        System.out.printf("Mol is %.2f%n", mg.mol_gas);
    }
}