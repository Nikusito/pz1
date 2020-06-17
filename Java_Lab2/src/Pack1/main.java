package Pack1;

import java.util.*;

public class main {

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> Linkedlist = new LinkedList<>();

        long time = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            arraylist.add(0,i);

        }


        long time2 = System.currentTimeMillis();
        System.out.println("Время выполнения операции вставки для ArrayList: "+(time2-time)+"ms");


        long time3 = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            Linkedlist.add(0,i);

        }


        long time4 = System.currentTimeMillis();
        System.out.println("Время выполнения операции вставки для LinkedList: "+(time4-time3)+"ms");

        System.out.println(".....................................................");

        /////////////ЧТение Arraylist
        time = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            arraylist.set(i,1);

        }

        time2 = System.currentTimeMillis();
        System.out.println("Время выполнения операции set для ArrayList: "+(time2-time)+"ms");

        /////////////ЧТение Linkedlist
        time3 = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            Linkedlist.set(i,1);

        }

        time4 = System.currentTimeMillis();
        System.out.println("Время выполнения операции set для LinkedList: "+(time4-time3)+"ms");
        System.out.println(".....................................................");

        ///////////// Arraylist
        time = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            arraylist.get(i);

        }

        time2 = System.currentTimeMillis();
        System.out.println("Время выполнения операции get для ArrayList: "+(time2-time)+"ms");

        /////////////ЧТение Linkedlist
        time3 = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            Linkedlist.get(i);

        }

        time4 = System.currentTimeMillis();
        System.out.println("Время выполнения операции get для LinkedList: "+(time4-time3)+"ms");
        System.out.println(".....................................................");

        ///////////// Удаление Arraylist
        time = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            arraylist.remove(0);

        }

        time2 = System.currentTimeMillis();
        System.out.println("Время выполнения операции удаление для ArrayList: "+(time2-time)+"ms");

        /////////////Удаление Linkedlist
        time3 = System.currentTimeMillis();

        for (int i=0;i<100000;i++)
        {
            Linkedlist.remove(0);

        }

        time4 = System.currentTimeMillis();
        System.out.println("Время выполнения операции удаление для LinkedList: "+(time4-time3)+"ms");


        Set<Student> hashset = new HashSet<>();
        Set<Student> treeset = new TreeSet<>();

        hashset.add(new Student("Oleg", "Ivanov", 4.5));
        hashset.add(new Student("Nikita", "Petrov", 3.2));
        hashset.add(new Student("Andrey", "Sidorov", 3.5));

        System.out.println("В коллекции HashSet есть "+hashset.contains(new Student("Oleg","Ivanov", 4.5)));

        System.out.println(hashset);

        hashset.remove(new Student("Andrey","Sidorov",3.5));
        System.out.println(hashset);

        hashset.add(new Student("Andrey","Sidorov",3.5));
        System.out.println(hashset);

        treeset.add(new Student("Andrey","Petrov",4.2));
        treeset.add(new Student("Alex","Dow",3.9));
        treeset.add(new Student("Dasha","Petrova",5.0));
        System.out.println(treeset);

        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().equals(o2.getName())&&o1.getLast_mame().equals(o2.getLast_mame())&& o1.getArage_Grade() == o2.getArage_Grade())
                    return 0;
                else if (o1.getArage_Grade()>o2.getArage_Grade())
                    return 1;
                else
                    return -1;
            }
        });

        set.add(new Student("Andrey","Petrov",4.2));
        set.add(new Student("Alex","Dow",3.9));
        set.add(new Student("Dasha","Petrova",5.0));

        System.out.println(set);

        set.remove(new Student("Dasha","Petrova",5.0));

        System.out.println(set);









    }
}
