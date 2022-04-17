import java.util.*;

public class mainBoutique {
    public static void main(String args[]){

        Vegan<PainVegan,SauceVegan,IngredientVegan> s1=new Vegan<>("Vegan");
        Vegetarien<PainVegetarient,SauceVegetarient,IngredientVegetarient> s2=new Vegetarien<>("Vegetarien");
        Sandwich<PainNormal,SauceNormal,IngredientNormal> s3 = new Sandwich<>("LeCarnivore");

        Iingredient kebab = new IngredientNormal("kebab", 210);
        Iingredient oignon = new IngredientVegetarient("oignon",100);
        Iingredient salade = new IngredientVegan("salade",30);

        PainVegan galette = new PainVegan("galette",120);

        s1.setPain(galette);
        s2.setPain(galette);
        // s3.setPain(galette);

        System.out.println(s1.getPain());
        System.out.println(s2.getPain());
        System.out.println(s3.getPain());

    }
}
