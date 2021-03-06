import java.util.ArrayList;

/**
 * @author Super-Zhang
 * @date 2021-08-05 16:10
 *  描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 *
 * [[1,2,3,4],
 * [5,6,7,8],
 * [9,10,11,12],
 * [13,14,15,16]]
 *
 * 则依次打印出数字
 *
 * [1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]
 */
public class JZ19顺时针打印矩阵 {

    /**
     * 本题说白了就是考察 对数组的逻辑访问。
     * 转着圈的输出就行，做好边界的判定。
     */

    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return list;
        }

        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true){
            for(int col=left;col<=right;col++){
                list.add(matrix[up][col]);
            }
            up++;
            if(up>down) break;

            for(int row = up;row<=down;row++){
                list.add(matrix[row][right]);
            }
            right--;
            if(left>right) break;

            for(int col=right;col>=left;col--){
                list.add(matrix[down][col]);
            }
            down--;
            if(down<up) break;

            for(int row=down;row>=up;row--){
                list.add(matrix[row][left]);
            }
            left++;
            if(left>right) break;
        }
        return list;

    }
}
