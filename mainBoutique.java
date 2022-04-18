import java.util.*;

public class mainBoutique {
    public static void main(String args[]){

        Vegan<PainVegan,SauceVegan,IngredientVegan> s1=new Vegan<>("Vegan");
        Vegetarien<PainVegetarient,SauceVegetarient,IngredientVegetarient> s2=new Vegetarien<>("Vegetarien");
        Sandwich<PainNormal,SauceNormal,IngredientNormal> s3 = new Sandwich<>("LeCarnivore");

        Iingredient kebab = new IngredientNormal("kebab", 210);
        Iingredient oignon = new IngredientVegetarient("oignon",100);
        IngredientVegan salade = new IngredientVegan("salade",30);

        PainVegan galette = new PainVegan("galette",120);

        SauceVegan sauce1 = new SauceVegan("sauce",10);

        s1.setPain(galette);
        s2.setPain(galette);
        // s3.setPain(galette);
        s1.setSauce(sauce1);
        s1.setIngredient(salade);

        // s2.deplacerIngredient(s1,salade);

        s2.listeIngredientIterateur();
        System.out.println("_____________________");
        s1.listeIngredientIterateur();
        System.out.println("_____________________");
        s2.listeIngredientStream();

    }
}
