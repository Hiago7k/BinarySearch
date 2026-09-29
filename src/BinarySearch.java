public class BinarySearch {
    static void main() {
        int[] nums = {1, 5, 7, 23, 10};

        /*
        Esse algoritmo, funciona utilizando pesquisa simples O(n)
        de modo que precisa, ser muito manual e harded code
         */
        int target = 5;

        if (nums[0] == target || nums[1] == target || nums[2] == target || nums[3] == target || nums[4] == target){
            System.out.printf("Pesquisa simples para achar o target! %n");
            System.out.println(target);
        }else {
            System.out.println("O numero não existe no array");
        }

    }
}
