package Exercise_4;

public class Main {
    public static void main(String[] args) throws Exception {
        try (InputReader inputReader = new InputReader()) {
            //Reading input
            String noun = inputReader.readString("Enter a noun:");
            String verb = inputReader.readString("Enter a verb:");
            String adj = inputReader.readString("Enter a adjective:");
            String adv = inputReader.readString("Enter a adverb:");

            //Logic
            String phrase = Phrase.phrase(noun, verb, adj, adv);

            //Output
            System.out.println(phrase);

            //Input & logic
            Phrase otherPhrase = new Phrase();
            otherPhrase.addNoun(inputReader.readString("Enter a noun:"));
            otherPhrase.addVerb(inputReader.readString("Enter a verb:"));
            otherPhrase.addAdj(inputReader.readString("Enter a adjective:"));
            otherPhrase.addAdv(inputReader.readString("Enter a adverb:"));
            String res = otherPhrase.phrase();

            //out
            System.out.println(res);

        }
    }
}
