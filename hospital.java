import java.util.Scanner; import java.util.Random;
class patient    {        Random random = new Random();        String name; int age; int p_id;        String d_name; int dc_fee; String d_spec;        patient(){            this.p_id = random.nextInt(1000);        }    }
public class Hospital {    public enum doctor{         AKANSHA("AKANSHA",150,"Cardiologist"),         AYUSHI("AYUSHI",250,"Opthalmologist"),         ABINASH("ABINASH",370,"Phyciatrist"),         ANUBHAV("ANUBHAV",400,"Dermatologist"),         ARNAV("ARNAV",600,"Neurologist");
    private String name; private int c_fee; private String spec;
    doctor(final String name, final int c_fee, final String spec){        this.name = name;        this.c_fee = c_fee;        this.spec = spec;    }
    }    public static void main(String args[]) {
      System.out.println("Select Any Doctor : ");      int i=0;      for(doctor name : doctor.values()){          System.out.print(++i + ") ");          System.out.print(name);          System.out.print(" ");          System.out.println("(" + name.spec + ")");      }
      Scanner sc = new Scanner(System.in);      int n;      n = sc.nextInt();      doctor d;      switch(n){          case 1 : d = doctor.AKANSHA;          break;          case 2 : d = doctor.AYUSHI;          break;          case 3 : d = doctor.ABINASH;          break;          case 4 : d = doctor.ANUBHAV;          break;   case 5 : d = doctor.ARNAV;   break;          default : d = doctor.AKANSHA; break;      }
       patient p = new patient();       String pname; int page;
       System.out.print("\nEnter Patient Name : ");       pname = sc.next();
       System.out.print("\nEnter Patient Age : ");       page = sc.nextInt();
       p.name = pname; p.age = page;       p.d_name = d.name; p.dc_fee = d.c_fee; p.d_spec = d.spec;
        System.out.print("\n ------RECEIPT-------- ");        System.out.print("\n Patient Name - ");        System.out.print(p.name);System.out.print("\n Patient Age - ");        System.out.print(p.age);System.out.print("\n Patient Id - ");        System.out.print(p.p_id);System.out.print("\n Doctor Name - ");        System.out.print(p.d_name);System.out.print("\n Doctor Consultation Fee - ");        System.out.print(p.dc_fee);System.out.print("\n Doctor Specialization - ");        System.out.print(p.d_spec);System.out.print("\n ");
 }}