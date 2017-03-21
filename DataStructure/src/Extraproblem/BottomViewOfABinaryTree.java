package Extraproblem;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

import CCI.BinaryTreeNode;
import CCI.Util;

public class BottomViewOfABinaryTree {

	public static TreeMap printBottomView(BinaryTreeNode current,int hd,TreeMap map){
		if(current==null){
			return null;
		}
		map.put(hd, current.value);
		printBottomView(current.left,hd-1,map);
		printBottomView(current.right,hd+1,map);
		return map;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode btNode=Util.getBT();
		TreeMap map=new TreeMap();
		map=printBottomView(btNode,0,map);
		Collection col=map.entrySet();
		Iterator itr=col.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
