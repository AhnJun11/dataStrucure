package dataStrucure;

import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		// 배열 추가
		list1.add(1);
		list1.add(2);
		//배열 출력
		System.out.println(list1.get(0));
		
		// 다중배열
		Integer[][][] data_list = {
			{
				{1,2,3}
				,{4,5,6}
			},{
				{7,8,9}
				,{10,11,12}
			}
		};	
		// 8 , 10 , 2 출력
		System.out.println(data_list[1][0][1]);
		System.out.println(data_list[1][1][0]);
		System.out.println(data_list[0][0][1]);
		
		//문자열 배열 찾기 문자열m 가지고있는 아이템의 수를 출력해보기
		String dataset[] = {
			    "Braund, Mr. Owen Harris",
			    "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
			    "Heikkinen, Miss. Laina",
			    "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
			    "Allen, Mr. William Henry",
			    "Moran, Mr. James",
			    "McCarthy, Mr. Timothy J",
			    "Palsson, Master. Gosta Leonard",
			    "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
			    "Nasser, Mrs. Nicholas (Adele Achem)",
			    "Sandstrom, Miss. Marguerite Rut",
			    "Bonnell, Miss. Elizabeth",
			    "Saundercock, Mr. William Henry",
			    "Andersson, Mr. Anders Johan",
			    "Vestrom, Miss. Hulda Amanda Adolfina",
			    "Hewlett, Mrs. (Mary D Kingcome) ",
			    "Rice, Master. Eugene",
			    "Williams, Mr. Charles Eugene",
			    "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
			    "Masselmani, Mrs. Fatima",
			    "Fynney, Mr. Joseph J",
			    "Beesley, Mr. Lawrence",
			    "McGowan, Miss. Anna",
			    "Sloper, Mr. William Thompson",
			    "Palsson, Miss. Torborg Danira",
			    "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
			    "Emir, Mr. Farred Chehab",
			    "Fortune, Mr. Charles Alexander",
			    "Dwyer, Miss. Ellen",
			    "Todoroff, Mr. Lalio"
			};
		int count = 0;
		for(int i=0;i<dataset.length;i++) {

			if(dataset[i].indexOf("M") >= 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
