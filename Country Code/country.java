import java.util.*;

class country {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet<String> country = new HashSet<String>();

        country.add("China");
        country.add("Nigeria");
        country.add("Japan");
        country.add("Russia");
        country.add("Italy");
        country.add("China");

        Iterator<String> it = country.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}