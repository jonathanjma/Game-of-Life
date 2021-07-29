package game;

public class BST<T extends Comparable<T>> {

    public BSTNode root;

    public void insert(T value) {
        root = insertHelper(value, root);
    }

    private BSTNode insertHelper(T value, BSTNode curr) {
        if (curr == null) {
            return new BSTNode(value);
        }
        if (value.compareTo(curr.value) < 0) {
            curr.left = insertHelper(value, curr.left);
        } else if (value.compareTo(curr.value) > 0) {
            curr.right = insertHelper(value, curr.right);
        }
        return curr;
    }

    public BSTNode find(T value) {
        return findHelper(value, root);
    }

    private BSTNode findHelper(T value, BSTNode curr) {
        if (curr == null) {
            return null;
        }
        if (value.compareTo(curr.value) == 0) {
            return curr;
        } else if (value.compareTo(curr.value) < 0) {
            return findHelper(value, curr.left);
        } else {
            return findHelper(value, curr.right);
        }
    }

    public void delete(T value) {
        root = deleteHelper(value, root);
    }

    private BSTNode deleteHelper(T value, BSTNode curr) {
        if (curr == null) {
            return null;
        }

        if (value.compareTo(curr.value) < 0) {
            curr.left = deleteHelper(value, curr.left);
        } else if (value.compareTo(curr.value) > 0) {
            curr.right = deleteHelper(value, curr.right);
        } else {
            if (curr.left == null && curr.right == null) {
                return null;
            } else if (curr.left != null && curr.right == null) {
                return curr.left;
            } else if (curr.right != null && curr.left == null) {
                return curr.right;
            } else {
                if (curr.right.left != null) {
                    curr.value = curr.right.left.value;
                    curr.right = deleteHelper(curr.right.left.value, curr.right);
                } else if (curr.left.right != null) {
                    curr.value = curr.left.right.value;
                    curr.left = deleteHelper(curr.left.right.value, curr.left);
                } else {
                    curr.value = curr.left.value;
                    if (curr.left.left != null) {
                        curr.left = curr.left.left;
                    } else {
                        curr.left = null;
                    }
                }
            }
        }

        return curr;
    }

    public int height() {
        return root != null ? heightHelper(root) - 1: -1;
    }

    private int heightHelper(BSTNode curr) {
        if (curr == null) {
            return 0;
        }
        int left = heightHelper(curr.left);
        int right = heightHelper(curr.right);
        return Math.max(left+1, right+1);
    }

    class BSTNode {
        public BSTNode left;
        public BSTNode right;
        public T value;

        public BSTNode(T value) {
            this.value = value;
        }
    }
}
