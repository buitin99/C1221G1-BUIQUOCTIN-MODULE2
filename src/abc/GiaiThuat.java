package abc;

public class GiaiThuat {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++){
            if (i == 0 || i == n){
                for (int i1 = 0; i1 < n; i1++){
                    System.out.print("*");
                }
            }else if(i == n-i)
            {
                System.out.print(" ");

            }
        }
    }

}
