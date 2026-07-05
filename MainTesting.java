package StringManipulation;

public class MainTesting {

    public static void main(String[] args) {

        //Experiment
        
        String helloWorld = "Hello" + "World";
        helloWorld.concat(" and goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello");
        helloWorldBuilder.append(" and goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("\nProcessing...".repeat(11));

        StringBuilder emptyStart2 = new StringBuilder(32);
        emptyStart2.append(" Vijay".repeat(1));

        printInformation(emptyStart);
        printInformation(emptyStart2);

        StringBuilder builderPlus = new StringBuilder("Hello");
        builderPlus.insert(5, emptyStart2);
        builderPlus.append(" welcome to Java world");
        builderPlus.deleteCharAt(28).insert(28, 'W');
        
        System.out.print("Index : ");
        for (int i = 0; i < builderPlus.length(); i++){
            System.out.print(i % 10);
             
        }
        System.out.println();
        
        System.out.println("Text  : "+builderPlus);
        System.out.println(builderPlus.charAt(28));
        
        builderPlus.reverse();
        System.out.println(builderPlus);
        System.out.println("Length :"+builderPlus.length());

       
    }

    public static void printInformation(String string) {

        System.out.println("String " + string);
        System.out.println("Length " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder " + builder);
        System.out.println("Length " + builder.length());
        System.out.println("Capacity " + builder.capacity());
    }

}
