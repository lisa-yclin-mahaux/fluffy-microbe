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

//        int switchValue = 4;
//
//        switch (switchValue) {
//            case 1: case 2: case 3:
//                System.out.println("The Value is " + switchValue);
//
//            default:
//                System.out.println("The value is not 1 or 2 or 3");
//                break;
//        }

        // ============New Way of Switch Code====================

        int switchValue = 8;
        switch (switchValue) {
            case 1 -> System.out.println("The Value is 1");
            case 2 -> System.out.println("The Value 2");
            case 3, 4, 5 -> {
                System.out.println("this is 3 or 4 or 5");
                System.out.println("Actually this is " + switchValue);
            }
            default -> System.out.println("This is not 1 to 5");
        }
        // ====== End ======

        String month = "Jan";
        getAnotherQuarter("Jan");
        System.out.println(month + " is in " + getAnotherQuarter("Jan") + " quarter of the year.");
    }

    public static String getQuarter(String month) {
//        switch (month) {
//            case "Jan":;//the ; sign is no use at all... ignore maybe, it will break out itself!
//
//            case "Feb":;
//            case "Mar":
//                return "1st";
//            case "Apr":
//            case "May":
//            case "Jun":
//                return "2nd";
//            case"Jul":
//                return "3rd";
//            default:
//                return "bad input";
//        }
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "Apr", "May", "Jun" -> "2nd";
            case "Jul" -> "3rd";
            default -> "bad input";
        };

    }

    public static void getAnotherQuarter(String month) {
        switch (month) {
            case "Jan", "Feb", "Mar" -> System.out.println("1st");
            case "Apr", "May", "Jun" -> System.out.println("2nd");
            case "Jul" -> System.out.println("3rd");
            default -> System.out.println("bad input");
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
