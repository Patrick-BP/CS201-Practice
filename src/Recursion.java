public class Recursion {
    public static void main(String[] args) {

        int n = 1  ;
        int m= 3;

        System.out.println(add(n, m));

    }
    public static int add(int n ,int m){ // 1) n=1 ,m=3   2) n=1 m=2 3) n=1 m=1

        if (n==m) {// 1) false 2) false 3) true
            return n;
        }

        else {// 1) 3 + 3= return 6  2) 2 + 1 = return 3
            return m + add(n, m-1);
        }
    }

}

// 1)else  return add(1, 2)
// 2) else return add(1, 1)
// 3) return 1;