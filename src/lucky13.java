public class lucky13 {


        public static void main(String[] args) {

            int[] nums = {1, 3, 33, 3, 9, 67, 3, 25, 15};

            for (int i = 0; i < 9; i++) {
                if ((nums[i] != 3) && (nums[i] != 1)) {
                    System.out.println ("true");

                } else {
                    System.out.println ("false");

                }

            }
        }

    }
