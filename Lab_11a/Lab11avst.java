package Lab_11a;

    // Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound ===>> ");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int i = 2; i < primes.length; i++)
            primes[i] = true;


        for (int i = 2; i < primes.length; i++)
            if (primes[i] == true){
                for (int j = i + i; j < primes.length; j = j + i)
                    primes[j] = false;
            }







    }

    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        //output all list value
        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}