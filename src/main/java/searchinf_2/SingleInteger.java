package searchinf_2;

import java.util.ArrayList;

public class SingleInteger {

    public static void main(String[] args) {

        int[] A={1, 2, 3, 4, 5};
                //{7, 41, 15, 36, 20, 21, 36, 10, 25, 35, 24, 19, 30, 37, 32, 26, 4, 48, 50, 9, 15, 46, 42};
                //{5, 10, 20, 100, 105};
                //{78, 45, 80, 78, 83, 89, 71, 68, 70, 41, 21, 76, 50, 66, 40, 35, 32, 90, 70, 95, 95, 65, 55, 80, 67, 29, 64, 68, 89, 59, 58, 5, 29, 6, 13, 33, 91, 5, 72, 3, 34, 63, 13, 96, 75, 91, 27, 28, 100, 47, 45, 93, 39, 2, 1, 75, 29, 22, 51, 71, 46, 63, 31, 75, 72, 6, 97, 34, 16, 34, 76, 89, 23, 82, 84, 33, 83, 62, 31, 56, 47, 21, 53, 76, 70, 14, 30, 35, 45, 38, 94, 2, 43, 48, 86, 38, 87, 67, 67, 52, 72, 88, 50, 56, 86, 18, 79, 3, 85, 18, 3, 9, 84, 63, 86, 78, 98, 14, 94, 83, 85, 52, 14, 28, 69, 68, 92, 36, 39, 62, 13, 63, 95, 81, 30, 75, 71, 35, 89, 70, 58, 25, 43, 56, 18, 52, 82, 39, 81, 9, 32, 33, 97, 42, 79, 98, 70, 85, 6, 75, 32, 41, 84, 30, 24, 92, 93, 30, 16, 38, 85, 1, 56, 17, 3, 92, 76, 67, 88, 42, 61, 21, 4, 10, 62, 45, 5, 67, 16, 71, 33, 33, 1, 69, 23, 97, 96, 49, 49, 3, 66, 97, 84, 47, 41, 58, 15, 13, 52, 99, 56, 77, 29, 35, 55, 8, 74, 50, 83, 36, 100, 30, 20, 98, 20, 93, 23, 22, 75, 33, 69, 95, 13, 94, 35, 51, 42, 33, 45, 10, 81, 77, 63, 29, 10, 63, 92, 69, 43, 5, 23, 24, 56, 58, 70, 22, 37, 39, 4, 18, 4, 16, 28, 63, 66, 3, 32, 82, 35, 65, 67, 95, 39, 27, 51, 88, 84, 50, 100, 85, 23, 55, 34, 60, 4, 12, 82, 11, 33, 26, 23, 38, 83, 17, 77, 91, 40, 80, 48, 87, 51, 49, 71, 45, 63, 48, 97, 90, 19, 85, 70, 26, 70, 2, 22, 6, 21, 18, 17, 32, 13, 8, 1, 68, 64, 85, 38, 77, 76, 96, 1, 75, 12, 21, 89, 76, 1, 17, 8, 81, 37, 54, 62, 97, 19, 93, 14, 96, 35, 95, 89, 51, 12, 47, 84, 59, 85, 8, 29, 49, 80, 78, 41, 25, 82, 48, 44, 42, 85, 26, 38, 1, 100, 6, 88, 12, 89, 33, 9, 11, 46, 8, 78, 88, 32, 100, 20, 71, 13, 46, 10, 9, 91, 88, 59, 16, 56, 37, 34, 54, 27, 27, 29, 1, 28, 51, 21, 1, 13, 16, 49, 68, 69, 45, 74, 7, 4, 38, 65, 53, 30, 89, 50, 98, 74, 23, 26, 85, 66, 81, 30, 28, 45, 22, 86, 78, 37, 82, 30, 39, 92, 93, 27, 41, 8, 20, 37, 22, 71, 91, 18, 42, 26, 43, 30, 87, 35, 32, 57, 5, 8, 21, 7, 62, 13, 62, 64, 41, 99, 16, 36, 96, 72, 53, 1, 9, 47, 96, 93, 35, 1, 14, 70, 88, 28, 34, 60, 91, 64, 71, 96, 99, 9, 34, 95, 25, 26, 77, 88, 94, 34, 73, 100, 18, 53, 38, 52, 19, 72, 43, 47, 92, 21, 79, 93, 7, 52, 44, 28, 13, 1, 78, 29, 66, 1, 49, 57, 88, 8, 35, 100, 56, 24, 63, 30, 32, 15, 77, 55, 84, 14, 11, 21, 72, 78, 94, 39, 52, 81, 67, 71, 9, 29, 65, 19, 36, 34, 89, 92, 65, 28, 21, 23, 92, 51, 11, 15, 72, 73, 49, 81, 2, 22, 34, 24, 95, 27, 45, 76, 18, 60, 98, 70, 81, 92, 48, 72, 61, 4, 31, 65, 89, 51, 39, 57, 81, 58, 4, 85, 34, 58, 71, 16, 100, 57, 55, 37, 55, 37, 64, 41, 64, 31, 34, 74, 89, 32, 96, 24, 10, 14, 96, 55, 7, 11, 47, 97, 3, 44, 61, 94, 54, 18, 3, 20, 1, 12, 81, 34, 84, 31, 22, 22, 67, 76, 11, 45, 95, 63, 99, 48, 9, 58, 69, 38, 6, 10, 7, 75, 48, 72, 25, 30, 12, 53, 93, 94, 23, 54, 55, 17, 32, 46, 44, 64, 94, 98, 62, 31, 29, 56, 73};
        int B=10;
                //332;
                //130;
                //99693;
        single_find(A,B);
    }


