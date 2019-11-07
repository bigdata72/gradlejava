package hackerrank.algos;

import com.bigdata72.algorithms.BinarySearch;

import java.util.Arrays;

public class IceCreamParlour {

	public static int[] findChoices(int[] menu, int money){
		int [] sortedMenu = menu.clone();
		Arrays.sort(sortedMenu);
		for(int i=0; i< sortedMenu.length; i++){
			int complement = money - sortedMenu[i];
			int location = BinarySearch.binarysearch(sortedMenu,(i+1), sortedMenu.length, complement);
			if(location >=0 && location < sortedMenu.length && sortedMenu[location] == complement){
				int [] indices = getIndicesFromValue(menu, sortedMenu[i], complement);
				return indices;
			}
		}
		return null;
	}

	public static int[] getIndicesFromValue(int [] arr, int value1, int value2){
		int index1 = indexOf(arr, value1, -1);
		int index2 = indexOf(arr, value2, index1);
		int[] indices = {Math.min(index1, index2), Math.max(index1, index2)};
		return indices;
	}

	public static int indexOf(int [] menu, int value, int excludeThis){
		for(int i=0; i < menu.length; i++){
			if(menu[i] == value && i != excludeThis){
				return i;
			}
		}
		return -1;
	}
}
