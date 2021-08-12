package Exercise_4;

public class Phrase {
    public String noun;
    public String verb;
    public String adj;
    public String adv;

    public Phrase(){};

    public void addNoun(String noun){
        this.noun = noun;
    }
    public void addVerb(String verb){
        this.verb = verb;
    }
    public void addAdj(String adj){
        this.adj = adj;
    }
    public void addAdv(String adv){
        this.adv = adv;
    }
    public static String phrase(String noun,String verb,String adj, String adv){
        return (noun + " " + verb + " " + adj + " " + adv);
    }
    public String phrase(){
        return (noun + " " + verb + " " + adj + " " + adv);
    }

}
