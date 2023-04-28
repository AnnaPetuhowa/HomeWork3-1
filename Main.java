public class Main {
    public static void main(String[] args) {
        Plastic.Sword<Plastic> plasticSword = new Plastic.Sword<>(new Plastic());
        Plastic.Sword<Metal.Steel> steelSword = new Plastic.Sword<>(new Metal.Steel());

                boolean isStrong = steelSword.checkEndurance();
                System.out.println("Меч из стали " + (isStrong ? "прошел" : "не прошел") + " проверку прочности");
            }
        }
