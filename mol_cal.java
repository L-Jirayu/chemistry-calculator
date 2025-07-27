class formula_calculate extends mol_calculate {
    private double mol_mass;
    private double mol_volume;
    private double mol_gas;

    public void setMolMass(double value) {
        this.mol_mass = value;
    }

    public void setMolVolume(double value) {
        this.mol_volume = value;
    }

    public void setMolGas(double value) {
        this.mol_gas = value;
    }

    public double getMolMass() {
        return mol_mass;
    }

    public double getMolVolume() {
        return mol_volume;
    }

    public double getMolGas() {
        return mol_gas;
    }
}
class input_infor_mm extends mol_calculate{ //INPUT HERE
    private final double mass = 30;
    private final double molecular_mass = 60;

    public double get_mM(){
        return mass;
    }
    public double get_mW(){
        return molecular_mass;
    }
}

class input_infor_mv extends mol_calculate{ //INPUT HERE
    private final double volume = 33.6;
    
    public double get_mV(){
        return volume;
    }
}

class input_infor_mg extends mol_calculate{ //INPUT HERE
    private final double atom = 24.08 * Math.pow(10,23);

    public double get_mG(){
        return atom;
    }
}

class mol_calculate {
    public void mass() {
        input_infor_mm imm = new input_infor_mm();
        formula_calculate mm = new formula_calculate();

        mm.setMolMass((imm.get_mM()) / (imm.get_mW()));
        System.out.printf("Mol is %.2f%n", mm.getMolMass());
    }

    public void volume() {
        input_infor_mv imv = new input_infor_mv();
        formula_calculate mv = new formula_calculate();

        mv.setMolVolume((imv.get_mV()) / 22.4);
        System.out.printf("Mol is %.2f%n", mv.getMolVolume());
    }

    public void atom() {
        input_infor_mg img = new input_infor_mg();
        formula_calculate mg = new formula_calculate();

        mg.setMolGas((img.get_mG()) / (6.02 * Math.pow(10, 23)));
        System.out.printf("Mol is %.2f%n", mg.getMolGas());
    }
}
