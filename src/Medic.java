public class Medic extends Hero{
    int healPoints = 90;
    public void increaseExperience(){
        healPoints = healPoints + ((healPoints * 10) / 100);
        System.out.println(healPoints);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic  Super Healing! ");
    }


}