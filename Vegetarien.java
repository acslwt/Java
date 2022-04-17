import java.util.ArrayList;

public class Vegetarien<P extends IPain,S extends Isauce,I extends Iingredient> extends Sandwich<P,S,I>{

    private String nom;
    private P pain;
    private ArrayList<S> sauce;
    private ArrayList<I> ingredients;

    public Vegetarien(String nom){

        super(nom);
    }

}