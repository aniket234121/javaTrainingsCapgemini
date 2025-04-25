package Searching;

public class StudentExample {


    public static void main(String[] args) {
       String [] students=new String[10];
        students[0] = "Alice Smith:78:85:90:88:92";
        students[1] = "Bob Johnson:65:70:68:72:74";
        students[2] = "Jane Doe:80:90:56:67:75";
        students[3] = "Charlie Brown:55:60:58:62:59";
        students[4] = "Diana Prince:95:92:96:98:94";
        students[5] = "Ethan Hunt:83:79:85:80:82";
        students[6] = "Fiona Gallagher:70:75:73:78:77";
        students[7] = "George Costanza:88:82:85:87:90";
        students[8] = "Hannah Baker:91:89:94:90:93";
        students[9] = "Ivan Drago:60:65:63:68:66";


        for(String student : students) {
            String [] studentRecord = student.split(":");
            int sum=0;
            for(int i=1; i<studentRecord.length; i++) {
                sum+=Integer.parseInt(studentRecord[i]);
            }

            if((sum/5)>=80)
            {
                System.out.print(sum/5);
                System.out.println(" "+studentRecord[0]);
            }
        }
    }
}
