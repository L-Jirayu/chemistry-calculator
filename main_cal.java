public class main_cal {
    public static void main(String[] args) {
        int select = 1; //INPUT HERE
        
        switch (select) {
            case 1 -> {
                System.out.println("Mole Mass Calculate");
                mol_calculate mc = new mol_calculate();
                mc.mass();
                mc.volume();
                mc.atom();
            }
            case 2 -> {
                System.out.println("Molarlity and Molality Calculator");
                inten_solu_calculate isc1 = new molar_calc();
                isc1.runCalculation();

                inten_solu_calculate isc2 = new molal_calc();
                isc2.runCalculation();
            }
            default -> System.out.println("F.");
        }
    }
}
