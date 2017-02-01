/**
 * Created by pjohnson on 31/01/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Pablo"));
        int[] anArray = {1, 2, 3, 1, 1, 1, 1, 0, 1, 4, 7, 6, 6, 5, 1, 1, 1, 1, 1};
        System.out.println(obtenModa(anArray));

        problemaNodo();
    }

    private static void problemaNodo() {
        TreeNode nodo10 = new TreeNode();
        TreeNode nodo9 = new TreeNode();
        TreeNode nodo8 = new TreeNode();
        TreeNode nodo7 = new TreeNode();
        TreeNode nodo6 = new TreeNode();
        TreeNode nodo5 = new TreeNode();
        TreeNode nodo4 = new TreeNode();
        TreeNode nodo3 = new TreeNode();
        TreeNode nodo2 = new TreeNode();
        TreeNode nodo1 = new TreeNode();
        TreeNode nodoPadre = new TreeNode();
        nodoPadre.left = nodo1;
        nodoPadre.right = nodo2;
        nodo1.left = nodo3;
        nodo2.left = nodo4;
        nodo2.right = nodo5;
        nodo3.left = nodo6;
        nodo3.right = nodo7;
        nodo6.left = nodo8;
        nodo5.left = nodo9;
        nodo5.left = nodo10;

        System.out.println("Maximama profundidad es " + maxProfundidad(nodoPadre));
    }

    public static String reverseString(String s) {
        char[] reversedString = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString[j++] = s.charAt(i);
        }

        return new String(reversedString);
    }

    public static int obtenModa(int[] array) {
        int rpta = 0;
        int rptaTemp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                rptaTemp++;
                rpta = Math.max(rpta, rptaTemp);
            } else {
                rptaTemp = 0;
            }
        }
        return rpta;
    }

    public static int maxProfundidad(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxProfundidad(root.left), maxProfundidad(root.right));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    public int sumOfLeftLeaves(TreeNode n) {
        if (n == null || (n.left == null && n.right == null)) return 0;
        int l = 0, r = 0;
        if (n.left != null) l = (n.left.left == null && n.left.right == null) ? n.left.val : sumOfLeftLeaves(n.left);
        if (n.right != null) r = sumOfLeftLeaves(n.right);
        return l + r;
    }
}
