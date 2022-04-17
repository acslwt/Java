import java.util.ArrayList;

public class Vegan<P extends IPain,S extends Isauce,I extends Iingredient> extends Sandwich<P,S,I>{

    private String nom;
    private P pain;
    private ArrayList<S> sauce;
    private ArrayList<I> ingredients;

    public Vegan(String nom){

        super(nom);
    }

}