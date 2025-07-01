public class main_cal {
    public static void main(String[] args) {
        int select = 2;
        
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
                inten_solu_calculate isc = new inten_solu_calculate();
                isc.molar();
                isc.molal();
            }
            default -> System.out.println("F.");
        }
    }
}
