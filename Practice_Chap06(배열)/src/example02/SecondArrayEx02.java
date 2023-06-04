package example02;

public class SecondArrayEx02 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {
										{100,70,50},
										{70,50,30},
										{50,80,70},
										{55,85,77},
										{100,80,75},
									};
		
		//과목별 총점
		int korTotal = 0; //국어점수
		int engTotal = 0; //영어점수
		int mathTotal = 0; //수학점수
		
		int totalsum = 0; //합계점수
		double totalavg = 0.0; //평균점수
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균"); // \t 는 보기좋게 띄워줌
		System.out.println("============================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0; //개인별 총점
			double avg = 0.0; //개인별 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(i+1);
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print("\t" + score[i][j]);
			}
			totalsum += sum; //총합계	
			avg = (double)sum / score[i].length; //개인별 평균
			totalavg += avg;
			
			//printf() 메서드는 %d < 형식지정자라고한다. 형식지정자의 갯수만큼 그에 대입되는 변수가 ,로 구분되어 제시가 되어야한다.
			System.out.printf("\t%d \t%.2f%n", sum, avg);
			
//			System.out.print("\t" + sum + "\t" + avg);
//			System.out.println();
		}
		totalavg /= score.length;
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%.3f", korTotal, engTotal, mathTotal, totalsum, totalavg);
		
	}

}
