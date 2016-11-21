package jp.ac.uryukyu.ie.e165719;

public class Hero extends LivingThing {

    public Hero(String name, int hitPoint, int attack) {
        super(name,hitPoint,attack);
    }
    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
