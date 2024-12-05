//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


class Solution {
    public void sort012(int[] arr) {
    // code here
    int i = 0;
    int j = 0;
    int k = arr.length - 1;

    while (j <= k) {
        int ele = arr[j];
        if (ele == 0) {
            swap(arr, i, j);
            ++i;
            ++j;
        } else if (ele == 1) {
            ++j;
        } else {
            swap(arr, j, k);
            --k;
        }
    }
}

public void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

}





//{ Driver Code Starts.
// } Driver Code Ends