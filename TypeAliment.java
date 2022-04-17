public class TypeAliment implements ITypeAliment{
    private String nom;
    private double calories;
    public TypeAliment(String nom,double calories){
        this.nom=nom;
        this.calories=calories;
    }
    public String getNom(){
        return this.nom;
    }
    public double getCalories(){
        return this.calories;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setCalories(double calories){
        this.calories=calories;
    }
    
}