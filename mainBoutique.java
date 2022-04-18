import java.util.*;

public class mainBoutique {
    public static void main(String args[]){

        Vegan<PainVegan,SauceVegan,IngredientVegan> s1=new Vegan<>("Vegan");
        Vegetarien<PainVegetarient,SauceVegetarient,IngredientVegetarient> s2=new Vegetarien<>("Vegetarien");
        Sandwich<PainNormal,SauceNormal,IngredientNormal> s3 = new Sandwich<>("LeCarnivore");

        IngredientNormal kebab = new IngredientNormal("kebab", 210);
        IngredientVegetarient oignon = new IngredientVegetarient("oignon",100);
        IngredientVegan salade = new IngredientVegan("salade",30);

        PainVegan galette = new PainVegan("galette",120);

        s1.setPain(galette);
        s2.setPain(galette);
        // s3.setPain(galette);
        s1.setIngredient(salade);
        s2.setIngredient(oignon);

        System.out.println(s1.getPain());
        System.out.println(s2.getPain());
        System.out.println(s3.getPain());

        s1.deplacerIngredient(s2,salade);

    }
}
