import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubClass extends PhanTu<Integer> {

    public static List<Integer> list = new ArrayList<>();

    public SubClass() {

    }

    public boolean isGreaterThan(Integer a) {
        return super.value.compareTo(a) > 0;
    }

    public static void exportToFile() throws IOException {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        FileOutputStream fos = new FileOutputStream(s);
        Writer dos = new BufferedWriter(new OutputStreamWriter(fos));
        for (Integer i : list) {
            dos.write(i + "\n");
        }
        dos.close();
        fos.close();
    }


    public static void getData(String ss) throws FileNotFoundException {
        String s = ss;   //
        File file = new File(s);
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getData(s);
        Collections.sort(list);
        exportToFile();
    }
}
