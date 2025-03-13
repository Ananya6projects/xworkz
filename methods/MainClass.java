public class MainClass {
    public static void main(String[] args) {
        // Invoking 4 methods from each of the 10 classes (Total 40 method calls)

        // Lipstick class
        Lipstick.chooseLipstick();
        Lipstick.useLipstick();
        Lipstick.applyLipstick();
        Lipstick.removeLipstick();

        // TrafficSignal class
        TrafficSignal.redLight();
        TrafficSignal.greenLight();
        TrafficSignal.yellowLight();
        TrafficSignal.signalMalfunction();

        // Brand class
        Brand.displayBrand();
        Brand.checkPopularity();
        Brand.compareWithOthers();
        Brand.brandLoyalty();

        // Pineapple class
        Pineapple.checkRipeness();
        Pineapple.cutPineapple();
        Pineapple.eatPineapple();
        Pineapple.makeJuice();

        // Gold class
        Gold.checkPurity();
        Gold.weighGold();
        Gold.calculateValue();
        Gold.storeGold();

        // Wire class
        Wire.chooseMaterial();
        Wire.cutWire();
        Wire.useWire();
        Wire.testWire();

        // Bracelet class
        Bracelet.chooseBracelet();
        Bracelet.wearBracelet();
        Bracelet.removeBracelet();
        Bracelet.cleanBracelet();

        // Perfume class
        Perfume.choosePerfume();
        Perfume.sprayPerfume();
        Perfume.checkFragrance();
        Perfume.storePerfume();

        // Wallet class
        Wallet.openWallet();
        Wallet.checkBalance();
        Wallet.addMoney();
        Wallet.removeMoney();

        // Currency class
        Currency.checkCurrency();
        Currency.exchangeCurrency();
        Currency.countMoney();
        Currency.depositMoney();
    }
}