    public static boolean isValid(int[] A, int B,int mid){
        boolean flag = false;
        for (int i = mid-1; i < A.length; i++) {
            flag=(i==mid-1 && A[i]>B ? true: false)||((A[i]-A[i-mid])>B ? true: false);
            if(flag) return flag;
        }
        return flag;
    }

    public static int single_find(int[] A,int B){

        int l=1;
        int h=A.length;
        int res=1;
        while (l<h){
            int m = (l+h+1)/2;
            long  r=0;
            for (int i = 0; i < m; i++) {
                r+=A[i];
            }
            if(r>B){
                h=m-1;
                continue;
            }

            for (int i = 1; i <=A.length-m; i++) {
                r=r-A[i-1]+A[i+m-1];
                if(r>B){
                    h=m-1;
                    break;
                }
            }

            if(r>B){
                continue;
            }else {
                res=m;
                l=m;
            }
        }
        return res;
    }

    public static int single_int(int[] A, int B){
        int len = A.length;
        int l=0;
        int r = len;
        int[] PA = prefix(A);
        int ans=0;
        while (l<=r){
            int mid =(l+r)/2;
            if(mid==0){
                System.out.println(1);
                return 1;
            }
            int count = find_sum(PA,mid,B);
            if(count==1){
                l=mid+1;
                ans=l;
            }else{
                r=mid-1;
                ans=r;
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void single_integer(int[] A,int B){
        int len = A.length;
        System.out.println(len);
        int l=0;
        int h=len-1;
        int[] PA = prefix(A);
        for (int i = 0; i < PA.length; i++) {
            System.out.print(PA[i]+" ");
        }
        System.out.println();
        System.out.println(PA[len-1]);
        if(PA[len-1]== len){
            System.out.println(len);
        }
        int res=0;
       int[] ans =  find(PA,B);
       int count=0;
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
            if(ans[i]==1){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
//        while (l<=h){
//            int mid = (l+h)/2;
//            int middle = find_sum(PA,mid,B);
//            int right = find_sum(PA,mid+1,B);
//            int left = find_sum(PA,mid-1,B);
//            if(right==1){
//                l=mid+1;
//            }else if(left==0){
//                h=mid-1;
//            }else if(middle==0){
//                h=mid-1;
//            }else if(left==1 || middle==1){
//                l=mid+1;
//            }else if(right==0){
//                h=mid;
//            }
//            res=l;
//        }
        System.out.println(res);
    }

    public static int[] find(int[] PA,int B){
        int[] res = new int[PA.length];
        for (int i = 1; i <=PA.length; i++) {
            int ans = find_sum(PA,i,B);
            if(ans==1){
                res[i-1]=ans;
            }else{
                break;
            }
        }
       return res;
    }

    public static int find_sum(int[] A, int sub,int B){
        int j=sub-1;
        int start = A[j];
        int count=0;
        if(start>B){
            return count;
        }
        for (int i = 1; i <A.length-sub+1 ; i++) {
            j++;
            start =A[j];
            int val = start-A[i-1];

            if(val<=B){
                count=1;
            }else if(val>B){
                return 0;
            }
        }
        return count;
    }

    //Prefix
    public static int[] prefix(int[] A){
        int[] pa =  new int[A.length];
        pa[0]=A[0];
        for (int i = 1; i <A.length ; i++) {
            pa[i]=pa[i-1]+A[i];
        }
        return pa;
    }


    public static void single(int[] A,int B){
        int[] pa = new int[A.length];
        pa[0] =A[0];
        //prefix
        for (int i = 1; i <A.length ; i++) {
            pa[i]=pa[i-1]+A[i];
        }
        int ans =0;
        for (int i = 0; i <pa.length ; i++) {
            if(pa[i]<=B) ans++;
            else break;
        }
        int i=0;
        while (i<=A.length){
            for (int j = 0; j < A.length; j++) {

            }
        }
        System.out.println(ans);

    }
}
