package client;

import java.util.HashMap;

public class Client {

    public static HashMap<String, Double> cardBalance = new HashMap<>();

    public String[] billNumber = {"82149617", "62748148", "03412457", "16021588", "14653263", "51224558", "68621164",
            "742325289", "95223456", "82212567"};

    public String[] cardNumber = {"2202412113652617", "2202540171140548", "2202599492924057", "2202924783622658",
            "2202784628070463", "2202893368729558", "2202367176351164", "2202348325451289", "2202500733038654",
            "2202072036905567"};

    public String[] code = {"1488", "0248", "4677", "4128", "2942", "5233", "2358", "1337", "5239", "8214", "1277"};


    public void connectCard() {

        cardBalance.put(cardNumber[0], (double) 0);
        cardBalance.put(cardNumber[1], (double) 0);
        cardBalance.put(cardNumber[2], (double) 0);
        cardBalance.put(cardNumber[3], (double) 0);
        cardBalance.put(cardNumber[4], (double) 0);
        cardBalance.put(cardNumber[5], (double) 0);
        cardBalance.put(cardNumber[6], (double) 0);
        cardBalance.put(cardNumber[7], (double) 0);
        cardBalance.put(cardNumber[8], (double) 0);
        cardBalance.put(cardNumber[9], (double) 0);

        System.out.println(cardBalance);

    }
}