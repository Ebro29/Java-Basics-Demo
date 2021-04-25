
public class Character {
    /**

     * @author Ebrahim Shahid

     */
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    public Character(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public void setStrength(int Strength)
    {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDexterity()
    {
        return dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom()
    {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma()
    {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.constitution = charisma;
    }

    int getStatsTotal()
    {
        int sum;
        sum=this.charisma+this.constitution+this.dexterity+this.intelligence+this.strength+this.wisdom;
        if(sum<0)
            return 0;
        return sum;
    }

}
