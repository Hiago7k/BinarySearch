public class BinarySearch {
    static void main(String[] args) {
        //      int[] nums = {1, 5, 7, 23, 10};

        /*
        Esse algoritmo, funciona utilizando pesquisa simples O(n)
        de modo que precisa, ser muito manual e harded code
         */
//        int target = 5;
//
//        if (nums[0] == target || nums[1] == target || nums[2] == target || nums[3] == target || nums[4] == target){
//            System.out.printf("Pesquisa simples para achar o target! %n");
//            System.out.println(target);
//        }else {
//            System.out.println("O numero não existe no array");
//        }

        // Utilizando Binary Search
        int[] nums = {1, 5, 7, 9, 10, 13, 21};
        int target = 5;
        int contador = 0;
        int l = nums[0];
        int r = nums.length - 1;
        int meio = nums.length / 2; // 6


       // System.out.println(nums[meio]);

        while (target < r) {
            contador++;
            if (target < nums[meio]) {
                r = meio;
                meio = meio /r +1; //
            } else {
                l = meio;
            }

            if (target == meio) {
                System.out.println(target);
                System.out.printf("Quantidade de passos para achar o target foi %d%n", contador);
                break;
            }
        }
    }
}
