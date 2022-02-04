import java.util.Scanner;
public class Main {
   public static void main(String args[]) throws Exception {
   Scanner sc = new Scanner(System.in);
  ExhibitionDAO edao = new ExhibitionDAO();
   Exhibition e = null;
     System.out.println("Enter the exhibition name:");
   String exName = sc.nextLine();
   e = edao.getExhibition(exName);
   while (e == null) {
   System.out.println("Enter the correct exhibition name:");
   exName = sc.nextLine();
     e = edao.getExhibition(exName);
   }
   System.out.format("%-20s%-20s%-15s\n", "Stall Name", "Detail", "Owner name");
    for (Stall s:e.getStallList()) {
   System.out.format("%-20s%-20s%-15s\n", s.getName(), s.getDetail(), s.getOwner());
    }
   }
    }