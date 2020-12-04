package HomeworkNine;

public class FillInQuestion extends Question{
	
	public FillInQuestion(String questionText) {
		super(questionText.replaceAll("\\_.*_", "_____"));
		
		super.setAnswer(search(questionText));
	}
	
	private String search(String questionText){
		String answer = "";
		
		int answerStart = -1;
		int answerEnd = -1;
		
		for (int i = 0; i < questionText.length(); i++){
				if (questionText.charAt(i) == '_'){
					answerStart = i;
					for(int j = i+1; j <questionText.length(); j++){
						if (questionText.charAt(j) == '_'){
							answerEnd = j;
							break;
						}
					}
					break;
				}
		}
	
		
		answer = questionText.substring(answerStart, answerEnd).replaceAll("\\_", "");
		
		return answer;
	}


}
