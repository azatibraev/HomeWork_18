package com.company;

public class Main {

    public static void main(String[] args) {

        DomesticAnimal blackAngus = new Cow(589.7f, (byte) 2, 'M', "Bully");

        DomesticAnimal hereford = new Cow(816.4f, (byte) 3, 'M', " Homer");

        DomesticAnimal simmental = new Cow(746.5f, (byte) 3, 'F', "Rose");

        DomesticAnimal texasLonghorn = new Cow(697.7f, (byte) 4, 'F', "Maggie");

        DomesticAnimal limousin = new Cow(880.7f, (byte) 5, 'M', "Nitrous");

        DomesticAnimal gelbvieh = new Cow(996.7f, (byte) 6, 'M', "Diesel");

        blackAngus.eat();


        DomesticAnimal merinoWoolSheep = new Sheep(54.43f, (byte) 4, 'F', "Flower");

        DomesticAnimal dorperSheep = new Sheep(46.5f, (byte) 5, 'F', "Candie");

        DomesticAnimal hampshireSheep = new Sheep(62.4f, (byte) 7, 'F', "Shelly");

        DomesticAnimal suffolkSheep = new Sheep(78.6f, (byte) 8, 'F', "Darla");

        merinoWoolSheep.eat();


        DomesticAnimal akhalTeke = new Horse(725.4f, (byte) 8, 'M', "NOIR", " black");

        DomesticAnimal arabian = new Horse(795.95f, (byte) 9, 'M', "CLEVELAND0", "brown");

        DomesticAnimal russianDon = new Horse(865.8f, (byte) 10, 'M', "NAPOLEON", " gray");

        akhalTeke.eat();

        System.out.println();


        DomesticAnimal[] farm1 = new DomesticAnimal[]{merinoWoolSheep, dorperSheep, hampshireSheep,
         simmental, texasLonghorn, limousin, blackAngus, hereford, akhalTeke, arabian};

        for (DomesticAnimal farm : farm1) {
            System.out.println(farm);
        }


        DomesticAnimal[] farm2 = new DomesticAnimal[]{gelbvieh, suffolkSheep, russianDon};
        for (DomesticAnimal farm3 : farm2) {
            System.out.println(farm3);
        }


        Farm farmOwner1 = new Farm("Kyrgyzstan",
                new Cow[]{(Cow) blackAngus, (Cow)hereford, (Cow)simmental, (Cow)texasLonghorn, (Cow)limousin},
                new Sheep[]{(Sheep) merinoWoolSheep, (Sheep) dorperSheep, (Sheep) hampshireSheep},
                new Horse[]{(Horse) akhalTeke, (Horse) arabian}, "John Malcolm" );

        Farm farmOwner2 = new Farm("Russia", new Cow[]{(Cow) gelbvieh}, new Sheep[]{(Sheep) suffolkSheep},
        new Horse[]{(Horse)russianDon}, " Michael Steward");

        System.out.println(farmOwner1 + "\n" + farmOwner2);
    }
}