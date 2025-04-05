package com.xworkz.inheritances1;

    public class Main {
        public static void main(String[] args) {
            IndiaParent indiaParent = new IndiaParent();
            indiaParent.countryInfo();
            indiaParent.stateAnimal();
            indiaParent.stateBird();
            indiaParent.stateSport();
            indiaParent.stateFlower();



            IndiaParent anParentRef = new India();
            anParentRef.countryInfo();
            anParentRef.stateAnimal();
            anParentRef.stateBird();
            anParentRef.stateSport();
            anParentRef.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of India <<<<<<<<<<<<<<<<");

            AntarticaParent antarticaParent = new AntarticaParent();
            antarticaParent.countryInfo();
            antarticaParent.stateAnimal();
            antarticaParent.stateBird();
            antarticaParent.stateSport();
            antarticaParent.stateFlower();


            AntarticaParent apParentRef = new Antartica();
            apParentRef.countryInfo();
            apParentRef.stateAnimal();
            apParentRef.stateBird();
            apParentRef.stateSport();
            apParentRef.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of antartica <<<<<<<<<<<<<<<<");

         AntParent antParent = new AntParent();
         antParent.speciesInfo();
         antParent.colonyType();
         antParent.bodyStructure();
         antParent.defenseMechanism();
         antParent.lifeSpan();


         Ant ant = new Ant();
         ant.habitat();
         ant.communication();
         ant.speciesCount();
         ant.foodHabit();
         ant.interestingFact();


         ant.speciesInfo();
         ant.colonyType();
         ant.bodyStructure();


         AntParent arParentRef = new Ant(); // Upcasting
         arParentRef.speciesInfo(); // Overridden version from Ant
         arParentRef.colonyType();  // Overridden version from Ant
         arParentRef.bodyStructure(); // Overridden version from Ant

         System.out.println(">>>>>>>>>>>>>>>> End Of Ants <<<<<<<<<<<<<<<<");


            HassanParent hassanParent = new HassanParent();
            hassanParent.countryInfo();
            hassanParent.stateAnimal();
            hassanParent.stateBird();
            hassanParent.stateSport();
            hassanParent.stateFlower();


            HassanParent hassanParentRef = new Hassan();
            hassanParentRef.countryInfo();
            hassanParentRef.stateAnimal();
            hassanParentRef.stateBird();
            hassanParentRef.stateSport();
            hassanParentRef.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Hassan<<<<<<<<<<<<<<<<");

            BanarasParent banarasParent = new BanarasParent();
            banarasParent.countryInfo();
            banarasParent.stateAnimal();
            banarasParent.stateBird();
            banarasParent.stateSport();
            banarasParent.stateFlower();


            BanarasParent banarasParent1 = new Banaras();
            banarasParent1.countryInfo();
            banarasParent1.stateAnimal();
            banarasParent1.stateBird();
            banarasParent1.stateSport();
            banarasParent1.stateFlower();


            System.out.println(">>>>>>>>>>>>>>>> End Of banaras <<<<<<<<<<<<<<<<");


            ChandigarhParent chandigarhParent = new ChandigarhParent();
            chandigarhParent.countryInfo();
            chandigarhParent.stateAnimal();
            chandigarhParent.stateBird();
            chandigarhParent.stateSport();
            chandigarhParent.stateFlower();


            ChandigarhParent chandigarhParent1 = new Chandigarh();
            chandigarhParent1.countryInfo();
            chandigarhParent1.stateAnimal();
            chandigarhParent1.stateBird();
            chandigarhParent1.stateSport();
            chandigarhParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Chandigarh <<<<<<<<<<<<<<<<");

            ChhattisgarhParent chhattisgarhParent = new ChhattisgarhParent();
            chhattisgarhParent.countryInfo();
            chhattisgarhParent.stateAnimal();
            chhattisgarhParent.stateBird();
            chhattisgarhParent.stateSport();
            chhattisgarhParent.stateFlower();


            GoaParent goaParent = new GoaParent();
            goaParent.countryInfo();
            goaParent.stateAnimal();
            goaParent.stateBird();
            goaParent.stateSport();
            goaParent.stateFlower();

            GoaParent goaParent1 = new Goa();
            goaParent1.countryInfo();
            goaParent1.stateAnimal();
            goaParent1.stateBird();
            goaParent1.stateSport();
            goaParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Goa <<<<<<<<<<<<<<<<");

            GujaratParent gujaratParent = new GujaratParent();
            gujaratParent.countryInfo();
            gujaratParent.stateAnimal();
            gujaratParent.stateBird();
            gujaratParent.stateSport();
            gujaratParent.stateFlower();


            GujaratParent gujaratParent1 = new Gujarat();
            gujaratParent1.countryInfo();
            gujaratParent1.stateAnimal();
            gujaratParent1.stateBird();
            gujaratParent1.stateSport();
            gujaratParent1.stateFlower();


            System.out.println(">>>>>>>>>>>>>>>> End Of Gujarat <<<<<<<<<<<<<<<<");

            HaryanaParent haryanaParent = new HaryanaParent();
            haryanaParent.countryInfo();
            haryanaParent.stateAnimal();
            haryanaParent.stateBird();
            haryanaParent.stateSport();
            haryanaParent.stateFlower();

            HaryanaParent haryanaParent1 = new Haryana();
            haryanaParent1.countryInfo();
            haryanaParent1.stateAnimal();
            haryanaParent1.stateBird();
            haryanaParent1.stateSport();
            haryanaParent1.stateFlower();


            System.out.println(">>>>>>>>>>>>>>>> End Of Haryana <<<<<<<<<<<<<<<<");

            HimachalPradeshParent himachalPradeshParent = new HimachalPradeshParent();
            himachalPradeshParent.countryInfo();
            himachalPradeshParent.stateAnimal();
            himachalPradeshParent.stateBird();
            himachalPradeshParent.stateSport();
            himachalPradeshParent.stateFlower();


            HimachalPradeshParent himachalParent = new HimachalPradesh();
            himachalParent.countryInfo();
            himachalParent.stateAnimal();
            himachalParent.stateBird();
            himachalParent.stateSport();
            himachalParent.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Himachal Pradesh <<<<<<<<<<<<<<<<");


            JharkhandParent jharkhandParent = new JharkhandParent();
            jharkhandParent.countryInfo();
            jharkhandParent.stateAnimal();
            jharkhandParent.stateBird();
            jharkhandParent.stateSport();
            jharkhandParent.stateFlower();


            JharkhandParent jharkhandParent1 = new Jharkhand();
            jharkhandParent1.countryInfo();
            jharkhandParent1.stateAnimal();
            jharkhandParent1.stateBird();
            jharkhandParent1.stateSport();
            jharkhandParent1.stateFlower();


            System.out.println(">>>>>>>>>>>>>>>> End Of Jharkhand <<<<<<<<<<<<<<<<");

            KarnatakaParent karnatakaParent = new KarnatakaParent();
            karnatakaParent.countryInfo();
            karnatakaParent.stateAnimal();
            karnatakaParent.stateBird();
            karnatakaParent.stateSport();
            karnatakaParent.stateFlower();


            KarnatakaParent karnatakaParent1 = new Karnataka();
            karnatakaParent1.countryInfo();
            karnatakaParent1.stateAnimal();
            karnatakaParent1.stateBird();
            karnatakaParent1.stateSport();
            karnatakaParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Karnataka <<<<<<<<<<<<<<<<");

            KeralaParent keralaParent = new KeralaParent();
            keralaParent.countryInfo();
            keralaParent.stateAnimal();
            keralaParent.stateBird();
            keralaParent.stateSport();
            keralaParent.stateFlower();

            Kerala kerala = new Kerala();
            kerala.capital();
            kerala.language();
            kerala.population();
            kerala.famousFood();
            kerala.touristSpot();

            KeralaParent keralaParent1 = new Kerala();
            keralaParent1.countryInfo();
            keralaParent1.stateAnimal();
            keralaParent1.stateBird();
            keralaParent1.stateSport();
            keralaParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Kerala <<<<<<<<<<<<<<<<");

            MadhyaPradeshParent madhyaPradeshParent = new MadhyaPradeshParent();
            madhyaPradeshParent.countryInfo();
            madhyaPradeshParent.stateAnimal();
            madhyaPradeshParent.stateBird();
            madhyaPradeshParent.stateSport();
            madhyaPradeshParent.stateFlower();

            MadhyaPradesh madhyaPradesh = new MadhyaPradesh();
            madhyaPradesh.capital();
            madhyaPradesh.language();
            madhyaPradesh.population();
            madhyaPradesh.famousFood();
            madhyaPradesh.touristSpot();

            MadhyaPradeshParent madhyaPradeshParent1 = new MadhyaPradesh();
            madhyaPradeshParent1.countryInfo();
            madhyaPradeshParent1.stateAnimal();
            madhyaPradeshParent1.stateBird();
            madhyaPradeshParent1.stateSport();
            madhyaPradeshParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Madhya Pradesh <<<<<<<<<<<<<<<<");

            MaharashtraParent maharashtraParent = new MaharashtraParent();
            maharashtraParent.countryInfo();
            maharashtraParent.stateAnimal();
            maharashtraParent.stateBird();
            maharashtraParent.stateSport();
            maharashtraParent.stateFlower();

            Maharashtra maharashtra = new Maharashtra();
            maharashtra.capital();
            maharashtra.language();
            maharashtra.population();
            maharashtra.famousFood();
            maharashtra.touristSpot();

            MaharashtraParent maharashtraParent1 = new Maharashtra();
            maharashtraParent1.countryInfo();
            maharashtraParent1.stateAnimal();
            maharashtraParent1.stateBird();
            maharashtraParent1.stateSport();
            maharashtraParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Maharashtra <<<<<<<<<<<<<<<<");


            ManipurParent manipurParent = new ManipurParent();
            manipurParent.countryInfo();
            manipurParent.stateAnimal();
            manipurParent.stateBird();
            manipurParent.stateSport();
            manipurParent.stateFlower();

            Manipur manipur = new Manipur();
            manipur.capital();
            manipur.language();
            manipur.population();
            manipur.famousFood();
            manipur.touristSpot();

            ManipurParent manipurParent1 = new Manipur();
            manipurParent1.countryInfo();
            manipurParent1.stateAnimal();
            manipurParent1.stateBird();
            manipurParent1.stateSport();
            manipurParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Manipur <<<<<<<<<<<<<<<<");

            MeghalayaParent meghalayaParent = new MeghalayaParent();
            meghalayaParent.countryInfo();
            meghalayaParent.stateAnimal();
            meghalayaParent.stateBird();
            meghalayaParent.stateSport();
            meghalayaParent.stateFlower();

            Meghalaya meghalaya = new Meghalaya();
            meghalaya.capital();
            meghalaya.language();
            meghalaya.population();
            meghalaya.famousFood();
            meghalaya.touristSpot();

            MeghalayaParent meghalayaParent1 = new Meghalaya();
            meghalayaParent1.countryInfo();
            meghalayaParent1.stateAnimal();
            meghalayaParent1.stateBird();
            meghalayaParent1.stateSport();
            meghalayaParent1.stateFlower();


            System.out.println(">>>>>>>>>>>>>>>> End Of Meghalaya <<<<<<<<<<<<<<<<");

            MizoramParent mizoramParent = new MizoramParent();
            mizoramParent.countryInfo();
            mizoramParent.stateAnimal();
            mizoramParent.stateBird();
            mizoramParent.stateSport();
            mizoramParent.stateFlower();

            Mizoram mizoram = new Mizoram();
            mizoram.capital();
            mizoram.language();
            mizoram.population();
            mizoram.famousFood();
            mizoram.touristSpot();

            MizoramParent mizoramParent1 = new Mizoram();
            mizoramParent1.countryInfo();
            mizoramParent1.stateAnimal();
            mizoramParent1.stateBird();
            mizoramParent1.stateSport();
            mizoramParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Mizoram <<<<<<<<<<<<<<<<");

            NagalandParent nagalandParent = new NagalandParent();
            nagalandParent.countryInfo();
            nagalandParent.stateAnimal();
            nagalandParent.stateBird();
            nagalandParent.stateSport();
            nagalandParent.stateFlower();



            NagalandParent nagalandParent1 = new Nagaland();
            nagalandParent1.countryInfo();
            nagalandParent1.stateAnimal();
            nagalandParent1.stateBird();
            nagalandParent1.stateSport();
            nagalandParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Nagaland <<<<<<<<<<<<<<<<");

            OdishaParent odishaParent = new OdishaParent();
            odishaParent.countryInfo();
            odishaParent.stateAnimal();
            odishaParent.stateBird();
            odishaParent.stateSport();
            odishaParent.stateFlower();


            OdishaParent odishaParent1 = new Odisha();
            odishaParent1.countryInfo();
            odishaParent1.stateAnimal();
            odishaParent1.stateBird();
            odishaParent1.stateSport();
            odishaParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Odisha <<<<<<<<<<<<<<<<");

            PunjabParent punjabParent = new PunjabParent();
            punjabParent.countryInfo();
            punjabParent.stateAnimal();
            punjabParent.stateBird();
            punjabParent.stateSport();
            punjabParent.stateFlower();



            PunjabParent punjabParent1 = new Punjab();
            punjabParent1.countryInfo();
            punjabParent1.stateAnimal();
            punjabParent1.stateBird();
            punjabParent1.stateSport();
            punjabParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Punjab <<<<<<<<<<<<<<<<");

            RajasthanParent rajasthanParent = new RajasthanParent();
            rajasthanParent.countryInfo();
            rajasthanParent.stateAnimal();
            rajasthanParent.stateBird();
            rajasthanParent.stateSport();
            rajasthanParent.stateFlower();


            RajasthanParent rajasthanParent1 = new Rajasthan();
            rajasthanParent1.countryInfo();
            rajasthanParent1.stateAnimal();
            rajasthanParent1.stateBird();
            rajasthanParent1.stateSport();
            rajasthanParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Rajasthan <<<<<<<<<<<<<<<<");

            SikkimParent sikkimParent = new SikkimParent();
            sikkimParent.countryInfo();
            sikkimParent.stateAnimal();
            sikkimParent.stateBird();
            sikkimParent.stateSport();
            sikkimParent.stateFlower();


            SikkimParent sikkimParent1 = new Sikkim();
            sikkimParent1.countryInfo();
            sikkimParent1.stateAnimal();
            sikkimParent1.stateBird();
            sikkimParent1.stateSport();
            sikkimParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Sikkim <<<<<<<<<<<<<<<<");

            TamilNaduParent tamilNaduParent = new TamilNaduParent();
            tamilNaduParent.countryInfo();
            tamilNaduParent.stateAnimal();
            tamilNaduParent.stateBird();
            tamilNaduParent.stateSport();
            tamilNaduParent.stateFlower();


            TamilNaduParent tamilNaduParent1 = new TamilNadu();
            tamilNaduParent1.countryInfo();
            tamilNaduParent1.stateAnimal();
            tamilNaduParent1.stateBird();
            tamilNaduParent1.stateSport();
            tamilNaduParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Tamil Nadu <<<<<<<<<<<<<<<<");

            TelanganaParent telanganaParent = new TelanganaParent();
            telanganaParent.countryInfo();
            telanganaParent.stateAnimal();
            telanganaParent.stateBird();
            telanganaParent.stateSport();
            telanganaParent.stateFlower();


            TelanganaParent telanganaParent1 = new Telangana();
            telanganaParent1.countryInfo();
            telanganaParent1.stateAnimal();
            telanganaParent1.stateBird();
            telanganaParent1.stateSport();
            telanganaParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Telangana <<<<<<<<<<<<<<<<");

            TripuraParent tripuraParent = new TripuraParent();
            tripuraParent.countryInfo();
            tripuraParent.stateAnimal();
            tripuraParent.stateBird();
            tripuraParent.stateSport();
            tripuraParent.stateFlower();


            TripuraParent tripuraParent1 = new Tripura();
            tripuraParent1.countryInfo();
            tripuraParent1.stateAnimal();
            tripuraParent1.stateBird();
            tripuraParent1.stateSport();
            tripuraParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Tripura <<<<<<<<<<<<<<<<");

            UttarakhandParent uttarakhandParent = new UttarakhandParent();
            uttarakhandParent.countryInfo();
            uttarakhandParent.stateAnimal();
            uttarakhandParent.stateBird();
            uttarakhandParent.stateSport();
            uttarakhandParent.stateFlower();


            UttarakhandParent uttarakhandParent1 = new Uttarakhand();
            uttarakhandParent1.countryInfo();
            uttarakhandParent1.stateAnimal();
            uttarakhandParent1.stateBird();
            uttarakhandParent1.stateSport();
            uttarakhandParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Uttarakhand <<<<<<<<<<<<<<<<");

            UttarPradeshParent uttarPradeshParent = new UttarPradeshParent();
            uttarPradeshParent.countryInfo();
            uttarPradeshParent.stateAnimal();
            uttarPradeshParent.stateBird();
            uttarPradeshParent.stateSport();
            uttarPradeshParent.stateFlower();



            UttarPradeshParent uttarPradeshParent1 = new UttarPradesh();
            uttarPradeshParent1.countryInfo();
            uttarPradeshParent1.stateAnimal();
            uttarPradeshParent1.stateBird();
            uttarPradeshParent1.stateSport();
            uttarPradeshParent1.stateFlower();

            System.out.println(">>>>>>>>>>>>>>>> End Of Uttar Pradesh <<<<<<<<<<<<<<<<");

            WestBengalParent westBengalParent = new WestBengalParent();
            westBengalParent.countryInfo();
            westBengalParent.stateAnimal();
            westBengalParent.stateBird();
            westBengalParent.stateSport();
            westBengalParent.stateFlower();


            WestBengalParent westBengalParent1 = new WestBengal();
            westBengalParent1.countryInfo();
            westBengalParent1.stateAnimal();
            westBengalParent1.stateBird();
            westBengalParent1.stateSport();
            westBengalParent1.stateFlower();


            MountainParent mountainParent = new Mountain();
            mountainParent.category();
            mountainParent.highestPeak();
            mountainParent.mountainRange();
            mountainParent.climate();
            mountainParent.famousTrek();



            MountainParent mountainRef = new Mountain();
            mountainRef.category();
            mountainRef.highestPeak();
            mountainRef.mountainRange();
            mountainRef.climate();
            mountainRef.famousTrek();

            System.out.println(">>>>>>>>>>>>>>>> End Of Mountain <<<<<<<<<<<<<<<<");

            // ---- RIVER ----
            RiverParent riverParent = new River();
            riverParent.category();
            riverParent.longestRiver();
            riverParent.deepestRiver();
            riverParent.riverSource();
            riverParent.riverMouth();



            RiverParent riverRef = new River();
            riverRef.category();
            riverRef.longestRiver();
            riverRef.deepestRiver();
            riverRef.riverSource();
            riverRef.riverMouth();

            System.out.println(">>>>>>>>>>>>>>>> End Of River <<<<<<<<<<<<<<<<");


            OceanParent oceanParent = new Ocean();
            oceanParent.category();
            oceanParent.largestOcean();
            oceanParent.averageDepth();
            oceanParent.salinity();
            oceanParent.famousTrench();


            OceanParent oceanRef = new Ocean();
            oceanRef.category();
            oceanRef.largestOcean();
            oceanRef.averageDepth();
            oceanRef.salinity();
            oceanRef.famousTrench();

            System.out.println(">>>>>>>>>>>>>>>> End Of Ocean <<<<<<<<<<<<<<<<");

            // ---- DESERT ----
            DesertParent desertParent = new Desert();
            desertParent.category();
            desertParent.largestDesert();
            desertParent.hottestDesert();
            desertParent.averageRainfall();
            desertParent.desertFlora();


            DesertParent desertRef = new Desert();
            desertRef.category();
            desertRef.largestDesert();
            desertRef.hottestDesert();
            desertRef.averageRainfall();
            desertRef.desertFlora();

            System.out.println(">>>>>>>>>>>>>>>> End Of Desert <<<<<<<<<<<<<<<<");

            // ---- FOREST ----
            ForestParent forestParent = new Forest();
            forestParent.category();
            forestParent.largestForest();
            forestParent.forestArea();
            forestParent.largestForest();
            forestParent.forestImportance();


            ForestParent forestRef = new Forest();
            forestRef.biodiversity();
            forestRef.largestForest();
            forestRef.category();
            forestRef.forestImportance();
            forestRef.forestArea();

            System.out.println(">>>>>>>>>>>>>>>> End Of Forest <<<<<<<<<<<<<<<<");

            // ---- VOLCANO ----
            VolcanoParent volcanoParent = new Volcano();
            volcanoParent.category();
            volcanoParent.mostActiveVolcano();
            volcanoParent.highestVolcano();
            volcanoParent.lavaComposition();
            volcanoParent.eruptionFrequency();

            Volcano volcano = new Volcano();

            volcano.eruptionFrequency();
            volcano.highestVolcano();


            VolcanoParent volcanoRef = new Volcano();
            volcanoRef.category();
            volcanoRef.mostActiveVolcano();
            volcanoRef.highestVolcano();
            volcanoRef.lavaComposition();
            volcanoRef.eruptionFrequency();

            System.out.println(">>>>>>>>>>>>>>>> End Of Volcano <<<<<<<<<<<<<<<<");

            // ---- ISLAND ----
            IslandParent islandParent = new Island();
            islandParent.category();
            islandParent.largestIsland();
            islandParent.famousIsland();
            islandParent.islandClimate();
            islandParent.largestIsland();



            IslandParent islandRef = new Island();
            islandRef.category();
            islandRef.largestIsland();
            islandRef.mostPopulatedIsland();
            islandRef.islandClimate();
            islandRef.famousIsland();

            System.out.println(">>>>>>>>>>>>>>>> End Of Island <<<<<<<<<<<<<<<<");

            // ---- GALAXY ----
            GalaxyParent galaxyParent = new Galaxy();
            galaxyParent.category();
            galaxyParent.largestGalaxy();
            galaxyParent.galaxyTypes();
            galaxyParent.galaxyFormation();
            galaxyParent.galaxyImportance();

            GalaxyParent galaxyRef = new Galaxy();
            galaxyRef.category();
            galaxyRef.largestGalaxy();
            galaxyRef.galaxyTypes();
            galaxyRef.galaxyFormation();
            galaxyRef.galaxyImportance();

            System.out.println(">>>>>>>>>>>>>>>> End Of Galaxy <<<<<<<<<<<<<<<<");

            // ---- COMET ----
            CometParent cometParent = new Comet();
            cometParent.category();
            cometParent.famousComet();
            cometParent.cometTailFormation();
            cometParent.cometOrbit();
            cometParent.cometComposition();


            CometParent cometRef = new Comet();
            cometRef.category();
            cometRef.famousComet();
            cometRef.cometTailFormation();
            cometRef.cometOrbit();
            cometRef.cometComposition();

            System.out.println(">>>>>>>>>>>>>>>> End Of Comet <<<<<<<<<<<<<<<<");

            // ---- METEOR ----
            MeteorParent meteorParent = new Meteor();
            meteorParent.category();
            meteorParent.meteorShowers();
            meteorParent.meteorSpeed();
            meteorParent.meteorComposition();
            meteorParent.meteorImpact();



            MeteorParent meteorRef = new Meteor();
            meteorRef.category();
            meteorRef.meteorShowers();
            meteorRef.meteorSpeed();
            meteorRef.meteorComposition();
            meteorRef.meteorImpact();

            System.out.println(">>>>>>>>>>>>>>>> End Of Meteor <<<<<<<<<<<<<<<<");

            // ---- NEBULA ----
            NebulaParent nebulaParent = new Nebula();
            nebulaParent.category();
            nebulaParent.famousNebula();
            nebulaParent.nebulaTypes();
            nebulaParent.nebulaFormation();
            nebulaParent.nebulaImportance();



            NebulaParent nebulaRef = new Nebula();
            nebulaRef.category();
            nebulaRef.famousNebula();
            nebulaRef.nebulaTypes();
            nebulaRef.nebulaFormation();
            nebulaRef.nebulaImportance();

            System.out.println(">>>>>>>>>>>>>>>> End Of Nebula <<<<<<<<<<<<<<<<");

            // ---- EXOPLANET ----
            ExoplanetParent exoplanetParent = new Exoplanet();
            exoplanetParent.category();
            exoplanetParent.firstDiscovered();
            exoplanetParent.exoplanetDetection();
            exoplanetParent.habitableZone();
            exoplanetParent.exoplanetAtmosphere();


            ExoplanetParent exoplanetRef = new Exoplanet();
            exoplanetRef.category();
            exoplanetRef.firstDiscovered();
            exoplanetRef.exoplanetDetection();
            exoplanetRef.habitableZone();
            exoplanetRef.exoplanetAtmosphere();

            System.out.println(">>>>>>>>>>>>>>>> End Of Exoplanet <<<<<<<<<<<<<<<<");

            // ---- SPACE STATION ----
            SpaceStationParent spaceStationParent = new SpaceStation();
            spaceStationParent.category();
            spaceStationParent.firstSpaceStation();
            spaceStationParent.largestSpaceStation();
            spaceStationParent.spaceStationOrbit();
            spaceStationParent.spaceStationPurpose();



            SpaceStationParent spaceStationRef = new SpaceStation();
            spaceStationRef.category();
            spaceStationRef.firstSpaceStation();
            spaceStationRef.largestSpaceStation();
            spaceStationRef.spaceStationOrbit();
            spaceStationRef.spaceStationPurpose();

            System.out.println(">>>>>>>>>>>>>>>> End Of Space Station <<<<<<<<<<<<<<<<");

            // ---- ASTEROID ----
            AnsteroidParent asteroidParent = new Ansteroid();
            asteroidParent.category();
            asteroidParent.largestAsteroid();
            asteroidParent.asteroidBelt();
            asteroidParent.asteroidComposition();
            asteroidParent.asteroidImpact();

            Ansteroid ansteroid = new Ansteroid();
            ansteroid.asteroidTypes();
            ansteroid.nearEarthAsteroids();
            ansteroid.asteroidMissions();
            ansteroid.asteroidMining();
            ansteroid.asteroidDeflection();

            AnsteroidParent ansteroidRef = new Ansteroid();
            ansteroidRef.category();
            ansteroidRef.largestAsteroid();
            ansteroidRef.asteroidBelt();
            ansteroidRef.asteroidComposition();
            ansteroidRef.asteroidImpact();

            System.out.println(">>>>>>>>>>>>>>>> End Of Ansteroid <<<<<<<<<<<<<<<<");

            // ---- BLACK HOLE ----
            BrindavanParent blackHoleParent = new Brindavan();
            blackHoleParent.category();
            blackHoleParent.eventHorizon();
            blackHoleParent.blackHoleFormation();
            blackHoleParent.typesOfBlackHoles();
            blackHoleParent.blackHoleHawkingRadiation();

            BrindavanParent blackHoleRef = new Brindavan();
            blackHoleRef.category();
            blackHoleRef.eventHorizon();
            blackHoleRef.blackHoleFormation();
            blackHoleRef.typesOfBlackHoles();
            blackHoleRef.blackHoleHawkingRadiation();

            System.out.println(">>>>>>>>>>>>>>>> End Of Black Hole <<<<<<<<<<<<<<<<");

            // ---- SUPERNOVA ----
            SupernovaParent supernovaParent = new Supernova();
            supernovaParent.category();
            supernovaParent.typesOfSupernovae();
            supernovaParent.supernovaBrightness();
            supernovaParent.supernovaFormation();
            supernovaParent.elementsFromSupernova();


            SupernovaParent supernovaRef = new Supernova();
            supernovaRef.category();
            supernovaRef.typesOfSupernovae();
            supernovaRef.supernovaBrightness();
            supernovaRef.supernovaFormation();
            supernovaRef.elementsFromSupernova();

            System.out.println(">>>>>>>>>>>>>>>> End Of Supernova <<<<<<<<<<<<<<<<");


            QuasarParent quasarParent = new Quasar();
            quasarParent.category();
            quasarParent.quasarEnergySource();
            quasarParent.brightestQuasar();
            quasarParent.quasarRedshift();
            quasarParent.quasarDiscovery();



            QuasarParent quasarRef = new Quasar();
            quasarRef.category();
            quasarRef.quasarEnergySource();
            quasarRef.brightestQuasar();
            quasarRef.quasarRedshift();
            quasarRef.quasarDiscovery();

            System.out.println(">>>>>>>>>>>>>>>> End Of Quasar <<<<<<<<<<<<<<<<");

            ToothpasteParent toothpasteParent = new Toothpaste();
            toothpasteParent.category();
            toothpasteParent.keyIngredient();
            toothpasteParent.benefits();
            toothpasteParent.usage();
            toothpasteParent.brands();


            ToothpasteParent toothpasteRef = new Toothpaste();
            toothpasteRef.category();
            toothpasteRef.keyIngredient();
            toothpasteRef.benefits();
            toothpasteRef.usage();
            toothpasteRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Toothpaste <<<<<<<<<<<<<<<<");

            // ---- SHAMPOO ----
            ShampooParent shampooParent = new Shampoo();
            shampooParent.category();
            shampooParent.keyIngredient();
            shampooParent.benefits();
            shampooParent.usage();
            shampooParent.brands();


            ShampooParent shampooRef = new Shampoo();
            shampooRef.category();
            shampooRef.keyIngredient();
            shampooRef.benefits();
            shampooRef.usage();
            shampooRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Shampoo <<<<<<<<<<<<<<<<");

            // ---- SOAP ----
            SoapParent soapParent = new Soap();
            soapParent.category();
            soapParent.keyIngredient();
            soapParent.benefits();
            soapParent.usage();
            soapParent.brands();


            SoapParent soapRef = new Soap();
            soapRef.category();
            soapRef.keyIngredient();
            soapRef.benefits();
            soapRef.usage();
            soapRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Soap <<<<<<<<<<<<<<<<");



            LotionParent lotionParent = new Lotion();
            lotionParent.category();
            lotionParent.keyIngredient();
            lotionParent.benefits();
            lotionParent.usage();
            lotionParent.brands();



            LotionParent lotionRef = new Lotion();
            lotionRef.category();
            lotionRef.keyIngredient();
            lotionRef.benefits();
            lotionRef.usage();
            lotionRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Lotion <<<<<<<<<<<<<<<<");

            // ---- PERFUME ----
            PerfumeParent perfumeParent = new Perfume();
            perfumeParent.category();
            perfumeParent.keyIngredient();
            perfumeParent.benefits();
            perfumeParent.usage();
            perfumeParent.brands();


            PerfumeParent perfumeRef = new Perfume();
            perfumeRef.category();
            perfumeRef.keyIngredient();
            perfumeRef.benefits();
            perfumeRef.usage();
            perfumeRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Perfume <<<<<<<<<<<<<<<<");

            // ---- DEODORANT ----
            DeodorantParent deodorantParent = new Deodorant();
            deodorantParent.category();
            deodorantParent.keyIngredient();
            deodorantParent.benefits();
            deodorantParent.usage();
            deodorantParent.brands();

            DeodorantParent deodorantRef = new Deodorant();
            deodorantRef.category();
            deodorantRef.keyIngredient();
            deodorantRef.benefits();
            deodorantRef.usage();
            deodorantRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Deodorant <<<<<<<<<<<<<<<<");

            // ---- SHAVING CREAM ----
            ShavingCreamParent shavingCreamParent = new ShavingCream();
            shavingCreamParent.category();
            shavingCreamParent.keyIngredient();
            shavingCreamParent.benefits();
            shavingCreamParent.usage();
            shavingCreamParent.brands();



            ShavingCreamParent shavingCreamRef = new ShavingCream();
            shavingCreamRef.category();
            shavingCreamRef.keyIngredient();
            shavingCreamRef.benefits();
            shavingCreamRef.usage();
            shavingCreamRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Shaving Cream <<<<<<<<<<<<<<<<");

            // ---- FACE WASH ----
            FaceWashParent faceWashParent = new FaceWash();
            faceWashParent.category();
            faceWashParent.keyIngredient();
            faceWashParent.benefits();
            faceWashParent.usage();
            faceWashParent.brands();

            FaceWashParent faceWashRef = new FaceWash();
            faceWashRef.category();
            faceWashRef.keyIngredient();
            faceWashRef.benefits();
            faceWashRef.usage();
            faceWashRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Face Wash <<<<<<<<<<<<<<<<");

            // ---- HAIR GEL ----
            HairGelParent hairGelParent = new HairGel();
            hairGelParent.category();
            hairGelParent.keyIngredient();
            hairGelParent.benefits();
            hairGelParent.usage();
            hairGelParent.brands();


            HairGelParent hairGelRef = new HairGel();
            hairGelRef.category();
            hairGelRef.keyIngredient();
            hairGelRef.benefits();
            hairGelRef.usage();
            hairGelRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Hair Gel <<<<<<<<<<<<<<<<");

            // ---- MOUTHWASH ----
            MouthwashParent mouthwashParent = new Mouthwash();
            mouthwashParent.category();
            mouthwashParent.keyIngredient();
            mouthwashParent.benefits();
            mouthwashParent.usage();
            mouthwashParent.brands();



            MouthwashParent mouthwashRef = new Mouthwash();
            mouthwashRef.category();
            mouthwashRef.keyIngredient();
            mouthwashRef.benefits();
            mouthwashRef.usage();
            mouthwashRef.brands();

            System.out.println(">>>>>>>>>>>>>>>> End Of Mouthwash <<<<<<<<<<<<<<<<");


            TvParent tvParent = new TvParent();
            tvParent.Display();
            tvParent.SetupBox();
            tvParent.Channels();
            tvParent.Sound();
            tvParent.Tvtype();

            Setupbox setupbox = new Setupbox();
            setupbox.SetuoType();
            setupbox.Brand();
            setupbox.price();
            setupbox.Avilable();
            setupbox.Support();

            TvParent tvParent1 = new Setupbox();
            tvParent1.Tvtype();
            tvParent1.Display();
            tvParent1.SetupBox();
            tvParent1.Sound();
            tvParent1.Channels();

            System.out.println(">>>>>>>>>>>>>>>>>TV IS OVer<<<<<<<<<<<<<<<<");

        }

        }









