import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PP {
    static void combinations(ArrayList<Integer> A, int B, int sum, int index, ArrayList<Integer> ans,
            ArrayList<ArrayList<Integer>> list) {
        if (sum == B) {
            ArrayList<Integer> f = ans;

            System.out.println(f);
            return;
        }
        if (sum > B)
            return;
        if (index >= A.size())
            return;

        int n = A.size();
        for (int i = index; i < n; i++) {
            if (sum + A.get(i) <= B) {
                ans.add(A.get(i));
                sum += A.get(i);
                combinations(A, B, sum, i, ans, list);
                sum -= A.get(index);
                ans.remove(A.get(i));
            }
        }
    }

    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        // add your code here

        Collections.sort(A);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        int index = 0;
        combinations(A, B, 0, index, ans, list);
        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Please Enter Number");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            A.add(sc.nextInt());
        }
        System.out.println("Please Enter Number");
        int B = sc.nextInt();
        ArrayList<ArrayList<Integer>> l = combinationSum(A, B);
        System.out.println(l);
    }
}