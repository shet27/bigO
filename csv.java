package bigO;

public class csv {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("D:\\Documents\\CSV Project\\csvfile.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next());
        }
        sc.close();
    }

}
