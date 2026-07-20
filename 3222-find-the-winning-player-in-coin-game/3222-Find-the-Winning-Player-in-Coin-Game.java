class Solution {
    public String winningPlayer(int x, int y) {
        int ans = Math.min(x, y/4);
        if((ans & 1) == 1){
            return "Alice";
        }
        return "Bob";
    }
}
//         int ans = 0;

//         while (x >= 1 && y >= 4) {
//             x -= 1;
//             y -= 4;
//             ans++;
//         }

//         if ((ans & 1) == 1) {
//             return "Alice";
//         }

//         return "Bob";
//     }
// }