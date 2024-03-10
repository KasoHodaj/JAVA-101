package Week3;

public class TowersOfHanoi {


    public static void main(String[] args) {
        //ΑΡΧΗ
        int n = 4; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B, and C are the names of the rods
        //ΤΕΛΟΣ
    }
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        /*
        n: The number of disks to move.
        from_rod: The rod where the disks are currently located.
        to_rod: The rod where the disks need to be moved.
        aux_rod: The auxiliary rod that can be used to move disks.
         */
        // Base case: if only one disk, move it from [from_rod] to [to_rod]
        if (n == 1) {
            System.out.println("Move disk 1 from " + from_rod + " to " + to_rod);
            return;
        }

        // Move n-1 disks from from_rod to aux_rod using to_rod as auxiliary
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);

        // Move the nth disk from from_rod to to_rod
        System.out.println("Move disk " + n + " from " + from_rod + " to " + to_rod);

        // Move n-1 disks from aux_rod to to_rod using from_rod as auxiliary
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
