import java.util.ArrayList;

public class Sandwich<P extends IPain,S extends Isauce,I extends Iingredient> {
private String nom;
private P pain;
private ArrayList<S> sauce;
private ArrayList<I> ingredients;

    public Sandwich(String nom){
        this.nom=nom;
        sauce=new ArrayList<S>();
        ingredients=new ArrayList<I>();
    }

    public void composerSandwich(P p,ArrayList<S> sauce,ArrayList<I> ingredients){
        setPain(p);
        for(int i=0;i<=this.sauce.size();i++){
            if(this.sauceExiste(sauce.get(i))==false){
                this.setSauce(sauce.get(i));
            }
        }
        for(int i=0;i<=ingredients.size();i++){
            if(this.ingredientExiste(ingredients.get(i))==false){
                this.setIngredient(ingredients.get(i));
            }
        }
    }

public P getPain() {
    return pain;
}
public S getSauce(int i) {
        return (this.sauce).get(i);
}

public boolean sauceExiste(S sauce){

    boolean existe=false;
    int i=0;
    while(i<this.sauce.size() && existe==false) {
        if (this.getSauce(i).equals(sauce)) {
            existe=true;
        }
        i++;
    }
    return existe;
}

public <U extends S> void setSauce(U sauce){
    if(this.sauceExiste(sauce)==false){
        this.sauce.add(sauce);
    }
}

public <U extends P> void setPain(U pain){
    this.pain = pain;
}

public String getNom() {
    return nom;
}

public void setNom(String nom){
    this.nom = nom;
}

public I getIngredient(int i){
    if(i<this.nombreIngredients()){
        return this.ingredients.get(i);
    }else{
        return this.ingredients.get(this.nombreIngredients()-1);
    }
}

public <U extends I> void setIngredient(U ingredient){
    if(this.ingredientExiste(ingredient)==false){
        this.ingredients.add(ingredient);
    }
}

public int nombreIngredients(){
    return this.ingredients.size();
}

public boolean ingredientExiste(I ingredient){

    boolean existe=false;
    int i=0;
    
    while(i<this.nombreIngredients() && existe==false) {
        if (this.getIngredient(i).equals(ingredient)) {
            existe=true;
        }
        i++;
    }
    return existe;
}

public boolean ingredientCommun(Sandwich<?,?,? super I > s2,I ingredient){
    
        boolean existe_s1 = this.ingredientExiste(ingredient);

        if(existe_s1){
            return s2.ingredientExiste(ingredient);
        }else{
            return existe_s1;
        }
        
    }

public String plusCalorique(){
    int max = 0;
    double calories=0;
    String nom="";
    for(int i=0;i<this.nombreIngredients();i++){
        if(this.getIngredient(i).getCalories()>calories){
            max=i;
            nom=this.getIngredient(max).getNom();
            calories = this.getIngredient(max).getCalories();
        }
    }
    for(int i=0;i<this.sauce.size();i++){
        if(this.getSauce(i).getCalories()>calories){
            max=i;
            nom=this.getSauce(max).getNom();
            calories = this.getSauce(max).getCalories();
        }
    }
    if(this.pain.getCalories()>calories){
        nom=this.pain.getNom();
    }
    return nom;
}

public void deplacerIngredient(Sandwich<?,?,? super I> s1,I ingredient){

    if(this.ingredientCommun(s1,ingredient)==true){
        System.out.println("L'ingredient existe déjà dans les deux sandwich");
    }else if(this.ingredientExiste(ingredient)){
        this.ingredients.remove(ingredient);
        s1.setIngredient(ingredient);
    }

}

}