package com.zybooks.pizzaparty;

public class PizzaCalculator {

    public enum HungerLevel {
        LIGHT, MEDIUM, RAVENOUS
    }

    public enum  PizzaSize {  // not sure if needed, may delete later
        SMALL, MEDIUM, LARGE
    }

    public final static int SLICES_PER_PIZZA = 8;
//    public final static int SMALL_PIZZA_SLICES = 6; // not sure if these three constants are needed, may delete later
//    public final static int MEDIUM_PIZZA_SLICES = 8;
//    public final static int LARGE_PIZZA_SLICES = 12;

    private HungerLevel mHungerLevel;
    private int mPartySize;
    private PizzaSize mPizzaSize; // may delete later

    public PizzaCalculator(int partySize, HungerLevel level, PizzaSize size) {
        setHungerLevel(level);
        setPartySize(partySize);
        setSlicesPerPizza(size);
    }

    public HungerLevel getHungerLevel() {
        return mHungerLevel;
    }
    public void setHungerLevel(HungerLevel level) {
        mHungerLevel = level;
    }

    public int getPartySize() {
        return mPartySize;
    }
    public void setPartySize(int partySize) {
        if (partySize >= 0) {
            mPartySize = partySize;
        }
    }
/// * continue here to set assign the slices per pizza selection using get and set method * ///
    public PizzaSize getPizzaSize() { return mPizzaSize; }
    public void setSlicesPerPizza(PizzaSize size) { mPizzaSize = size; }
///

    public int getTotalPizzas() {
        int slicesPerPerson;
        int pizzaSize = 0;
        if (mHungerLevel == HungerLevel.LIGHT) {
            slicesPerPerson = 2;
        }
        else if (mHungerLevel == HungerLevel.MEDIUM) {
            slicesPerPerson = 3;
        }
        else {
            slicesPerPerson = 4;
        }

        if (mPizzaSize == PizzaSize.SMALL) {
            pizzaSize = 6;
        }
        else if (mPizzaSize == PizzaSize.MEDIUM) {
            pizzaSize = 8;
        }
        else if (mPizzaSize == PizzaSize.LARGE) {
            pizzaSize = 12;
        }

//        return (int) Math.ceil(mPartySize * slicesPerPerson / (double) SLICES_PER_PIZZA);
        return (int) Math.ceil(mPartySize * slicesPerPerson / (double) pizzaSize);
    }
}
