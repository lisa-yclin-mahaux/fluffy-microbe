public class Main {
    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            default:
//                System.out.println("Value was not 1 or 2");
//                break;
//        }

// -----if the case is like 20, the code above will be tedious
// -----there is easier way:

        int switchValue = 4;

        switch (switchValue) {
            case 1: case 2: case 3:
                System.out.println("The Value is " + switchValue);
                break;
            default:
                System.out.println("The value is not 1 or 2 or 3");
                break;
        }



    }
}
////if you have a lot of condition to perform
//switch () {
//    case x:
//        break;
//    case y:
//        break;
//    default:

