int[] average_grades(int grades[][], int weights[]){
	int[] results = new int[grades.length];
	
	for(int i=0; i < grades.length; i++){
		for(int j=0; j < weights.length; j++){
			if(grades[i][j] != 0){
				results[i] += (grades[i][j]*weights[j])/100;
			}
		}
	}
	
	return results;
}