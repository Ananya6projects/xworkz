package com.xworkz.tostring.runner;
import com.xworkz.tostring.inner.*;

public class MainRunner {
    public static void main(String[] args) {

        AeroGrid aeroGrid = new AeroGrid("High-Performance", 800, true);
        System.out.println(aeroGrid);
        System.out.println("hashCode: " + aeroGrid.hashCode());
        AeroGrid anotherAeroGrid = new AeroGrid("High-Performance", 800, true);
        System.out.println("equals: " + aeroGrid.equals(anotherAeroGrid));

        AirConditioner airConditioner = new AirConditioner("Cooling", 1200, true);
        System.out.println(airConditioner);
        System.out.println("hashCode: " + airConditioner.hashCode());
        AirConditioner anotherAirConditioner = new AirConditioner("Cooling", 1200, true);
        System.out.println("equals: " + airConditioner.equals(anotherAirConditioner));

        AlarmClock alarmClock = new AlarmClock("Digital", 8, true);
        System.out.println(alarmClock);
        System.out.println("hashCode: " + alarmClock.hashCode());
        AlarmClock anotherAlarmClock = new AlarmClock("Digital", 8, true);
        System.out.println("equals: " + alarmClock.equals(anotherAlarmClock));

        AstroScope astroScope = new AstroScope("High-Magnification", 400, false);
        System.out.println(astroScope);
        System.out.println("hashCode: " + astroScope.hashCode());
        AstroScope anotherAstroScope = new AstroScope("High-Magnification", 400, false);
        System.out.println("equals: " + astroScope.equals(anotherAstroScope));

        Backpack backpack = new Backpack("Travel", 30, true);
        System.out.println(backpack);
        System.out.println("hashCode: " + backpack.hashCode());
        Backpack anotherBackpack = new Backpack("Travel", 30, true);
        System.out.println("equals: " + backpack.equals(anotherBackpack));

        Bag bag = new Bag("Leather", 15, false);
        System.out.println(bag);
        System.out.println("hashCode: " + bag.hashCode());
        Bag anotherBag = new Bag("Leather", 15, false);
        System.out.println("equals: " + bag.equals(anotherBag));

        Bicycle bicycle = new Bicycle("Mountain", 21, true);
        System.out.println(bicycle);
        System.out.println("hashCode: " + bicycle.hashCode());
        Bicycle anotherBicycle = new Bicycle("Mountain", 21, true);
        System.out.println("equals: " + bicycle.equals(anotherBicycle));

        BicycleHelmet bicycleHelmet = new BicycleHelmet("Safety", 200, true);
        System.out.println(bicycleHelmet);
        System.out.println("hashCode: " + bicycleHelmet.hashCode());
        BicycleHelmet anotherBicycleHelmet = new BicycleHelmet("Safety", 200, true);
        System.out.println("equals: " + bicycleHelmet.equals(anotherBicycleHelmet));

        BioSynth bioSynth = new BioSynth("Portable", 1500, true);
        System.out.println(bioSynth);
        System.out.println("hashCode: " + bioSynth.hashCode());
        BioSynth anotherBioSynth = new BioSynth("Portable", 1500, true);
        System.out.println("equals: " + bioSynth.equals(anotherBioSynth));

        Blender blender = new Blender("Plastic", 500, false);
        System.out.println(blender);
        System.out.println("hashCode: " + blender.hashCode());
        Blender anotherBlender = new Blender("Plastic", 500, false);
        System.out.println("equals: " + blender.equals(anotherBlender));

        Bottle bottle = new Bottle("Plastic", 750, true);
        System.out.println(bottle);
        System.out.println("hashCode: " + bottle.hashCode());
        Bottle anotherBottle = new Bottle("Plastic", 750, true);
        System.out.println("equals: " + bottle.equals(anotherBottle));

        Camera camera = new Camera("DSLR", 24, true);
        System.out.println(camera);
        System.out.println("hashCode: " + camera.hashCode());
        Camera anotherCamera = new Camera("DSLR", 24, true);
        System.out.println("equals: " + camera.equals(anotherCamera));

        CameraLens cameraLens = new CameraLens("Zoom", 18, false);
        System.out.println(cameraLens);
        System.out.println("hashCode: " + cameraLens.hashCode());
        CameraLens anotherCameraLens = new CameraLens("Zoom", 18, false);
        System.out.println("equals: " + cameraLens.equals(anotherCameraLens));

        Chair chair = new Chair("Wooden", 5, false);
        System.out.println(chair);
        System.out.println("hashCode: " + chair.hashCode());
        Chair anotherChair = new Chair("Wooden", 5, false);
        System.out.println("equals: " + chair.equals(anotherChair));

        Charger charger = new Charger("Fast", 20, true);
        System.out.println(charger);
        System.out.println("hashCode: " + charger.hashCode());
        Charger anotherCharger = new Charger("Fast", 20, true);
        System.out.println("equals: " + charger.equals(anotherCharger));

        Clock clock = new Clock("Analog", 6, true);
        System.out.println(clock);
        System.out.println("hashCode: " + clock.hashCode());
        Clock anotherClock = new Clock("Analog", 6, true);
        System.out.println("equals: " + clock.equals(anotherClock));

        CoffeeMaker coffeeMaker = new CoffeeMaker("Espresso", 2000, true);
        System.out.println(coffeeMaker);
        System.out.println("hashCode: " + coffeeMaker.hashCode());
        CoffeeMaker anotherCoffeeMaker = new CoffeeMaker("Espresso", 2000, true);
        System.out.println("equals: " + coffeeMaker.equals(anotherCoffeeMaker));

        Comb comb = new Comb("Plastic", 10, true);
        System.out.println(comb);
        System.out.println("hashCode: " + comb.hashCode());
        Comb anotherComb = new Comb("Plastic", 10, true);
        System.out.println("equals: " + comb.equals(anotherComb));

        CrystalTune crystalTune = new CrystalTune("Sound", 120, true);
        System.out.println(crystalTune);
        System.out.println("hashCode: " + crystalTune.hashCode());
        CrystalTune anotherCrystalTune = new CrystalTune("Sound", 120, true);
        System.out.println("equals: " + crystalTune.equals(anotherCrystalTune));

        Curtain curtain = new Curtain("Cotton", 10, false);
        System.out.println(curtain);
        System.out.println("hashCode: " + curtain.hashCode());
        Curtain anotherCurtain = new Curtain("Cotton", 10, false);
        System.out.println("equals: " + curtain.equals(anotherCurtain));

        Cushion cushion = new Cushion("Memory Foam", 50, true);
        System.out.println(cushion);
        System.out.println("hashCode: " + cushion.hashCode());
        Cushion anotherCushion = new Cushion("Memory Foam", 50, true);
        System.out.println("equals: " + cushion.equals(anotherCushion));

        CyberNest cyberNest = new CyberNest("Compact", 2500, true);
        System.out.println(cyberNest);
        System.out.println("hashCode: " + cyberNest.hashCode());
        CyberNest anotherCyberNest = new CyberNest("Compact", 2500, true);
        System.out.println("equals: " + cyberNest.equals(anotherCyberNest));
        Door door = new Door("Wooden", 40, true);
        System.out.println(door);
        System.out.println("hashCode: " + door.hashCode());
        Door anotherDoor = new Door("Wooden", 40, true);
        System.out.println("equals: " + door.equals(anotherDoor));

        DrawingTablet drawingTablet = new DrawingTablet("Wacom", 10, true);
        System.out.println(drawingTablet);
        System.out.println("hashCode: " + drawingTablet.hashCode());
        DrawingTablet anotherDrawingTablet = new DrawingTablet("Wacom", 10, true);
        System.out.println("equals: " + drawingTablet.equals(anotherDrawingTablet));

        Drone drone = new Drone("Quadcopter", 1500, true);
        System.out.println(drone);
        System.out.println("hashCode: " + drone.hashCode());
        Drone anotherDrone = new Drone("Quadcopter", 1500, true);
        System.out.println("equals: " + drone.equals(anotherDrone));

        Earbuds earbuds = new Earbuds("Wireless", 50, true);
        System.out.println(earbuds);
        System.out.println("hashCode: " + earbuds.hashCode());
        Earbuds anotherEarbuds = new Earbuds("Wireless", 50, true);
        System.out.println("equals: " + earbuds.equals(anotherEarbuds));

        EchoTrek echoTrek = new EchoTrek("Smart", 200, true);
        System.out.println(echoTrek);
        System.out.println("hashCode: " + echoTrek.hashCode());
        EchoTrek anotherEchoTrek = new EchoTrek("Smart", 200, true);
        System.out.println("equals: " + echoTrek.equals(anotherEchoTrek));

        ElectricKettle electricKettle = new ElectricKettle("Stainless Steel", 1500, true);
        System.out.println(electricKettle);
        System.out.println("hashCode: " + electricKettle.hashCode());
        ElectricKettle anotherElectricKettle = new ElectricKettle("Stainless Steel", 1500, true);
        System.out.println("equals: " + electricKettle.equals(anotherElectricKettle));

        Fan fan = new Fan("Ceiling", 100, true);
        System.out.println(fan);
        System.out.println("hashCode: " + fan.hashCode());
        Fan anotherFan = new Fan("Ceiling", 100, true);
        System.out.println("equals: " + fan.equals(anotherFan));

        FanHeater fanHeater = new FanHeater("Tower", 1200, true);
        System.out.println(fanHeater);
        System.out.println("hashCode: " + fanHeater.hashCode());
        FanHeater anotherFanHeater = new FanHeater("Tower", 1200, true);
        System.out.println("equals: " + fanHeater.equals(anotherFanHeater));

        FlashDrive flashDrive = new FlashDrive("USB-C", 128, true);
        System.out.println(flashDrive);
        System.out.println("hashCode: " + flashDrive.hashCode());
        FlashDrive anotherFlashDrive = new FlashDrive("USB-C", 128, true);
        System.out.println("equals: " + flashDrive.equals(anotherFlashDrive));

        Fridge fridge = new Fridge("Samsung", 300, true);
        System.out.println(fridge);
        System.out.println("hashCode: " + fridge.hashCode());
        Fridge anotherFridge = new Fridge("Samsung", 300, true);
        System.out.println("equals: " + fridge.equals(anotherFridge));

        FrostLink frostLink = new FrostLink("Compact", 500, true);
        System.out.println(frostLink);
        System.out.println("hashCode: " + frostLink.hashCode());
        FrostLink anotherFrostLink = new FrostLink("Compact", 500, true);
        System.out.println("equals: " + frostLink.equals(anotherFrostLink));

        Gamepad gamepad = new Gamepad("Wireless", 150, true);
        System.out.println(gamepad);
        System.out.println("hashCode: " + gamepad.hashCode());
        Gamepad anotherGamepad = new Gamepad("Wireless", 150, true);
        System.out.println("equals: " + gamepad.equals(anotherGamepad));

        Glasses glasses = new Glasses("Eyeglasses", 300, false);
        System.out.println(glasses);
        System.out.println("hashCode: " + glasses.hashCode());
        Glasses anotherGlasses = new Glasses("Eyeglasses", 300, false);
        System.out.println("equals: " + glasses.equals(anotherGlasses));

        GliderSync gliderSync = new GliderSync("Portable", 700, true);
        System.out.println(gliderSync);
        System.out.println("hashCode: " + gliderSync.hashCode());
        GliderSync anotherGliderSync = new GliderSync("Portable", 700, true);
        System.out.println("equals: " + gliderSync.equals(anotherGliderSync));

        GraphicsCard graphicsCard = new GraphicsCard("NVIDIA", 8, true);
        System.out.println(graphicsCard);
        System.out.println("hashCode: " + graphicsCard.hashCode());
        GraphicsCard anotherGraphicsCard = new GraphicsCard("NVIDIA", 8, true);
        System.out.println("equals: " + graphicsCard.equals(anotherGraphicsCard));

        HairDryer hairDryer = new HairDryer("Conair", 1500, true);
        System.out.println(hairDryer);
        System.out.println("hashCode: " + hairDryer.hashCode());
        HairDryer anotherHairDryer = new HairDryer("Conair", 1500, true);
        System.out.println("equals: " + hairDryer.equals(anotherHairDryer));

        Headphones headphones = new Headphones("Noise Cancelling", 100, true);
        System.out.println(headphones);
        System.out.println("hashCode: " + headphones.hashCode());
        Headphones anotherHeadphones = new Headphones("Noise Cancelling", 100, true);
        System.out.println("equals: " + headphones.equals(anotherHeadphones));

        Helmet helmet = new Helmet("Motorcycle", 1000, true);
        System.out.println(helmet);
        System.out.println("hashCode: " + helmet.hashCode());
        Helmet anotherHelmet = new Helmet("Motorcycle", 1000, true);
        System.out.println("equals: " + helmet.equals(anotherHelmet));

        Humidifier humidifier = new Humidifier("Cool Mist", 60, true);
        System.out.println(humidifier);
        System.out.println("hashCode: " + humidifier.hashCode());
        Humidifier anotherHumidifier = new Humidifier("Cool Mist", 60, true);
        System.out.println("equals: " + humidifier.equals(anotherHumidifier));

        InfernoDeck infernoDeck = new InfernoDeck("High Power", 1500, true);
        System.out.println(infernoDeck);
        System.out.println("hashCode: " + infernoDeck.hashCode());
        InfernoDeck anotherInfernoDeck = new InfernoDeck("High Power", 1500, true);
        System.out.println("equals: " + infernoDeck.equals(anotherInfernoDeck));

        Iron iron = new Iron("Steam", 1200, true);
        System.out.println(iron);
        System.out.println("hashCode: " + iron.hashCode());
        Iron anotherIron = new Iron("Steam", 1200, true);
        System.out.println("equals: " + iron.equals(anotherIron));

        Joystick joystick = new Joystick("Wireless", 200, true);
        System.out.println(joystick);
        System.out.println("hashCode: " + joystick.hashCode());
        Joystick anotherJoystick = new Joystick("Wireless", 200, true);
        System.out.println("equals: " + joystick.equals(anotherJoystick));

        Keyboard keyboard = new Keyboard("Mechanical", 800, true);
        System.out.println(keyboard);
        System.out.println("hashCode: " + keyboard.hashCode());
        Keyboard anotherKeyboard = new Keyboard("Mechanical", 800, true);
        System.out.println("equals: " + keyboard.equals(anotherKeyboard));

        Keychain keychain = new Keychain("Leather", 50, false);
        System.out.println(keychain);
        System.out.println("hashCode: " + keychain.hashCode());
        Keychain anotherKeychain = new Keychain("Leather", 50, false);
        System.out.println("equals: " + keychain.equals(anotherKeychain));

        LavaTrack lavaTrack = new LavaTrack("Wireless", 250, true);
        System.out.println(lavaTrack);
        System.out.println("hashCode: " + lavaTrack.hashCode());
        LavaTrack anotherLavaTrack = new LavaTrack("Wireless", 250, true);
        System.out.println("equals: " + lavaTrack.equals(anotherLavaTrack));
        LEDBulb ledBulb = new LEDBulb("Energy Efficient", 800, true);
        System.out.println(ledBulb);
        System.out.println("hashCode: " + ledBulb.hashCode());
        LEDBulb anotherLEDBulb = new LEDBulb("Energy Efficient", 800, true);
        System.out.println("equals: " + ledBulb.equals(anotherLEDBulb));

        LumenBox lumenBox = new LumenBox("Smart", 1000, true);
        System.out.println(lumenBox);
        System.out.println("hashCode: " + lumenBox.hashCode());
        LumenBox anotherLumenBox = new LumenBox("Smart", 1000, true);
        System.out.println("equals: " + lumenBox.equals(anotherLumenBox));

        LunchBox lunchBox = new LunchBox("Plastic", 500, true);
        System.out.println(lunchBox);
        System.out.println("hashCode: " + lunchBox.hashCode());
        LunchBox anotherLunchBox = new LunchBox("Plastic", 500, true);
        System.out.println("equals: " + lunchBox.equals(anotherLunchBox));

        Marker marker = new Marker("Permanent", 10, false);
        System.out.println(marker);
        System.out.println("hashCode: " + marker.hashCode());
        Marker anotherMarker = new Marker("Permanent", 10, false);
        System.out.println("equals: " + marker.equals(anotherMarker));

        Mattress mattress = new Mattress("Memory Foam", 1200, true);
        System.out.println(mattress);
        System.out.println("hashCode: " + mattress.hashCode());
        Mattress anotherMattress = new Mattress("Memory Foam", 1200, true);
        System.out.println("equals: " + mattress.equals(anotherMattress));

        Microphone microphone = new Microphone("USB", 200, true);
        System.out.println(microphone);
        System.out.println("hashCode: " + microphone.hashCode());
        Microphone anotherMicrophone = new Microphone("USB", 200, true);
        System.out.println("equals: " + microphone.equals(anotherMicrophone));

        Microscope microscope = new Microscope("Optical", 500, true);
        System.out.println(microscope);
        System.out.println("hashCode: " + microscope.hashCode());
        Microscope anotherMicroscope = new Microscope("Optical", 500, true);
        System.out.println("equals: " + microscope.equals(anotherMicroscope));

        Microwave microwave = new Microwave("Samsung", 700, true);
        System.out.println(microwave);
        System.out.println("hashCode: " + microwave.hashCode());
        Microwave anotherMicrowave = new Microwave("Samsung", 700, true);
        System.out.println("equals: " + microwave.equals(anotherMicrowave));

        MicrowaveOven microwaveOven = new MicrowaveOven("LG", 1000, true);
        System.out.println(microwaveOven);
        System.out.println("hashCode: " + microwaveOven.hashCode());
        MicrowaveOven anotherMicrowaveOven = new MicrowaveOven("LG", 1000, true);
        System.out.println("equals: " + microwaveOven.equals(anotherMicrowaveOven));

        Mirror mirror = new Mirror("Wall", 60, true);
        System.out.println(mirror);
        System.out.println("hashCode: " + mirror.hashCode());
        Mirror anotherMirror = new Mirror("Wall", 60, true);
        System.out.println("equals: " + mirror.equals(anotherMirror));

        MirrorStand mirrorStand = new MirrorStand("Adjustable", 150, true);
        System.out.println(mirrorStand);
        System.out.println("hashCode: " + mirrorStand.hashCode());
        MirrorStand anotherMirrorStand = new MirrorStand("Adjustable", 150, true);
        System.out.println("equals: " + mirrorStand.equals(anotherMirrorStand));

        Mobile mobile = new Mobile("Samsung", 6, true);
        System.out.println(mobile);
        System.out.println("hashCode: " + mobile.hashCode());
        Mobile anotherMobile = new Mobile("Samsung", 6, true);
        System.out.println("equals: " + mobile.equals(anotherMobile));

        Mouse mouse = new Mouse("Wireless", 150, true);
        System.out.println(mouse);
        System.out.println("hashCode: " + mouse.hashCode());
        Mouse anotherMouse = new Mouse("Wireless", 150, true);
        System.out.println("equals: " + mouse.equals(anotherMouse));

        MousePad mousePad = new MousePad("Gel", 50, false);
        System.out.println(mousePad);
        System.out.println("hashCode: " + mousePad.hashCode());
        MousePad anotherMousePad = new MousePad("Gel", 50, false);
        System.out.println("equals: " + mousePad.equals(anotherMousePad));

        NailCutter nailCutter = new NailCutter("Stainless Steel", 30, false);
        System.out.println(nailCutter);
        System.out.println("hashCode: " + nailCutter.hashCode());
        NailCutter anotherNailCutter = new NailCutter("Stainless Steel", 30, false);
        System.out.println("equals: " + nailCutter.equals(anotherNailCutter));

        NanoForge nanoForge = new NanoForge("Advanced", 1500, true);
        System.out.println(nanoForge);
        System.out.println("hashCode: " + nanoForge.hashCode());
        NanoForge anotherNanoForge = new NanoForge("Advanced", 1500, true);
        System.out.println("equals: " + nanoForge.equals(anotherNanoForge));

        NeonBlaster neonBlaster = new NeonBlaster("Flashlight", 300, true);
        System.out.println(neonBlaster);
        System.out.println("hashCode: " + neonBlaster.hashCode());
        NeonBlaster anotherNeonBlaster = new NeonBlaster("Flashlight", 300, true);
        System.out.println("equals: " + neonBlaster.equals(anotherNeonBlaster));

        Notebook notebook = new Notebook("Leather", 200, true);
        System.out.println(notebook);
        System.out.println("hashCode: " + notebook.hashCode());
        Notebook anotherNotebook = new Notebook("Leather", 200, true);
        System.out.println("equals: " + notebook.equals(anotherNotebook));

        OmegaLens omegaLens = new OmegaLens("50mm", 3000, true);
        System.out.println(omegaLens);
        System.out.println("hashCode: " + omegaLens.hashCode());
        OmegaLens anotherOmegaLens = new OmegaLens("50mm", 3000, true);
        System.out.println("equals: " + omegaLens.equals(anotherOmegaLens));

        PencilBox pencilBox = new PencilBox("Plastic", 50, false);
        System.out.println(pencilBox);
        System.out.println("hashCode: " + pencilBox.hashCode());
        PencilBox anotherPencilBox = new PencilBox("Plastic", 50, false);
        System.out.println("equals: " + pencilBox.equals(anotherPencilBox));

        Pillow pillow = new Pillow("Memory Foam", 500, true);
        System.out.println(pillow);
        System.out.println("hashCode: " + pillow.hashCode());
        Pillow anotherPillow = new Pillow("Memory Foam", 500, true);
        System.out.println("equals: " + pillow.equals(anotherPillow));

        PixelDrone pixelDrone = new PixelDrone("Quadcopter", 2500, true);
        System.out.println(pixelDrone);
        System.out.println("hashCode: " + pixelDrone.hashCode());
        PixelDrone anotherPixelDrone = new PixelDrone("Quadcopter", 2500, true);
        System.out.println("equals: " + pixelDrone.equals(anotherPixelDrone));

        Plate plate = new Plate("Ceramic", 300, true);
        System.out.println(plate);
        System.out.println("hashCode: " + plate.hashCode());
        Plate anotherPlate = new Plate("Ceramic", 300, true);
        System.out.println("equals: " + plate.equals(anotherPlate));

        PowerBank powerBank = new PowerBank("Lithium", 5000, true);
        System.out.println(powerBank);
        System.out.println("hashCode: " + powerBank.hashCode());
        PowerBank anotherPowerBank = new PowerBank("Lithium", 5000, true);
        System.out.println("equals: " + powerBank.equals(anotherPowerBank));

        Printer printer = new Printer("Laser", 1500, true);
        System.out.println(printer);
        System.out.println("hashCode: " + printer.hashCode());
        Printer anotherPrinter = new Printer("Laser", 1500, true);
        System.out.println("equals: " + printer.equals(anotherPrinter));

        Projector projector = new Projector("LED", 2000, true);
        System.out.println(projector);
        System.out.println("hashCode: " + projector.hashCode());
        Projector anotherProjector = new Projector("LED", 2000, true);
        System.out.println("equals: " + projector.equals(anotherProjector));

        QuantumMat quantumMat = new QuantumMat("Heated", 300, true);
        System.out.println(quantumMat);
        System.out.println("hashCode: " + quantumMat.hashCode());
        QuantumMat anotherQuantumMat = new QuantumMat("Heated", 300, true);
        System.out.println("equals: " + quantumMat.equals(anotherQuantumMat));

        Refrigerator refrigerator = new Refrigerator("LG", 500, true);
        System.out.println(refrigerator);
        System.out.println("hashCode: " + refrigerator.hashCode());
        Refrigerator anotherRefrigerator = new Refrigerator("LG", 500, true);
        System.out.println("equals: " + refrigerator.equals(anotherRefrigerator));

        Remote remote = new Remote("Universal", 100, true);
        System.out.println(remote);
        System.out.println("hashCode: " + remote.hashCode());
        Remote anotherRemote = new Remote("Universal", 100, true);
        System.out.println("equals: " + remote.equals(anotherRemote));

        RingLight ringLight = new RingLight("LED", 500, true);
        System.out.println(ringLight);
        System.out.println("hashCode: " + ringLight.hashCode());
        RingLight anotherRingLight = new RingLight("LED", 500, true);
        System.out.println("equals: " + ringLight.equals(anotherRingLight));

        Router router = new Router("Wi-Fi", 2000, true);
        System.out.println(router);
        System.out.println("hashCode: " + router.hashCode());
        Router anotherRouter = new Router("Wi-Fi", 2000, true);
        System.out.println("equals: " + router.equals(anotherRouter));

        Scanner scanner = new Scanner("Flatbed", 1500, true);
        System.out.println(scanner);
        System.out.println("hashCode: " + scanner.hashCode());
        Scanner anotherScanner = new Scanner("Flatbed", 1500, true);
        System.out.println("equals: " + scanner.equals(anotherScanner));

        Screwdriver screwdriver = new Screwdriver("Manual", 50, true);
        System.out.println(screwdriver);
        System.out.println("hashCode: " + screwdriver.hashCode());
        Screwdriver anotherScrewdriver = new Screwdriver("Manual", 50, true);
        System.out.println("equals: " + screwdriver.equals(anotherScrewdriver));

        SelfieStick selfieStick = new SelfieStick("Bluetooth", 500, true);
        System.out.println(selfieStick);
        System.out.println("hashCode: " + selfieStick.hashCode());
        SelfieStick anotherSelfieStick = new SelfieStick("Bluetooth", 500, true);
        System.out.println("equals: " + selfieStick.equals(anotherSelfieStick));

        Shoes shoes = new Shoes("Sports", 1500, true);
        System.out.println(shoes);
        System.out.println("hashCode: " + shoes.hashCode());
        Shoes anotherShoes = new Shoes("Sports", 1500, true);
        System.out.println("equals: " + shoes.equals(anotherShoes));

        Skateboard skateboard = new Skateboard("Electric", 3000, true);
        System.out.println(skateboard);
        System.out.println("hashCode: " + skateboard.hashCode());
        Skateboard anotherSkateboard = new Skateboard("Electric", 3000, true);
        System.out.println("equals: " + skateboard.equals(anotherSkateboard));

        Smartwatch smartwatch = new Smartwatch("Apple", 5000, true);
        System.out.println(smartwatch);
        System.out.println("hashCode: " + smartwatch.hashCode());
        Smartwatch anotherSmartwatch = new Smartwatch("Apple", 5000, true);
        System.out.println("equals: " + smartwatch.equals(anotherSmartwatch));

        Sofa sofa = new Sofa("Leather", 7000, true);
        System.out.println(sofa);
        System.out.println("hashCode: " + sofa.hashCode());
        Sofa anotherSofa = new Sofa("Leather", 7000, true);
        System.out.println("equals: " + sofa.equals(anotherSofa));

        SolarNest solarNest = new SolarNest("Portable", 1200, true);
        System.out.println(solarNest);
        System.out.println("hashCode: " + solarNest.hashCode());
        SolarNest anotherSolarNest = new SolarNest("Portable", 1200, true);
        System.out.println("equals: " + solarNest.equals(anotherSolarNest));

        Speaker speaker = new Speaker("Bluetooth", 500, true);
        System.out.println(speaker);
        System.out.println("hashCode: " + speaker.hashCode());
        Speaker anotherSpeaker = new Speaker("Bluetooth", 500, true);
        System.out.println("equals: " + speaker.equals(anotherSpeaker));

        Stapler stapler = new Stapler("Heavy Duty", 50, true);
        System.out.println(stapler);
        System.out.println("hashCode: " + stapler.hashCode());
        Stapler anotherStapler = new Stapler("Heavy Duty", 50, true);
        System.out.println("equals: " + stapler.equals(anotherStapler));

        Sunglasses sunglasses = new Sunglasses("Ray-Ban", 3000, false);
        System.out.println(sunglasses);
        System.out.println("hashCode: " + sunglasses.hashCode());
        Sunglasses anotherSunglasses = new Sunglasses("Ray-Ban", 3000, false);
        System.out.println("equals: " + sunglasses.equals(anotherSunglasses));

        Table table = new Table("Wooden", 5000, true);
        System.out.println(table);
        System.out.println("hashCode: " + table.hashCode());
        Table anotherTable = new Table("Wooden", 5000, true);
        System.out.println("equals: " + table.equals(anotherTable));

        Television television = new Television("LED", 8000, true);
        System.out.println(television);
        System.out.println("hashCode: " + television.hashCode());
        Television anotherTelevision = new Television("LED", 8000, true);
        System.out.println("equals: " + television.equals(anotherTelevision));

        Thermometer thermometer = new Thermometer("Digital", 100, true);
        System.out.println(thermometer);
        System.out.println("hashCode: " + thermometer.hashCode());
        Thermometer anotherThermometer = new Thermometer("Digital", 100, true);
        System.out.println("equals: " + thermometer.equals(anotherThermometer));

        Toothbrush toothbrush = new Toothbrush("Electric", 200, false);
        System.out.println(toothbrush);
        System.out.println("hashCode: " + toothbrush.hashCode());
        Toothbrush anotherToothbrush = new Toothbrush("Electric", 200, false);
        System.out.println("equals: " + toothbrush.equals(anotherToothbrush));

        Towel towel = new Towel("Cotton", 100, false);
        System.out.println(towel);
        System.out.println("hashCode: " + towel.hashCode());
        Towel anotherTowel = new Towel("Cotton", 100, false);
        System.out.println("equals: " + towel.equals(anotherTowel));

        Tripod tripod = new Tripod("Adjustable", 1500, true);
        System.out.println(tripod);
        System.out.println("hashCode: " + tripod.hashCode());
        Tripod anotherTripod = new Tripod("Adjustable", 1500, true);
        System.out.println("equals: " + tripod.equals(anotherTripod));

        VortexShield vortexShield = new VortexShield("High Efficiency", 2500, true);
        System.out.println(vortexShield);
        System.out.println("hashCode: " + vortexShield.hashCode());
        VortexShield anotherVortexShield = new VortexShield("High Efficiency", 2500, true);
        System.out.println("equals: " + vortexShield.equals(anotherVortexShield));

        Wallet wallet = new Wallet("Leather", 500, true);
        System.out.println(wallet);
        System.out.println("hashCode: " + wallet.hashCode());
        Wallet anotherWallet = new Wallet("Leather", 500, true);
        System.out.println("equals: " + wallet.equals(anotherWallet));

        WashingMachine washingMachine = new WashingMachine("Samsung", 5000, true);
        System.out.println(washingMachine);
        System.out.println("hashCode: " + washingMachine.hashCode());
        WashingMachine anotherWashingMachine = new WashingMachine("Samsung", 5000, true);
        System.out.println("equals: " + washingMachine.equals(anotherWashingMachine));

        WaterBottle waterBottle = new WaterBottle("Plastic", 500, false);
        System.out.println(waterBottle);
        System.out.println("hashCode: " + waterBottle.hashCode());
        WaterBottle anotherWaterBottle = new WaterBottle("Plastic", 500, false);
        System.out.println("equals: " + waterBottle.equals(anotherWaterBottle));

        ZenPulse zenPulse = new ZenPulse("Smart", 1500, true);
        System.out.println(zenPulse);
        System.out.println("hashCode: " + zenPulse.hashCode());
        ZenPulse anotherZenPulse = new ZenPulse("Smart", 1500, true);
        System.out.println("equals: " + zenPulse.equals(anotherZenPulse));
    }
}
