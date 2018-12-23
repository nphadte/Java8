package E_NIO.MyFileReader;

/*https://examples.javacodegeeks.com/core-java/java-8-read-file-line-line-example/
 * https://stackoverflow.com/questions/26949985/reading-files-with-intellij-idea-ide
 * */

public class FilReader {
    /*
    public static void main(String[] args) {
            public List<Data> getData(String fileLocationName);

        String fName = "C:/temp/Output.txt";


        try {
            Stream<String> lines = Files.lines(Paths.get(fName));
            System.out.println("<!-----Read all lines as a Stream-----!>");
            //lines.forEach(line -> new Data(line);
            lines.forEach(System.out::println());
            lines.close();
        } catch( IOException io){
            io.printStackTrace();
        }

    }


        *//*Path path = FileSystems.getDefault().getPath("Output.txt");
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        *//*//
    // Stream<String> lines = Files.lines("Output.txt");*/
//}
}
//try{


//}

    /*public static List<Data> getFileData(String  location, String fileName){
        String  location = ".";
        String  fileName = "Output.txt";

        Path path = FileSystems.getDefault().getPath("Output.txt");
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);

        try{
            Stream<String> lines = Files.lines("Output.txt")

        }catch ( IOException ioe){

        }


    }*/
//}
