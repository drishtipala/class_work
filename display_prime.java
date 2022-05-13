package assignment_work;

public class display_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 1, high = 1000;

        while (low < high) {
            if(checkPrimeNumber(low))
                System.out.print(low + " \n");

            ++low;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
		

	}

}
