package actividad3;

public class SubsetSum {
    public static boolean subsetSum(int[] nums, int n, int target) {
        // Caso base
        if (target == 0) return true;         // encontramos subconjunto
        if (n == 0 && target != 0) return false; // sin elementos y no logramos suma

        // Si el último elemento es mayor que el target, lo ignoramos
        if (nums[n - 1] > target) {
            return subsetSum(nums, n - 1, target);
        }

        // Caso recursivo: incluir o no incluir el último elemento
        return subsetSum(nums, n - 1, target) ||
                subsetSum(nums, n - 1, target - nums[n - 1]);
    }

    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;

        if (subsetSum(nums, nums.length, target)) {
            System.out.println("Existe un subconjunto con suma " + target);
        } else {
            System.out.println("No existe subconjunto con suma " + target);
        }
    }
}
