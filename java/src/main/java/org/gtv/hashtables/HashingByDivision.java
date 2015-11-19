package org.gtv.hashtables;

import java.util.ArrayList;
import java.util.List;

public class HashingByDivision {

	private List<List<Integer>> hashTable;
	
	public HashingByDivision() {
		hashTable = new ArrayList<List<Integer>>(100);
		for(int i=0;i<100;i++){
			hashTable.add(null);
		}
	}
	
	public void put(Integer value){
		int hashValue = value % 100;
		if(hashTable.get(hashValue) != null){
			hashTable.get(hashValue).add(value);
		} else {
		    List<Integer> array = new ArrayList<Integer>();
		    array.add(value);
		    hashTable.add(hashValue, array);
		}
		
	}
	
	public boolean isPresent(Integer value) {
		int hashValue = value % 100;
		if(hashTable.get(hashValue)!=null){
			List<Integer> array = hashTable.get(hashValue);
			for(Integer arrayValue:array){
				if(value.equals(arrayValue)){
					return true;
				}
			}
		}
		return false;
	}
	
}
