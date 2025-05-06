public class Main
{
    public static void main(String[] args)
    {
        String[] wordNums={"one","two","three"};
        WordPairList exampleOne=new WordPairList(wordNums);
        System.out.println(exampleOne.getAllPairs());
        System.out.println();
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        System.out.println(exampleTwo.getAllPairs());
        System.out.println();
        String[] moreWords = {"the","red","fox","the","red"};
        WordPairList exampleThree = new WordPairList(moreWords);
        System.out.println(exampleThree.numMatches());



    }
}