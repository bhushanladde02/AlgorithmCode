package Extraproblem;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;

import CCI.BinaryTreeNode;
import CCI.Util;

public class PrintNodesInTopViewOfBinaryTree {

	public static TreeMap printFromTop(BinaryTreeNode traverse, int hd, TreeMap<Integer,Integer> map){
		if(traverse==null){
			return null;
		}
		if(!map.containsKey(hd)){
			map.put(hd, traverse.value);	
		}
		printFromTop(traverse.left,hd-1,map);
		printFromTop(traverse.right,hd+1,map);
		return map;
	}
	public static void main(String[] args) {
		BinaryTreeNode node=Util.getBT();
		TreeMap<Integer,Integer> result=printFromTop(node,0,new TreeMap<Integer,Integer>());
		Collection col=result.entrySet();
		Iterator itr=col.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
