package TwitterProblems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution2 {

	public static void main(String[] args) {
		//data structure to hold input data
		HashMap<Integer,Map<String,Integer>> inputDataStructure=new HashMap<Integer,Map<String,Integer>>();
		Scanner scanner = new Scanner(System.in);
		String input[]=scanner.nextLine().split(",");
		
		//creating proper date format
		String fromDate=input[0].concat("-01");
		String toDate=input[1].concat("-01");
		
		//avoiding first empty line
		scanner.nextLine();
		String inputData=null;

		//Filling all input data into data structure format
		while(scanner.hasNextLine() && !(inputData = scanner.nextLine()).isEmpty()){
			String[] subData = inputData.split(",");
			String currentDate = subData[0];
			String[] dateSplitedArray = currentDate.split("-");
			Integer keyInt = getkey(dateSplitedArray);
			String category = subData[1].trim();
			Integer dataCount = Integer.parseInt(subData[2].trim());
			if(inputDataStructure.containsKey(keyInt)){
				Map<String,Integer> fetch=inputDataStructure.get(keyInt);
				if(fetch.containsKey(category)){
					int fetchData=fetch.get(category);
					fetchData=fetchData+dataCount;
					fetch.remove(category);
					fetch.put(category, fetchData);
				}else{
					fetch.put(category, dataCount);
				}
			}else{
				Map<String,Integer> insertNewMap=new TreeMap<String,Integer>();
				insertNewMap.put(category, dataCount);
				inputDataStructure.put(keyInt,insertNewMap);
			}
		}
		
		//traversing all data and printing in require format
		String traverse=getNextDate(toDate);
		while(!traverse.trim().equals(fromDate.trim())){
			int count=1;
			Integer key=getkey(traverse.split("-"));
			if(inputDataStructure.containsKey(key)){
				Map<String,Integer> map=inputDataStructure.get(key);
				System.out.print(traverse.split("-")[0]+"-"+traverse.split("-")[1]+", ");
				for(Map.Entry<String,Integer> e: map.entrySet()){
					if(count<map.size()){
						System.out.print(e.getKey()+", "+e.getValue()+", ");
					}else{
						System.out.print(e.getKey()+", "+e.getValue());
					}
					count++;
				}
				System.out.println("");
			}
			traverse=getNextDate(traverse.trim());
		}
		int count=1;
		Integer key=getkey(traverse.split("-"));
		Map<String,Integer> lastRecordMap=inputDataStructure.get(key);
		System.out.print(traverse.split("-")[0]+"-"+traverse.split("-")[1]+", ");
		for(Map.Entry<String,Integer> e: lastRecordMap.entrySet()){
			if(count<lastRecordMap.size()){
				System.out.print(e.getKey()+", "+e.getValue()+", ");
			}else{
				System.out.print(e.getKey()+", "+e.getValue());
			}
			count++;
		}
		scanner.close();
	}

	//this function give hashmap key as per our format
	public static Integer getkey(String[] value){
		return Integer.parseInt(value[0].trim().concat(value[1].trim()));
	}

	public static String getNextDate(String dt){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(sdf.parse(dt));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.add(Calendar.MONTH, -1);  
		dt = sdf.format(c.getTime()); 
		return dt;
	}

}
