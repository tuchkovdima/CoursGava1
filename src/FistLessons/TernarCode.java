package FistLessons;

public class TernarCode {
    public static void main(String[] args) {
         boolean passIsValid = true;
         boolean inCarrantine = true;
         boolean isPersonnel = true;

         String messege;
         if (passIsValid && !inCarrantine) {
             messege = "Open";
         } else if (isPersonnel){
             messege = "open for personal";
         } else {
             messege = "close";
         }
    }
}
