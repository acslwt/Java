import java.util.Iterator;

public class ConcreteIterator implements Iterator<TypeAliment>{
    private Sandwich<Pain,Sauce,Ingredient> sandwich;
    private int cursor=0;

    public ConcreteIterator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    @Override
    public boolean hasNext(){
        // System.out.println(nb);
        int nb=sandwich.nombreIngredients()+sandwich.nombreSauces()+1;
        // System.out.println(nb);
        return cursor<nb;
    }

    @Override
    public TypeAliment next(){
        if(cursor==0){
            cursor++;
            return sandwich.getPain();
        }
        if(cursor-1<sandwich.nombreSauces()){
            // System.out.println(cursor-1);
            cursor++;
            return sandwich.getSauce(cursor-2);
        }
        if(cursor-sandwich.nombreSauces()-1<sandwich.nombreIngredients()){
            // System.out.println(cursor-sandwich.nombreSauces());
            cursor++;
            return sandwich.getIngredient(cursor-sandwich.nombreSauces()-1);
        }
        // if(cursor==1){
        //     cursor++;
        //     Iterator<Sauce> iter = sandwich.getAllSauce().iterator();
        // }
        // if(cursor==2){
        //     cursor++;
        //     Iterator<Ingredient> iter = sandwich.getAllIngredients().iterator();
        // }
        return null;
    }
}