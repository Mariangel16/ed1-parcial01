package ed.lab;

public class E01FlattenBT {

    public void flatten(TreeNode<Integer> root) {
        TreeNode<Integer> current = root;

        while (current != null) {
            if (current.left != null) {
                // Encuentra el predecesor (el nodo más a la derecha del subárbol izquierdo)
                TreeNode<Integer> predecessor = current.left;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }

                // Conecta el subárbol derecho al final del izquierdo
                predecessor.right = current.right;

                // Mueve el subárbol izquierdo al derecho
                current.right = current.left;
                current.left = null;
            }

            // Continúa al siguiente nodo
            current = current.right;
        }

    }

}
