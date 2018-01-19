package OOp_lab3;

public class PIN {
    String PIN = "1234",Input;
    int count = 0;
    Scanner scanner = new Scanner (System.in);
   do {
       system.out.print("Enter PIN:" );
       input = scanner.nextLine();
       if (PIN.equals (input)) {
           system.out.println ("Welcome.");
           break;

       }else {
           count++;
           if (count==3){
               System.out.println("Locked.");
               break;
           }
       }

    }
}
