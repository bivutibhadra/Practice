package linkList2;

import java.util.LinkedList;

public class StudentListTest {
    public static void main(String[] args) {
        LinkedList<StudentList> list = new LinkedList<StudentList>();

        StudentList s1 = new StudentList("Bivuti", "cse", 101);
        StudentList s2 = new StudentList("Hashi", "cse", 102);
        StudentList s3 = new StudentList("Nishat", "cse", 103);
        StudentList s4 = new StudentList("Bappi", "cse", 104);
        StudentList s5 = new StudentList("Momin", "cse", 105);
        StudentList s6 = new StudentList("Shilon", "cse", 105);

        //adding student to the studentlist

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        //information display

        for (StudentList s : list) {

            System.out.println(s.id + " " + s.classNme + " " + s.name);
        }
                System.out.println("List : " + list.size());
            }
        }

