package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	
	
	public int solution(int k) {
		
		int i , divider, counter= 0;
		boolean gabStarted = false;
		List<Integer> numbList = new ArrayList<Integer>();
		List<Integer> gabList = new ArrayList<Integer>();
		
		for(i=0 ; i<Integer.MAX_VALUE; i++) {
			divider = k%2;
			numbList.add(divider);
			k = k/2;
			
			if(k==1) {
				break;
			}
		}	
		
		numbList.add(1);
		
		Collections.reverse(numbList);
		counter = 0;
		
		for(i=0; i<numbList.size()-1;i++) {
			
			if(numbList.get(i)!=numbList.get(i+1)) {
				gabStarted = !gabStarted;
			} 
			
			if(gabStarted) {
				counter++;
			} else {
				gabList.add(counter);
				counter=0;
			}
		}
		
		if(gabList.isEmpty()) {
			gabList.add(0);
		}
		
		return Collections.max(gabList);
	
	}
}
