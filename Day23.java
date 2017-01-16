	public static int getHeight(Node root){
      //Write your code here
        if (root == null){
            return -1;
        }
        int leftHeight = 1 + getHeight(root.left);
        int rightHeight = 1 + getHeight(root.right);
        if (rightHeight > leftHeight){
            return rightHeight;
        }
        else{
            return leftHeight;
        }
    }
