package nodes;

import java.util.ArrayList;

public class FunctionDef {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AbstractTreeNode getRoot() {
		return root;
	}
	public void setRoot(AbstractTreeNode root) {
		this.root = root;
	}
	public ArrayList<String> getParams() {
		return params;
	}
	ArrayList<String> params = new ArrayList<String>();
	AbstractTreeNode root;
	
}
