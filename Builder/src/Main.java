public class Main {

    public static void main(String[] args) {
        Dyrektor dyrektor = new Dyrektor();
        Meal danieI = dyrektor.setDishI();
        Meal danieII = dyrektor.setDishII();
        Meal danieIII = dyrektor.setDishIII();
        System.out.println("Danie I: "+danieI.getName()+danieI.getDescription()+"Cena: "+danieI.getPrice());
        System.out.println("Danie II: "+danieII.getName()+danieII.getDescription()+"Cena: "+danieII.getPrice());
        System.out.println("Danie III: "+danieIII.getName()+danieIII.getDescription()+"Cena: "+danieIII.getPrice());
    }
}
