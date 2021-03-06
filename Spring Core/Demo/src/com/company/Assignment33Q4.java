import java.util.*;
import java.lang.*;

class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + date;
        result = prime * result + month;
        // result =prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        DateClass other = (DateClass) obj;
        if (date != other.date) return false;
        if (month != other.month) return false;
        if (year == other.year) return false;

        return true;
    }


    public int getDate() {
        return this.date;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return "date: " + this.date + "  month: " + this.month + "  year: " + this.year + "  ";
    }

}

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> hm, String employeeName) {

        String s = "get method fails";

        for (Map.Entry<DateClass, String> entry : hm.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println(employeeName + "  lll");
            if (entry.getValue().equals(employeeName)) {
                s = entry.getValue();
                break;
            }


        }
        return s;
    }


    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);

        HashMap<DateClass, String> hm = new HashMap<>();

        /*
         * System.out.print("enter the nmber of employees : "); int ne=ss.nextInt();
         *
         * for (int i=0;i<ne;i++){
         *
         * System.out.print("enter the day : "); int d=ss.nextInt();
         *
         * System.out.print("enter the month : "); int m=ss.nextInt();
         *
         * System.out.print("enter the year : "); int y=ss.nextInt();
         *
         * System.out.print("enter the name : "); String n=ss.next();
         *
         * hm.put(new DateClass(d,m,y),n); }
         */
        DateClass d1 = new DateClass(4, 7, 95);
        hm.put(d1, "a1");
        DateClass d2 = new DateClass(4, 3, 97);
        hm.put(d2, "a2");
        DateClass d3 = new DateClass(4, 7, 95);
        hm.put(d3, "a");
        DateClass d4 = new DateClass(4, 3, 95);
        hm.put(d4, "a3");

        System.out.println("hashmap : " + hm);

        System.out.print("enter the name of employee you want to check : ");
        String nae = ss.next();

        Assignment3Q4 o = new Assignment3Q4();
        System.out.println("          " + o.getEmployee(hm, nae));


    }
}