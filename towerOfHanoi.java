import java.util.Scanner;
public class towerOfHanoi {
    static void tower_OH(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Take disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        tower_OH(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        tower_OH(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        tower_OH(n, 'A', 'C', 'B');
    }

}